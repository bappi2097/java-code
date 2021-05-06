package javaonlineproblem;
import java.util.Scanner;
public class Problem51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input The Array Size : ");
        int size = input.nextInt();
        int []array;
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]=input.nextInt();
        }
        int pot,count = size-1;
        for (int i = 0; i < size/2; i++) {
            pot = array[i];
            array[i]=array[count];
            array[count]=pot;
            count--;
        }
        for (int i = 0; i < size; i++) {
            System.out.println("Array n["+i+"] = "+array[i]);
        }
    }
}

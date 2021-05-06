package javaonlineproblem;
import java.util.Scanner;
public class Problem52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input The Length Of The Array : ");
        int size = input.nextInt();
        System.out.println("Input The Array Element : ");
        int []array;
        array = new int[size];
        array[0] = input.nextInt();
        int potNumber=array[0],potIndex=0;
        for (int i = 1; i < size; i++) {
            array[i]=input.nextInt();
            if(potNumber>array[i]){
                potNumber = array[i];
                potIndex = i;
            }
        }
        System.out.println("Smallest Value : "+potNumber);
        System.out.println("Position Of The Element : "+potIndex);
    }
}

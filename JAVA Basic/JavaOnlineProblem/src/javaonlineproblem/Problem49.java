package javaonlineproblem;
import java.util.Scanner;
public class Problem49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input The First Number Of The Array : ");
        int []array;
        array = new int[5];
        array[0]=input.nextInt();
        for (int i = 1; i < 5; i++) {
            array[i]=(array[i-1]*3);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("n["+i+"] = "+array[i]);
        }
    }
}

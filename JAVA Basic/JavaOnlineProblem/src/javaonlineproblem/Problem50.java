package javaonlineproblem;
import java.util.Scanner;
public class Problem50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Five Elements Of The Array : ");
        int []array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if(array[i]<5){
                System.out.println("A["+i+"] = "+array[i]);
            }
        }
    }
}

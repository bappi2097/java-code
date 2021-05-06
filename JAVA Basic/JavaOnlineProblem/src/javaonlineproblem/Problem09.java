package javaonlineproblem;
import java.util.Scanner;
public class Problem09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input The First Number : ");
        int firstNumber = input.nextInt();
        System.out.print("Input The Second Number : ");
        int secondNumber = input.nextInt();
        System.out.print("Sum of the above two integers = "+(firstNumber+secondNumber));
        System.out.println("");
    }
}

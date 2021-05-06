package javaonlineproblem;
import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input The First Integer : ");
        int firstNumber = input.nextInt();
        System.out.print("Input The Second Integer : ");
        int secondNumber = input.nextInt();
        System.out.print("Product of the above two integers = "+(firstNumber*secondNumber));
        System.out.println("");
    }
}

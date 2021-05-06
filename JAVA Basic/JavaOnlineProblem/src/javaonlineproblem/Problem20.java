package javaonlineproblem;
import java.util.Scanner;
public class Problem20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number(a): ");
        int a = input.nextInt();
        System.out.print("Input the second number(b): ");
        int b = input.nextInt();
        System.out.print("Input the third number(c): ");
        int c = input.nextInt();
        double positive = (-b+Math.sqrt((Math.pow(b, 2)-(4*a*c))))/(2*a);
        double negetive = (-b-Math.sqrt((Math.pow(b, 2)-(4*a*c))))/(2*a);
        System.out.print("Root1 = "+positive);
        System.out.print("\nRoot2 = "+negetive);
        System.out.println("");
    }
}

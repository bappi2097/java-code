
package javaonlineproblem;
import java.util.Scanner;
public class Problem08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number Of Days : ");
        int number = input.nextInt();
        System.out.print("Years : "+(number/365));
        number%=365;
        System.out.print("\nWeeks : "+(number/7));
        number%=7;
        System.out.println("\nDays : "+number);
    }
}

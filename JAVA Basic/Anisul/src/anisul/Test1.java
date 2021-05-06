
package anisul;
import java.util.Scanner;
public class Test1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int firstNumber = input.nextInt();
        System.out.print("Enter Second Number : ");
        int secondNumber = input.nextInt();
        int large = (firstNumber>secondNumber) ?firstNumber :secondNumber;
        System.out.print("The Largest Number Is : "+large);
        System.out.println();
    }
    
}

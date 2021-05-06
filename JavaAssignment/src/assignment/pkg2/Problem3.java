// Greatest Number //
package assignment.pkg2;

import java.util.Scanner;

public class Problem3 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter First Number:");
        int firstNumber=input.nextInt();
        System.out.print("\nEnter Second Number:");
        int secondNumber=input.nextInt();
        System.out.print("\nEnter Third Number:");
        int thirdNumber=input.nextInt();
        if(firstNumber > secondNumber && firstNumber >thirdNumber){
            System.out.println(firstNumber+" Is Greater Than "+secondNumber+" & "+thirdNumber);
        }
        else if(secondNumber > firstNumber && secondNumber > thirdNumber){
            System.out.println(secondNumber+" Is Greater Than "+firstNumber+" & "+thirdNumber);
        }
        else if(thirdNumber > firstNumber && thirdNumber > secondNumber){
            System.out.println(thirdNumber+" Is Greater Than "+firstNumber+" & "+secondNumber);
        }
        else{
            System.out.println("We Have Two Or More Similar Number ");
        }
    }
    
}

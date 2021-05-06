
package javaonlineproblem;
import java.util.Scanner;
public class Problem35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a pair of numbers (for example 10,2 : 2,10):");
        System.out.print("Input First Number Of The Pair : ");
        int firstNumber = input.nextInt();
        System.out.print("Input Second Number Of The Pair : ");
        int secondNumber = input.nextInt();
        if(firstNumber<secondNumber){
            System.out.println("The pair is in Ascending order! ");
        }
        else if(firstNumber>secondNumber){
            System.out.println("The pair is in Descending order! ");
        }
        else{
            System.out.println("The Pair Is Equale Number!");
        }
    }
}

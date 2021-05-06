
package javaonlineproblem;
import java.util.Scanner;
public class Problem23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a= input.nextInt();
        System.out.print("Input the second number: ");
        int b = input.nextInt();
        System.out.print("Input the third number: ");
        int c = input.nextInt();
        if(a<(b+c) && b<(a+c) && c<(a+b)){
            System.out.println("Perimeter = "+(a+b+c));
        }
        else{
            System.out.println("it is not possible to make a triangle ");
        }
    }
}

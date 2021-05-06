
package javaonlineproblem;
import java.util.Scanner;
public class Problem13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input First Integer : ");
        int first = input.nextInt();
        System.out.print("Input Second Integer : ");
        int second = input.nextInt();
        System.out.print("Input Third Integer : ");
        int third = input.nextInt();
        if(first>=second && first>=third){
            System.out.print("Maximum value of three integers: "+first);
        }
        else if(second >= first && second >= third){
            System.out.print("Maximum value of three integers: "+second);
        }
        else{
            System.out.print("Maximum value of three integers: "+third);
        }
        System.out.println("");
    }
}

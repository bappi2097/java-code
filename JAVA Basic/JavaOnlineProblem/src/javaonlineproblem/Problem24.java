
package javaonlineproblem;
import java.util.Scanner;
public class Problem24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input The First Number: ");
        int first = input.nextInt();
        System.out.print("Input The Second Number: ");
        int second = input.nextInt();
        if(first%second==0 || second%first==0){
            System.out.println("Multiplied!");
        }
        else{
            System.out.println("Not Multiplied");
        }
    }
}

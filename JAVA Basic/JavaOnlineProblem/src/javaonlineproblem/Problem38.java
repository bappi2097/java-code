package javaonlineproblem;
import java.util.Scanner;
public class Problem38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input two numbers: ");
        System.out.print("X : ");
        int x = input.nextInt();
        System.out.print("Y : ");
        int y = input.nextInt();
        if(x%y==0){
            System.out.println(x/y);
        }
        else{
            System.out.println("Division not possible");
        }
    }
}

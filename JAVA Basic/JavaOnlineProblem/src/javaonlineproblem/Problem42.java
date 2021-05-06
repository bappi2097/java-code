package javaonlineproblem;
import java.util.Scanner;
public class Problem42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input The Number Of Lines : ");
        int lineNumber = input.nextInt();
        for (int i = 1; i <= lineNumber; i++) {
            System.out.println(i+" "+(int)Math.pow(i, 2)+" "+(int)Math.pow(i, 3));
        }
    }
}

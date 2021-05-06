package javaonlineproblem;
import java.util.Scanner;
public class Problem41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number Of Lines : ");
        int lineNumber = input.nextInt();
        for (int i = 1; i <= (3*lineNumber); i++) {
            System.out.print(i+" ");
            i++;
            System.out.print(i+" ");
            i++;
            System.out.print(i+"\n");
        }
    }
}

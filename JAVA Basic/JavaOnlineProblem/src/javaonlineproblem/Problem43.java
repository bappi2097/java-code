package javaonlineproblem;
import java.util.Scanner;
public class Problem43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number Of Lines : ");
        int lineNumber = input.nextInt();
        System.out.print("Input Number Of Characters In A Line : ");
        int charNumber = input.nextInt();
        int a=1;
        for (int i = 1; i <= lineNumber; i++) {
            for (int j = 0; j < charNumber; j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println("");
        }
    }
}

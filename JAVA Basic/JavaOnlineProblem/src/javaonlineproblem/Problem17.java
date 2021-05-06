
package javaonlineproblem;
import java.util.Scanner;
public class Problem17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int sec = input.nextInt();
        System.out.print("There are:\nH:M:S - "+(sec/3600));
        sec%=3600;
        System.out.print(":"+(sec/60));
        sec%=60;
        System.out.print(":"+sec);
        System.out.println("");
    }
}

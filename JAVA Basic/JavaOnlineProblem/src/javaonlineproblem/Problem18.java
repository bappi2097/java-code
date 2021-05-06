
package javaonlineproblem;
import java.util.Scanner;
public class Problem18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input no. of days: ");
        int day = input.nextInt();
        System.out.print((day/365)+" Year(s) \n");
        day%=365;
        System.out.print((day/30)+" Month(s)\n");
        day%=30;
        System.out.print(day+" Day(s)\n");
        System.out.println("");
    }
}

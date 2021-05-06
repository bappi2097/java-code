package javaonlineproblem;
import java.util.Scanner;
public class Problem45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input The Base Number : ");
        int base = input.nextInt();
        double sum=0;
        for (double i = 1; i <= base; i++) {
            sum+=(1/i);
            i++;
        }
        System.out.println("Values Of S : "+sum);
    }
}

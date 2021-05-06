package javaonlineproblem;
import java.util.Scanner;
public class Problem11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Weight-Item-1 : ");
        int weight1 = input.nextInt();
        System.out.print("No. Of Item-1 : ");
        int no1 = input.nextInt();
        System.out.print("Weight-Item-2 : ");
        int weight2 = input.nextInt();
        System.out.print("No. Of Item-2 : ");
        int no2 = input.nextInt();
        double avg = (double)((weight1*no1)+(weight2*no2))/(no1+no2);
        System.out.printf("Average Value = %.4f",avg);
        System.out.println("");
    }
}

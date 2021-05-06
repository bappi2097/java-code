
package javaonlineproblem;
import java.util.Scanner;
public class Problem15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input X1 : ");
        int x1 = input.nextInt();
        System.out.print("Input Y1 : ");
        int y1 = input.nextInt();
        System.out.print("Input X2 : ");
        int x2 = input.nextInt();
        System.out.print("Input Y2 : ");
        int y2 = input.nextInt();
        double distance = (double) Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        System.out.printf("Distance between the said points: %.4f",distance);
        System.out.println("");
    }
}

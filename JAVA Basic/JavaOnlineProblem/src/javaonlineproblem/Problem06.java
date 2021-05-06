
package javaonlineproblem;
import java.util.Scanner;
public class Problem06 {
    static double PI = 3.1416;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Radius : ");
        double r = input.nextDouble();
        System.out.println("Perimeter of the Circle = "+(2*PI*r)+" inches");
        System.out.println("Area of the Circle = "+(PI*Math.pow(r, 2))+" square inches");
    }
}

package javaonlineproblem;
import java.util.Scanner;
public class Problem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         System.out.print("Enter Height : ");
         int height = input.nextInt();
         System.out.print("Enter Width : ");
         int width = input.nextInt();
         System.out.print("Perimeter of the rectangle = "+2*(height+width)+" inches ");
         System.out.println("\nArea of the rectangle = "+(height*width)+" square inches");
    }
}
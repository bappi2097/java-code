
package javaonlineproblem;
import java.util.Scanner;
public class Problem12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ID = null ;
        boolean b = true;
        while(b){
            System.out.print("Input the Employees ID(Max. 10 chars): ");
            ID = input.next();
            if(ID.length()<=10){
                b = false ;
            }
        }
        System.out.print("Input the working hrs: ");
        int hour = input.nextInt();
        System.out.print("Salary amount/hr: ");
        double amountPerHour = input.nextDouble();
        System.out.print("Employees ID = "+ID);
        System.out.printf("\nSalary = U$ %.2f",(double)(hour*amountPerHour));
        System.out.println("");
    }
}

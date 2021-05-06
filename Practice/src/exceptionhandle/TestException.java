package exceptionhandle;
import java.util.*;
public class TestException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String id, n;
        double s = 0, p = 0;
        System.out.print("Enter Your Name : ");
        n = input.nextLine();
        System.out.print("Enter Your ID : ");
        id = input.nextLine();
        try {
            System.out.print("Enter Salary Per Day : ");
            s = input.nextDouble();
            System.out.print("Enter The Number Of Sales Product : ");
            p = input.nextDouble();
        } catch (InputMismatchException e) {
            System.err.println(e);
        }
        SalesMan obj = new SalesMan(id, n, s);
        double c = obj.Monthlysalary();
        obj.Bonus(p);
        obj.PrintInfo();
    }
}

package javaquiz02;
import java.util.Scanner;
public class Javaquiz02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String id, n;
        double s , p;
        System.out.print("Enter Your Name : ");
        n = input.nextLine();
        System.out.print("Enter Your ID : ");
        id = input.nextLine();
        System.out.print("Enter Salary Per Day : ");
        s = input.nextDouble();
        SalesMan obj = new SalesMan(id , n, s);
        double c = obj.Monthlysalary();
        System.out.print("Enter The Number Of Sales Product : ");
        p = input.nextDouble();
        obj.Bonus(p);
        obj.PrintInfo();
    }
    
}

package universitymanagementsystem2;
import java.util.Scanner;
public class Employee extends Person{
    private Scanner input = null;
    private String EmployeeID;
    private double MonthlySalary;
    protected Employee(){
        super();
        input = new Scanner(System.in);
    }
    protected void input_EmployeeAll(){
        System.out.println("Enter ID : ");
        EmployeeID=input.nextLine();
        System.out.println("Enter Monthly Salary : ");
        MonthlySalary=input.nextDouble();
    }
    protected double get_MonthlySalary(){
        return MonthlySalary;
    }
}

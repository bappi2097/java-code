package supershop;
import java.util.Scanner;
public class Employee extends Person{
    private Scanner input=null;
    private double Salary;
    public Employee(){
        super();
        input=new Scanner(System.in);
    }
    public void input_Salary(){
        System.out.print("Enter Salary : ");
        Salary=input.nextDouble();
    }
    public double get_Salary(){
        return Salary;
    }
    public void print_Salary(){
        System.out.println("Salary : "+Salary);
    }
    public void input_All(){
        input_ID();
        input_Name();
        input_Address();
        input_Salary();
    }
}

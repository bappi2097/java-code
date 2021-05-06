package universitymanagementsystem2;
import java.util.Scanner;
public class Teacher extends Employee{
    private Scanner input = null;
    private final double Bonus=0.10;
    private double YearlySalary;
    private int CourseCredit=0;
    protected Teacher(){
        super();
        input=new Scanner(System.in);
    }
    protected void calculateYearlySalary(){
        YearlySalary=(get_MonthlySalary()+get_MonthlySalary()*Bonus)*12;
    }
    protected double get_YearlySalary(){
        return YearlySalary;
    }
    protected void get_CourseCredit(int credit){
        CourseCredit+=credit;
    }
    protected void print_All(){
        System.out.println("Name : "+get_Name());
        System.out.println("Department : "+get_Department());
        System.out.println("Age : "+get_Age());
        System.out.println("Monthly Salary : "+get_MonthlySalary());
        System.out.println("Yearly Salary : "+get_YearlySalary());
    }
}

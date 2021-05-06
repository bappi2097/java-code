package bankmanagementsystem;
import java.util.Scanner;
public class Manager extends Person{
    /**
     * For manager and accountant you must store their 
     * name, age, salary. Every employee fixed salary 
     * 8000/-. Manager get salary-fixed salary+manager 
     * bonus(it count from all account-holder balance*0.07)
     * +manager honorable salary
     */
    private Scanner input=null;
    private int Age;
    private final double FixedSalary=8000.00;
    private double  Salary,
                    Bonus,
                    EidBonus,
                    HonorableSalary;
    public Manager(){
        super();
        input=new Scanner(System.in);
    }
    public void input_Age(){
        System.out.print("Enter Age : ");
        Age=input.nextInt();
    }
    public int get_Age(){
        return Age;
    }
    public void print_Age(){
        System.out.println("Age : "+Age);
    }
    public void input_Bonus(double bonus){
        this.Bonus=bonus;
    }
    public double get_Bonus(){
        return Bonus;
    }
    public void print_Bonus(){
        System.out.println("Bonus : "+Bonus);
    }
    public void input_EidBonus(){
        System.out.print("Enter Eid Bonus : ");
        EidBonus=input.nextDouble();
    }
    public double get_EidBonus(){
        return EidBonus;
    }
    public void print_EidBonus(){
        System.out.println("Eid Bonus : "+EidBonus);
    }
    public void input_HonorableSalary(){
        System.out.print("Enter Honorable Salary : ");
        HonorableSalary=input.nextDouble();
    }
    public double get_HonorableSalary(){
        return HonorableSalary;
    }
    public void print_HonorableSalary(){
        System.out.println("Honorable Salary : "+HonorableSalary);
    }
    public void calculate_Salary(){
        Salary=(FixedSalary+(get_Bonus()*0.07)+get_EidBonus()+get_HonorableSalary());
    }
    public double get_Salary(){
        return Salary;
    }
    public void print_Salary(){
        System.out.println("Salary : "+Salary);
    }
    public void input_All(){
        input_Name();
        input_Age();
        input_EidBonus();
        input_HonorableSalary();
        calculate_Salary();
    }
    public void print_All(){
        print_Name();
        print_Age();
        print_Bonus();
        print_EidBonus();
        print_HonorableSalary();
        print_Salary();
    }
}

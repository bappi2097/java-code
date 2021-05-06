package electricitycostmodelingapplication;
import ecmainterface.EmployeeInterface;
import java.util.Scanner;
public class Employee extends Person implements EmployeeInterface{
    private Scanner input=null;
    private double TotalCollectedBill=0;
    protected Employee(){
        super();
        input=new Scanner(System.in);
    }

    @Override
    public void calculate_TotalCollectedBill(double n) {
        TotalCollectedBill+=n;
    }
    public void print_TotalCollectedBill(){
        System.out.println("Total Collected Bill : "+TotalCollectedBill);
    }
    
    protected void print_AllInfo(){
        print_All();
        print_TotalCollectedBill();
    }
}

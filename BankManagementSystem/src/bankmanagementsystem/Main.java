package bankmanagementsystem;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccountHolder acch=new AccountHolder();
        System.out.println("Account Holder Information : ");
        acch.input_All();
        Manager mngr = new Manager();
        System.out.println("Manager Information : ");
        mngr.input_Bonus(acch.get_CurrentBalance());
        mngr.input_All();
        Accountent acc = new Accountent();
        System.out.println("Accountent Information : ");
        acc.input_Bonus(acch.get_CurrentBalance());
        acc.input_All();
        
        System.out.println("Account Holder Information : ");
        acch.print_All();
        
        System.out.println("Manager Information : ");
        mngr.print_All();
        
        System.out.println("Accountent Information : ");
        acc.print_All();
        
    }
    
}

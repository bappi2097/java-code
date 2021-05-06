package bankmanagementsystem;
import java.util.Scanner;
public class AccountHolder extends Person{
    /**
     * For account-holder must be store name, current balance, 
     * deposit, withdraw, interest and loan. If account-holder 
     * balance more than 500 then they will be given a loan. 
     * Every account-holder getting 10% interest. Account-holder 
     * account id must be auto generate.
     */
    private Scanner input=null;
    private String ID;
    private double  CurrentBalance,
                    Deposit,
                    Withdrow,
                    Loan;
    private final double Interest=0.10;
    public AccountHolder(){
        super();
        input=new Scanner (System.in);
    }
    public void input_ID(){
        System.out.print("Enter ID : ");
        ID=input.nextLine();
    }
    public String get_ID(){
        return ID;
    }
    public void Print_ID(){
        System.out.println("ID : "+ID);
    }
    public void input_CurrentBalance(){
        System.out.print("Enter Current Balance : ");
        CurrentBalance=input.nextDouble();
    }
    public double get_CurrentBalance(){
        return CurrentBalance;
    }
    public void print_CurrentBalance(){
        System.out.println("Current Balance : "+CurrentBalance);
    }
    public void input_Deposit(){
        System.out.print("Enter Diposit Amount : ");
        double deposit=input.nextDouble();
        calculate_Deposite(deposit);
    }
    public void calculate_Deposite(double deposit){
        this.Deposit+=deposit;
        this.CurrentBalance+=deposit;
    }
    public double get_Deposit(){
        return Deposit;
    }
    public void print_Deposit(){
        System.out.println("Deposit : "+Deposit);
    }
    public void input_Withdrow(){
        System.out.print("Enter Withdrow Amount : ");
        double WantToWithdrow=input.nextDouble();
        check_Withdrow(WantToWithdrow);
    }
    public void check_Withdrow(double WantToWithdrow){
        if(CurrentBalance>WantToWithdrow)   calculate_Withdrow(WantToWithdrow);
        else    System.out.println("You Have Not Sufficient Balance");
    }
    public void calculate_Withdrow(double WantToWithdrow){
        this.Withdrow+=WantToWithdrow;
        this.CurrentBalance-=WantToWithdrow;
    }
    public double get_Withdrow(){
        return Withdrow;
    }
    public void print_Withdrow(){
        System.out.println("Withdrow : "+Withdrow);
    }
    public void input_Loan(){
        System.out.print("Enter Loan Amount : ");
        double loan=input.nextDouble();
        if(loan>0)  check_Loan(loan);
    }
    public void check_Loan(double loan){
        if(CurrentBalance>500)    calculate_Loan(loan); 
        else    System.out.println("You Are Not Eligible For Loan");
    }
    public void calculate_Loan(double loan){
        this.Loan+=loan*Interest;
    }
    public double get_Loan(){
        return Loan;
    }
    public void print_Loan(){
        System.out.println("Loan : "+Loan);
    }
    public void input_All(){
        input_Name();
        input_ID();
        input_CurrentBalance();
        input_Deposit();
        input_Withdrow();
        input_Loan();
    }
    public void print_All(){
        print_Name();
        Print_ID();
        print_CurrentBalance();
        print_Deposit();
        print_Withdrow();
        print_Loan();
    }
}

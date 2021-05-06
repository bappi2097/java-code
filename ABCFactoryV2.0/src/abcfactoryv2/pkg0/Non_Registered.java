package abcfactoryv2.pkg0;
import java.util.Scanner;
public class Non_Registered extends Person{
    private Scanner input=null;
    private int TotalOrderAmount=0;
    private double TotalBill=0;
    protected Non_Registered(){
        super();
        input=new Scanner(System.in);
    }
    protected void set_TotalOrderAmount(int n){
        TotalOrderAmount=n;
    }
    protected int get_TotalOrderAmount(){
        return TotalOrderAmount;
    }
    protected void print_TotalOrderAmount(){
        System.out.println("Total Order Amount : "+TotalOrderAmount);
    }
    protected void set_TotalBill(double n){
        TotalBill=n;
    }
    protected double get_TotalBill(){
        return TotalBill;
    }
    protected void print_TotalBill(){
        System.out.println("Total Bill : "+TotalBill);
    }
}

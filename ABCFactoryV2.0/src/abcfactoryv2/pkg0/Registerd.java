package abcfactoryv2.pkg0;
import java.util.Scanner;
public class Registerd extends Person{
    private Scanner input=null;
    private int TotalOrderAmount=0;
    private int NoOfOrder=0;
    private double TotalBill=0;
    private final double Discount=0.10;
    private boolean Eligible=false;
    protected Registerd(){
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
    protected void calculate_TotalBill(){
        TotalBill-=TotalBill*Discount;
        Eligible=true;
    }
    protected void print_Eligible(){
        if(Eligible)System.out.println(get_ID()+" Is Eligible For Discount");
        else System.out.println(get_ID()+" Is Not Eligible For Discount");
    }
    protected double get_TotalBill(){
        return TotalBill;
    }
    protected void print_TotalBill(){
        System.out.println("Total Bill : "+TotalBill);
    }
    protected void set_NoOfOrder(int n){
        NoOfOrder=n;
    }
}

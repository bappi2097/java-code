package abcfactory;
import java.util.Scanner;
public class RegisteredClient extends Person{
    private Scanner input=null;
    private int OrderAmount=0;
    private double DiscountAmount=10;
    private double Bill=0;
    protected RegisteredClient(){
        super();
        input=new Scanner(System.in);
    }
    protected void input_OrderAmount(){
        System.out.println("Enter Order Amount : ");
        OrderAmount=input.nextInt();
    }
    protected void set_OrderAmout(int n){
        OrderAmount+=n;
    }
    protected int get_OrderAmount(){
        return OrderAmount;
    }
    protected void set_Bill(double n){
        Bill+=n;
    }
    protected void calculate_Bill(){
        Bill=Bill-(Bill*DiscountAmount);
    }
    protected double get_Bill(){
        return Bill;
    }
    protected void input_All(){
        input_ID();
        input_Name();
    }
    protected void print_All(){
        print_ID();
        print_Name();
        System.out.println("Total Bill : "+Bill);
    }
}

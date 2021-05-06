package abcfactory;
import java.util.Scanner;
public class Order {
    private Scanner input=null;
    private String OrderID;
    private int Amount=0;
    private String ClientID;
    private final double Price=200;
    private final double Tax =0.05;
    private double Bill=0;
    protected Order(){
        input=new Scanner(System.in);
    }
    protected void input_OrderID(){
        System.out.println("Enter Order ID : ");
        OrderID=input.nextLine();
    }
    protected void input_Amount(){
        System.out.println("Enter Amount : ");
        Amount=input.nextInt();
    }
    protected void set_Amount(int n){
        Amount=n;
    }
    protected int get_amount(){
        return Amount;
    }
    protected boolean cheack_Amount(){
        if(Amount>5000) return true;
        else return false;
    }
    protected void set_ClientID(String s){
        ClientID=s;
    }
    protected void calculate_Bill(){
        Bill=(Amount*Price)+(Amount*Price*Tax);
    }
    protected double get_Bill(){
        return Bill;
    }
}

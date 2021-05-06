package abcfactoryv2.pkg0;
import java.util.Scanner;
import abcfactoryinterface.OrderInterface;
public class Order implements OrderInterface{
    private Scanner input=null;
    private String OrderID;
    private int OrderAmount=0;
    private String ClientID;
    private boolean Confirm=false;
    private double Bill=0;
    private final double Tax=0.05;
    private final double Price=200;
    protected Order(){
        input=new Scanner(System.in);
    }
    protected void input_OrderID(){
        System.out.println("Enter Order ID : ");
        OrderID=input.nextLine();
    }
    protected String get_OrderID(){
        return OrderID;
    }
    protected void print_OrderID(){
        System.out.println("Order ID : "+OrderID);
    }
    protected void input_OrderAmount(){
        System.out.println("Enter Order Amount : ");
        OrderAmount=input.nextInt();
        check_Confirmation();
    }
    protected int get_OrderAmount(){
        return OrderAmount;
    }
    protected void print_OrderAmount(){
        System.out.println("Order Amount : "+OrderAmount);
    }
    protected void set_ClientID(String s){
        ClientID=s;
    }
    protected String get_ClientID(){
        return ClientID;
    }
    protected void print_ClientID(){
        System.out.println("Client ID : "+ClientID);
    }
    @Override
    public void check_Confirmation(){
        if(OrderAmount>5000)Confirm=true;
    }
    protected boolean get_Confirmation(){
        return Confirm;
    }
    protected void calculate_Bill(){
        Bill=(200*OrderAmount)+(200*OrderAmount*Tax);
    }
    protected double get_Bill(){
        return Bill;
    }
    protected void print_Bill(){
        System.out.println("Bill : "+Bill);
    }
    protected void input_All(){
        input_OrderID();
        input_OrderAmount();
    }
    protected void print_All(){
        print_ClientID();
        print_OrderAmount();
        print_ClientID();
        print_Bill();
    }
}

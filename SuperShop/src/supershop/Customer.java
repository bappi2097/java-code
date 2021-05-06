package supershop;
import java.util.Scanner;
public class Customer extends Person {
    private Scanner input=null;
    private String CustType;
    private double  Discount=0.10,
                    TotalPurchase;
    private int TotalPoint;
    public Customer(){
        super();
        input=new Scanner(System.in);
    }
    public void input_CustType(){
        System.out.print("Enter Customer Type : ");
        CustType=input.nextLine();
    }
    public String get_CustType(){
        return CustType;
    }
    public void print_CustType(){
        System.out.println("Customer Type : "+CustType);
    }
    public void Calculate_Discount(){
        if(CustType.equalsIgnoreCase("Member"))TotalPurchase-=(Discount*TotalPurchase);
    }
    public double get_Discount(){
        return Discount;
    }
    public void print_Discount(){
        System.out.println("Discount : "+Discount*100+"%");
    }
    public void calculate_TotalPoint(){
        TotalPoint+=(TotalPurchase/100);
    }
    public int get_TotalPoint(){
        return TotalPoint;
    }
    public void print_TotalPoint(){
        System.out.println("Total Point : "+TotalPoint);
    }
    public void calculate_TotalPurchase(int salequantity,double SalePrice){
        TotalPurchase+=(double)SalePrice*salequantity;
    }
    public double get_TotalPurchase(){
        return TotalPurchase;
    }
    public void print_TotalPurchase(){
        System.out.println("Total Purchase : "+TotalPurchase);
    }
    public void input_All(){
        input_ID();
        input_Name();
        input_Address();
        input_CustType();
    }
    public void print_All(){
        print_ID();
        print_Name();
        print_Address();
        print_CustType();
        print_TotalPurchase();
        print_TotalPoint();
    }
}

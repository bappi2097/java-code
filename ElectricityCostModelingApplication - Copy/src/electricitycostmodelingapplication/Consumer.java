package electricitycostmodelingapplication;
import java.util.Scanner;
import ecmainterface.ConsumerInterface;
public class Consumer extends Person implements ConsumerInterface{
    private String ConsumerType,Location;
    private double SalePrice,MonthlyUsedKW,BillWIthTax=0,BillWithService=0,BillWithDiscount=0,Bill=0;
    private Scanner input=null;
    protected Consumer(){
        super();
        input=new Scanner(System.in);
    }
    protected void input_ConsumerType(){
        System.out.println("Enter Consumer Type : ");
        ConsumerType=input.nextLine();
    }
    protected String get_ConsumerType(){
        return ConsumerType;
    }
    protected void input_Location(){
        System.out.println("Enter Consumer Location : ");
        Location=input.nextLine();
    }
    protected String get_Location(){
        return Location;
    }
    protected void set_SalePrice(double n){
        SalePrice=n;
    }
    protected void input_MonthlyUsedKW(){
        System.out.println("Enter Consumer Monthly Used in KW : ");
        MonthlyUsedKW=input.nextDouble();
    }
    protected double get_MonthlyUsedKW(){
        return MonthlyUsedKW;
    }
    @Override
    public void calculate_BillWithTax() {
        BillWIthTax=(MonthlyUsedKW*SalePrice)+(MonthlyUsedKW*SalePrice*Tax);
        Bill=BillWIthTax;
    }

    @Override
    public boolean check_ConsumerType() {
        return get_ConsumerType().equalsIgnoreCase("Monthly");
    }

    @Override
    public void calculate_BillWithServiceCharge() {
        if(check_ConsumerType()){
            BillWithService=Bill+Bill*.03;
            Bill=BillWithService;
        }
        else{
            BillWithService=Bill+Bill*.02;
            Bill=BillWithService;
        }
    }

    @Override
    public boolean check_Discount() {
        return MonthlyUsedKW>100;
    }

    @Override
    public void calculate_BillWithDiscount() {
        if(check_Discount()){
            BillWithDiscount=Bill-Bill*0.02;
            Bill=BillWithDiscount;
        }
    }
    protected double get_Bill(){
        return Bill;
    }
    protected void input_AllInfo(){
        input_Location();
        input_ConsumerType();
        input_MonthlyUsedKW();
    }
    protected void Print_AllInfo(){
        print_All();
        System.out.println("Location : "+Location);
        System.out.println("Consumer Type : "+ConsumerType);
        System.out.println("Monthly Used : "+MonthlyUsedKW+" KW");
        System.out.println("Total Bill : "+Bill);
    }
    
}

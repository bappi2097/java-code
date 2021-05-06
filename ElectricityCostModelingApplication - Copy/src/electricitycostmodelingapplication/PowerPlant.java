package electricitycostmodelingapplication;
import java.util.Scanner;
import ecmainterface.PowerPlantInterface;
public class PowerPlant implements PowerPlantInterface{
    private Scanner input=null;
    private String Name,Location;
    private double PowerCapacity,ProductioncostMW,ProductioncostKW,SalePriceKW,Profit=0;
    private int NoOfConsumer=0;
    protected PowerPlant(){
        input=new Scanner(System.in);
    }
    protected void input_Name(){
        System.out.println("Enter Power Plant Name : ");
        Name=input.nextLine();
    }
    protected String get_Name(){
        return Name;
    }
    protected void input_Location(){
        System.out.println("Enter Power Plant Location : ");
        Location=input.nextLine();
    }
    protected String get_Location(){
        return Location;
    }
    protected void input_PowerCapacity(){
        System.out.println("Enter Power Plant Capacity(MW) : ");
        PowerCapacity=input.nextDouble();
    }
    protected double get_PowerCapacity(){
        return PowerCapacity;
    }
    protected void input_ProductionCostMW(){
        System.out.println("Enter Production Cost Per MW : ");
        ProductioncostMW=input.nextDouble();
    }
    protected double get_ProductioncostMW(){
        return ProductioncostMW;
    }
    protected void input_SalePriceKW(){
        System.out.println("Enter Power Plant Sale Price Per KW : ");
        SalePriceKW=input.nextDouble();
    }
    protected double get_SalePriceKW(){
        return SalePriceKW;
    }
    @Override
    public void calculate_TotalNoOfConsumer() {
        NoOfConsumer++;
    }

    @Override
    public void calculate_ProductionPerKW() {
        ProductioncostKW=ProductioncostMW/1000;
    }

    @Override
    public void calculate_Profit(double Amount) {
        Profit+=(SalePriceKW*Amount-ProductioncostKW*Amount);
    }
    protected void input_All(){
        input_Name();
        input_Location();
        input_PowerCapacity();
        input_ProductionCostMW();
        calculate_ProductionPerKW();
        input_SalePriceKW();
    }
    protected void print_All(){
        System.out.println("Name : "+Name);
        System.out.println("Location : "+Location);
        System.out.println("Total Power Capacity :"+PowerCapacity+" MW");
        System.out.println("Profit : "+Profit);
        System.out.println("No Of Consumer : "+NoOfConsumer);
        
    }
}

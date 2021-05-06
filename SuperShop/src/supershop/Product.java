package supershop;
import java.util.Scanner;
public class Product {
    private Scanner input=null;
    private String  ID,
                    Name;
    private int Quantity,
                SaleQuantity;
    private double  UnitPrice,
                    SalePrice,
                    Profit;
    public Product(){
        input=new Scanner(System.in);
    }
    public void input_ID(){
        System.out.print("Enter Product ID : ");
        ID=input.nextLine();
    }
    public String get_ID(){
        return ID;
    }
    public void print_ID(){
        System.out.println("Product ID : "+ID);
    }
    public void input_Name(){
        System.out.print("Enter Product Name : ");
        Name=input.nextLine();
    }
    public String get_Name(){
        return Name;
    }
    public void print_Name(){
        System.out.println("Product Name : "+Name);
    }
    public void input_Quantity(){
        System.out.print("Enter "+Name+" Quantity : ");
        Quantity=input.nextInt();
    }
    public int get_Quantity(){
        return Quantity;
    }
    public void calculate_Quantity(){
        Quantity-=SaleQuantity;
    }
    public void print_Quantity(){
        System.out.println("Quantity : "+Quantity);
    }
    public void input_SaleQuantity(){
        System.out.print("Enter Sale Quantity : ");
        SaleQuantity=input.nextInt();
        
    }
    public boolean IsProductAvailable(){
        if(SaleQuantity>Quantity){
            System.out.println("Insufficient Product.We have "+Quantity);
            return false;
        }
        else return true;
    }
    public int get_SaleQuantity(){
        return SaleQuantity;
    }
    public void print_SaleQuantity(){
        System.out.println("Sale Quantity : "+SaleQuantity);
    }
    public void input_UnitPrice(){
        System.out.print("Enter Unit Price Of "+Name+" : ");
        UnitPrice=input.nextDouble();
    }
    public double get_UnitPrice(){
        return UnitPrice;
    }
    public void print_UnitPrice(){
        System.out.println("Unit Price Of "+Name+" : "+UnitPrice);
    }
    public void input_SalePrice(){
        System.out.print("Enter Sale Price Of "+Name+" : ");
        SalePrice=input.nextDouble();
    }
    public double get_SalePrice(){
        return SalePrice;
    }
    public void print_SalePrice(){
        System.out.println("Sale Price Of "+Name+" : "+UnitPrice);
    }
    public void calculate_Profit(int salequantity){
        Profit=(SalePrice-UnitPrice)*salequantity;
    }
    public double get_Profit(){
        return Profit;
    }
    public void print_Profit(){
        System.out.println("Profit : "+Profit);
    }
    public void input_All(){
        input_ID();
        input_Name();
        input_Quantity();
        input_UnitPrice();
        input_SalePrice();
    }
}

package abcfactory;
import java.util.Scanner;
public class Person {
    private Scanner input=null;
    private String Name;
    private String ID;
    private int NoOfOrder;
    protected Person(){
        input=new Scanner(System.in);
    }
    protected void input_ID(){
        System.out.println("Enter ID : ");
        ID=input.nextLine();
    }
    protected void input_Name(){
        System.out.println("Enter Name : ");
        Name=input.nextLine();
    }
    protected String get_ID(){
        return ID;
    }
    protected void print_ID(){
        System.out.println("ID : "+ID);
    }
    protected void print_Name(){
        System.out.println("Name : "+Name);
    }
    protected void set_NoOfOrder(int n){
        NoOfOrder=n;
    }
    protected int get_NoOfOrder(){
        return NoOfOrder;
    }
}

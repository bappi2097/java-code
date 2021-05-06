package supershop;
import java.util.Scanner;
public class Person {
    private Scanner input=null;
    private String  ID,
                    Name,
                    Address;
    public Person(){
        input=new Scanner(System.in);
    }
    public void input_ID(){
        System.out.print("Enter ID : ");
        ID=input.nextLine();
    }
    public String get_ID(){
        return ID;
    }
    public void print_ID(){
        System.out.println("ID : "+ID);
    }
    public void input_Name(){
        System.out.print("Enter Name : ");
        Name=input.nextLine();
    }
    public String get_Name(){
        return Name;
    }
    public void print_Name(){
        System.out.println("Name : "+Name);
    }
    public void input_Address(){
        System.out.print("Enter Address : ");
        Address=input.nextLine();
    }
    public String get_Address(){
        return Address;
    }
    public void print_Address(){
        System.out.println("Address : "+Address);
    }
}

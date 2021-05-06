package abcfactoryv2.pkg0;
import java.util.Scanner;
import abcfactoryinterface.PersonInterace;
public class Person implements PersonInterace{
    private Scanner input=null;
    private String Name;
    private String ID;
    protected Person(){
        input=new Scanner(System.in);
    }
    @Override
    public void input_ID(){
        System.out.println("Enter ID : ");
        ID=input.nextLine();
    }
    protected String get_ID(){
        return ID;
    }
    protected void print_ID(){
        System.out.println("ID : "+ID);
    }
    protected void input_Name(){
        System.out.println("Enter Name : ");
        Name=input.nextLine();
    }
    protected String get_Name(){
        return Name;
    }
    protected void print_Name(){
        System.out.println("Name : "+Name);
    }
    protected void input_AllInfo(){
        input_ID();
        input_Name();
    }
    protected void print_AllInfo(){
        print_ID();
        print_Name();
    }
}

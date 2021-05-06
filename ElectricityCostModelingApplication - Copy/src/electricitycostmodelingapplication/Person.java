package electricitycostmodelingapplication;
import java.util.Scanner;
public abstract class Person{
    private String ID,Name,PowerPlantName;
    private Scanner input=null;
    protected Person(){
        input=new Scanner(System.in);
    }
    protected void input_ID(){
        System.out.println("Enter ID : ");
        ID=input.nextLine();
    }
    protected String get_ID(){
        return ID;
    }
    protected void input_Name(){
        System.out.println("Enter Name : ");
        Name=input.nextLine();
    }
    protected String get_Name(){
        return Name;
    }
    
    protected void input_PowerPlantName(){
        System.out.println("Enter Power Plant Name : ");
        PowerPlantName=input.nextLine();
    }
    protected void set_PowerPlantName(String n){
        PowerPlantName=n;
    }
    protected String get_PowerPlantName(){
        return PowerPlantName;
    }
    protected void input_All(){
        input_ID();
        input_Name();
    }
    protected void print_All(){
        System.out.println("ID : "+ID);
        System.out.println("Name : "+Name);
        System.out.println("Power Plant Name : "+PowerPlantName);
    }
}

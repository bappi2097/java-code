package universitymanagementsystem2;
import java.util.Scanner;
public class Person {
    private Scanner input=null;
    private String FirstName;
    private String LastName;
    private String Department;
    private int Age;
    protected Person(){
        input=new Scanner(System.in); 
    }
    protected void input_AllInfo(){
        System.out.println("Enter First Name : ");
        FirstName=input.nextLine();
        System.out.println("Enter Last Name : ");
        LastName=input.nextLine();
        System.out.println("Enter Department Name : ");
        Department=input.nextLine();
        System.out.println("Enter Age : ");
        Age=input.nextInt();
    }
    protected String get_Name(){
        return FirstName+LastName;
    }
    protected String get_Department(){
        return Department;
    }
    protected int get_Age(){
        return Age;
    }
}

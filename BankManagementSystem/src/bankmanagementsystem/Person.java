package bankmanagementsystem;
import java.util.Scanner;
public class Person {
    private String Name;
    private Scanner input=null;
    public Person(){
        input=new Scanner(System.in);
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
}

package assignment_code_submission;
import java.util.Scanner;
public class Football extends Player{
    private Scanner input=null;
    private int NoOfGoals;
    private String ClubName;
    protected Football(){
        super();
        input=new Scanner(System.in);
    }
    protected void input_NoOfGoals(){
        System.out.println("Enter No Of Goals : ");
        NoOfGoals=input.nextInt();
    }
    protected void add_NoOfGoals(){
        System.out.println("Enter No Of New Match : ");
        NoOfGoals+=input.nextInt();
    }
    protected int get_NoOfGoals(){
        return NoOfGoals;
    }
    protected void print_NoOfGoals(){
        System.out.println("No Of Goals : "+NoOfGoals);
    }
    protected void input_ClubName(){
        System.out.println("Enter Club Name :");
        ClubName=input.nextLine();
    }
    protected void set_ClubName(String s){
        ClubName=s;
    }
    protected void print_ClubName(){
        System.out.println("Club Name : "+ClubName);
    }
    
}

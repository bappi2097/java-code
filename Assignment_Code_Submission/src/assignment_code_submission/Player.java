package assignment_code_submission;
import java.util.Scanner;
public class Player {
    private Scanner input=null;
    private String Name;
    private String SportName;
    private int Age;
    private String Country;
    private int NoOfMatch;
    private int NoOfMedal;
    private int NoOfWorldRecord;
    private String SponsorName;
    private double TotalEarning;
    protected Player(){
        input=new Scanner(System.in);
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
    protected void input_SportName(){
        System.out.println("Enter Sport Name : ");
        SportName=input.nextLine();
    }
    protected String get_SportName(){
        return SportName;
    }
    protected void print_SportName(){
        System.out.println("Sport Name : "+SportName);
    }
    protected void input_Age(){
        System.out.println("Enter Age : ");
        Age=input.nextInt();
    }
    protected int get_Age(){
        return Age;
    }
    protected void print_Age(){
        System.out.println("Age : "+Age);
    }
    protected void input_Country(){
        System.out.println("Enter Country Name : ");
        Country=input.nextLine();
    }
    protected String get_Country(){
        return Country;
    }
    protected void print_Country(){
        System.out.println("Country Name : "+Country);
    }
    protected void input_NoOfMatch(){
        System.out.println("Enter No Of Match : ");
        NoOfMatch=input.nextInt();
    }
    protected int get_NoOfMatch(){
        return NoOfMatch;
    }
    protected void add_NoOfMatch(){
        System.out.println("Enter No Of New Match : ");
        NoOfMatch+=input.nextInt();
    }
    protected void print_NoOfMatch(){
        System.out.println("No Of Match : "+NoOfMatch);
    }
    protected void input_NoOfMedal(){
        System.out.println("Enter No Of Medal : ");
        NoOfMedal=input.nextInt();
    }
    protected void add_NoOfMedal(){
        System.out.println("Enter No Of New Medal : ");
        NoOfMedal+=input.nextInt();
    }
    protected int get_NoOfMedal(){
        return NoOfMedal;
    }
    protected void print_NoOfMedal(){
        System.out.println("No Of Medal : "+NoOfMedal);
    }
    protected void input_NoOfWorldRecord(){
        System.out.println("Enter No Of World Record : ");
        NoOfWorldRecord=input.nextInt();
    }
    protected void add_NoOfWorldRecord(){
        System.out.println("Enter No Of New Record : ");
        NoOfWorldRecord+=input.nextInt();
    }
    protected int get_NoOfWorldRecord(){
        return NoOfWorldRecord;
    }
    protected void print_NoOfWorldRecord(){
        System.out.println("No Of World Record : "+NoOfWorldRecord);
    }
    protected void input_SponsorName(){
        System.out.println("Enter Sponsor Name : ");
        SponsorName=input.nextLine();
    }
    protected String get_SponsorName(){
        return SponsorName;
    }
    protected void set_SponsorName(){
        System.out.println("Enter New Sponsor Name : ");
        SponsorName=input.nextLine();
    }
    protected void print_SponsorName(){
        System.out.println("SponsorName : "+SponsorName);
    }
    protected void input_TotalEarning(){
        System.out.println("Enter Total Earning : ");
        TotalEarning=input.nextDouble();
    }
    protected void set_TotalEarning(){
        System.out.println("Enter Added Earning : ");
        TotalEarning+=input.nextDouble();
    }
    protected double get_TotalEarning(){
        return TotalEarning;
    }
    protected void print_TotalEarning(){
        System.out.println("Total Earning: "+TotalEarning);
    }
    protected void input_Gape(){
        input.nextLine();
    }
    protected void input_All(){
        input_Name();
        input_SportName();
        input_Age();
        input.nextLine();
        input_Country();
        input_NoOfMatch();
        input_NoOfMedal();
        input_NoOfWorldRecord();
        input.nextLine();
        input_SponsorName();
        input_TotalEarning();
    }
    protected void print_All(){
        print_Name();
        print_SportName();
        print_Age();
        print_Country();
        print_NoOfMatch();
        print_NoOfMedal();
        print_NoOfWorldRecord();
        print_SponsorName();
        print_TotalEarning();
    }
}

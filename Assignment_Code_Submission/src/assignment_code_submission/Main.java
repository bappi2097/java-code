package assignment_code_submission;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter No Of Football Player : ");
        int NoOfFootball=input.nextInt();
        Football [] football;
        football = new Football[NoOfFootball];
        for(int i=0;i<NoOfFootball;i++){
            football[i]=new Football();
            football[i].input_All();
            football[i].input_Gape();
            football[i].input_ClubName();
            football[i].input_NoOfGoals();
            input.nextLine();
            System.out.println("Do You Update (Y/N):");
            String a=input.nextLine();
            if(a.equalsIgnoreCase("Y")){
                football[i].add_NoOfGoals();
                football[i].add_NoOfMatch();
                football[i].add_NoOfMedal();
                football[i].add_NoOfWorldRecord();
            }
            football[i].print_All();
            football[i].print_NoOfGoals();
            football[i].print_ClubName();
        }
        System.out.println("Enter No Of Tennis Player : ");
        int NoOfTennis=input.nextInt();
        Tennis [] tennis=new Tennis[NoOfTennis];
        for(int i=0;i<NoOfTennis;i++){
            tennis[i]=new Tennis();
            tennis[i].input_All();
            input.nextLine();
            System.out.println("Do You Update (Y/N):");
            String a=input.nextLine();
            if(a.equalsIgnoreCase("Y")){
                tennis[i].add_NoOfMatch();
                tennis[i].add_NoOfMedal();
                tennis[i].add_NoOfWorldRecord();
            }
            tennis[i].print_All();
        }
        System.out.println("Enter No Of Sprint Player : ");
        int NoOfSprint=input.nextInt();
        Sprint []sprint=new Sprint[NoOfSprint];
        for(int i=0;i<NoOfSprint;i++){
            sprint[i]=new Sprint();
            sprint[i].input_All();
            input.nextLine();
            System.out.println("Do You Update (Y/N):");
            String a=input.nextLine();
            if(a.equalsIgnoreCase("Y")){
                sprint[i].add_NoOfMatch();
                sprint[i].add_NoOfMedal();
                sprint[i].add_NoOfWorldRecord();
            }
            sprint[i].print_All();
        }
    }
}

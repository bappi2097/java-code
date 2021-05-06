package javalab17_07;
import java.io.File;
import java.util.Scanner;
public class JavaLab17_07Exm {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        String Name,Id,first,second,third;
        try{
            System.out.println("Enter Your Name: ");
            Name=scanf.nextLine();
            System.out.println("Enter Your ID : ");
            Id = scanf.nextLine();
            System.out.println("Enter First Subject :");
            first = scanf.nextLine();
            System.out.println("Enter Second Subject :");
            second = scanf.nextLine();
            System.out.println("Enter Third Subject :");
            third = scanf.nextLine();
            File file = new File("khan.txt");
        }
        catch(Exception e){
            
        }
    }
}

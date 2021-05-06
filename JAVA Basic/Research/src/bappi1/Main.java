package bappi1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String n = input.nextLine();
        System.out.print("Enter Your ID : ");
        String id = input.nextLine();
        Information obj1 = new Information(n,id);
        System.out.print("Enter First Subject Number : ");
        double f = input.nextDouble();
        System.out.print("Enter Second Subject Number : ");
        double s = input.nextDouble();
        System.out.print("Enter Third Subject Number : ");
        double t = input.nextDouble();
        obj1.Grade(f, s, t);
        obj1.PrintInfo();
        System.out.print("Enter Your Name : ");
        n = input.nextLine();
        n = input.nextLine();
        System.out.print("Enter Your ID : ");
        id = input.nextLine();
        Information obj2 = new Information(n,id);
        System.out.print("Enter First Subject Number : ");
        f = input.nextDouble();
        System.out.print("Enter Second Subject Number : ");
        s = input.nextDouble();
        System.out.print("Enter Third Subject Number : ");
        t = input.nextDouble();
        obj2.Grade(f, s, t);
        obj2.PrintInfo();
        
    }
}

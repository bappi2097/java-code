package javafinallabtest;
import java.util.Scanner;
public class JavaFinalLabTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your ID : ");
        String ID = input.nextLine();
        System.out.println("Enter Your Name : ");
        String Name = input.nextLine();
        System.out.println("Total Bill : ");
        double totalBill=input.nextDouble();
        Customer obj = new Customer(ID, Name, totalBill);
        System.out.println("Enter Participants On Seminar : ");
        int p = input.nextInt();
        obj.totalCost_Seminar(p);
        System.out.println("Enter Particpents on WorkShop : ");
        p=input.nextInt();
        System.out.println("Enter Workshop duration : ");
        int d = input.nextInt();
        obj.totalCost_Workshop(p, d);
        obj.Display();
    }
}

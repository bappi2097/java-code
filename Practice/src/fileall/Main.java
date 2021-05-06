package fileall;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String name = input.nextLine();
        System.out.println("Enter ID : ");
        String id = input.nextLine();
        System.out.println("Enter Balance : ");
        double balance = input.nextDouble();
        FileWrite obj = new FileWrite(name, id, balance);
        System.out.println("Enter Deposite Anoubt : ");
        obj.Deposite(input.nextDouble());
        obj.CheckWithdrow();
        obj.Save();
        obj.Display();
    }
}

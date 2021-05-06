package labtest2;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ReservationSystem obj = new ReservationSystem();
        int s = 0;
        boolean b;
        String str = null;
        while (true) {
            System.out.print("Enter The Ticket Class Name : ");
            str = input.nextLine();
            try {
                if (str.equalsIgnoreCase("First Class")) {

                    try {
                        System.out.print("Enter The Number Of Ticket : ");
                        s = input.nextInt();
                    } catch (InputMismatchException e) {
                        System.err.println(e);
                    }
                    if (obj.firstClassAvail(s)) {
                        obj.getEconomyClass(s);
                        obj.Display();
                    } else {
                        System.out.println("All seats are booked.Next flight leaves in 3 hours");
                    }
                } else if (str.equalsIgnoreCase("Economy Class")) {

                    try {
                        System.out.print("Enter The Number Of Ticket : ");
                        s = input.nextInt();
                    } catch (InputMismatchException e) {
                        System.err.println(e);
                    }
                    if (obj.economyClassAvail(s)) {
                        obj.getEconomyClass(s);
                        obj.Display();
                    } else {
                        System.out.println("All seats are booked.Next flight leaves in 3 hours");
                    }
                } else {
                    System.err.println("Wrong Input");
                }
            } catch (NullPointerException e) {
                System.err.println(e);
            }
            System.out.println("Do You want to Buy another Ticket (Y or N) : ");
            str = input.nextLine();
            str = input.nextLine();
            if (str.equalsIgnoreCase("NO") || str.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
}
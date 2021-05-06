package javaonlineproblem;
import java.util.Scanner;
public class Problem14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input total distance in km: ");
        int distance = input.nextInt();
        System.out.print("Input total fuel spent in liters: ");
        int fuel = input.nextInt();
        System.out.printf("Average consumption (km/lt) %.2f",(double)(distance/fuel));
        System.out.println("");
    }
}

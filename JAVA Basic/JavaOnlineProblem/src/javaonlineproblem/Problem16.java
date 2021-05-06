package javaonlineproblem;
import java.util.Scanner;
public class Problem16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input The Amount : ");
        int amount = input.nextInt();
        System.out.println((amount/100)+" Note(s) of 100.00 ");
        amount%=100;
        System.out.println((amount/50)+" Note(s) of 50.00 ");
        amount%=50;
        System.out.println((amount/20)+" Note(s) of 20.00 ");
        amount%=20;
        System.out.println((amount/10)+" Note(s) of 10.00 ");
        amount%=10;
        System.out.println((amount/5)+" Note(s) of 5.00 ");
        amount%=5;
        System.out.println((amount/2)+" Note(s) of 2.00 ");
        amount%=2;
        System.out.println(amount+" Note(s) of 1.00 ");
    }
}

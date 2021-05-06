package javaonlineproblem;
import java.util.Scanner;
public class Problem47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input An Integer : ");
        long number = input.nextInt();
        long count=1;
        System.out.println("All the divisor of "+number+" are :");
        for (long i = 1; i <= (number/2); i++) {
            if(number%i==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(number);
        System.out.println("\nNumber Of Process : "+count);
    }
}

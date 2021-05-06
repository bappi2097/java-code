package javaonlineproblem;
import java.util.Scanner;
public class Problem34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a pair of numbers (for example 10,2 : 2,10):");
        System.out.print("Input First Number Of The Pair : ");
        int lowBound = input.nextInt();
        System.out.print("Input Second Number Of The Pair : ");
        int highBound = input.nextInt();
        System.out.println("List Of Odd Numbers : ");
        int sum=0;
        while(lowBound!=highBound){
            if(lowBound<highBound){
                if(lowBound%2!=0){
                    System.out.println(lowBound);
                    sum+=lowBound;
                }
                lowBound++;
            }
            else if(lowBound>highBound){
                if(highBound%2!=0){
                    System.out.println(highBound);
                    sum+=highBound;
                }
                highBound++;
            }
        }
        System.out.println("Sum = "+sum);
    }
}

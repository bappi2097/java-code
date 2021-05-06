package javaonlineproblem;
import java.util.Scanner;
public class Problem21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = input.nextInt();
        if(number>-1 && number < 81){
            System.out.print("Range [0, ");
            while(number%10!=0){
                number++;
            }
            System.out.println(number+"]");
        }
        else{
            System.out.println("Number Must Be A Positive Number And Greater Then 80");
        }       
    }
}

package javaonlineproblem;
import java.util.Scanner;
public class Problem31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input An Integer : ");
        int number = input.nextInt();
        if(number>-1){
            if(number%2==0){
                System.out.println("Positive Even");
            }
            else{
                System.out.println("Positive Odd");
            }
        }
        else{
            if(number%2==0){
                System.out.println("Negative Even");
            }
            else{
                System.out.println("Negative Odd");
            }
        }
    }
}

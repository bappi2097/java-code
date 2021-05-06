package javaonlineproblem;
import java.util.Scanner;
public class Problem44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,sum=0;
        double count=0;
        System.out.println("Input Mathematics marks (0 to terminate): ");
        number = input.nextInt();
        while(number!=0){
            sum+=number;
            count++;
            number = input.nextInt();
        }
        System.out.println("Average marks in Mathematics: "+(double)(sum/count));
    }
}

package javaonlineproblem;
import java.util.Scanner;
public class Problem32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input An Integer : ");
        int number = input.nextInt();
        int other=(number+3);
        while(other<=500){
            System.out.println(other);
            other+=number;
        }
    }
}

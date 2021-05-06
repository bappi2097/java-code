package javaonlineproblem;
import java.util.Scanner;
public class Problem40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input The First Integer : ");
        int firstNumber = input.nextInt();
        System.out.print("Input The Second Integer : ");
        int secondNumber = input.nextInt();
        for (int i = firstNumber+1; i < secondNumber; i++) {
            if(i%7==2 || i%7==3){
                System.out.println(i);
            }
        }
    }
}

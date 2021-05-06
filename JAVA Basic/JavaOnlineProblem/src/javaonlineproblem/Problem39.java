package javaonlineproblem;
import java.util.Scanner;
public class Problem39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input The First Integer : ");
        int firstNumber = input.nextInt();
        System.out.print("Input The Second Integer : ");
        int secondNumber = input.nextInt();
        int sum=0;
        for (int i = firstNumber; i <= secondNumber; i++) {
            if(i%17==0){
                sum+=i;
            }
        }
        System.out.println("Sum = "+sum);
    }
}

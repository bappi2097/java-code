package javaonlineproblem;
import java.util.Scanner;
public class Problem46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double two = 1 , odd = 1 , sum = 1;
        for (int i = 0; odd < 7; i++) {
            two*=2;
            odd+=2;
            sum+=(odd/two);
        }
        System.out.println("Values Of Series : "+sum);
    }
}


package javaonlineproblem;
import java.util.Scanner;
public class Problem26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Even numbers between 1 to 50 (inclusive): ");
        for (int i = 1; i <= 50; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}

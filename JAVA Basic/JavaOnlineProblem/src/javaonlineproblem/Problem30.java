
package javaonlineproblem;
import java.util.Scanner;
public class Problem30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("List of square of each one of the even values from 1 to : ");
        int range = input.nextInt();
        for (int i = 1; i <=range; i++) {
            if(i%2==0){
                System.out.println(i+"^2 = "+(int)Math.pow(i, 2));
            }
        }
    }
}

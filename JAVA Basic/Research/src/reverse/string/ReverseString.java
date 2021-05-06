package reverse.string;
import javax.swing.*;
import java.util.Scanner;
import java.lang.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int scan = 0 , pot = 0 , count = 1;
        for (int i = 0; i < number; i++) {
            scan=input.nextInt();
            if(scan > pot){
                pot = scan;
            }
            else if(scan == pot){
                count++;
            }
        }
        System.out.println(count);
    }
}

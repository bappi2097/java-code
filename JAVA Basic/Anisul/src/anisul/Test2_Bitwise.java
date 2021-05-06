package anisul;
import java.util.Scanner;
public class Test2_Bitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 32;
        int b = 12;
        int c;
        c = a & b;
        System.out.println(c);
        c = a | b;
        System.out.println(c);
        c = a ^ b;
        System.out.println(c);
    }
}

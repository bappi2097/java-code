package MidExam;
import FinalExam.Calculator1;
import java.util.*;
import java.io.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = 0, result = 0;
        int b = 0;
        try {
            b = input.nextInt();
            a = Double.parseDouble("A");
            Calculator1 obj = new Calculator1();
            result = obj.div(a, b);
        } catch (NumberFormatException | InputMismatchException | ArithmeticException e) {
            System.err.println(e);
        }
        System.out.println("Final : " + result);
        String c = null;
        try {
            if (c.equals("ABC")) {
            }
            System.out.println(c);
        } catch (NullPointerException e) {
            System.err.println(e);
        }
    }
}

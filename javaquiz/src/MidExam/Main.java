package MidExam;
import FinalExam.Calculator;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a=0,result=0;
        int b=0;
        try {
            a = Double.parseDouble("A");
        } catch (NumberFormatException e) {
            System.err.println(e);
        }
        try {
            b = (int) input.nextDouble();
        } catch (InputMismatchException e) {
            System.err.println(e);
        }
        Calculator obj = new Calculator();
        try {
            result = obj.div(a, b);
        } catch (ArithmeticException e) {
            System.err.println(e);
        }
        System.out.println("Final : " + result);
        String c=null;
        try{
            System.out.println(c);
        }catch(NullPointerException e){
            System.err.println(e);
        }
    }

}

package MidExam;
import FinalExam.Calculator11;
import java.util.*;
import java.io.*;

public class Main11 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a=0,result=0;
        int b=0;
        try {
            b = (int) input.nextDouble();
        } catch (InputMismatchException e) {
            System.err.println(e);
        }
        try {
            a = Double.parseDouble("A");
        } catch (NumberFormatException e) {
            System.err.println(e);
        }
        Calculator11 obj = new Calculator11();
        try {
            result = obj.div(a, b);
        } catch (ArithmeticException e) {
            System.err.println(e);
        }
        System.out.println("Final : " + result);
        String s=null;
        try{
            if(s.equals("ABC")){
                System.out.println(s.toString());
            }
        }catch(NullPointerException e){
            System.err.println(e);
        }
    }

}

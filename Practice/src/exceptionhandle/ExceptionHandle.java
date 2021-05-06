//package exceptionhandle;
import java.util.*;
import java.io.FileWriter;
public class ExceptionHandle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            int a=100/0;
            
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        try{
            int []ar=new int[4];
            ar[5]=5;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        try{
            int size=-3;
            int []ar2=new int[size];
        }catch(NegativeArraySizeException e){
            System.out.println(e);
        }
        try{
            String[] s = "a;b;c".split(";");
        }catch(ArrayStoreException e){
            System.out.println(e);
        }
        try{
            int b=input.nextInt();
        }catch(InputMismatchException e){
            System.out.println(e);
        }
        try{
            int c=Integer.parseInt("ABC");
        }catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}

package exceptionhandle;
import java.util.Scanner;
public class Throw1 {
    public static void main(String[] args)throws ArithmeticException {
        Scanner input= new Scanner(System.in);
        Handle obj = new Handle();
        System.out.println("Enter A umber : ");
        try{
            obj.test(input.nextInt());
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
class Handle{
    void test(int a)throws ArithmeticException{
        Scanner input = new Scanner(System.in);
        if(a<=20){
            throw new ArithmeticException("This Is Wrong Number");
        }
    }
}
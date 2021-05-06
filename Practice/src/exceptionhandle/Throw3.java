package exceptionhandle;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Throw3 {
    public static void main(String[] args) throws HandleException{
        Scanner input = new Scanner(System.in);
        HandleException obj = new HandleException();
        System.out.println("Enter A number : ");
        try{
            int a=input.nextInt();
            obj.exception(a);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
class HandleException extends Exception{
    void exception(int a)throws Exception{
        if(a>100){
            throw new Exception("This is a HandleException . ");
        }
    }
}
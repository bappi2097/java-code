package exceptionhandle;
import java.util.Scanner;
public class Throws3 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        try{
            MyException obj = new MyException();
            obj.my(input.nextInt());
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
class MyException extends Exception{

    void my(int a) throws MyException, Exception{
        if(a==0){
            throw new Exception("Value Of This Variable Is 0(Zero)");
        }
    }
}
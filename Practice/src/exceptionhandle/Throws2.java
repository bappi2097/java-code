package exceptionhandle;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Throws2 {

    public void getInt() throws Exception{   
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter a number");
            scan.nextInt();
            throw new InputMismatchException("value must contain only number");
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage()); // Expected "value must contain number
        }
    }

    public static void main(String[]arsgs) throws Exception{
        Throws2 x = new Throws2();
        x.getInt();
    }
}
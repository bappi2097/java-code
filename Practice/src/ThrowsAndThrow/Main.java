package ThrowsAndThrow;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{
            int a=input.nextInt();
            Object obj = new Object(a);
        }catch(MaireFelaException e){
            System.err.println(e);
        }
    }
}

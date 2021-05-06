package MultipleTask;

import InputRequester.InputRequester;
import static java.lang.Math.pow;
import java.util.InputMismatchException;
import java.util.Scanner;
public class NewClass {

    public NewClass() {

    }
    static InputRequester in = new InputRequester();
    public static void main(String[] args) {
        
        int a;
        a = in.requestInt("Enter A number : ");
        System.out.println(a);
        Scanner input = new Scanner(System.in);
        int     sum=25;
        System.out.println(sum++ +" "+ ++sum+" "+sum+" "+ sum-- +" "+ sum);
        System.out.println(pow(10, 2));
        try {
            input.nextInt();
            input.nextLine();
            NewClass1 obj = new NewClass1(Integer.parseInt(input.nextLine()));
            obj.Bappi();
        } catch (InputMismatchException | NumberFormatException e) {
            System.err.println(e);
        } finally {
            bappi();
        }
    }

    public static void bappi() {
        boolean b="1".matches("-?\\d+(\\.\\d+)?");
        System.out.println(b);
        System.out.println("\n" + pow(2, 2));
        
    }
}

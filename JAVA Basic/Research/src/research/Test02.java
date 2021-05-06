package research;
import java.util.Scanner;
public class Test02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        System.out.print("Enter The Size : ");
        int size = input.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("2^"+i+" = "+(int)Math.pow(2, i));
        }
    }
}

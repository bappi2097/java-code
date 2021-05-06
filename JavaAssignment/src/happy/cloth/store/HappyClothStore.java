package happy.cloth.store;
import java.util.Scanner;
public class HappyClothStore {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Shop obj = new Shop();
        System.out.print("Enter Number Of T-Shirt : ");
        double t=input.nextDouble();
        System.out.print("Enter Number Of Jacket : ");
        double j=input.nextDouble();
        obj.calculation(t, j);
        obj.printInfo();
        System.out.println("");
    }
}

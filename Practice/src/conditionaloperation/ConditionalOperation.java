package conditionaloperation;

import java.util.Scanner;

public class ConditionalOperation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Integer value : ");
        int a = input.nextInt();
        boolean b = (a > 100);
        int c = 0;
        while (b) {
            a--;
            b = a > 100;
            c++;
            System.out.println("a=" + a + "\tc=" + c);
        }
        System.out.println("Enter Integer value : ");
        int x = input.nextInt();
        System.out.println("Enter Integer Value : ");
        int y = input.nextInt();
        int max = (x > y) ? x : y;
        System.out.println("Max : " + max);
        System.out.println("Bollean (x<y) : "+(x<y));
        System.out.println("Min : "+((x>y)?y:x));
    }
}

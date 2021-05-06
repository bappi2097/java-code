package javalabtest;
import java.util.Scanner;
public class JavaLabTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FootBaller obj=new FootBaller();
        System.out.print("Enter Name : ");
        String n=input.nextLine();
        System.out.print("Enter Country : ");
        String c=input.nextLine();
        System.out.print("Enter Age : ");
        int a=input.nextInt();
        System.out.print("Enter Number Of Goals : ");
        int g = input.nextInt();
        System.out.print("Enter Number Of Offside : ");
        int o=input.nextInt();
        System.out.print("Enter Number Of Match : ");
        int m=input.nextInt();
        obj.info(n, a, c, g, o, m);
        System.out.print("Increase Goals : ");
        g=input.nextInt();
        obj.increaseGoal(g);
        System.out.print("Increase Offside : ");
        o = input.nextInt();
        obj.increaseOffside(o);
        System.out.print("Increase Match : ");
        m=input.nextInt();
        obj.increaseMatch(m);
        obj.printInfo();
    }
    
}

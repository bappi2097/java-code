package javaonlineproblem;
import java.util.Scanner;
public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 125, b = 12345; 
        long ax = 1234567890; 
        short s = 4043; 
        float x = (float) 2.13459; 
        double dx = 1.1415927; 
        char c = 'W';
        System.out.println(a+" + "+c+" = "+(a+c));
        System.out.println(x+" + "+c+" = "+(x+c));
        System.out.println(dx+" + "+x+" = "+(dx+x));
        System.out.println(dx+" + "+ax+" = "+((int)dx+ax));
        System.out.println(a+" + "+x+" = "+(a+x));
        System.out.println(s+" + "+b+" = "+(s+b));
        System.out.println(ax+" + "+b+" = "+(ax+b));
        System.out.println(s+" + "+c+" = "+(s+c));
        System.out.println(ax+" + "+c+" = "+(ax+c));
    }
}

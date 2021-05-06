package javalab2;
import java.util.Scanner;
public class JavaLab2 {
    public static void main(String[] args) {
        studentinfo std1 = new studentinfo();
        Scanner input = new Scanner(System.in);
        System.out.println("Input Name: ");
        String name = input.nextLine();
        std1.info("101", name, "swe", 0 ,10000);
        std1.showInfo();
    }
}

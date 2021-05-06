package javalab3;
import java.util.Scanner;
public class JavaLab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student obj1= new Student();
        
        System.out.print("inpur id: ");
        String id= input.nextLine();
        
        System.out.print("\ninpur name: ");
        String name= input.nextLine();
        
        obj1.completeReg(id, name);
        
        System.out.print("\ninput java marks: ");
        double j= input.nextDouble();
        
        System.out.print("\ninput db marks: ");
        double d= input.nextDouble();
        
        System.out.print("\ninput algo marks: ");
        double a= input.nextDouble();
        
        obj1.getMarks(a, d, j);
        
        obj1.display();

    }
}

package File;
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Id : ");
        String id = input.nextLine();
        System.out.println("Enter Name : ");
        String name = input.nextLine();
        Filewrite obj = new Filewrite(id, name);
        Fileread obj1=new Fileread();
    }
}

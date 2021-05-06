package Exception;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Enter Your Age : ");
            int age = input.nextInt();
            CheckAge obj = new CheckAge();
            obj.Age(age);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

package javaonlineproblem;
import java.util.Scanner;
public class Problem36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input The Password : ");
        String password = input.nextLine();
        if("1234".equals(password)){
            System.out.println("Correct password");
        }
        else{
            System.out.println("Incorrect password");
        }
    }
}

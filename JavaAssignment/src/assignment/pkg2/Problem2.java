// Password //
package assignment.pkg2;

import java.util.Scanner;

public class Problem2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Password:");
        String passWord = input.nextLine();
        char pot;
        int passWordLen = passWord.length();
        int countLetter = 0 , countNumber = 0, count = 0;
        if( passWordLen > 9){
            for (int i = 0; i < passWordLen; i++) {
                pot = passWord.charAt(i);
                if(pot > 64 && pot < 91 || pot > 96 && pot < 123){
                    countLetter++;
                }
                else if(pot > 47 && pot < 58){
                    countNumber++;
                }
                else{
                    System.out.println("Password consists of only letters and digits!");
                }
            }
            count = countLetter + countNumber;
            if(countNumber >1 && count == passWordLen ){
                System.out.println("It Is A Valid Password");
            }
            else if(countNumber < 2){
                System.out.println("Password Must Contain At Least Two Digits!");
            }
        }
        else{
            System.out.println("Password Must Be At Least 10 Character !");
        }
    }
}


package javaonlineproblem;

import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int len = s.length();
        System.out.print("The reverse of "+s+" is ");
        for (int i = len-1; i >= 0; i--) { 
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}

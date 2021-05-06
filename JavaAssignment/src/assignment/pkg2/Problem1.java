//Word Counter //
package assignment.pkg2;

import java.util.Scanner;

public class Problem1 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter String:");
        String s = input.nextLine();
        char pot;
        int len = s.length();
        int countWord = 1;
        for (int i = 0; i < len; i++) {
            pot = s.charAt(i);
            if(pot == ' ') {
                countWord++;     
            }
        }
        System.out.println("Number Of Word : "+countWord);
    }
    
}

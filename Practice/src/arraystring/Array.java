package arraystring;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String array1[] = {"a", "b", "c", "d"};
        String array2[] = {"a", "b", "c", "d"};
        char[] ch1 = {'M', 'y', ' ', 'N', 'a', 'm', 'e'};
        System.out.println(ch1);
        // method 1 (right)
        if (Arrays.equals(array1, array2)) {
            System.out.println("Both string are mathced");
        } else {
            System.out.println("String not matched");
        }

        // mehtod 2 (error)
        if (array1 == array2) {
            System.out.println("Both string are matched");
        } else {
            System.out.println("String not matched");
        }
    }
}

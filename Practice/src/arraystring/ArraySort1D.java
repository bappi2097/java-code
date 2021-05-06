package arraystring;
import java.util.Arrays;
import java.util.Scanner;
public class ArraySort1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i]=input.nextInt();
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
}

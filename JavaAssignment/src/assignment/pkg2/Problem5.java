// Reverse Array //
package assignment.pkg2;
import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = input.nextInt();
        int [] array = new int[size];
        int [] arrayPot = new int[size];
        System.out.print("Enter Array Value : ");
        for (int i = 0; i < size; i++) {
            array[i]=input.nextInt();
        }
        int reverse = size;
        for (int i = 0; i < size; i++) {
            reverse--;
            arrayPot[reverse]=array[i];
        }
        System.out.print("After Reverse The Array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arrayPot[i]+" ");
        }
        System.out.println();
    }
    
}

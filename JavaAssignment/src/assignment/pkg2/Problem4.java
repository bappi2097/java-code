// Second Leargest Number //
package assignment.pkg2;
import java.util.Scanner;
public class Problem4 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Array Size : ");
        int arraySize = input.nextInt();
        int [] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("\nEnter Number : ");
            array[i] = input.nextInt();
        }
        int pot ;
        for (int i = 0; i < arraySize ; i++) {
            for (int j = 0; j < arraySize - 1 ; j++) {
                if(array[j+1] > array[j]){   
                    pot = array[j+1];
                    array[j+1] = array[j];
                    array[j]=pot;
                }
            }
        }
        System.out.println("The Second Largest Number Is "+array[1]);
    }
    
}

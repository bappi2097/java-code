package algorithm.lab;
import java.util.Scanner;
public class TwoArrayIntoOneWithoutSorted {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Array Size : ");
        int sizeA = input.nextInt();
        System.out.print("\nEnter The Value Of Array : ");
        int [] arrayA = new int[sizeA];
        for (int i = 0; i < sizeA; i++) {
            arrayA[i] = input.nextInt();
        }
        System.out.print("\nEnter Second Array Size : ");
        int sizeB = input.nextInt();
        int []arrayB = new int[sizeB];
        System.out.print("\nEnter The Value Of Array : ");
        for (int i = 0; i < sizeB; i++) {
            arrayB[i]=input.nextInt();
        }
        int [] arrayAB= new int[sizeA+sizeB];
        for (int i = 0; i < sizeA; i++) {
            arrayAB[i]=arrayA[i];
        }
        int count=0;
        for (int i = sizeA; i < sizeA+sizeB; i++) {
            arrayAB[i]=arrayB[count];
            count++;
        }
        System.out.print("\nThe Full Array : ");
        for (int i = 0; i < sizeA+sizeB; i++) {
            System.out.print(arrayAB[i]+" ");
        }
    }
}
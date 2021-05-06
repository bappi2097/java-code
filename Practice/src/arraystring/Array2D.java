package arraystring;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Array's Row Size :");
        int r = input.nextInt();
        System.out.println("Enter Array's Column Size : ");
        int c= input.nextInt();
        System.out.println("Enter Array's Element : ");
        int [][] array = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

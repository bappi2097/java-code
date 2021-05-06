package javaonlineproblem;
import java.util.Scanner;
public class Problem22_b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input The First Integer:");
        int []array;
        array = new int[3];
        array[0] = input.nextInt();
        System.out.print("Input The Second Integer:");
        array[1] = input.nextInt();
        System.out.print("Input The Third Integer:");
        array[2] = input.nextInt();
        int pot;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if(array[j]>array[j+1]){
                    pot = array[j];
                    array[j]=array[j+1];
                    array[j+1]=pot;
                }
            }
        }
        System.out.println("Numbers in sorted order: "+array[0]+" "+array[1]+" "+array[2]);
    }
}

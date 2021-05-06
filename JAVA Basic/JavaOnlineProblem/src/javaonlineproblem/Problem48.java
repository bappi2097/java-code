package javaonlineproblem;
import java.util.Scanner;
public class Problem48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input The Five Members Of The Array : ");
        int [] array;
        array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = input.nextInt();
            if(array[i]<=0){
                array[i]=100;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("n["+i+"] = "+array[i]);
        }
    }
}

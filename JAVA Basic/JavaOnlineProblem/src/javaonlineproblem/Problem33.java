package javaonlineproblem;
import java.util.Scanner;
public class Problem33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int potNumber,potIndex=1;
        System.out.println("Input Five Integer : ");
        int []array;
        array= new int[5];
        array[0]=input.nextInt();
        potNumber = array[0];
        for (int i = 1; i < 5; i++) {
            array[i]=input.nextInt();
            if(array[i]>potNumber){
                potNumber=array[i];
                potIndex=i+1;
            }
        }
        System.out.println("Highest Value : "+potNumber);
        System.out.println("Position : "+potIndex);
    }
}

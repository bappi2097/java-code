
package javaonlineproblem;
import java.util.Scanner;
public class Problem28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input The First Number : ");
        int []array;
        int positive=0,sum=0;
        array = new int[5];
        array[0]=input.nextInt();
        System.out.print("Input The Second Number : ");
        array[1]=input.nextInt();
        System.out.print("Input The Third Number : ");
        array[2]=input.nextInt();
        System.out.print("Input The Fourth Number : ");
        array[3]=input.nextInt();
        System.out.print("Input The Fifth Number : ");
        array[4]=input.nextInt();
        for (int i = 0; i < 5; i++) {
            if(array[i]>-1){
                positive++;
                sum+=array[i];
            }
        }
        System.out.println("Number Of Positive Numbers : "+positive);
        System.out.printf("Average value of the said positive numbers: %.2f",(double)(sum/positive));
        System.out.println("");
    }
}

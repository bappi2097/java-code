package arraystring;
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int marks[]=new int [5];
        int New[]=new int[5];
        for (int i = 0; i < 5; i++) {
            marks[i]=input.nextInt();
        }
        for(int i : marks)System.out.println(i+"\n");
    }
}

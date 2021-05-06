package javaonlineproblem;
import java.util.Scanner;
public class Problem19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input The First Integer: ");
        int p = input.nextInt();
        System.out.print("Input The Second Integer: ");
        int q = input.nextInt();
        System.out.print("Input The Third Integer: ");
        int r = input.nextInt();
        System.out.print("Input The Fourth Integer: ");
        int s = input.nextInt();
        if(r>-1 && s > -1 && p%2==0 ){
            if(q>r && s>p){
                if((r+s)>(p+q)){
                    System.out.println("Correct values");
                }
                else{
                    System.out.println("Wrong values ");
                }
            }
            else{
                System.out.println("Wrong values ");
            }
        }
        else{
            System.out.println("Wrong values ");
        }
    }
}

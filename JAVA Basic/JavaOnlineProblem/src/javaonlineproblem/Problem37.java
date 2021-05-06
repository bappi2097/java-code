
package javaonlineproblem;
import java.util.Scanner;
public class Problem37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the Coordinate(x,y):");
        System.out.print("X : ");
        int x = input.nextInt();
        System.out.print("Y : ");
        int y = input.nextInt();
        if(x>-1){
            if(y>-1){
                System.out.println("Quadrant-I(+,+) ");
            }
            else{
                System.out.println("Quadrant-IV(+,-) ");
            }
        }
        else{
            if(y>-1){
                System.out.println("Quadrant-II(-,+) ");
            }
            else{
                System.out.println("Quadrant-III(-,-) ");
            }
        }
    }
}

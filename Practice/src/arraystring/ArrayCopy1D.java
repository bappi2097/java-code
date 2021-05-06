package arraystring;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayCopy1D {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int [] a={1,2,3,4,5};
        int [] b={10,20,30,40,50};
        System.arraycopy(a,0,b,0,3);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        if(Arrays.equals(a, b)){
            
        }
        String str1 = "I Love";
        String str2 = "Bangladesh";

        System.out.println(str1.concat(" " + str2));
    }
    public void IntArray(int [] a,int [] b){
        
    }
}

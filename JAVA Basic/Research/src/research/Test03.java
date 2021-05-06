package research;
import java.util.Scanner;
public class Test03 {    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,m,i=0,j=0,count=0;
        System.out.println("Enter starting number: ");
        m=in.nextInt();
        System.out.println("Enter last number: ");
        n=in.nextInt();
        for(i=m;i<=n;i++){
            count = 0;
            for(j=2;j<=i/2;j++){
                if(i%j==0){
                    count=1;
                    break;
                }
            }
            if(count==0){
            System.out.println(""+i);
            }
        }
    }
}

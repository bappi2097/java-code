
package fibonakki;

public class Fibonakki {

    public static void main(String[] args) {
        int a=1,b=1,c,d=2,f;
        int [] e = new int[100];
        e[0]=a;
        e[1]=b;
        e[2]=0;
        for (int i = 2;i < 100; i++) {
            c=a+b;
            a=b;
            b=c;
            d++;
            if(c>100){
                break;
            }
            else{
                
            e[i]=c;
            }
        }
        for (int i = 0; i < d-1; i++) {
            System.out.println(e[i]);
        }
    }
    
}

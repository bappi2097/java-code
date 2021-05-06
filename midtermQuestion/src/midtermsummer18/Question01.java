package midtermsummer18;
import java.util.Scanner;
import java.lang.Math;
public class Question01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Two Integer :");
        int a = input.nextInt();
        int b = input.nextInt();
        int c=Swap(a,b);
        System.out.println("Enter Base & Height :");
        double base =input.nextDouble();
        double height =input.nextDouble();
        double r=AreaTriangle(base, height);
        System.out.println("Enter CGPA :");
        double cgpa = input.nextDouble();
        GetWeiver(cgpa);
        System.out.println("Enter Two Integer :");
        int n=input.nextInt();
        int p=input.nextInt();
        int re=Power(n, p);
    }
    public static int Swap(int a,int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        return (int)b;
    }
    public static double AreaTriangle(double base , double height){
        return (.5*base*height);
    }
    public static void GetWeiver(double cgpa){
        if(cgpa>3.75){
            System.out.println("recive 100% waiver");
        }
        else if(cgpa>=3.50 && cgpa<=3.75){
            System.out.println("receive 50%");
        }
        else if(cgpa<3.50){
            System.out.println("No waiver");
        }
    }
    public static int Power(int n,int p){
        if(n%2==1)
            return (int) Math.pow(n, p);
        else
            return (int) Math.pow(p, n);
    }
}

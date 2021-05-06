package abcfactoryv2.pkg0;
import java.util.Scanner;
public class Supervisor extends Person{
    private Scanner input=null;
    protected Supervisor(){
        super();
        input=new Scanner(System.in);
    }
    protected boolean check_Discount(int n){
        if(n>10000)return true;
        else return false;
    }
}

package abcfactory;
import java.util.Scanner;
public class Supervisor extends Person{
    private Scanner input=null;
    private int NoOfClient;
    protected Supervisor(int n){
        super();
        input=new Scanner(System.in);
        NoOfClient=n;
    }
    protected boolean check_OrderOfRegisteredClient(int n){
            if(n>10000){
                return true;
            }
            else return false;
        
    }
    
}

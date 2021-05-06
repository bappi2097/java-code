package javalab1;
import java.util.Scanner;
public class JavaLab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        account acc1 = new account();
        acc1.Initialvalue("acc101", "Bappi", 100.0);
        acc1.deposite(5000);
        acc1.withdraw(600);
        acc1.shoeacc();
        account acc2 = new account();
        acc2.Initialvalue("acc102", "Dipta", 1000.0);
        acc2.deposite(5000);
        acc2.withdraw(600);
        acc2.shoeacc();
        /*
        ** object create kora
        ** instance kora
        ** reference crete kora
        */
    //    account acc3 = new account();
    //    acc3.acc_no = "acc101";
    }
}

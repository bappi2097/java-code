package javalab1;

public class account {
    String acc_no;
    String acc_owner;
    double balance = 0.0;
    public void Initialvalue(String a,String o, double b){
        acc_no = a;
        acc_owner = o;
        balance = b;
                
    }
    public void deposite(double d){
        balance = balance + d;
    }
    public void withdraw(double d){
        balance = balance - d;
    }
    public void shoeacc(){
        System.out.println("Account Number: "+acc_no);
        System.out.println("Account Owner: "+acc_owner);
        System.out.println("Balance"+balance);
    }
}

package jsaiskcode;

public class NonRegCustomer {
    String Name,Phone;
    double totalBill;
    final double tax=0.02;
    
    protected void set_Name(String n){
        Name=n;
    }
    protected String get_Name(){
        return Name;
    }
    
    protected void set_Phone(String p){
        Phone=p;
    }
    protected String get_Phone(){
        return Phone;
    }
    public void Bill_Calculation(double b){
        totalBill=b+(b*tax);
    }
    public double Get_Bill(){
        return totalBill;
    }
}

package jsaiskcode;

import Interface.OrderInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Order implements OrderInterface{
    private double TotalBill=0,Discount;
    private int ShirtAmount=0,PantAmount=0;
    private String Phone;
    @Override
    public void calculate_TotalBill(){
        TotalBill=ShirtAmount*399+PantAmount*599;
    }
    @Override
    public double get_Discount(){
        return Discount;
    }
    @Override
    public void calculate_Discount(){
        Discount=TotalBill*.05;
        TotalBill-=Discount;
    }
    @Override
    public double get_TotalBill(){
        return TotalBill;
    }
    protected void set_ShirtAmount(int a){
        ShirtAmount=a;
    }
    protected int get_ShirtAmount(){
        return ShirtAmount;
    }
    protected void set_PantAmount(int a){
        PantAmount=a;
    }
    protected int get_PantAmount(){
        return PantAmount;
    }
    protected void set_Phone(String t){
        Phone=t;
    }
    protected String get_Phone(){
        return Phone;
    }
    protected void save_Bill(){
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = con.connect();
        String sql = "INSERT INTO Bill (Phone,Bill) VALUES (?,?);";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, get_Phone());
            pst.setString(2, String.valueOf(get_TotalBill()));
            pst.executeUpdate();
            System.out.println("save successfull");
            pst.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Records created successfully");
    }
}

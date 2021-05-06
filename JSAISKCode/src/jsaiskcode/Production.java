package jsaiskcode;
import Interface.ProductionInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Production implements ProductionInterface{
    private String productionCost,TotalBill;
    private String Year;
    private String Profit;
    protected void set_ProductionCost(String p ){
        productionCost= p;
    }
    protected String get_ProductionCost(){
        return productionCost;
    }
    protected void set_Year(String y){
        Year= y;
    }
    protected String get_Year(){
        return Year;
    }
    protected void set_TotalBill(String Bill){
        TotalBill = Bill;
    }
    protected String get_TotalBill(){
        return TotalBill;
    }
    
    @Override
    public void save_productionCost(){
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = con.connect();
        String sql = "INSERT INTO Production (ProductionCost,Year) VALUES (?,?);";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, get_ProductionCost());
            pst.setString(2, get_Year());
            pst.executeUpdate();
            System.out.println("save successfull");
            pst.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Records created successfully");
    }
    
    @Override
    public void get_TotalBillFromDB(){
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = con.connect();
        try {
            Statement stmt = null;
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT SUM(Bill) FROM Bill ;");
            
            set_TotalBill(rs.getString("SUM(Bill)"));
            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
    protected String get_Profit(){
        return Profit;
    }
    @Override
     public void set_Profit(){
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = con.connect();
        try {
            Statement stmt = null;
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT SUM(Bill) FROM Bill ;");
            
            set_TotalBill(rs.getString("SUM(Bill)"));
            rs.close();
            ResultSet rs1 = stmt.executeQuery("SELECT ProductionCost FROM Production where Serial"
                    + "= (select Max(Serial) From Production) ;");
            set_ProductionCost(rs1.getString("ProductionCost"));
            Profit=String.valueOf(Double.parseDouble(TotalBill)-Double.parseDouble(get_ProductionCost()));
            
            stmt.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
            
}

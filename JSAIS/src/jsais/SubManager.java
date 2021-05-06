package jsais;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SubManager extends Person {

    protected void save_Info() {
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = con.connect();
        String sql = "INSERT INTO Manager (Name,ID,Address,Phone,Age,Password) VALUES (?,?,?,?,?,?);";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, "");
            pst.setString(2, get_ID());
            pst.setString(3, "");
            pst.setString(4, "");
            pst.setString(5, "");
            pst.setString(6, get_Password());
            pst.executeUpdate();
            System.out.println("save successfull");
            pst.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Records created successfully");
    }

    protected void Update_Name(String UserID, String Name) {
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = con.connect();
        String sql = "Update Manager set Name = ? where ID =" + UserID + " ;";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, Name);
            pst.executeUpdate();
            System.out.println("save successfull");
            pst.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Records created successfully");
    }

    protected void Update_Address(String UserID, String Address) {
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = con.connect();
        String sql = "Update Manager set Address = ? where ID =" + UserID + " ;";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, Address);
            pst.executeUpdate();
            System.out.println("save successfull");
            pst.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Records created successfully");
    }

    protected void Update_Phone(String UserID, String Phone) {
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = con.connect();
        String sql = "Update Manager set Phone = ? where ID =" + UserID + " ;";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, Phone);
            pst.executeUpdate();
            System.out.println("save successfull");
            pst.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Records created successfully");
    }

    protected void Update_Age(String UserID, int Age) {
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = con.connect();
        String sql = "Update Manager set Age = ? where ID =" + UserID + " ;";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, String.valueOf(Age));
            pst.executeUpdate();
            System.out.println("save successfull");
            pst.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Records created successfully");
    }

    protected void set_ManagerInfo(String UserID) {
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = con.connect();
        try {
            Statement stmt = null;
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Manager Where ID = " + UserID + ";");
            
            set_Name(rs.getString("Name"));
            set_ID(rs.getString("ID"));
            set_Addres(rs.getString("Address"));
            set_Phone(rs.getString("Phone"));
            set_Age(Integer.parseInt(rs.getString("Age")));
            set_Password(rs.getString("Password"));

            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}

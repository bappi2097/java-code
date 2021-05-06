package jsaiskcode;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SubManager extends Person {

    private String Salary;

    protected void set_Salary(String n) {
        Salary = n;
    }

    protected String get_Salary() {
        return Salary;
    }

    @Override
    protected void save_Info() {
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = con.connect();
        String sql = "INSERT INTO Manager (Name,ID,Address,Phone,Age,Password,Salary) VALUES (?,?,?,?,?,?,?);";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, "");
            pst.setString(2, get_ID());
            pst.setString(3, "");
            pst.setString(4, "");
            pst.setString(5, "0");
            pst.setString(6, get_Password());
            pst.setString(7, get_Salary());
            pst.executeUpdate();
            System.out.println("save successfull");
            pst.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Records created successfully");
    }

    protected void Update_ID(String UserID, String ID) {
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = con.connect();
        String sql = "Update Manager set Name = ? where ID = ? ;";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, ID);
            pst.setString(2, UserID);
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
        String sql = "Update Manager set Name = ? where ID =? ;";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, Name);
            pst.setString(2, UserID);
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
        String sql = "Update Manager set Address = ? where ID =? ;";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, Address);
            pst.setString(2, UserID);
            pst.executeUpdate();
            System.out.println("save successfull");
            pst.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Records created successfully");
    }

    protected void Update_Password(String UserID, String Password) {
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = con.connect();
        String sql = "Update Manager set Password = ? where ID =?;";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, Password);
            pst.setString(2, UserID);
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
        String sql = "Update Manager set Phone = ? where ID =? ;";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, Phone);
            
            pst.setString(2, UserID);
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
        String sql = "Update Manager set Age = ? where ID =? ;";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, String.valueOf(Age));
            pst.setString(2, UserID);
            pst.executeUpdate();
            System.out.println("save successfull");
            pst.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Records created successfully");
    }

    protected void Update_Salary(String UserID, String Salary) {
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = con.connect();
        String sql = "Update Manager set Salary = ? where ID =? ;";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, Salary);
            
            pst.setString(2, UserID);
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
            String sql = "SELECT * FROM Manager Where ID = ?;";
            try (PreparedStatement pst = c.prepareStatement(sql)) {
                pst.setString(1, UserID);
                ResultSet rs =null;
                rs = pst.executeQuery();

                set_Name(rs.getString("Name"));
                set_ID(rs.getString("ID"));
                set_Addres(rs.getString("Address"));
                set_Phone(rs.getString("Phone"));
                set_Age(Integer.parseInt(rs.getString("Age")));
                set_Password(rs.getString("Password"));
                set_Salary(rs.getString("Salary"));

                rs.close();
                pst.close();
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

}

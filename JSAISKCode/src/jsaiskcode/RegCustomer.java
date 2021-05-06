package jsaiskcode;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class RegCustomer extends Person {

    private String Type, TNXID;

    protected void set_Type(String n) {
        Type = n;
    }

    protected String get_Type() {
        return Type;
    }

    protected void set_TNXID(String n) {
        TNXID = n;
    }

    protected String get_TNXID() {
        return TNXID;
    }

    @Override
    protected void save_Info() {
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = con.connect();
        String sql = "INSERT INTO RegCustomer (Name,Phone,TNXID,Address,Password,Type) VALUES (?,?,?,?,?,?);";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, get_Name());
            pst.setString(2, get_Phone());
            pst.setString(3, get_TNXID());
            pst.setString(4, get_Address());
            pst.setString(5, get_Password());
            pst.setString(6, get_Type());
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
        String sql = "Update Manager set Name = ? where ID =" + UserID + " ;";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, ID);
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

    protected void Update_Password(String Phone, String Password) {
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = con.connect();
        String sql = "Update RegCustomer set Password = ? where Phone = ? ;";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, Password);
            pst.setString(2,Phone);
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

    protected void Update_Type(String Phone) {
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = con.connect();
        String sql = "Update RegCustomer set Type = ? where Phone = ? ;";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, "Reg");
            pst.setString(2, Phone);
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

    protected void Update_Salary(String UserID, String Salary) {
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = con.connect();
        String sql = "Update Manager set Salary = ? where ID =" + UserID + " ;";
        try {
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, Salary);
            pst.executeUpdate();
            System.out.println("save successfull");
            pst.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Records created successfully");
    }

    protected void set_RegCustomerInfo(String Phone) {
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = con.connect();
        try {
            String sql ="SELECT * FROM RegCustomer Where Phone = ?;";
            PreparedStatement pst =c.prepareStatement(sql);
            pst.setString(1, Phone);
            ResultSet rs =null;
            rs=pst.executeQuery();
            set_Name(rs.getString("Name"));
            set_Phone(rs.getString("Phone"));
            set_TNXID(rs.getString("TNXID"));
            set_Addres(rs.getString("Address"));
            set_Password(rs.getString("Password"));
            set_Type(rs.getString("Type"));

            rs.close();
            pst.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    protected void set_RegCustomerInfoTNXID(String TNXID) {
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = con.connect();
        try {
            Statement stmt = null;
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM RegCustomer Where TNXID = " + TNXID + ";");
            set_Name(rs.getString("Name"));
            set_Phone(rs.getString("Phone"));
            set_TNXID(rs.getString("TNXID"));
            set_Addres(rs.getString("Address"));
            set_Password(rs.getString("Password"));
            set_Type(rs.getString("Type"));

            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
    protected void search_TNXID(String TNXID) {
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = con.connect();
        try {
            Statement stmt = null;
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT TNXID FROM RegCustomer Where TNXID = " + TNXID + ";");
            set_Name(rs.getString("Name"));
            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

}

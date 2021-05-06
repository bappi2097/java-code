package databaseexemple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseExemple {

    public static void main(String[] args) {
        
        DatabaseConnect db = new DatabaseConnect();
        Connection con = db.Connect();
        Statement stmt=null;
        ResultSet rs = null;
        String Sql="select * from user";
        
        try{
            stmt=con.createStatement();
            rs=stmt.executeQuery(Sql);
            while(rs.next()){
                
                String Email=rs.getString("Email");
                String Name=rs.getString("Name");
                int Semester=rs.getInt("Semester");
                
                System.out.println("Name:"+Name);
                System.out.println("Email:"+Email);
                System.out.println("Semester:"+Semester);
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
        
    }
    
}

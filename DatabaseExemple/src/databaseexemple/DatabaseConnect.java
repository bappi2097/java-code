
package databaseexemple;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnect {
    private String connectionUrl = "jdbc:mysql://localhost/diu"; 
    private String Username="diu_user";
    private String Password="diu2018#SWE";
    private Connection con=null;

    
    public Connection Connect(){
        try {     
         Class.forName("com.mysql.jdbc.Driver");  
         con = DriverManager.getConnection(connectionUrl,Username,Password);  
        }catch (Exception e) {  
          System.out.println(e); 
        }
        return  con;
    }
    
    
}

package javaproject;
import java.sql.Connection;
import java.sql.DriverManager;
public class SQLiteDBconnection {
    public static Connection connect () {
     Connection con = null;
      try {
         Class.forName("org.sqlite.JDBC");
         con = DriverManager.getConnection("jdbc:sqlite:E:\\JAVA\\javaproject\\javaproject.sqlite");
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
      System.out.println("Opened database successfully");
      return con;
    }
    
}

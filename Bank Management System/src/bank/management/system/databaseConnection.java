package bank.management.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseConnection {
    public Connection connect() {
     Connection con = null;
      try {
         Class.forName("org.sqlite.JDBC");
         con = DriverManager.getConnection("jdbc:sqlite:F:\\DOCUMENTS\\DIU\\SUMMER 18-23\\SWE 132\\CODE\\Bank Management System\\Account_holder.sqlite");
      } catch ( ClassNotFoundException | SQLException e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
         System.out.println("My name is Khan");
      }
      System.out.println("Opened database successfully");
      return con;
    }
}

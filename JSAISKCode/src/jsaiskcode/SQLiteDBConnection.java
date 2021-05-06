package jsaiskcode;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class SQLiteDBConnection {
    public static Connection connect () {
     Connection con = null;
      try {
         Class.forName("org.sqlite.JDBC");
         con = DriverManager.getConnection("jdbc:sqlite:E:\\JAVA\\JSAISKCode\\jsais.sqlite");
      } catch ( ClassNotFoundException | SQLException e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
      System.out.println("Opened database successfully");
      return con;
    }
    
}


package sqlliteexample2;
 
import java.sql.Connection;
import java.sql.DriverManager;

public class SQLiteJDBCDriverConnection {
    public Connection connect() {
     Connection con = null;
      try {
         Class.forName("org.sqlite.JDBC");
         con = DriverManager.getConnection("jdbc:sqlite:E:\\Database\\bappi.sqlite");
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
      System.out.println("Opened database successfully");
      
      return con;
    }
}

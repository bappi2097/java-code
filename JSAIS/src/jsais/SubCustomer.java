package jsais;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
public class SubCustomer extends Person{
    protected void save_Info(){
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c=con.connect();
        /*ID =  txtTeacherID.getText();
        Password = txtPassword.getText();
        confirmPassword=txtConfirmPassword.getText();
        if(Password.contains(confirmPassword)){  
            String sql = "INSERT INTO teacher (Name,ID,PhoneNumber,Email,Address,Password,Gender,Age) VALUES (?,?,?,?,?,?,?,?);"; 
            try {
                PreparedStatement pst = c.prepareStatement(sql);
                pst.setString(1,"");
                pst.setString(2,ID);
                pst.setString(3,"");
                pst.setString(4,"");
                pst.setString(5,"");
                pst.setString(6,Password);
                pst.setString(7, "");
                pst.setString(8, "");
                pst.executeUpdate();
                System.out.println("save successfull");
                pst.close();
                c.close();
            }
            catch ( Exception e ) {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            }
        System.out.println("Records created successfully");
        }
        else{
            JOptionPane.showMessageDialog(null, "Wrong password Input");
            txtPassword.setText(null);
            txtConfirmPassword.setText(null);
        }*/
    }
}

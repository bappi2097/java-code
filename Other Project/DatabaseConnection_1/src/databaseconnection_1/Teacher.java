package databaseconnection_1;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Teacher extends javax.swing.JFrame {

    public Teacher() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTeacherUserID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTeacherPassword = new javax.swing.JPasswordField();
        btnTeacherLogin = new javax.swing.JButton();
        btnTeacherPrevious = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("User ID : ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 65, 35));

        txtTeacherUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeacherUserIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtTeacherUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 184, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 80, 35));
        getContentPane().add(txtTeacherPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 184, 40));

        btnTeacherLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTeacherLogin.setText("Log In");
        btnTeacherLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeacherLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnTeacherLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));

        btnTeacherPrevious.setText("<<Previous");
        btnTeacherPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeacherPreviousActionPerformed(evt);
            }
        });
        getContentPane().add(btnTeacherPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\jon-tyson-597590-unsplash copy.JPG")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTeacherPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeacherPreviousActionPerformed
        // TODO add your handling code here:
        Main mainObj = new Main();
        setVisible(false);
        mainObj.setVisible(true);
    }//GEN-LAST:event_btnTeacherPreviousActionPerformed

    private void btnTeacherLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeacherLoginActionPerformed
        // TODO add your handling code here:
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = SQLiteDBConnection.connect();
        ResultSet rs = null;
        String userID = txtTeacherUserID.getText();
        String Password = txtTeacherPassword.getText();
        try {
            String sql = "select ID,Password from teacher where ID ='" + txtTeacherUserID.getText() + "'";
            try (PreparedStatement pst = c.prepareStatement(sql)) {
                rs = pst.executeQuery();
                if (Password.equals(rs.getString("Password"))) {
                    pst.close();
                    c.close();
                    TeacherHome teachhome = new TeacherHome(userID);
                    setVisible(false);
                    teachhome.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong Password");
                    txtTeacherUserID.setText(null);
                    txtTeacherPassword.setText(null);
                }
            }
            c.close();
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "Wrong UserID");
        }

    }//GEN-LAST:event_btnTeacherLoginActionPerformed

    private void txtTeacherUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeacherUserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeacherUserIDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTeacherLogin;
    private javax.swing.JButton btnTeacherPrevious;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtTeacherPassword;
    private javax.swing.JTextField txtTeacherUserID;
    // End of variables declaration//GEN-END:variables
}

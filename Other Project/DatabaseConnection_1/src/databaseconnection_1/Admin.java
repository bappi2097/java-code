/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseconnection_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Anonymous
 */
public class Admin extends javax.swing.JFrame {
    public Admin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtAdminUserID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAdminPassword = new javax.swing.JPasswordField();
        btnAdminPrevious = new javax.swing.JButton();
        btnAdminLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(626, 457));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("User ID : ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 65, 35));

        txtAdminUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdminUserIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtAdminUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 184, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 90, 35));
        getContentPane().add(txtAdminPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 184, 40));

        btnAdminPrevious.setBackground(new java.awt.Color(255, 102, 102));
        btnAdminPrevious.setText("<<Previous");
        btnAdminPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminPreviousActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdminPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnAdminLogin.setBackground(new java.awt.Color(0, 153, 102));
        btnAdminLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdminLogin.setText("Log In");
        btnAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdminLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 120, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\jon-tyson-597590-unsplash copy.JPG")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminPreviousActionPerformed
        // TODO add your handling code here:
        Main mainObj = new Main();
        setVisible(false);
        mainObj.setVisible(true);
    }//GEN-LAST:event_btnAdminPreviousActionPerformed

    private void btnAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminLoginActionPerformed
        // TODO add your handling code here:
        AdminHome adminObj = new AdminHome();
        String userID = txtAdminUserID.getText();
        String password = txtAdminPassword.getText();
        if(userID.equals("1") && password.equals("1")){
            setVisible(false);
            adminObj.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Wrong User Id Or Password");
            txtAdminPassword.setText(null);
            txtAdminUserID.setText(null);
        }
    }//GEN-LAST:event_btnAdminLoginActionPerformed

    private void txtAdminUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdminUserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdminUserIDActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminLogin;
    private javax.swing.JButton btnAdminPrevious;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtAdminPassword;
    private javax.swing.JTextField txtAdminUserID;
    // End of variables declaration//GEN-END:variables
}

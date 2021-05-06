package databaseconnection_1;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTeacher = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        btnWxit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTeacher.setBackground(new java.awt.Color(0, 153, 153));
        btnTeacher.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTeacher.setIcon(new javax.swing.ImageIcon("E:\\JAVA\\admin logo 3.png")); // NOI18N
        btnTeacher.setText("TEACHER");
        btnTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeacherActionPerformed(evt);
            }
        });
        getContentPane().add(btnTeacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 160, 60));

        btnAdmin.setBackground(new java.awt.Color(0, 153, 153));
        btnAdmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdmin.setIcon(new javax.swing.ImageIcon("E:\\JAVA\\admin logo 2.png")); // NOI18N
        btnAdmin.setText("ADMIN");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 160, 60));

        btnWxit.setBackground(new java.awt.Color(153, 153, 255));
        btnWxit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnWxit.setText("Exit");
        btnWxit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWxitActionPerformed(evt);
            }
        });
        getContentPane().add(btnWxit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 91, 34));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\back home copy.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
        Admin adminObj = new Admin();
        setVisible(false);
        adminObj.setVisible(true);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeacherActionPerformed
        // TODO add your handling code here:
        Teacher teacherObj = new Teacher();
        setVisible(false);
        teacherObj.setVisible(true);
    }//GEN-LAST:event_btnTeacherActionPerformed

    private void btnWxitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWxitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnWxitActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnTeacher;
    private javax.swing.JButton btnWxit;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

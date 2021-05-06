package databaseconnection_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TeacherInformationUpdate extends javax.swing.JFrame {

    String Name = "", TeacherID = "", Number = "", Email = "", Address = "", Gender = "";
    String Age = "";

    public TeacherInformationUpdate(String ID) {
        TeacherID = ID;
        initComponents();
    }

    private TeacherInformationUpdate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        txtTeacherName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        rdbtnMale = new javax.swing.JRadioButton();
        rdbtnFemale = new javax.swing.JRadioButton();
        cmbDD = new javax.swing.JComboBox<>();
        cmbMM = new javax.swing.JComboBox<>();
        cmbYYYY = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 69, -1));
        getContentPane().add(txtTeacherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 185, 31));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Phone Number :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 100, -1));
        getContentPane().add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 185, 30));
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 185, 31));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 185, 31));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Email :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 69, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Address");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 69, 20));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, -1, -1));

        jButton2.setText("<<Previous");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, -1, -1));

        buttonGroup1.add(rdbtnMale);
        rdbtnMale.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbtnMale.setText("Male");
        getContentPane().add(rdbtnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        buttonGroup1.add(rdbtnFemale);
        rdbtnFemale.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rdbtnFemale.setText("Female");
        getContentPane().add(rdbtnFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, -1));

        cmbDD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbDD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(cmbDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 367, -1, -1));

        cmbMM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbMM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(cmbMM, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 367, -1, -1));

        cmbYYYY.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbYYYY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YYYY", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989" }));
        getContentPane().add(cmbYYYY, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 367, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 69, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Birthdate");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 69, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\jon-tyson-597590-unsplash copy.JPG")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        TeacherHome teacherObj = new TeacherHome(TeacherID);
        setVisible(false);
        teacherObj.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = SQLiteDBConnection.connect();
        Name = txtTeacherName.getText();
        Number = txtPhoneNumber.getText();
        Email = txtEmail.getText();
        Address = txtAddress.getText();
        if (rdbtnMale.isSelected()) {
            Gender = "Male";
        } else if (rdbtnFemale.isSelected()) {
            Gender = "Female";
        } else {
            Gender = "Not Selected";
        }
        Age = cmbDD.getSelectedItem().toString() + "/" + cmbMM.getSelectedItem()
                .toString() + "/" + cmbYYYY.getSelectedItem().toString();

        String sql = "Update teacher set Name=?, ID=?, PhoneNumber=?, Email=?,"
                + " Address=?, Gender=?, Age=? where ID=?;";
        try {
            try (PreparedStatement pst = c.prepareStatement(sql)) {
                pst.setString(1, Name);
                pst.setString(2, TeacherID);
                pst.setString(3, Number);
                pst.setString(4, Email);
                pst.setString(5, Address);
                pst.setString(6, Gender);
                pst.setString(7, Age);
                pst.setString(8, TeacherID);
                pst.executeUpdate();
                System.out.println("save successfull");
            }
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        System.out.println("Records created successfully");

    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(TeacherInformationUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherInformationUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherInformationUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherInformationUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TeacherInformationUpdate().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbDD;
    private javax.swing.JComboBox<String> cmbMM;
    private javax.swing.JComboBox<String> cmbYYYY;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rdbtnFemale;
    private javax.swing.JRadioButton rdbtnMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtTeacherName;
    // End of variables declaration//GEN-END:variables
}

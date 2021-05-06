
package databaseconnection_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class StudentRegistration extends javax.swing.JFrame {
    Connection con;
    String ID;
    public StudentRegistration() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        cmbSemester = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbCourse1 = new javax.swing.JComboBox<>();
        cmbCourse2 = new javax.swing.JComboBox<>();
        cmbCourse3 = new javax.swing.JComboBox<>();
        btnSave1 = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblStudentInfo = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 135, 33));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Student ID :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 10, 180, 33));

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Semester", "Course-1", "Course-2", "Course-3"
            }
        ));
        jScrollPane1.setViewportView(tblStudent);
        if (tblStudent.getColumnModel().getColumnCount() > 0) {
            tblStudent.getColumnModel().getColumn(3).setHeaderValue("Course-3");
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 370, 190));

        btnSearch.setIcon(new javax.swing.ImageIcon("E:\\go-logo copy.png")); // NOI18N
        btnSearch.setMargin(new java.awt.Insets(1, 1, 1, 1));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 33, 33));

        cmbSemester.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semester", "1st", "2nd", "3th", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th" }));
        getContentPane().add(cmbSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 180, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("         Choose Semester");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 250, 32));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("         Choose Courses");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 240, 32));

        cmbCourse1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbCourse1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course-1", "SWE 112", "SWE111", "PHY114", "ENG 123", "MAT113", "SWE121", "SWE122", "MAT221", "SWE133", "STA131", "SWE231", "SWE132", "SWE213", "SWE 211", "SWE 211" }));
        getContentPane().add(cmbCourse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 96, 28));

        cmbCourse2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbCourse2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course-2", "SWE 112", "SWE111", "PHY114", "ENG 123", "MAT113", "SWE121", "SWE122", "MAT221", "SWE133", "STA131", "SWE231", "SWE132", "SWE213", "SWE 211", "SWE 211" }));
        getContentPane().add(cmbCourse2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 96, 28));

        cmbCourse3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbCourse3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course-3", "SWE 112", "SWE111", "PHY114", "ENG 123", "MAT113", "SWE121", "SWE122", "MAT221", "SWE133", "STA131", "SWE231", "SWE132", "SWE213", "SWE 211", "SWE 211" }));
        getContentPane().add(cmbCourse3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 96, 28));

        btnSave1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSave1.setText("Save");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 100, 30));

        btnPrevious.setText("<<Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 478, 110, 20));

        tblStudentInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email"
            }
        ));
        jScrollPane3.setViewportView(tblStudentInfo);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 370, 61));

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\jon-tyson-597590-unsplash copy.JPG")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        try{
        SQLiteDBConnection obj = new SQLiteDBConnection();
        con = SQLiteDBConnection.connect();
        LoadData();
        LoadData2();
        con.close();
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        // TODO add your handling code here:
        SQLiteDBConnection con = new SQLiteDBConnection();
        Connection c = SQLiteDBConnection.connect();
        String sem = cmbSemester.getSelectedItem().toString();
        String course1=cmbCourse1.getSelectedItem().toString();
        String course2=cmbCourse2.getSelectedItem().toString();
        String course3=cmbCourse3.getSelectedItem().toString();
            String sql = "INSERT INTO Registration (ID,Semester,Sub1,Sub2,Sub3"
                    +") VALUES (?,?,?,?,?);"; 
            try {
                try (PreparedStatement pst = c.prepareStatement(sql)) {
                    pst.setString(1, ID);
                    pst.setString(2, sem);
                    pst.setString(3, course1);
                    pst.setString(4, course2);
                    pst.setString(5, course3);
                    pst.execute();
                    System.out.println("save successfull");
                }
                c.close();
            } catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }
            System.out.println("Records created successfully");
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        TeacherHome obj = new TeacherHome(ID);
        setVisible(false);
        obj.setVisible(true);
    }//GEN-LAST:event_btnPreviousActionPerformed

    public void LoadData(){
        ID =txtSearch.getText();
        try {
            String sql ="SELECT ID,Name,Email FROM StudentInfo where ID=?;";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ID);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String id = rs.getString("ID");
                String Name = rs.getString("Name");
                String Email = rs.getString("Email");
                
                Object[] objs = {id,Name,Email};

                DefaultTableModel model = (DefaultTableModel) tblStudentInfo.getModel();

                model.addRow(objs);
            }
            rs.close();
            pst.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
    public void LoadData2(){
        ID=txtSearch.getText();
        try {
            String sql ="SELECT * FROM Registration where ID=?;";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ID);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String id = rs.getString("ID");
                String sem = rs.getString("Semester");
                String course1 = rs.getString("Sub1");
                String course2=rs.getString("Sub2");
                String course3=rs.getString("Sub3");
                
                Object[] objs = {sem,course1,course2,course3};

                DefaultTableModel model = (DefaultTableModel) tblStudent.getModel();

                model.addRow(objs);
            }
            rs.close();
            pst.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
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
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbCourse1;
    private javax.swing.JComboBox<String> cmbCourse2;
    private javax.swing.JComboBox<String> cmbCourse3;
    private javax.swing.JComboBox<String> cmbSemester;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTable tblStudentInfo;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}

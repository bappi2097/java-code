
package StudentPaymentSystems;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AdminStudentRegistration extends javax.swing.JFrame {

Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;

    public AdminStudentRegistration() {
        initComponents();
        //con=sql_connect.ConnecrDB();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogInPanel1 = new javax.swing.JPanel();
        lblReg = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        RegPanel2 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        tbxName = new javax.swing.JTextField();
        btnReg = new javax.swing.JButton();
        Cancelbtn = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        LogInlabel5 = new javax.swing.JLabel();
        Reglabel10 = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblSscGolden = new javax.swing.JLabel();
        lblHscGolden = new javax.swing.JLabel();
        Reglabel11 = new javax.swing.JLabel();
        lblSscGPA = new javax.swing.JLabel();
        Reglabel9 = new javax.swing.JLabel();
        cbxHSC = new javax.swing.JComboBox<>();
        cbxSSC = new javax.swing.JComboBox<>();
        tbxID = new javax.swing.JTextField();
        cbxGender = new javax.swing.JComboBox<>();
        tbxCredit = new javax.swing.JTextField();
        tbxHSC = new javax.swing.JTextField();
        tbxSSC = new javax.swing.JTextField();
        tbxPrevCGPA = new javax.swing.JTextField();
        BackbtnAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        LogInPanel1.setBackground(new java.awt.Color(51, 153, 0));

        lblReg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblReg.setForeground(new java.awt.Color(255, 255, 255));
        lblReg.setIcon(new javax.swing.ImageIcon("E:\\Java Project\\StudentPaymentSystem\\nbproject\\Images\\Register.png")); // NOI18N
        lblReg.setText("Student Registration");

        lblClose.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblClose.setForeground(new java.awt.Color(255, 255, 255));
        lblClose.setText("X");
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        lblMin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblMin.setForeground(new java.awt.Color(255, 255, 255));
        lblMin.setText("-");
        lblMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinMouseClicked(evt);
            }
        });

        RegPanel2.setBackground(new java.awt.Color(0, 0, 51));

        lblName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name:");

        tbxName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbxName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxNameActionPerformed(evt);
            }
        });

        btnReg.setBackground(new java.awt.Color(0, 204, 204));
        btnReg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReg.setForeground(new java.awt.Color(255, 255, 255));
        btnReg.setText("Register");
        btnReg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegMouseClicked(evt);
            }
        });
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });

        Cancelbtn.setBackground(new java.awt.Color(255, 0, 0));
        Cancelbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cancelbtn.setForeground(new java.awt.Color(255, 255, 255));
        Cancelbtn.setText("Reset");
        Cancelbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancelbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelbtnMouseClicked(evt);
            }
        });
        Cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelbtnActionPerformed(evt);
            }
        });

        lblID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(255, 255, 255));
        lblID.setText("ID:");

        LogInlabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LogInlabel5.setForeground(new java.awt.Color(255, 255, 255));

        Reglabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Reglabel10.setForeground(new java.awt.Color(255, 255, 255));
        Reglabel10.setText("Prev sem's CGPA:");

        lblGender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGender.setForeground(new java.awt.Color(255, 255, 255));
        lblGender.setText("Gender:");

        lblSscGolden.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSscGolden.setForeground(new java.awt.Color(255, 255, 255));
        lblSscGolden.setText("SSC Golden:");

        lblHscGolden.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHscGolden.setForeground(new java.awt.Color(255, 255, 255));
        lblHscGolden.setText("HSC GPA:");

        Reglabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Reglabel11.setForeground(new java.awt.Color(255, 255, 255));
        Reglabel11.setText("Current Sem's Credit:");

        lblSscGPA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSscGPA.setForeground(new java.awt.Color(255, 255, 255));
        lblSscGPA.setText("SSC GPA:");

        Reglabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Reglabel9.setForeground(new java.awt.Color(255, 255, 255));
        Reglabel9.setText("HSC Golden:");

        cbxHSC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "     ", "Yes", "No" }));

        cbxSSC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "No", "Yes" }));
        cbxSSC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSSCActionPerformed(evt);
            }
        });

        tbxID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbxID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxIDActionPerformed(evt);
            }
        });

        cbxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    ", "Male", "Female" }));
        cbxGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxGenderActionPerformed(evt);
            }
        });

        tbxCredit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tbxHSC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tbxSSC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tbxPrevCGPA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbxPrevCGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxPrevCGPAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegPanel2Layout = new javax.swing.GroupLayout(RegPanel2);
        RegPanel2.setLayout(RegPanel2Layout);
        RegPanel2Layout.setHorizontalGroup(
            RegPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegPanel2Layout.createSequentialGroup()
                .addGroup(RegPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReg)
                    .addGroup(RegPanel2Layout.createSequentialGroup()
                        .addGroup(RegPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(RegPanel2Layout.createSequentialGroup()
                                    .addGap(74, 74, 74)
                                    .addGroup(RegPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblSscGolden)
                                        .addComponent(lblHscGolden)
                                        .addComponent(lblGender)
                                        .addComponent(lblID)
                                        .addComponent(lblName)
                                        .addComponent(lblSscGPA)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(RegPanel2Layout.createSequentialGroup()
                                        .addGap(133, 133, 133)
                                        .addComponent(LogInlabel5))
                                    .addGroup(RegPanel2Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(RegPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Reglabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegPanel2Layout.createSequentialGroup()
                                                .addComponent(Reglabel10)
                                                .addGap(9, 9, 9))))))
                            .addGroup(RegPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(RegPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Cancelbtn)
                                    .addComponent(Reglabel11))))
                        .addGap(18, 18, 18)
                        .addGroup(RegPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbxCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxSSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbxName, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbxID, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RegPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbxGender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tbxHSC, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tbxSSC, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(tbxPrevCGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxHSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        RegPanel2Layout.setVerticalGroup(
            RegPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegPanel2Layout.createSequentialGroup()
                .addGroup(RegPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(RegPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(tbxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(RegPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblID)
                            .addComponent(tbxID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(RegPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(cbxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(RegPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSscGPA)
                            .addComponent(tbxSSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(RegPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSscGolden)
                            .addComponent(cbxSSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(RegPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHscGolden)
                            .addComponent(tbxHSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(RegPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Reglabel9)
                            .addComponent(cbxHSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(RegPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbxPrevCGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reglabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(LogInlabel5)
                .addGroup(RegPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(RegPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Reglabel11)
                            .addComponent(tbxCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addGroup(RegPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReg)
                            .addComponent(Cancelbtn))
                        .addGap(95, 95, 95))))
        );

        BackbtnAdmin.setBackground(java.awt.Color.orange);
        BackbtnAdmin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BackbtnAdmin.setText("< Back");
        BackbtnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LogInPanel1Layout = new javax.swing.GroupLayout(LogInPanel1);
        LogInPanel1.setLayout(LogInPanel1Layout);
        LogInPanel1Layout.setHorizontalGroup(
            LogInPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogInPanel1Layout.createSequentialGroup()
                .addComponent(BackbtnAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMin, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblClose)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogInPanel1Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addComponent(lblReg, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RegPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        LogInPanel1Layout.setVerticalGroup(
            LogInPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogInPanel1Layout.createSequentialGroup()
                .addGroup(LogInPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LogInPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(LogInPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMin)
                            .addComponent(lblClose)))
                    .addGroup(LogInPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(BackbtnAdmin)))
                .addGroup(LogInPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LogInPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(RegPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LogInPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lblReg, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogInPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LogInPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinMouseClicked

    private void btnRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegMouseClicked
        AdminStudentRegistration reg =new AdminStudentRegistration();
        reg.setVisible(true);
        reg.pack();
        reg.setLocationRelativeTo(null);
        reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnRegMouseClicked

    private void CancelbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelbtnMouseClicked

    }//GEN-LAST:event_CancelbtnMouseClicked

    private void CancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelbtnActionPerformed
        
    }//GEN-LAST:event_CancelbtnActionPerformed

    private void tbxPrevCGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxPrevCGPAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbxPrevCGPAActionPerformed

    private void cbxSSCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSSCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSSCActionPerformed

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        try {
            
        SQLiteJDBCDriverConnection con = new SQLiteJDBCDriverConnection();
        Connection c= con.connect();
        
        String name = tbxName.getText();
        String id = tbxID.getText();
        String gender = cbxGender.getSelectedItem().toString();
        int SSC = Integer.parseInt(tbxSSC.getText());
        String SscGolden = cbxSSC.getSelectedItem().toString();
        int Hsc = Integer.parseInt(tbxHSC.getText());
        String HscGolden = cbxHSC.getSelectedItem().toString();
        int prevCGPA = Integer.parseInt(tbxPrevCGPA.getText());
        int Credit = Integer.parseInt(tbxCredit.getText());
       
        int Amount =Credit*3200;
        
        
        
        String sql = "insert into StudentReg (Name,ID,Gender,SSC,SSCGolden,HSC,HSCGolden,PrevCGPA,Credit,Amount) values (?,?,?,?,?,?,?,?,?,?)"; 
        
        
        
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1,name);
            pst.setString(2,id);
            pst.setString(3,gender);
            pst.setInt(4,SSC);
            pst.setString(5,SscGolden);
            pst.setInt(6,Hsc);
            pst.setString(7,HscGolden);
            pst.setInt(8,prevCGPA);
            pst.setInt(9,Credit);
            pst.setInt(10,Amount);
            pst.executeUpdate();
             c.close();
            JOptionPane.showMessageDialog(null,"saved");
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }    
    
        
        
    }//GEN-LAST:event_btnRegActionPerformed

    private void tbxNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbxNameActionPerformed

    private void tbxIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbxIDActionPerformed

    private void cbxGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxGenderActionPerformed

    private void BackbtnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnAdminActionPerformed
        AdminMenu ad=new AdminMenu();
        ad.setVisible(true);
        ad.pack();
        ad.setLocationRelativeTo(null);
        ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_BackbtnAdminActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminStudentRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackbtnAdmin;
    private javax.swing.JButton Cancelbtn;
    private javax.swing.JPanel LogInPanel1;
    private javax.swing.JLabel LogInlabel5;
    private javax.swing.JPanel RegPanel2;
    private javax.swing.JLabel Reglabel10;
    private javax.swing.JLabel Reglabel11;
    private javax.swing.JLabel Reglabel9;
    private javax.swing.JButton btnReg;
    private javax.swing.JComboBox<String> cbxGender;
    private javax.swing.JComboBox<String> cbxHSC;
    private javax.swing.JComboBox<String> cbxSSC;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHscGolden;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblReg;
    private javax.swing.JLabel lblSscGPA;
    private javax.swing.JLabel lblSscGolden;
    private javax.swing.JTextField tbxCredit;
    private javax.swing.JTextField tbxHSC;
    private javax.swing.JTextField tbxID;
    private javax.swing.JTextField tbxName;
    private javax.swing.JTextField tbxPrevCGPA;
    private javax.swing.JTextField tbxSSC;
    // End of variables declaration//GEN-END:variables

  
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laidelibrary;

import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class ForgotPassword extends javax.swing.JFrame {

    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
        initComponents();
        //Centralise the Forgot Password Window
        this.setLocationRelativeTo(null);
        
        //Disable resizing
        this.setResizable(false);
        
        //Stop the Window Exit Button from closing the application
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_logo = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblFirstName9 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblFirstName8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblFirstName6 = new javax.swing.JLabel();
        txtMothersMaidenName = new javax.swing.JTextField();
        btnResetPassword = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/laidelibrary/images/laide_library_logo.png"))); // NOI18N

        lblTitle.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(56, 72, 96));
        lblTitle.setText("Forgot Password");

        lblFirstName9.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblFirstName9.setForeground(new java.awt.Color(56, 72, 96));
        lblFirstName9.setText("Username:");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lblFirstName8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblFirstName8.setForeground(new java.awt.Color(56, 72, 96));
        lblFirstName8.setText("Email Address:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblFirstName6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblFirstName6.setForeground(new java.awt.Color(56, 72, 96));
        lblFirstName6.setText("Mother's Maiden Name:");

        txtMothersMaidenName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMothersMaidenNameActionPerformed(evt);
            }
        });

        btnResetPassword.setBackground(new java.awt.Color(56, 72, 96));
        btnResetPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnResetPassword.setForeground(new java.awt.Color(255, 255, 255));
        btnResetPassword.setText("Reset Password");
        btnResetPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnResetPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPasswordActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(64, 120, 102));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle)
                            .addComponent(lbl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail)
                            .addComponent(txtUsername)
                            .addComponent(txtMothersMaidenName)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFirstName6)
                                    .addComponent(lblFirstName9)
                                    .addComponent(lblFirstName8))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnResetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(lblFirstName9)
                .addGap(18, 18, 18)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFirstName8)
                .addGap(18, 18, 18)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFirstName6)
                .addGap(18, 18, 18)
                .addComponent(txtMothersMaidenName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtMothersMaidenNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMothersMaidenNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMothersMaidenNameActionPerformed

    private void btnResetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPasswordActionPerformed
        //Confirm that all fields are not left blank
        if (txtUsername.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter your Username!",
                    "Username Field is Blank!", JOptionPane.WARNING_MESSAGE);
        } else if (txtEmail.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter your Email Address!",
                    "Email Address Field is Blank!", 
                    JOptionPane.WARNING_MESSAGE);
        } else if (txtMothersMaidenName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter your Mother's Maiden Name!",
                    "Mother's Maiden Name Field is Blank!",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            // Retrieve the user's password based on the information provided
            SQLQueries queryObject = new SQLQueries();
            String userStatus = queryObject
                    .validateUserPasswordDetails(txtUsername.getText(),
                    txtEmail.getText(),txtMothersMaidenName.getText());
            int userIDForPasswordReset = SQLQueries.userIDForPasswordReset;
            if (userStatus.equals("valid")) {
                JOptionPane.showMessageDialog(this,
                        "Your details have been successfuly confirmed.\n"
                                + "Please reset your password on the next page.",
                        "Success!",
                        JOptionPane.INFORMATION_MESSAGE);
                ResetPassword rpObject 
                        = new ResetPassword(userIDForPasswordReset);
                rpObject.setVisible(true);
                this.dispose();
            } else{
                JOptionPane.showMessageDialog(this,
                        "Invalid user details!",
                        "Error!",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnResetPasswordActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // Go back to the Login Page
        Login loginObject = new Login();
        loginObject.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnResetPassword;
    private javax.swing.JLabel lblFirstName6;
    private javax.swing.JLabel lblFirstName8;
    private javax.swing.JLabel lblFirstName9;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMothersMaidenName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laidelibrary;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class ResetPassword extends javax.swing.JFrame {

    static int userID;
    /**
     * Creates new form ResetPassword
     */
    public ResetPassword(int userID) {
        initComponents();
        //Centralise the Reset Password Window
        this.setLocationRelativeTo(null);
        
        //Disable resizing
        this.setResizable(false);
        
        //Stop the Window Exit Button from closing the application
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        //Store the user's ID in a static variable 
        //So it can be easily accessed by other methods
        ResetPassword.userID = userID;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnResetPassword = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lbl_logo = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblReEnterPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtReEnterPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/laidelibrary/images/laide_library_logo.png"))); // NOI18N

        lblTitle.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(56, 72, 96));
        lblTitle.setText("Reset Password");

        lblPassword.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(56, 72, 96));
        lblPassword.setText("Enter new Password:");

        lblReEnterPassword.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblReEnterPassword.setForeground(new java.awt.Color(56, 72, 96));
        lblReEnterPassword.setText("Re-enter Password:");

        txtReEnterPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtReEnterPasswordKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle)
                            .addComponent(lbl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtReEnterPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnResetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPassword)
                                    .addComponent(lblReEnterPassword))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(lblPassword)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblReEnterPassword)
                .addGap(18, 18, 18)
                .addComponent(txtReEnterPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPasswordActionPerformed
        
        // pattern for valid password
        Pattern passwordPattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=."
                + "*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$");
        
        Matcher passwordMatcher = 
                passwordPattern.matcher(txtPassword.getText());
        
        //Confirm that all fields are not left blank
        if (txtPassword.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Please enter your new Password!",
                "Password Field is Blank!", JOptionPane.WARNING_MESSAGE);
        }  else if (!passwordMatcher.matches()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter a valid Password!\n"
                            + "All passwords must: \n"
                            + "<html><ul><li>Contain 8 characters, minimum "
                            + " and 20 characters, maximum.</li>"
                            + "<li>Contain at least one digit.</li>" 
                            + "<li>Contain at least one upper case alphabet.</li>" 
                            + "<li>Contain at least one lower case alphabet.</li>" 
                            + "<li>Contain at least one special character "
                            + "which includes !@#$%&*()-+=^.</li>" 
                            + "<li>Not contain any white space.</li></ul></html>",
                    "Invalid Password!",
                    JOptionPane.WARNING_MESSAGE);
        } else if (txtReEnterPassword.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Please re-enter your new Password!",
                "Re-enter Password Field is Blank!",
                JOptionPane.WARNING_MESSAGE);
        } else if(!txtPassword.getText().equals(txtReEnterPassword.getText())){
           JOptionPane.showMessageDialog(this,
                "The passwords do not match!",
                "Password Mismatch!",
                JOptionPane.WARNING_MESSAGE);
        } else {
            // Retrieve the user's password in the database
            SQLQueries queryObject = new SQLQueries();
            String updateStatus = 
                    queryObject.updateUser(ResetPassword.userID, 
                            "Password", txtPassword.getText());
            
            if(updateStatus.equals("successful")){
                JOptionPane.showMessageDialog(this,
                        "Password Reset is Successful!", "Success!",
                        JOptionPane.INFORMATION_MESSAGE);
                
                // Go back to the Login Page
                Login loginObject = new Login();
                loginObject.setVisible(true);
                this.dispose();
            } else{
                System.out.println("An error occured!");
            }
        }
    }//GEN-LAST:event_btnResetPasswordActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // Go back to the Forgot Password Page
        ForgotPassword fpObject = new ForgotPassword();
        fpObject.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtReEnterPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReEnterPasswordKeyReleased
        // Ensure that the passwords match
        // Green indicates that they match
        // Red indicates that they do not match
        if(txtPassword.getText().equals(txtReEnterPassword.getText())){
            txtReEnterPassword.setForeground(Color.GREEN);
        }
        else{
            txtReEnterPassword.setForeground(Color.red);
        }
    }//GEN-LAST:event_txtReEnterPasswordKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[], int userID) {
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
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResetPassword(userID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnResetPassword;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblReEnterPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtReEnterPassword;
    // End of variables declaration//GEN-END:variables
}

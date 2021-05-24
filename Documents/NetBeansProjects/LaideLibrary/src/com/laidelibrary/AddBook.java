/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laidelibrary;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class AddBook extends javax.swing.JFrame {

    /**
     * Creates new form AddBook
     */
    public AddBook() {
        initComponents();

        //Centralise the Window
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

        lblTitle = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        lblAuthor = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblFirstName5 = new javax.swing.JLabel();
        cbGenre = new javax.swing.JComboBox<>();
        lbl_logo = new javax.swing.JLabel();
        lblAddBook = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        btnAddBook = new javax.swing.JButton();
        lblFirstName6 = new javax.swing.JLabel();
        spQuantityInStock = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(56, 72, 96));
        lblTitle.setText("Title:");

        txtTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitleActionPerformed(evt);
            }
        });

        lblAuthor.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblAuthor.setForeground(new java.awt.Color(56, 72, 96));
        lblAuthor.setText("Author:");

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

        lblFirstName5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblFirstName5.setForeground(new java.awt.Color(56, 72, 96));
        lblFirstName5.setText("Genre:");

        cbGenre.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        cbGenre.setForeground(new java.awt.Color(56, 72, 96));
        cbGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Christian", "Fiction", "Fantasy", "Science Fiction", "Dystopian", "Action & Adventure", "Mystery", "Horror", "Thriller & Suspense", "Historical Fiction", "Romance", "Women's Fiction", "Contemporary Fiction", "Literary Fiction", "Magical Realism", "Graphic Novel", "Short Story", "Young Adult", "New Adult", "Children's", "Nonfiction", "Memoir & Autobiography", "Biography", "Food & Drink", "Art & Photography", "Self-help", "History", "Travel", "True Crime", "Humour", "Essay", "Guide / How-to", "Religion & Spirituality", "Humanities & Social Sciences", "Parenting & Families", "Science & Technology", "Other" }));
        cbGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGenreActionPerformed(evt);
            }
        });

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/laidelibrary/images/laide_library_logo.png"))); // NOI18N

        lblAddBook.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblAddBook.setForeground(new java.awt.Color(56, 72, 96));
        lblAddBook.setText("Add Book");

        txtAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAuthorActionPerformed(evt);
            }
        });

        btnAddBook.setBackground(new java.awt.Color(56, 72, 96));
        btnAddBook.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAddBook.setForeground(new java.awt.Color(255, 255, 255));
        btnAddBook.setText("Add Book");
        btnAddBook.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBookActionPerformed(evt);
            }
        });

        lblFirstName6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblFirstName6.setForeground(new java.awt.Color(56, 72, 96));
        lblFirstName6.setText("Quantity in Stock:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAddBook)
                .addGap(158, 158, 158))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFirstName5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAuthor, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFirstName6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spQuantityInStock, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                    .addComponent(txtTitle)
                                    .addComponent(txtAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                    .addComponent(cbGenre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(lbl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddBook)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAuthor)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFirstName5)
                    .addComponent(cbGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spQuantityInStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstName6))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitleActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        JOptionPane.showMessageDialog(this,
                "Click on the Refresh Table button to "
                + "view new Books!",
                "Refesh Table!",
                JOptionPane.INFORMATION_MESSAGE);
        // Close this page
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAuthorActionPerformed

    private void btnAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBookActionPerformed
        // patterns for valid title and author
        Pattern titlePattern
                = Pattern.compile("^[A-Za-z0-9\\s\\-()\\?!'\\.,;]{2,100}+$");
        Pattern authorPattern = Pattern.compile("[A-Za-z\\s\\.,;]{2,100}");

        // matching the text in the fields against their respective patterns
        Matcher titleMatcher = titlePattern.matcher(txtTitle.getText());
        Matcher authorMatcher = authorPattern.matcher(txtAuthor.getText());

        //Confirm that all fields are not left blank
        if (txtTitle.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter the Book Title!",
                    "Title Field is Blank!", JOptionPane.WARNING_MESSAGE);
        } else if (!titleMatcher.matches()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter a valid Title!",
                    "Invalid Title!",
                    JOptionPane.WARNING_MESSAGE);
        } else if (txtAuthor.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter the Author's Name!",
                    "Author Field is Blank!", JOptionPane.WARNING_MESSAGE);
        } else if (!authorMatcher.matches()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter a valid Author Name!",
                    "Invalid Author Name!",
                    JOptionPane.WARNING_MESSAGE);
        } else if (cbGenre.getSelectedItem().equals("Select")) {
            JOptionPane.showMessageDialog(this,
                    "Please select the Genre!",
                    "Select a Genre!", JOptionPane.WARNING_MESSAGE);
        } else if (spQuantityInStock.getValue().toString().equals("0")) {
            JOptionPane.showMessageDialog(this,
                    "Please enter the Quantity in Stock!",
                    "Quantity in Stock Field is Blank!", JOptionPane.WARNING_MESSAGE);
        } else if (Integer.parseInt(spQuantityInStock.getValue().toString()) < 1) {
            JOptionPane.showMessageDialog(this,
                    "You must have at least 1 (one) book in stock!",
                    "Error! Invalid Quantity in Stock!", JOptionPane.WARNING_MESSAGE);
        } else {
            // Create an array to hold the book's details
            String[] newBook = new String[11];
            newBook[0] = txtTitle.getText();
            newBook[1] = txtAuthor.getText();
            newBook[2] = cbGenre.getSelectedItem().toString();
            newBook[3] = spQuantityInStock.getValue().toString();

            // Run the query to insert a new book
            SQLQueries queryObject = new SQLQueries();
            boolean status = queryObject.insertBook(newBook);

            // If the query executes successfully, notify the librarian/administrator
            if (status == false) {
                int insertAnotherBook = JOptionPane.showConfirmDialog(this,
                        "New book added successfully!\n"
                        + "Would you like to add another book?",
                        "Success!",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                switch (insertAnotherBook) {
                    // If the Librarian/Admin chooses yes
                    case 0:
                        // Reset the form
                        txtTitle.setText("");
                        txtAuthor.setText("");
                        cbGenre.setSelectedItem("Select");
                        spQuantityInStock.setValue(0);
                        break;
                    // If the Librarian/Admin chooses no
                    case 1:
                        JOptionPane.showMessageDialog(this,
                                "Click on the Refresh Table button to "
                                + "view new Books!",
                                "Refesh Table!",
                                JOptionPane.INFORMATION_MESSAGE);
                        // Close this page
                        this.dispose();
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(this,
                        "Unable to add new book! An Error occured!",
                        "Error!",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddBookActionPerformed

    private void cbGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGenreActionPerformed

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
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cbGenre;
    private javax.swing.JLabel lblAddBook;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblFirstName5;
    private javax.swing.JLabel lblFirstName6;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JSpinner spQuantityInStock;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}

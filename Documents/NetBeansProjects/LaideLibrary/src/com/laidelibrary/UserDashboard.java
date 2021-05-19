/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laidelibrary;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author pc
 */
public class UserDashboard extends javax.swing.JFrame {

    // Populating the table object with values from the database
    // Creating the ResultSet object that holds the value from the database
    // table
    ResultSet tableContents = null;

    // Creating an object of the SQLQueries Class
    SQLQueries sqlqueriesObject = new SQLQueries();

    // Declare a string to hold the username
    static String username;

    /**
     * Creates new form UserDashboard
     *
     * @param username adds the username to the dashboard
     */
    public UserDashboard(String username) {
        initComponents();
        
        //Centralise the User Dashboard
        this.setLocationRelativeTo(null);
        
        //Disable resizing
        this.setResizable(false);

        //Stop the Window Exit Button from closing the application
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        //Hide Loan Details
        lblLoanDetails.setVisible(false);
        lblLoanDate1.setVisible(false);
        lblPeriod1.setVisible(false);
        lblExpectedReturnDate1.setVisible(false);
        lblLoanDate2.setVisible(false);
        lblPeriod2.setVisible(false);
        lblExpectedReturnDate2.setVisible(false);

        //Customise Welcome Label
        lblWelcome.setText("Welcome, " + username);

        // Retrieve username into static variable 
        // for future use in other methods
        UserDashboard.username = username;
        // Executing the required method within the SQLQueries class
        // and saving it to the ResultSet object
        tableContents = sqlqueriesObject.getAvailableBooks();

        // Populating the Java table object with the values in the 
        // saved ResultSet object
        tbAvailableBooks.setModel(DbUtils.resultSetToTableModel(tableContents));
        tbAvailableBooks.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLowerPanel = new javax.swing.JPanel();
        lblAvailableBooks = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        tbAvailableBooks = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        pnlLendForm = new javax.swing.JPanel();
        lblLoanDetails = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLoan = new javax.swing.JButton();
        lblLoanDate1 = new javax.swing.JLabel();
        lblPeriod1 = new javax.swing.JLabel();
        lblExpectedReturnDate1 = new javax.swing.JLabel();
        lblLoanABook = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        lblLoanDate2 = new javax.swing.JLabel();
        lblPeriod2 = new javax.swing.JLabel();
        lblExpectedReturnDate2 = new javax.swing.JLabel();
        spnBookID = new javax.swing.JSpinner();
        lblLogo = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAvailableBooks.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lblAvailableBooks.setForeground(new java.awt.Color(56, 72, 96));
        lblAvailableBooks.setText("Available Books");
        lblAvailableBooks.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(56, 72, 96));
        jLabel1.setText("Search:");

        spTable.setFont(new java.awt.Font("Cambria", 0, 11)); // NOI18N

        tbAvailableBooks.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        tbAvailableBooks.setForeground(new java.awt.Color(56, 72, 96));
        tbAvailableBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAvailableBooks.setSelectionBackground(new java.awt.Color(28, 140, 188));
        spTable.setViewportView(tbAvailableBooks);
        if (tbAvailableBooks.getColumnModel().getColumnCount() > 0) {
            tbAvailableBooks.getColumnModel().getColumn(0).setResizable(false);
            tbAvailableBooks.getColumnModel().getColumn(1).setResizable(false);
            tbAvailableBooks.getColumnModel().getColumn(2).setResizable(false);
            tbAvailableBooks.getColumnModel().getColumn(3).setResizable(false);
        }

        jSeparator1.setForeground(new java.awt.Color(76, 171, 118));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setToolTipText("");

        pnlLendForm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblLoanDetails.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lblLoanDetails.setForeground(new java.awt.Color(56, 72, 96));
        lblLoanDetails.setText("Loan Details");
        lblLoanDetails.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(56, 72, 96));
        jLabel2.setText("Book ID:");

        btnLoan.setBackground(new java.awt.Color(56, 72, 96));
        btnLoan.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnLoan.setForeground(new java.awt.Color(255, 255, 255));
        btnLoan.setText("Loan");
        btnLoan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoanActionPerformed(evt);
            }
        });

        lblLoanDate1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblLoanDate1.setForeground(new java.awt.Color(56, 72, 96));
        lblLoanDate1.setText("Loan Date:");

        lblPeriod1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblPeriod1.setForeground(new java.awt.Color(56, 72, 96));
        lblPeriod1.setText("Period (Days):");

        lblExpectedReturnDate1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblExpectedReturnDate1.setForeground(new java.awt.Color(56, 72, 96));
        lblExpectedReturnDate1.setText("Return Date:");

        lblLoanABook.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lblLoanABook.setForeground(new java.awt.Color(56, 72, 96));
        lblLoanABook.setText("Loan a Book");
        lblLoanABook.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnLogout.setBackground(new java.awt.Color(64, 120, 102));
        btnLogout.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblLoanDate2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblLoanDate2.setForeground(new java.awt.Color(56, 72, 96));
        lblLoanDate2.setPreferredSize(new java.awt.Dimension(69, 18));

        lblPeriod2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblPeriod2.setForeground(new java.awt.Color(56, 72, 96));
        lblPeriod2.setPreferredSize(new java.awt.Dimension(69, 18));

        lblExpectedReturnDate2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblExpectedReturnDate2.setForeground(new java.awt.Color(56, 72, 96));
        lblExpectedReturnDate2.setPreferredSize(new java.awt.Dimension(69, 18));

        javax.swing.GroupLayout pnlLendFormLayout = new javax.swing.GroupLayout(pnlLendForm);
        pnlLendForm.setLayout(pnlLendFormLayout);
        pnlLendFormLayout.setHorizontalGroup(
            pnlLendFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLendFormLayout.createSequentialGroup()
                .addGroup(pnlLendFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLendFormLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLendFormLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(pnlLendFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLoanDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlLendFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnlLendFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlLendFormLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(spnBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblLoanABook))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLendFormLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlLendFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLendFormLayout.createSequentialGroup()
                        .addComponent(lblPeriod1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPeriod2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLendFormLayout.createSequentialGroup()
                        .addComponent(lblLoanDate1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblLoanDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLendFormLayout.createSequentialGroup()
                        .addComponent(lblExpectedReturnDate1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblExpectedReturnDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        pnlLendFormLayout.setVerticalGroup(
            pnlLendFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLendFormLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblLoanABook)
                .addGap(20, 20, 20)
                .addGroup(pnlLendFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spnBookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLoanDetails)
                .addGap(18, 18, 18)
                .addGroup(pnlLendFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLoanDate1)
                    .addComponent(lblLoanDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlLendFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPeriod1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPeriod2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlLendFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblExpectedReturnDate1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblExpectedReturnDate2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout pnlLowerPanelLayout = new javax.swing.GroupLayout(pnlLowerPanel);
        pnlLowerPanel.setLayout(pnlLowerPanelLayout);
        pnlLowerPanelLayout.setHorizontalGroup(
            pnlLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLowerPanelLayout.createSequentialGroup()
                .addGroup(pnlLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLowerPanelLayout.createSequentialGroup()
                        .addGroup(pnlLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlLowerPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(pnlLowerPanelLayout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(lblAvailableBooks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlLendForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        pnlLowerPanelLayout.setVerticalGroup(
            pnlLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLowerPanelLayout.createSequentialGroup()
                .addComponent(lblAvailableBooks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addComponent(pnlLendForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/laidelibrary/images/laide_library_logo.png"))); // NOI18N

        lblTitle.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(56, 72, 96));
        lblTitle.setText("User Dashboard");

        lblWelcome.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(64, 120, 102));
        lblWelcome.setText("Welcome, ");

        jSeparator2.setForeground(new java.awt.Color(76, 171, 118));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGap(409, 409, 409)
                .addComponent(lblWelcome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlLowerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle)
                            .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlLowerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // Go back to the Login Page
        Login loginObject = new Login();
        loginObject.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void displayLoanDetails(boolean insertStatus) {
        // Create new SQLQueries object to insert new record in Loans table
        SQLQueries queryObject = new SQLQueries();

        if (insertStatus == false) {
            JOptionPane.showMessageDialog(this,
                    "Loan Successful!\n Please see the Librarian to "
                    + "collect your book!", "Success!",
                    JOptionPane.INFORMATION_MESSAGE);
            // Disable Loan Book Button
            btnLoan.setEnabled(false);

            // Display relevant Loan details to the user
            lblLoanDetails.setVisible(true);
            lblLoanDate1.setVisible(true);
            lblPeriod1.setVisible(true);
            lblExpectedReturnDate1.setVisible(true);
            try {
                ResultSet loanDetails = queryObject.getLoanDetails();
                lblLoanDate2.setText(loanDetails.getString("LoanDate"));
                lblPeriod2.setText(loanDetails.getString("LoanPeriod"));
                lblExpectedReturnDate2.setText(loanDetails
                        .getString("ReturnDate"));
                lblLoanDate2.setVisible(true);
                lblPeriod2.setVisible(true);
                lblExpectedReturnDate2.setVisible(true);

            } catch (SQLException e) {
            }
            // Executing the required method within the SQLQueries class
            // and saving it to the ResultSet object
            tableContents = sqlqueriesObject.getAvailableBooks();

            // Populating the Java table object with the values in the 
            // saved ResultSet object
            tbAvailableBooks.setModel(DbUtils.resultSetToTableModel(tableContents));
        } else {
            JOptionPane.showMessageDialog(this,
                    "Error Inserting Loan Details!",
                    "An error occured!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    private void btnLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoanActionPerformed
        // Get the content of the Book ID Spinner 
        int bookID = (int) spnBookID.getValue();

        //Confirm that the bookID field is not left blank or zero
        if (bookID == 0) {
            JOptionPane.showMessageDialog(this,
                    "Please enter BookID!",
                    "Enter BookID!", JOptionPane.WARNING_MESSAGE);
        } else {
            // Create an SQLQueries object to check availability of book in database
            SQLQueries queryObject = new SQLQueries();
            String bookStatus = queryObject.validateBook(bookID);
            // if the book exists, check that the user does not have any
            // unreturned books
            if (bookStatus.equals("valid")) {
                String loanedBefore = queryObject.checkUserLoan();
                if (loanedBefore.equals("valid")) {
                    String returned = queryObject.validateUserLoan();
                    if (returned.equals("valid")) {
                        // insert new record in loan table
                        boolean insertStatus = queryObject.insertLoan();
                        displayLoanDetails(insertStatus);
                    } else {
                        JOptionPane.showMessageDialog(this,
                                "Please return previously loaned book! "
                                + "Your request will not be granted\n "
                                + "until you return the book you loaned."
                                + "\n Please see the Librarian for "
                                + "more information.",
                                "Error! You are owing us a book!",
                                JOptionPane.ERROR_MESSAGE);
                        btnLoan.setEnabled(false);
                    }
                } else {
                    boolean insertStatus = queryObject.insertLoan();
                    displayLoanDetails(insertStatus);
                }
            } else {
                JOptionPane.showMessageDialog(this,
                        "Please enter a valid Book ID!",
                        "Error! Invalid BookID!",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnLoanActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // The object to filter through
        TableRowSorter sorter;

        // Executing the required method within the SQLQueries class
        // and saving it to the ResultSet object
        tableContents = sqlqueriesObject.getAvailableBooks();

        // Setting up the search functionality
        sorter = new TableRowSorter<>(DbUtils.resultSetToTableModel(tableContents));
        tbAvailableBooks.setRowSorter(sorter);

        // Getting the value typed
        String search = txtSearch.getText();

        // Filtering through the values in the table
        if (txtSearch.getText().trim().isEmpty()) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + search));
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[], String username) {
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
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboard(username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoan;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAvailableBooks;
    private javax.swing.JLabel lblExpectedReturnDate1;
    private javax.swing.JLabel lblExpectedReturnDate2;
    private javax.swing.JLabel lblLoanABook;
    private javax.swing.JLabel lblLoanDate1;
    private javax.swing.JLabel lblLoanDate2;
    private javax.swing.JLabel lblLoanDetails;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPeriod1;
    private javax.swing.JLabel lblPeriod2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel pnlLendForm;
    private javax.swing.JPanel pnlLowerPanel;
    private javax.swing.JScrollPane spTable;
    private javax.swing.JSpinner spnBookID;
    private javax.swing.JTable tbAvailableBooks;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}

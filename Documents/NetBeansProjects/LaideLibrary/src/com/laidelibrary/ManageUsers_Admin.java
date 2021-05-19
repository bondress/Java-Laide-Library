/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laidelibrary;

import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author pc
 */
public class ManageUsers_Admin extends javax.swing.JFrame {

    /**
     * Creates new form ManageUsers
     */
    // Populating the table object with values from the database
    // Creating the ResultSet object that holds the value from the database
    // table
    ResultSet tableContents = null;

    // Creating an object of the SQLQueries Class
    SQLQueries sqlqueriesObject = new SQLQueries();

    // Static variable that holds the user ID of the User to be updated
    static int userRoleForUpdate;

    public ManageUsers_Admin() {
        initComponents();

        //Centralise the Window
        this.setLocationRelativeTo(null);

        //Stop the Window Exit Button from closing the application
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        // Executing the required method within the SQLQueries class
        // and saving it to the ResultSet object
        tableContents = sqlqueriesObject.getAllUsersAndOfficers();

        // Populating the Java table object with the values in the 
        // saved ResultSet object
        tbAllUsers.setModel(DbUtils.resultSetToTableModel(tableContents));
        tbAllUsers.setEnabled(false);
    }

    public void updateUser(int userID, String column, String data) {
        // Check if State is to be updated before updating User details
        if (column.equals("State")) {
            data = cbState.getSelectedItem().toString();
        }
        // update the user's details
        String updateStatus
                = sqlqueriesObject.updateUser(userID, column, data);
        if (updateStatus.equals("successful")) {
            JOptionPane.showMessageDialog(this,
                    "Update Successful!", "Success!",
                    JOptionPane.INFORMATION_MESSAGE);
            // Executing the method within the SQLQueries class to populate the
            // table with the current contents and saving it to the ResultSet object
            tableContents = sqlqueriesObject.getAllUsersAndOfficers();

            // Populating the Java table object with the values in the 
            // saved ResultSet object
            tbAllUsers.setModel(DbUtils.resultSetToTableModel(tableContents));

            // Reset all delete fields
            spnUserID.setValue(0);
            cbUpdateColumn.setSelectedItem("Select");
            txtUpdateValue.setText("");
            cbState.setSelectedItem("Select");
        } else {
            JOptionPane.showMessageDialog(this,
                    "Unable to update User's Details!",
                    "An error occured!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void checkUserStatusBeforeDeleting(String statusOfUserToBeDeleted,
            String column, String value) {
        switch (statusOfUserToBeDeleted) {
            case "valid":
                if (ManageUsers_Admin.userRoleForUpdate == 1) {
                    JOptionPane.showMessageDialog(this,
                            "You cannot delete Administrator Details!",
                            "Error!",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    int deleteStatus = sqlqueriesObject.deleteUser(column, value);
                    switch (deleteStatus) {
                        case 1:
                            JOptionPane.showMessageDialog(this,
                                    "User deleted successfully!", "Success!",
                                    JOptionPane.INFORMATION_MESSAGE);
                            // Executing the method within the SQLQueries class to populate the
                            // table with the current contents and saving it to the ResultSet object
                            tableContents = sqlqueriesObject.getAllUsersAndOfficers();

                            // Populating the Java table object with the values in the 
                            // saved ResultSet object
                            tbAllUsers.setModel(DbUtils.resultSetToTableModel(tableContents));

                            // Reset all delete fields
                            cbDeleteColumn.setSelectedItem("Select");
                            txtDeleteValue.setText("");
                            break;
                        default:
                            JOptionPane.showMessageDialog(this,
                                    "User with " + column + ": " + value + " does not exist!",
                                    "Error deleting user!", JOptionPane.WARNING_MESSAGE);
                            break;
                    }
                }
                break;
            default:
                JOptionPane.showMessageDialog(this,
                        "User with " + column + ": " + value + " does not exist!",
                        "Error deleting user!", JOptionPane.WARNING_MESSAGE);
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAllUsers = new javax.swing.JTable();
        lblAllUsers = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblUpdateUser = new javax.swing.JLabel();
        btnCreateNewUser = new javax.swing.JButton();
        lblUpdateUser1 = new javax.swing.JLabel();
        lblUserId = new javax.swing.JLabel();
        spnUserID = new javax.swing.JSpinner();
        lblColumnToUpdate = new javax.swing.JLabel();
        cbUpdateColumn = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        txtUpdateValue = new javax.swing.JTextField();
        cbDeleteColumn = new javax.swing.JComboBox<>();
        txtDeleteValue = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        cbState = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnRefreshTable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1500, 632));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/laidelibrary/images/laide_library_logo.png"))); // NOI18N

        lblTitle.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(56, 72, 96));
        lblTitle.setText("Manage Users");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jSeparator2.setForeground(new java.awt.Color(76, 171, 118));

        tbAllUsers.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbAllUsers);

        lblAllUsers.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lblAllUsers.setForeground(new java.awt.Color(56, 72, 96));
        lblAllUsers.setText("All Users");

        jSeparator1.setForeground(new java.awt.Color(76, 171, 118));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setToolTipText("");

        lblUpdateUser.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lblUpdateUser.setForeground(new java.awt.Color(56, 72, 96));
        lblUpdateUser.setText("Update User");
        lblUpdateUser.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnCreateNewUser.setBackground(new java.awt.Color(56, 72, 96));
        btnCreateNewUser.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnCreateNewUser.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateNewUser.setText("Create New User");
        btnCreateNewUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreateNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewUserActionPerformed(evt);
            }
        });

        lblUpdateUser1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lblUpdateUser1.setForeground(new java.awt.Color(56, 72, 96));
        lblUpdateUser1.setText("Delete User");
        lblUpdateUser1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblUserId.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblUserId.setForeground(new java.awt.Color(56, 72, 96));
        lblUserId.setText("User ID:");

        spnUserID.setFont(new java.awt.Font("Cambria", 0, 11)); // NOI18N
        spnUserID.setModel(new javax.swing.SpinnerNumberModel());

        lblColumnToUpdate.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblColumnToUpdate.setForeground(new java.awt.Color(56, 72, 96));
        lblColumnToUpdate.setText("Select column to update:");

        cbUpdateColumn.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        cbUpdateColumn.setForeground(new java.awt.Color(56, 72, 96));
        cbUpdateColumn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "FirstName", "LastName", "Age", "PhoneNumber", "Address", "State", "MothersMaidenName", "Username", "EmailAddress", "Password" }));
        cbUpdateColumn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUpdateColumnActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(56, 72, 96));
        btnUpdate.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtUpdateValue.setEnabled(false);

        cbDeleteColumn.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        cbDeleteColumn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "UserID", "PhoneNumber", "Username", "EmailAddress" }));
        cbDeleteColumn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDeleteColumnActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(56, 72, 96));
        btnDelete.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(64, 120, 102));
        btnBack.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        cbState.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        cbState.setForeground(new java.awt.Color(56, 72, 96));
        cbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Abia", "Adamawa", "Akwa Ibom", "Anambra", "Bauchi", "Benue", "Borno", "Cross River", "Delta", "Ebonyi", "Edo", "Ekiti", "Enugu", "Federal Capital Territory", "Gombe", "Imo", "Jigawa", "Kaduna", "Kano", "Katsina", "Kebbi", "Kogi", "Kwara", "Lagos", "Nasarawa", "Niger", "Ogun", "Ondo", "Osun", "Oyo", "Plateau", "Rivers", "Sokoto", "Taraba", "Yobe", "Zamfara" }));
        cbState.setEnabled(false);
        cbState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStateActionPerformed(evt);
            }
        });

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

        btnRefreshTable.setBackground(new java.awt.Color(56, 72, 96));
        btnRefreshTable.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnRefreshTable.setForeground(new java.awt.Color(255, 255, 255));
        btnRefreshTable.setText("Refresh Table");
        btnRefreshTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 460, Short.MAX_VALUE)
                        .addComponent(lblAllUsers)
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefreshTable, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(lblColumnToUpdate)
                            .addGap(60, 60, 60))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCreateNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtUpdateValue)
                                        .addComponent(cbState, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbDeleteColumn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDeleteValue)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(cbUpdateColumn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(55, 55, 55)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(lblUpdateUser))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(lblUserId)
                                .addGap(18, 18, 18)
                                .addComponent(spnUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblUpdateUser1)
                                .addGap(82, 82, 82))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(574, 574, 574)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(561, 561, 561)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreateNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblUpdateUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUserId)
                            .addComponent(spnUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblColumnToUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbUpdateColumn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUpdateValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblUpdateUser1)
                        .addGap(1, 1, 1)
                        .addComponent(cbDeleteColumn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDeleteValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAllUsers)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btnRefreshTable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addComponent(jSeparator1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewUserActionPerformed
        // Display the User Registration Form
        UserRegistration_Admin urObject = new UserRegistration_Admin();
        urObject.setVisible(true);
    }//GEN-LAST:event_btnCreateNewUserActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // Create an SQLQueries object to check availability of the user in database
        SQLQueries queryObject = new SQLQueries();

        // Get the content of the User ID Spinner 
        int userID = (int) spnUserID.getValue();

        // Check that column to be updated is selected
        String column = cbUpdateColumn.getSelectedItem().toString();
        String data = txtUpdateValue.getText();

        // pattern for valid firstName, lastName and mothersMaidenName
        Pattern namePattern = Pattern.compile("[A-Za-z]{2,22}");

        // pattern for valid email
        Pattern emailPattern
                = Pattern.compile("[a-zA-Z0-9._]+@[a-z]+\\.[a-z]{2,3}");

        //the pattern for valid phone number
        Pattern phonePattern = Pattern.compile("0+[7-9]{1}[01]{1}[0-9]{8}");

        // pattern for valid password
        Pattern passwordPattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=."
                + "*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$");

        // matching the text in the fields against their respective patterns
        Matcher firstNameMatcher = namePattern.matcher(data);
        Matcher lastNameMatcher = namePattern.matcher(data);
        Matcher mothersMaidenNameMatcher
                = namePattern.matcher(data);
        Matcher phoneMatcher = phonePattern.matcher(data);
        Matcher emailMatcher = emailPattern.matcher(data);
        Matcher passwordMatcher
                = passwordPattern.matcher(data);

        try {
            //Confirm that the userID field is not left blank or zero
            if (userID == 0) {
                JOptionPane.showMessageDialog(this,
                        "Please enter UserID!",
                        "Enter UserID!", JOptionPane.WARNING_MESSAGE);
            } else if (column.equals("Select")) {
                JOptionPane.showMessageDialog(this,
                        "Please select a column to be updated!",
                        "Select update column!", JOptionPane.WARNING_MESSAGE);
            } else if (data.trim().isEmpty() && !cbState.isEnabled()) {
                JOptionPane.showMessageDialog(this, "Please enter the new " + column
                        + "!", column + " Field is Blank!",
                        JOptionPane.WARNING_MESSAGE);
            } else if (column.equals("FirstName") && !firstNameMatcher.matches()) {
                JOptionPane.showMessageDialog(this, "Please enter a valid " + column
                        + "!", "Invalid " + column + "!",
                        JOptionPane.WARNING_MESSAGE);
            } else if (column.equals("LastName") && !lastNameMatcher.matches()) {
                JOptionPane.showMessageDialog(this, "Please enter a valid " + column
                        + "!", "Invalid " + column + "!",
                        JOptionPane.WARNING_MESSAGE);
            } else if (column.equals("Age") && Integer.parseInt(data) < 16) {
                JOptionPane.showMessageDialog(this, "Please enter a valid " + column
                        + "!", "Invalid " + column + "!",
                        JOptionPane.WARNING_MESSAGE);
            } else if (column.equals("PhoneNumber") && !phoneMatcher.matches()) {
                JOptionPane.showMessageDialog(this, "Please enter a valid " + column
                        + "!", "Invalid " + column + "!",
                        JOptionPane.WARNING_MESSAGE);
            } else if (column.equals("Address") && data.length() < 15) {
                JOptionPane.showMessageDialog(this, "Please enter a valid " + column
                        + "!", "Invalid " + column + "!",
                        JOptionPane.WARNING_MESSAGE);
            } else if (column.equals("MothersMaidenName") && !mothersMaidenNameMatcher.matches()) {
                JOptionPane.showMessageDialog(this, "Please enter valid " + column
                        + "!", "Invalid " + column + "!",
                        JOptionPane.WARNING_MESSAGE);
            } else if (column.equals("Username") && data.length() < 8) {
                JOptionPane.showMessageDialog(this, "Please enter valid " + column
                        + "!\n" + column + " should be at least 8 characters",
                        "Invalid " + column + "!",
                        JOptionPane.WARNING_MESSAGE);
            } else if (column.equals("EmailAddress") && !emailMatcher.matches()) {
                JOptionPane.showMessageDialog(this, "Please enter valid " + column
                        + "!", "Invalid " + column + "!",
                        JOptionPane.WARNING_MESSAGE);
            } else if (column.equals("Password") && !passwordMatcher.matches()) {
                JOptionPane.showMessageDialog(this, "Please enter valid " + column
                        + "!", "Invalid " + column + "!",
                        JOptionPane.WARNING_MESSAGE);
            } else if (column.equals("State") && cbState.getSelectedItem().toString().equals("Select")) {
                JOptionPane.showMessageDialog(this, "Please select a " + column
                        + "!", "Select a " + column + "!",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                // Check if user to be updated exists in the database
                String userStatus = queryObject.validateUser(userID);

                if (userStatus.equals("valid")) {
                    // If the user exists, pdate the User's Details
                    updateUser(userID, column, data);
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Please enter a valid User ID!",
                            "Error! Invalid UserID!",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this,
                    "Please enter a valid Age!",
                    "Error! Invalid Age!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // Create an SQLQueries object to check availability of the user in database
        SQLQueries queryObject = new SQLQueries();

        // Create variables to store the column and corresponding data values
        String column = cbDeleteColumn.getSelectedItem().toString();
        String value = txtDeleteValue.getText();

        try {
            if (column.equals("Select")) {
                JOptionPane.showMessageDialog(this,
                        "Please select a column!",
                        "Select column!", JOptionPane.WARNING_MESSAGE);
            } else if (column.equals("UserID") && Integer.parseInt(value) <= 0) {
                JOptionPane.showMessageDialog(this,
                        "Please enter a valid UserID!",
                        "Invalid User ID!", JOptionPane.WARNING_MESSAGE);
            } else if (column.equals("PhoneNumber") && value.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter " + column
                        + "!", column + " Field is blank!",
                        JOptionPane.WARNING_MESSAGE);
            } else if (column.equals("Username") && value.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter " + column
                        + "!", column + " Field is blank!",
                        JOptionPane.WARNING_MESSAGE);
            } else if (column.equals("EmailAddress") && value.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter " + column
                        + "!", column + " Field is blank!",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                // verify the role of the logged in user
                String userRole = queryObject.validateUserRole();

                if (userRole.equals("administrator")) {
                    if (column.equals("UserID") && Integer.parseInt(value) > 0) {
                        //Check the user's validity and check the user's role
                        String statusOfUserToBeDeleted = queryObject.validateUser(Integer.parseInt(value));
                        ManageUsers_Admin.userRoleForUpdate = SQLQueries.userRoleForUpdate;
                        checkUserStatusBeforeDeleting(statusOfUserToBeDeleted,
                                column, value);
                    } else if (column.equals("PhoneNumber") && !value.trim().isEmpty()) {
                        //Check the user's validity and check the user's role
                        String statusOfUserToBeDeleted = queryObject.validateUserRoleWithPhoneNumber(value);
                        ManageUsers_Admin.userRoleForUpdate = SQLQueries.userRoleForUpdate;
                        checkUserStatusBeforeDeleting(statusOfUserToBeDeleted,
                                column, value);
                    } else if (column.equals("Username") && !value.trim().isEmpty()) {
                        //Check the user's validity and check the user's role
                        String statusOfUserToBeDeleted = queryObject.validateUserRoleWithUsername(value);
                        ManageUsers_Admin.userRoleForUpdate = SQLQueries.userRoleForUpdate;
                        checkUserStatusBeforeDeleting(statusOfUserToBeDeleted,
                                column, value);
                    } else if (column.equals("EmailAddress") && !value.trim().isEmpty()) {
                        //Check the user's validity and check the user's role
                        String statusOfUserToBeDeleted = queryObject.validateUserRoleWithEmailAddress(value);
                        ManageUsers_Admin.userRoleForUpdate = SQLQueries.userRoleForUpdate;
                        checkUserStatusBeforeDeleting(statusOfUserToBeDeleted,
                                column, value);
                    }
                } else {
                    JOptionPane.showMessageDialog(this,
                            "You shouldn't be here!",
                            "Error!",
                            JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Please enter valid " + column
                    + "!", "Invalid " + column + "!",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // Close this window
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void cbDeleteColumnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDeleteColumnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDeleteColumnActionPerformed

    private void cbUpdateColumnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUpdateColumnActionPerformed
        // Code to handle what happens when a column to be updated is selected
        if (cbUpdateColumn.getSelectedItem().toString().equals("FirstName")) {
            txtUpdateValue.setEnabled(true);
            cbState.setEnabled(false);
            cbState.setSelectedItem("Select");
        } else if (cbUpdateColumn.getSelectedItem().toString().equals("LastName")) {
            txtUpdateValue.setEnabled(true);
            cbState.setEnabled(false);
            cbState.setSelectedItem("Select");
        } else if (cbUpdateColumn.getSelectedItem().toString().equals("Age")) {
            txtUpdateValue.setEnabled(true);
            cbState.setEnabled(false);
            cbState.setSelectedItem("Select");
        } else if (cbUpdateColumn.getSelectedItem().toString().equals("PhoneNumber")) {
            txtUpdateValue.setEnabled(true);
            cbState.setEnabled(false);
            cbState.setSelectedItem("Select");
        } else if (cbUpdateColumn.getSelectedItem().toString().equals("Address")) {
            txtUpdateValue.setEnabled(true);
            cbState.setEnabled(false);
            cbState.setSelectedItem("Select");
        } else if (cbUpdateColumn.getSelectedItem().toString().equals("State")) {
            cbState.setEnabled(true);
            txtUpdateValue.setText("");
            txtUpdateValue.setEnabled(false);
        } else if (cbUpdateColumn.getSelectedItem().toString().equals("MothersMaidenName")) {
            txtUpdateValue.setEnabled(true);
            cbState.setEnabled(false);
            cbState.setSelectedItem("Select");
        } else if (cbUpdateColumn.getSelectedItem().toString().equals("Username")) {
            txtUpdateValue.setEnabled(true);
            cbState.setEnabled(false);
            cbState.setSelectedItem("Select");
        } else if (cbUpdateColumn.getSelectedItem().toString().equals("EmailAddress")) {
            txtUpdateValue.setEnabled(true);
            cbState.setEnabled(false);
            cbState.setSelectedItem("Select");
        } else if (cbUpdateColumn.getSelectedItem().toString().equals("Password")) {
            txtUpdateValue.setEnabled(true);
            cbState.setEnabled(false);
            cbState.setSelectedItem("Select");
        }
    }//GEN-LAST:event_cbUpdateColumnActionPerformed

    private void cbStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStateActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // The object to filter through
        TableRowSorter sorter;

        // Executing the required method within the SQLQueries class
        // and saving it to the ResultSet object
        tableContents = sqlqueriesObject.getAllUsersAndOfficers();

        // Setting up the search functionality
        sorter = new TableRowSorter<>(DbUtils.resultSetToTableModel(tableContents));
        tbAllUsers.setRowSorter(sorter);

        // Getting the value typed
        String search = txtSearch.getText();

        // Filtering through the values in the table
        if (txtSearch.getText().trim().isEmpty()) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + search));
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnRefreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshTableActionPerformed
        // Executing the method within the SQLQueries class to populate the
        // table with the current contents and saving it to the ResultSet object
        ResultSet newContents = sqlqueriesObject.getAllUsersAndOfficers();

        // Populating the Java table object with the values in the 
        // saved ResultSet object
        tbAllUsers.setModel(DbUtils.resultSetToTableModel(newContents));
    }//GEN-LAST:event_btnRefreshTableActionPerformed

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
            java.util.logging.Logger.getLogger(ManageUsers_Admin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUsers_Admin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUsers_Admin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUsers_Admin.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageUsers_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateNewUser;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefreshTable;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbDeleteColumn;
    private javax.swing.JComboBox<String> cbState;
    private javax.swing.JComboBox<String> cbUpdateColumn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAllUsers;
    private javax.swing.JLabel lblColumnToUpdate;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUpdateUser;
    private javax.swing.JLabel lblUpdateUser1;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JSpinner spnUserID;
    private javax.swing.JTable tbAllUsers;
    private javax.swing.JTextField txtDeleteValue;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUpdateValue;
    // End of variables declaration//GEN-END:variables
}

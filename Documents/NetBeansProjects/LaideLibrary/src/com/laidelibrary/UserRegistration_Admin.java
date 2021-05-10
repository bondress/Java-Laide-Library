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
public class UserRegistration_Admin extends javax.swing.JFrame {

    /**
     * Creates new form UserRegistration_Librarian
     */
    public UserRegistration_Admin() {
        initComponents();
        //Centralise the User Registration Window
        this.setLocationRelativeTo(null);
        
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

        bgGender = new javax.swing.ButtonGroup();
        txtPassword = new javax.swing.JPasswordField();
        txtPhoneNumber = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        txtFirstName = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        lblFirstName1 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblFirstName2 = new javax.swing.JLabel();
        lblFirstName3 = new javax.swing.JLabel();
        lblFirstName4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblFirstName5 = new javax.swing.JLabel();
        lblFirstName10 = new javax.swing.JLabel();
        lblFirstName6 = new javax.swing.JLabel();
        txtReEnterPassword = new javax.swing.JPasswordField();
        lblFirstName7 = new javax.swing.JLabel();
        lblFirstName8 = new javax.swing.JLabel();
        lblFirstName9 = new javax.swing.JLabel();
        txtMothersMaidenName = new javax.swing.JTextField();
        spAge = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        cbState = new javax.swing.JComboBox<>();
        txtUsername = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lbl_logo = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        lblFirstName.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(56, 72, 96));
        lblFirstName.setText("First Name:");

        btnRegister.setBackground(new java.awt.Color(56, 72, 96));
        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        lblPhoneNumber.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(56, 72, 96));
        lblPhoneNumber.setText("Phone Number:");

        lblFirstName1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblFirstName1.setForeground(new java.awt.Color(56, 72, 96));
        lblFirstName1.setText("Last Name:");

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        lblFirstName2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblFirstName2.setForeground(new java.awt.Color(56, 72, 96));
        lblFirstName2.setText("Age:");

        lblFirstName3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblFirstName3.setForeground(new java.awt.Color(56, 72, 96));
        lblFirstName3.setText("Gender:");

        lblFirstName4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblFirstName4.setForeground(new java.awt.Color(56, 72, 96));
        lblFirstName4.setText("Password:");

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
        lblFirstName5.setText("State:");

        lblFirstName10.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblFirstName10.setForeground(new java.awt.Color(56, 72, 96));
        lblFirstName10.setText("Re-enter Password:");

        lblFirstName6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblFirstName6.setForeground(new java.awt.Color(56, 72, 96));
        lblFirstName6.setText("Mother's Maiden Name:");

        txtReEnterPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtReEnterPasswordKeyReleased(evt);
            }
        });

        lblFirstName7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblFirstName7.setForeground(new java.awt.Color(56, 72, 96));
        lblFirstName7.setText("Address:");

        lblFirstName8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblFirstName8.setForeground(new java.awt.Color(56, 72, 96));
        lblFirstName8.setText("Email Address:");

        lblFirstName9.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblFirstName9.setForeground(new java.awt.Color(56, 72, 96));
        lblFirstName9.setText("Username:");

        txtMothersMaidenName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMothersMaidenNameActionPerformed(evt);
            }
        });

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(56, 72, 96));
        txtAddress.setLineWrap(true);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        bgGender.add(rdMale);
        rdMale.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        rdMale.setForeground(new java.awt.Color(56, 72, 96));
        rdMale.setText("Male");
        rdMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMaleActionPerformed(evt);
            }
        });

        bgGender.add(rdFemale);
        rdFemale.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        rdFemale.setForeground(new java.awt.Color(56, 72, 96));
        rdFemale.setText("Female");

        cbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Abia", "Adamawa", "Akwa Ibom", "Anambra", "Bauchi", "Benue", "Borno", "Cross River", "Delta", "Ebonyi", "Edo", "Ekiti", "Enugu", "Federal Capital Territory", "Gombe", "Imo", "Jigawa", "Kaduna", "Kano", "Katsina", "Kebbi", "Kogi", "Kwara", "Lagos", "Nasarawa", "Niger", "Ogun", "Ondo", "Osun", "Oyo", "Plateau", "Rivers", "Sokoto", "Taraba", "Yobe", "Zamfara" }));

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/laidelibrary/images/laide_library_logo.png"))); // NOI18N

        lblTitle.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(56, 72, 96));
        lblTitle.setText("User Registration");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(lbl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 146, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFirstName5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFirstName9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFirstName7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFirstName3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFirstName8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFirstName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFirstName2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFirstName4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFirstName1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFirstName6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFirstName10, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword)
                                    .addComponent(txtEmail)
                                    .addComponent(txtUsername)
                                    .addComponent(txtMothersMaidenName)
                                    .addComponent(jScrollPane1)
                                    .addComponent(txtFirstName)
                                    .addComponent(spAge)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdMale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94))
                                    .addComponent(txtPhoneNumber)
                                    .addComponent(txtLastName)
                                    .addComponent(txtReEnterPassword))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName1)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName2)
                    .addComponent(spAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName3)
                    .addComponent(rdMale)
                    .addComponent(rdFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNumber))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstName7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstName5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMothersMaidenName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstName6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstName9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstName8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFirstName4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFirstName10)
                    .addComponent(txtReEnterPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
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
        Matcher firstNameMatcher = namePattern.matcher(txtFirstName.getText());
        Matcher lastNameMatcher = namePattern.matcher(txtLastName.getText());
        Matcher mothersMaidenNameMatcher =
        namePattern.matcher(txtMothersMaidenName.getText());
        Matcher phoneMatcher = phonePattern.matcher(txtPhoneNumber.getText());
        Matcher emailMatcher = emailPattern.matcher(txtEmail.getText());
        Matcher passwordMatcher = 
                passwordPattern.matcher(txtPassword.getText());

        //Confirm that all fields are not left blank
        if (txtFirstName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Please enter your First Name!",
                "First Name Field is Blank!", JOptionPane.WARNING_MESSAGE);
        } else if (!firstNameMatcher.matches()) {
            JOptionPane.showMessageDialog(this,
                "Please enter a valid First Name!",
                "Invalid First Name!",
                JOptionPane.WARNING_MESSAGE);
        } else if (txtLastName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Please enter your Last Name!",
                "Last Name Field is Blank!", JOptionPane.WARNING_MESSAGE);
        } else if (!lastNameMatcher.matches()) {
            JOptionPane.showMessageDialog(this,
                "Please enter a valid Last Name!",
                "Invalid Last Name!",
                JOptionPane.WARNING_MESSAGE);
        } else if (spAge.getValue().toString().equals("0")) {
            JOptionPane.showMessageDialog(this,
                "Please enter your Age!",
                "Age Field is Blank!", JOptionPane.WARNING_MESSAGE);
        } else if (Integer.parseInt(spAge.getValue().toString()) < 16) {
            JOptionPane.showMessageDialog(this,
                "You must be at least 16 years old to register!",
                "Too Young!", JOptionPane.WARNING_MESSAGE);
            spAge.setEnabled(false);
        } else if (!rdMale.isSelected() && !rdFemale.isSelected()) {
            JOptionPane.showMessageDialog(this,
                "Please select a Gender!",
                "Select a Gender!", JOptionPane.WARNING_MESSAGE);
        }  else if (txtPhoneNumber.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Please enter your Phone Number!",
                "Phone Number Field is Blank!",
                JOptionPane.WARNING_MESSAGE);
        }  else if (!phoneMatcher.matches()) {
            JOptionPane.showMessageDialog(this,
                "Please enter a valid Phone Number!",
                "Invalid Phone Number!",
                JOptionPane.WARNING_MESSAGE);
        } else if (txtAddress.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Please enter your Address!",
                "Address Field is Blank!", JOptionPane.WARNING_MESSAGE);
        } else if (cbState.getSelectedItem().equals("Select")) {
            JOptionPane.showMessageDialog(this,
                "Please choose your State!",
                "State Field is Blank!", JOptionPane.WARNING_MESSAGE);
        } else if (txtMothersMaidenName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Please enter your Mother's Maiden Name!",
                "Mother's Maiden Name Field is Blank!",
                JOptionPane.WARNING_MESSAGE);
        } else if (!mothersMaidenNameMatcher.matches()) {
            JOptionPane.showMessageDialog(this,
                "Please enter a valid Mother's Maiden Name!",
                "Invalid Mother's Maiden Name!",
                JOptionPane.WARNING_MESSAGE);
        } else if (txtEmail.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Please enter your Email Address!",
                "Email Address Field is Blank!",
                JOptionPane.WARNING_MESSAGE);
        } else if (!emailMatcher.matches()) {
            JOptionPane.showMessageDialog(this,
                "Please enter a valid Email Address!",
                "Invalid Email Address!",
                JOptionPane.WARNING_MESSAGE);
        } else if (txtPassword.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Please enter your Password!",
                "Password Field is Blank!", JOptionPane.WARNING_MESSAGE);
        } else if (!passwordMatcher.matches()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter a valid Password!\n"
                            + "All passwords must: \n"
                            + "<html><ul><li>Contain 8 characters, minimum and"
                            + "20 characters, maximum.</li>"
                            + "<li>Contain at least one digit.</li>" 
                            + "<li>Contain at least one upper case alphabet.</li>" 
                            + "<li>Contain at least one lower case alphabet.</li>" 
                            + "<li>Contain at least one special character "
                            + "which includes !@#$%&*()-+=^.</li>" 
                            + "<li>Not contain any white space.</li></ul></html>",
                    "Invalid Password!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (txtReEnterPassword.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Please re-enter your Password!",
                "Re-enter Password Field is Blank!",
                JOptionPane.WARNING_MESSAGE);
        } else if(!txtPassword.getText().equals(txtReEnterPassword.getText())){
            JOptionPane.showMessageDialog(this,
                "The passwords do not match!",
                "Password Mismatch!",
                JOptionPane.WARNING_MESSAGE);
        } else {
            // Create an array to hold the user's details
            String[] newUser = new String[11];
            newUser[0] = txtFirstName.getText();
            newUser[1] = txtLastName.getText();
            newUser[2] = spAge.getValue().toString();
            if (rdMale.isSelected()) {
                newUser[3] = rdMale.getText();
            } else if (rdFemale.isSelected()) {
                newUser[3] = rdFemale.getText();
            }
            newUser[4] = txtPhoneNumber.getText();
            newUser[5] = txtAddress.getText();
            newUser[6] = cbState.getSelectedItem().toString();
            newUser[7] = txtMothersMaidenName.getText();
            newUser[8] = txtUsername.getText();
            newUser[9] = txtEmail.getText();
            newUser[10] = txtPassword.getText();

            // Run the query to insert a new user
            SQLQueries queryObject = new SQLQueries();
            boolean status = queryObject.addUser(newUser);

            // If the query executes successfully, notify the user
            if (status == false) {
               int createNewUser = JOptionPane.showConfirmDialog(this,
                    "Registration Successful!\n"
                            + "Would you like to create another user?", 
                    "Success!",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                switch(createNewUser){
                    // If the Librarian/Admin chooses yes
                    case 0:
                        // Reset the form
                        txtFirstName.setText("");
                        txtLastName.setText("");
                        spAge.setValue(0);
                        bgGender.clearSelection();
                        txtPhoneNumber.setText("");
                        txtAddress.setText("");
                        cbState.setSelectedItem("Select");
                        txtMothersMaidenName.setText("");
                        txtUsername.setText("");
                        txtEmail.setText("");
                        txtPassword.setText("");
                        break;
                    // If the Librarian/Admin chooses no
                    case 1:
                        // Close this page
                        this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(this,
                    "Registration Unsuccessful!",
                    "Error!",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // Close this page
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

    private void txtMothersMaidenNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMothersMaidenNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMothersMaidenNameActionPerformed

    private void rdMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdMaleActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

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
            java.util.logging.Logger.getLogger(UserRegistration_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRegistration_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRegistration_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRegistration_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRegistration_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgGender;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cbState;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblFirstName1;
    private javax.swing.JLabel lblFirstName10;
    private javax.swing.JLabel lblFirstName2;
    private javax.swing.JLabel lblFirstName3;
    private javax.swing.JLabel lblFirstName4;
    private javax.swing.JLabel lblFirstName5;
    private javax.swing.JLabel lblFirstName6;
    private javax.swing.JLabel lblFirstName7;
    private javax.swing.JLabel lblFirstName8;
    private javax.swing.JLabel lblFirstName9;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JSpinner spAge;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMothersMaidenName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JPasswordField txtReEnterPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

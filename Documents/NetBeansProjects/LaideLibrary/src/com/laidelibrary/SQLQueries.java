/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laidelibrary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class SQLQueries {

    static Connection connection = null;
    ResultSet resultSet = null;
    PreparedStatement preparedStatement = null;
    static int userID, bookID, userIDForPasswordReset;
    static String username;

    public SQLQueries() {
        connection = DBConnection.getConnection();
    }

    //Method to confirm existence of user in the database
    public String validateUser(String username, String password) {
        //Store the username as a static variable for use in other methods
        SQLQueries.username = username;
            
        //A string to confirm if the user is present in the database
        //"invalid" will be returned if the user does not exist in the database
        String userStatus = "invalid";
        try {
            String sql = "SELECT * FROM Users WHERE Username=? AND Password=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            //getting the result
            resultSet = preparedStatement.executeQuery();

            //Return valid if the user exists
            if (resultSet.next()) {
                //Store the userID as a static variable for use in other methods
                SQLQueries.userID = resultSet.getInt("UserID");
                userStatus = "valid";
            }
        } catch (SQLException ex) {
        }
        return userStatus;
    }
    
    //Method to confirm existence of user in the database
    public String validateUser(int userID) {         
        //A string to confirm if the user is present in the database
        //"invalid" will be returned if the user does not exist in the database
        String userStatus = "invalid";
        try {
            String sql = "SELECT * FROM Users WHERE UserID=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, userID);

            //getting the result
            resultSet = preparedStatement.executeQuery();

            //Return valid if the user exists
            if (resultSet.next()) {
                userStatus = "valid";
            }
        } catch (SQLException ex) {
        }
        return userStatus;
    }

    //Method to confirm role of user in the database
    public String validateUserRole() {
        //A string to confirm if the user is present in the database
        //"invalid" will be returned if the user does not exist in the database
        String userRole = "invalid";
        try {
            String sql = "SELECT Title FROM Roles"
                    + " WHERE RoleID="
                    + "(SELECT RoleID FROM Users"
                    + " WHERE Username=?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, SQLQueries.username);

            //getting the result
            resultSet = preparedStatement.executeQuery();

            //Return valid if the user exists
            if (resultSet.next()) {
                if (resultSet.getString("Title").equalsIgnoreCase("user")) {
                    userRole = "user";
                } else if (resultSet.getString("Title")
                        .equalsIgnoreCase("administrator")) {
                    userRole = "administrator";
                } else if (resultSet.getString("Title")
                        .equalsIgnoreCase("librarian")) {
                    userRole = "librarian";
                }
            }
        } catch (SQLException ex) {
        }
        return userRole;
    }

    // Getting all availabe books from the book table
    public ResultSet getAvailableBooks() {
        //
        try {
            String sql = "SELECT B.BookID, B.Title, A.Name AS Author, "
                    + "G.Name AS Genre, B.QuantityInStock FROM Books B "
                    + "JOIN Authors A ON B.AuthorID = A.AuthorID "
                    + "JOIN Genres G on B.GenreID = G.GenreID "
                    + "WHERE QuantityInStock > 0";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
        }
        return (resultSet);
    }

    //Method to confirm existence of book in the database
    public String validateBook(int bookID) {
        //Storing bookID in a static variable for future use in other methods
        SQLQueries.bookID = bookID;
        
        //A String to confirm is Book is present in the database
        //"invalid" will be returned if the book does not exist in the database
        String bookStatus = "invalid";
        try {
            String sql = "SELECT * FROM Books WHERE BookID=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, bookID);

            //getting the result
            resultSet = preparedStatement.executeQuery();

            //Return valid if the user exists
            if (resultSet.next()) {
                bookStatus = "valid";
            }
        } catch (SQLException ex) {
        }
        return bookStatus;
    }

    //Method to confirm if user has a loan record
    public String checkUserLoan() {
        //A String to confirm is user has loaned a book before
        //"invalid" will be returned if the user has never loaned a book
        String status = "invalid";
        try {
            String sql = "SELECT * FROM Issue WHERE UserID=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, SQLQueries.userID);

            //getting the result
            resultSet = preparedStatement.executeQuery();

            // Check if such a user exists in Issue table
            if (resultSet.next()) {
                status = "valid";
            }
        } catch (SQLException ex) {
        }
        return status;
    }
    
    //Method to confirm if user can loan a book
    public String validateUserLoan() {
        //A String to confirm if user can loan a book
        //"invalid" will be returned if the user has not returned loaned book
        String loanStatus = "invalid";
        try {
            String sql = "SELECT Returned FROM Issue WHERE UserID="
                    + "(SELECT UserID FROM Users WHERE Username =?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);

            //getting the result
            resultSet = preparedStatement.executeQuery();

            // Check if such a user exists using the username
            if (resultSet.next()) {
                if (resultSet.getString("Returned").equals("1")) {
                    System.out.println(resultSet.getString("Returned"));
                    loanStatus = "valid";
                }
            }
        } catch (SQLException ex) {
        }
        return loanStatus;
    }

    // inserting a new loan in issue table
    public boolean insertIssue() {
        boolean status = true;
        try {
            String sql = "INSERT INTO Issue (UserID, BookID)"
                    + " VALUES(?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, SQLQueries.userID);
            preparedStatement.setInt(2, SQLQueries.bookID);
            status = preparedStatement.execute();
        } catch (SQLException e) {
        }
        return status;
    }
    
    // Getting all availabe books from the book table
    public ResultSet getIssueDetails() {
        //
        try {
            //String sql = "SELECT * FROM Issue WHERE UserID=?";
            String sql = "SELECT CAST(IssueDate AS DATE) AS IssueDate,"
                    + "IssuePeriod,CAST(ExpectedReturnDate AS DATE) "
                    + "AS ReturnDate FROM Issue WHERE UserID=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, SQLQueries.userID);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                return resultSet;
            }
        } catch (SQLException e) {
        }
        // Return null if there are no values in the result set
        return null;
    }
    
    // A method to insert a new user into the user table
    public boolean addUser(String[] user){
        boolean status = true;
        try{
            String sql = "INSERT INTO Users (FirstName, LastName, Age, Gender, "
                    + "PhoneNumber, Address, State, MothersMaidenName, "
                    + "Username, EmailAddress, Password) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?) ";

            preparedStatement = connection.prepareStatement(sql);
            // passing the variables into the sql statement
            preparedStatement.setString(1, user[0]); //FirstName
            preparedStatement.setString(2, user[1]); //LastName
            preparedStatement.setInt(3, Integer.parseInt(user[2])); //Age
            preparedStatement.setString(4, user[3]); //Gender
            preparedStatement.setString(5, user[4]); //Phone Number
            preparedStatement.setString(6, user[5]); //Address
            preparedStatement.setString(7, user[6]); //State
            preparedStatement.setString(8, user[7]); //Mother's Maiden Name
            preparedStatement.setString(9, user[8]); //Username
            preparedStatement.setString(10, user[9]); //Email Address
            preparedStatement.setString(11, user[10]); //Password

            status = preparedStatement.execute();
            
        }catch(SQLException e){
            // Providing user defined messages for errors in inserting
            if(e.toString().contains("PhoneNumber")){
                JOptionPane.showMessageDialog(null,
                    "A User with the Phone Number: " 
                            + user[4] + " already exists!",
                    "Phone Number Exists!", JOptionPane.WARNING_MESSAGE);
            } else if(e.toString().contains("Username")){
                JOptionPane.showMessageDialog(null,
                    "A User with the Username: " 
                            + user[8] + " already exists!",
                    "Username Exists!", JOptionPane.WARNING_MESSAGE);
            } else if(e.toString().contains("EmailAddress")){
                JOptionPane.showMessageDialog(null,
                    "A User with the Email Address: " 
                            + user[9] + " already exists!",
                    "Email Add Exists!", JOptionPane.WARNING_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null,
                    "An error occurred while inserting user details!",
                    "An error occurred :(", JOptionPane.ERROR_MESSAGE);
            }
        }
        return status;
    }
    
    // A method to verify user details before resetting password
    public String validateUserPasswordDetails(String username, String email, 
            String mothersMaidenName){
        String userStatus = "invalid";
        try {
            String sql = "SELECT * FROM Users WHERE Username=?"
                    + " AND EmailAddress=? AND MothersMaidenName=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, mothersMaidenName);

            //getting the result
            resultSet = preparedStatement.executeQuery();

            // Check if such a user exists in the database
            if (resultSet.next()) {
                //Store the userID as a static variable for use in other methods
                SQLQueries.userIDForPasswordReset = resultSet.getInt("UserID");
                userStatus = "valid";
            }
        } catch (SQLException ex) {
        }
        return userStatus;
    }
    
    // A method to update the Users Table
    public String updateUser(int userID, String updateColumn, String columnData){
        String status = "failed";
        try{
            String sql = "UPDATE Users SET " + updateColumn + " =? WHERE "
                    + "UserID = ?";
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, columnData);
            preparedStatement.setInt(2, userID);
            
            int check = preparedStatement.executeUpdate();
            
            if (check == 1){
                status = "successful";
            }
        } catch(SQLException e){
        }
        
        return status;
    }
    
    // A method to validate User ID
}

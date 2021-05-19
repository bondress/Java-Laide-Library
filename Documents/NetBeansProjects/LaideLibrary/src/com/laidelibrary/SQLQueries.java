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
    static int userID, bookID, userIDForPasswordReset, userRoleForUpdate;
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
                SQLQueries.userRoleForUpdate = resultSet.getInt("RoleID");
                userStatus = "valid";
            }
        } catch (SQLException ex) {
        }
        return userStatus;
    }

    //Method to confirm existence of user in the database (for delete user option)
    public String validateUserRoleWithPhoneNumber(String phone) {
        //A string to confirm if the user is present in the database
        //"invalid" will be returned if the user does not exist in the database
        String userStatus = "invalid";
        try {
            String sql = "SELECT * FROM Users WHERE PhoneNumber=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, phone);

            //getting the result
            resultSet = preparedStatement.executeQuery();

            //Return valid if the user exists
            if (resultSet.next()) {
                SQLQueries.userRoleForUpdate = resultSet.getInt("RoleID");
                userStatus = "valid";
            }
        } catch (SQLException ex) {
        }
        return userStatus;
    }

    //Method to confirm existence of user in the database (for delete user option)
    public String validateUserRoleWithUsername(String username) {
        //A string to confirm if the user is present in the database
        //"invalid" will be returned if the user does not exist in the database
        String userStatus = "invalid";
        try {
            String sql = "SELECT * FROM Users WHERE Username=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);

            //getting the result
            resultSet = preparedStatement.executeQuery();

            //Return valid if the user exists
            if (resultSet.next()) {
                SQLQueries.userRoleForUpdate = resultSet.getInt("RoleID");
                userStatus = "valid";
            }
        } catch (SQLException ex) {
        }
        return userStatus;
    }

    //Method to confirm existence of user in the database (for delete user option)
    public String validateUserRoleWithEmailAddress(String email) {
        //A string to confirm if the user is present in the database
        //"invalid" will be returned if the user does not exist in the database
        String userStatus = "invalid";
        try {
            String sql = "SELECT * FROM Users WHERE EmailAddress=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, email);

            //getting the result
            resultSet = preparedStatement.executeQuery();

            //Return valid if the user exists
            if (resultSet.next()) {
                SQLQueries.userRoleForUpdate = resultSet.getInt("RoleID");
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

    // Getting all available books from the book table
    public ResultSet getAvailableBooks() {
        //
        try {
            String sql = "SELECT BookID, Title, Author, Genre"
                    + " FROM Books WHERE QuantityInStock > 0";
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
            String sql = "SELECT * FROM Loans WHERE UserID=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, SQLQueries.userID);

            //getting the result
            resultSet = preparedStatement.executeQuery();

            // Check if such a user exists in Loan table
            if (resultSet.next()) {
                status = "valid";
            }
        } catch (SQLException ex) {
        }
        return status;
    }
    
    //Method to confirm if user has a loan record
    public String checkUserLoan(int userID) {
        //A String to confirm is user has loaned a book before
        //"invalid" will be returned if the user has never loaned a book
        String status = "invalid";
        try {
            String sql = "SELECT * FROM Loans WHERE UserID=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, userID);

            //getting the result
            resultSet = preparedStatement.executeQuery();

            // Check if such a user exists in Loan table
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
            String sql = "SELECT Returned FROM Loans WHERE UserID="
                    + "(SELECT UserID FROM Users WHERE Username =?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);

            //getting the result
            resultSet = preparedStatement.executeQuery();

            // Check if such a user exists using the username
            if (resultSet.next()) {
                if (resultSet.getString("Returned").equals("1")) {
                    loanStatus = "valid";
                }
            }
        } catch (SQLException ex) {
        }
        return loanStatus;
    }
    
    //Method to confirm if user can loan a book
    public String validateUserLoan(int userID) {
        //A String to confirm if user can loan a book
        //"invalid" will be returned if the user has not returned loaned book
        String loanStatus = "invalid";
        try {
            String sql = "SELECT Returned FROM Loans WHERE UserID=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, userID);

            //getting the result
            resultSet = preparedStatement.executeQuery();

            // Check if such a user exists using the username
            if (resultSet.next()) {
                if (resultSet.getString("Returned").equals("1")) {
                    loanStatus = "valid";
                }
            }
        } catch (SQLException ex) {
        }
        return loanStatus;
    }

    // inserting a new loan in issue table
    public boolean insertLoan() {
        boolean status = true;
        try {
            String sql = "INSERT INTO Loans (UserID, BookID)"
                    + " VALUES(?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, SQLQueries.userID);
            preparedStatement.setInt(2, SQLQueries.bookID);
            status = preparedStatement.execute();
        } catch (SQLException e) {
        }
        return status;
    }
    
    // inserting a new loan in issue table
    public boolean insertLoan(int userID, int bookID) {
        boolean status = true;
        try {
            String sql = "INSERT INTO Loans (UserID, BookID)"
                    + " VALUES(?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, userID);
            preparedStatement.setInt(2, bookID);
            status = preparedStatement.execute();
        } catch (SQLException e) {
        }
        return status;
    }

    // Getting loan details from the book table
    public ResultSet getLoanDetails() {
        //
        try {
            String sql = "SELECT CAST(LoanDate AS DATE) AS LoanDate,"
                    + "LoanPeriod,CAST(ExpectedReturnDate AS DATE) "
                    + "AS ReturnDate FROM Loans WHERE UserID=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, SQLQueries.userID);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet;
            }
        } catch (SQLException e) {
        }
        // Return null if there are no values in the result set
        return null;
    }

    // A method to insert a new user into the user table
    public boolean insertUser(String[] user) {
        boolean status = true;
        try {
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

        } catch (SQLException e) {
            // Providing user defined messages for errors in inserting
            if (e.toString().contains("PhoneNumber")) {
                JOptionPane.showMessageDialog(null,
                        "A User with the Phone Number: "
                        + user[4] + " already exists!",
                        "Phone Number Exists!", JOptionPane.WARNING_MESSAGE);
            } else if (e.toString().contains("Username")) {
                JOptionPane.showMessageDialog(null,
                        "A User with the Username: "
                        + user[8] + " already exists!",
                        "Username Exists!", JOptionPane.WARNING_MESSAGE);
            } else if (e.toString().contains("EmailAddress")) {
                JOptionPane.showMessageDialog(null,
                        "A User with the Email Address: "
                        + user[9] + " already exists!",
                        "Email Add Exists!", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "An error occurred while inserting user details!",
                        "An error occurred :(", JOptionPane.ERROR_MESSAGE);
            }
        }
        return status;
    }

    // A method to verify user details before resetting password
    public String validateUserPasswordDetails(String username, String email,
            String mothersMaidenName) {
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
    public String updateUser(int userID, String updateColumn, String columnData) {
        String status = "failed";
        try {
            String sql = "UPDATE Users SET " + updateColumn + " =? WHERE "
                    + "UserID = ?";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, columnData);
            preparedStatement.setInt(2, userID);

            int check = preparedStatement.executeUpdate();

            if (check == 1) {
                status = "successful";
            }
        } catch (SQLException e) {
            // Providing user defined messages for errors in updating
            if (e.toString().contains("PhoneNumber")) {
                JOptionPane.showMessageDialog(null,
                        "A User with the Phone Number: "
                        + columnData + " already exists!",
                        "Phone Number Exists!", JOptionPane.WARNING_MESSAGE);
            } else if (e.toString().contains("Username")) {
                JOptionPane.showMessageDialog(null,
                        "A User with the Username: "
                        + columnData + " already exists!",
                        "Username Exists!", JOptionPane.WARNING_MESSAGE);
            } else if (e.toString().contains("EmailAddress")) {
                JOptionPane.showMessageDialog(null,
                        "A User with the Email Address: "
                        + columnData + " already exists!",
                        "Email Add Exists!", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "An error occurred while updating user details!",
                        "An error occurred :(", JOptionPane.ERROR_MESSAGE);
            }
        }
        return status;
    }

    // Getting all Users (only) from the Users table for the Librarian Dashboard
    public ResultSet getAllUsers() {
        try {
            String sql = "SELECT * FROM Users WHERE RoleID=3";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
        } catch (Exception e) {
        }
        return resultSet;
    }

    // Getting all Users (including Librarians and Administrators) 
    // from the Users table for the Administrator Dashboard
    public ResultSet getAllUsersAndOfficers() {
        try {
            String sql = "SELECT * FROM Users";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
        } catch (Exception e) {
        }
        return resultSet;
    }

    //method to delete from the Users Table
    public int deleteUser(String column, String value) {
        int deleteStatus = 0;
        try {
            String sql = "DELETE FROM Users WHERE " + column + " =?";
            preparedStatement = connection.prepareStatement(sql);

            //Checking if the column provided is the UserId
            //Because UserId is int not String
            if (column.equals("UserID")) {
                preparedStatement.setInt(1, Integer.parseInt(value));
            } else {
                preparedStatement.setString(1, value);
            }
            deleteStatus = preparedStatement.executeUpdate();
        } catch (SQLException e) {
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(null,
                    "Invalid User Id!",
                    "Invalid Id", JOptionPane.WARNING_MESSAGE);
        }
        return deleteStatus;
    }

    // Getting all available books from the book table
    public ResultSet getAllBooks() {
        //
        try {
            String sql = "SELECT * FROM Books";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
        }
        return (resultSet);
    }

    // A method to insert a new user into the book table
    public boolean insertBook(String[] book) {
        boolean status = true;
        try {
            String sql = "INSERT INTO Books VALUES (?,?,?,?) ";

            preparedStatement = connection.prepareStatement(sql);
            // passing the variables into the sql statement
            preparedStatement.setString(1, book[0]); //Title
            preparedStatement.setString(2, book[1]); //Author
            preparedStatement.setString(3, book[2]); //Genre
            preparedStatement.setInt(4, Integer.parseInt(book[3])); //QuantityInStock

            status = preparedStatement.execute();

        } catch (SQLException e) {
            e.toString();
            // Providing user defined messages for errors in inserting
            if (e.toString().contains("duplicate")) {
                JOptionPane.showMessageDialog(null,
                        "A Book with the Title: "
                        + book[0] + " and Author: " + book[1]
                        + " already exists!",
                        "Book Already Exists!", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "An error occurred while inserting book details!",
                        "An error occurred :(", JOptionPane.ERROR_MESSAGE);
            }
        }
        return status;
    }

    // A method to update the Book Table
    public String updateBook(int bookID, String updateColumn, String columnData) {
        String status = "failed";
        try {
            String sql = "UPDATE Books SET " + updateColumn + " =? WHERE "
                    + "BookID = ?";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, columnData);
            preparedStatement.setInt(2, bookID);

            int check = preparedStatement.executeUpdate();

            if (check == 1) {
                status = "successful";
            }
        } catch (SQLException e) {
            // Providing user defined messages for errors in updating
            if (e.toString().contains("duplicate")) {
                JOptionPane.showMessageDialog(null,
                        "A Book with the "
                        + updateColumn + ": " + columnData
                        + " already exists!",
                        "Book Already Exists!", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "An error occurred while updating book details!",
                        "An error occurred :(", JOptionPane.ERROR_MESSAGE);
            }
        }
        return status;
    }

    //method to delete from the Books Table
    public int deleteBook(int bookId) {
        int deleteStatus = 0;
        try {
            String sql = "DELETE FROM Books WHERE BookID=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, bookId);

            deleteStatus = preparedStatement.executeUpdate();
        } catch (SQLException e) {
        }
        return deleteStatus;
    }

    // Getting all active loans from the book table
    public ResultSet getAllLoans() {
        //
        try {
            String sql = "SELECT LoanID, l.UserID, Username, l.BookID, Title, Author,"
                    + "CAST(ExpectedReturnDate AS DATE) AS ReturnDate,"
                    + "CASE WHEN Returned = 0 THEN 'Not Returned' "
                    + "WHEN Returned = 1 THEN 'Returned' END Returned "
                    + "FROM Loans l join Users u "
                    + "ON l.UserID = u.UserID "
                    + "JOIN Books b "
                    + "ON l.BookID = b.BookID";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
        }
        return resultSet;
    }

    // A method to update the Loans Table
    public String updateLoan(int loanID) {
        String status = "failed";
        try {
            String sql = "UPDATE Loans SET Returned = 1 WHERE LoanID = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, loanID);

            int check = preparedStatement.executeUpdate();

            if (check == 1) {
                status = "successful";
            }
        } catch (SQLException e) {
        }
        return status;
    }

    //method to delete from the Loans Table
    public int deleteLoan(int loanId) {
        int deleteStatus = 0;
        try {
            String sql = "DELETE FROM Loans WHERE LoanID=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, loanId);

            deleteStatus = preparedStatement.executeUpdate();
        } catch (SQLException e) {
        }
        return deleteStatus;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laidelibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class DBConnection {
    private static Connection connection = null;
    public static Connection getConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost;"
                    + "databaseName=LaideLibrary;integratedSecurity=true;");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("A connection error occured: " + e.getMessage());
            return null; 
        }
        return connection;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sms.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kushani
 */
public class databaseConnection {
   public static Connection getDatabaseConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(databaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spare_parts_ms", "root", "1234");
        return con;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.control;

import com.sms.daoimpl.userDaoImpl;
import com.sms.model.user;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Amal
 */
public class userControl {

    public static void addUser(String name, String email, String password, String address, String contact) throws SQLException {
        user user = new user();
        user.setUserAddress(address);
        user.setUserContact(contact);
        user.setUserEmail(email);
        user.setUserName(name);
        user.setUserStatus(user.ACTIVE_USER);
        user.setUserPassword(password);
        new userDaoImpl().addUser(user);
    }

    public static ResultSet getAllUsers() throws SQLException {
        return new userDaoImpl().getAllUsers();
    }

    public static void deleteUser(String userId) throws SQLException {
        new userDaoImpl().deleteUser(Integer.parseInt(userId));
    }

}

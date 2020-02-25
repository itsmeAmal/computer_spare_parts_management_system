/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.daoimpl;

import com.sms.connection.databaseConnection;
import com.sms.dao.userDao;
import com.sms.model.user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kushani
 */
public class userDaoImpl implements userDao {

    private String selectQuery = "select user_id, user_email, user_name, user_password, user_status, user_address, user_contact from user";

    @Override
    public void addUser(user user) throws SQLException {
        Connection con = databaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into user(user_email,"
                + " user_name, user_password, user_status, user_address, user_contact) values(?,?,?,?,?,?)");
        ps.setString(1, user.getUserEmail());
        ps.setString(2, user.getUserName());
        ps.setString(3, user.getUserPassword());
        ps.setInt(4, user.ACTIVE_USER);
        ps.setString(5, user.getUserAddress());
        ps.setString(6, user.getUserContact());
        ps.executeUpdate();
        ps.close();
    }

    @Override
    public void UpdateUser(user user) throws SQLException {
        
    }

    @Override
    public void deleteUser(int userId) throws SQLException {
        Connection con = databaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("delete from user where user_id=?");
        ps.setInt(1, userId);
        ps.executeUpdate();
        ps.close();
    }

    public ResultSet getAllUsers() throws SQLException {
        return new commonDaoImpl().getAllRecords(selectQuery);
    }

}

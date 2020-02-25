/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sms.dao;

import com.sms.model.user;
import java.sql.SQLException;

/**
 *
 * @author kushani
 */
public interface userDao {
    void addUser(user user)throws SQLException;
    void UpdateUser(user user)throws SQLException;
    void deleteUser(int userId)throws SQLException;
    
}

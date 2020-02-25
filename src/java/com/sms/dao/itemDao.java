/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sms.dao;

import com.sms.model.item;
import java.sql.SQLException;

/**
 *
 * @author kushani
 */
public interface itemDao {
    void addItem(item item)throws SQLException;
    void updateItem(item item)throws SQLException;
    void deleteItem(int itemId) throws SQLException;
    
}

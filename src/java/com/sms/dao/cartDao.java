/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sms.dao;

import com.sms.model.cart;
import java.sql.SQLException;

/**
 *
 * @author kushani
 */
public interface cartDao {
    void addCart(cart c)throws SQLException;
    void updateCart(cart c)throws SQLException;
    void deleteCart(int cartId)throws SQLException;
    
}

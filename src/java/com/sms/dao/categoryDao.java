/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sms.dao;

import com.sms.model.category;
import java.sql.SQLException;

/**
 *
 * @author kushani
 */
public interface categoryDao {
    void addCategory(category category)throws SQLException;
    void updateCategory(category category)throws SQLException;
    void deleteCategory(int categoryId)throws SQLException;
    
}

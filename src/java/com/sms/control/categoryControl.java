/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.control;

import com.sms.daoimpl.categoryDaoImpl;
import com.sms.model.category;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class categoryControl {

    public static void addCategory(String category_name, String category_code) throws SQLException {
        category category = new category();
        category.setCategoryName(category_name);
        category.setCategoryCode(category_code);
        new categoryDaoImpl().addCategory(category);
    }

    public static ResultSet getAllCategory() throws SQLException {
        return new categoryDaoImpl().getAllCategory();
    }
}

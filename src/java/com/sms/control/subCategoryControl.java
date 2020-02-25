/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.control;

import com.sms.daoimpl.subCategoryDaoImpl;
import com.sms.model.subCategory;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class subCategoryControl {

    public static void addSubCategory(String subCategoryName, String CategoryName) throws SQLException {
        subCategory subCategory = new subCategory();
        subCategory.setSubCategoryName(subCategoryName);
        subCategory.setCategoryName(CategoryName);
        new subCategoryDaoImpl().addSubCategory(subCategory);
    }

    public static ResultSet getAllsubCategory() throws SQLException {
        return new subCategoryDaoImpl().getAllsubCategory();
    }
}

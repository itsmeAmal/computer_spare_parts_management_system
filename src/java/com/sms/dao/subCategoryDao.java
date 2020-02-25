/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sms.dao;

import com.sms.model.subCategory;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public interface subCategoryDao {
    
    void addSubCategory(subCategory subCategory) throws SQLException;
    void updateSubCategory(subCategory subCategory1) throws SQLException;
    void deleteSubCategoty(int subCategoryId) throws SQLException;
    
}

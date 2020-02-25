/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.daoimpl;

import com.sms.connection.databaseConnection;
import com.sms.dao.subCategoryDao;
import com.sms.model.subCategory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class subCategoryDaoImpl implements subCategoryDao {

    private String selectQuery = "select sub_category_id, sub_category_name, sub_category_category_name, sub_category_status from sub_category";

    @Override
    public void addSubCategory(subCategory subCategory) throws SQLException {
        Connection con = databaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into sub_category(sub_category_name, sub_category_category_name, sub_category_status) "
                + "values(?,?,?)");
        ps.setString(1, subCategory.getSubCategoryName());
        ps.setString(2, subCategory.getCategoryName());
        ps.setInt(3, 1);
        ps.executeUpdate();
        ps.close();
    }

    @Override
    public void updateSubCategory(subCategory subCategory1) throws SQLException {
//        Connection con = databaseConnection.getDatabaseConnection();
//        PreparedStatement ps = con.prepareStatement("update sub_category set sub_category_name=?, sub_category_item_code=?, sub_category_status=? where sub_category_id=?");
//        ps.setString(1, subCategory1.getSubCategoryName());
//        ps.setInt(2, subCategory1.getSubCatItemCode());
//        ps.setInt(3, subCategory1.getSubCategoryStatus());
//        ps.setInt(4, subCategory1.getSubCategoryId());
//        ps.executeUpdate();
//        ps.close();
    }

    @Override
    public void deleteSubCategoty(int subCategoryId) throws SQLException {

        Connection con = databaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("delete from sub_category where sub_category_id=?");
        ps.executeUpdate();
        ps.close();
    }

    public ResultSet getAllsubCategory() throws SQLException {
        return new commonDaoImpl().getAllRecords(selectQuery);
    }

}

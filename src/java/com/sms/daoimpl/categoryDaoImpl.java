/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.daoimpl;

import com.sms.connection.databaseConnection;
import com.sms.dao.categoryDao;
import com.sms.model.category;
import static com.sms.model.category.ACTIVE_CATEGORY;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kushani
 */
public class categoryDaoImpl implements categoryDao {

    private String selectQuery = "select category_id, category_name, category_code, category_status from category";

    @Override
    public void addCategory(category category) throws SQLException {
        Connection con = databaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into category(category_name, category_code, category_status) values(?,?,?)");
        ps.setString(1, category.getCategoryName());
        ps.setString(2, category.getCategoryCode());
        ps.setInt(3, category.ACTIVE_CATEGORY);
        ps.executeUpdate();
        ps.close();
    }

    @Override
    public void updateCategory(category category) throws SQLException {
        Connection con = databaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("update category set category_name=?, category_code=?, category_status=? where category_id=?");
        ps.setString(1, category.getCategoryName());
        ps.setString(2, category.getCategoryCode());
        ps.setInt(3, ACTIVE_CATEGORY);
        ps.setInt(4, category.getCategoryId());
        ps.executeUpdate();
        ps.close();
    }

    @Override
    public void deleteCategory(int categoryId) throws SQLException {
        Connection con = databaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("delete from category where category_id=?");
        ps.setInt(1, categoryId);
        ps.executeUpdate();
        ps.close();

    }

    public ResultSet getAllCategory() throws SQLException {
        return new commonDaoImpl().getAllRecords(selectQuery);
    }
}

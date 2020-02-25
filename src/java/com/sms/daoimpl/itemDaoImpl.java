/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.daoimpl;

import com.sms.connection.databaseConnection;
import com.sms.dao.itemDao;
import com.sms.model.item;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kushani
 */
public class itemDaoImpl implements itemDao {

    private String selectQuerry = "select item_id, item_name, item_code, item_category_name, item_status, item_description, item_image_path, item_sub_category_name, item_brand_name from item";

    @Override
    public void addItem(item item) throws SQLException {
        Connection con = databaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into item(item_name,"
                + " item_code, item_category_name, item_status, item_description,"
                + " item_image_path, item_sub_category_name, item_brand_name)"
                + " values(?,?,?,?,?,?,?,?)");
        ps.setString(1, item.getItemName());
        ps.setString(2, "001");
        ps.setString(3, item.getItemCategoryName());
        ps.setInt(4, item.ACTIVE_ITEM);
        ps.setString(5, item.getItemDescription());
        ps.setString(6, "");
        ps.setString(7, item.getSubCategoryName());
        ps.setString(8, item.getBrandName());
        ps.executeUpdate();
        ps.close();

    }

    @Override
    public void updateItem(item item) throws SQLException {
//        Connection con = databaseConnection.getDatabaseConnection();
//        PreparedStatement ps = con.prepareStatement("update item set item_name=?, item_code=?, "
//                + "item_category_id=?, item_status=?, item_description=?, item_image_path=? where item_id=?");
//        ps.setString(1, item.getItemName());
//        ps.setString(2, item.getItemCode());
//        ps.setInt(3, item.getItemCategoryId());
//        ps.setInt(4, item.getItemStatus());
//        ps.setString(5, item.getItemDescription());
//        ps.setString(6, item.getItemImagePath());
//        ps.setInt(7, item.getItemId());
//        ps.executeUpdate();
//        ps.close();
    }

    @Override
    public void deleteItem(int itemId) throws SQLException {
        Connection con = databaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("delete from item where item_id=?");
        ps.setInt(1, itemId);
        ps.executeUpdate();
        ps.close();

    }

    public ResultSet getAllItem() throws SQLException {
        return new commonDaoImpl().getAllRecords(selectQuerry);
    }

}

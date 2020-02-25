/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.control;

import com.sms.daoimpl.itemDaoImpl;
import com.sms.model.item;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kushani
 */
public class itemControl {

    public static void addItem(String itemName, String itemCategoryName, String itemDescription, String subCategoryName, String brandName) throws SQLException {
        item item = new item();
        item.setItemName(itemName);
        item.setItemCategoryName(itemCategoryName);
        item.setItemDescription(itemDescription);
        item.setItemDescription(subCategoryName);
        item.setItemDescription(brandName);
        new itemDaoImpl().addItem(item);
    }

    public static ResultSet getAllItem() throws SQLException {
        return new itemDaoImpl().getAllItem();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sms.daoimpl;

import com.sms.connection.databaseConnection;
import com.sms.dao.cartDetailDao;
import com.sms.model.cartDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author kushani
 */
public class cartDetailDaoImpl implements cartDetailDao{

    @Override
    public void addCartDetail(cartDetail cartDetail) throws SQLException {
        Connection con = databaseConnection.getDatabaseConnection();
        PreparedStatement ps=con.prepareStatement("insert into cart_details(cart_detail_id,"
                + " cart_detail_cart_id, cart_detail_item_id, cart_detail_qty, "
                + "item_retail_price, item_unit_price) values(?,?,?,?,?,?)");
        
        ps.setInt(1,cartDetail.getCartDetailId());
        ps.setInt(2,cartDetail.getCartDetailCartId());
        ps.setInt(3,cartDetail.getCartDetailItemId());
        ps.setInt(4,cartDetail.getCartDetailQty());
        ps.setBigDecimal(5,cartDetail.getItemRetailPrice());
        ps.setBigDecimal(6,cartDetail.getItemUnitPrice());
        ps.executeUpdate();
        ps.close();
        
    }

    @Override
    public void updateCartDetail(cartDetail cartDetail) throws SQLException {
        
    }

    @Override
    public void deleteCartDetail(int cartDetailId) throws SQLException {
        Connection con= databaseConnection.getDatabaseConnection();
        PreparedStatement ps=con.prepareStatement("delete from cart_detail where cart_detail_id=?");
        ps.setInt(1, cartDetailId);
        ps.executeUpdate();
        ps.close();
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.daoimpl;

import com.sms.connection.databaseConnection;
import com.sms.dao.cartDao;
import com.sms.model.cart;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author kushani
 */
public class cartDaoImpl implements cartDao {

    @Override
    public void addCart(cart cart) throws SQLException {
        Connection con = databaseConnection.getDatabaseConnection();
         PreparedStatement ps=con.prepareStatement("insert into cart(cart_id,"
                 + "cart_session_id, cart_user_id, cart_status, "
                 + "cart_total, cart_item_qty, cart_esd_delivery_date, cart_payment_date,"
                 + " cart_shipping_date, cart_delivery_date) values(?,?,?,?,?,?,?,?,?,?)");
        ps.setInt(1, cart.getCartId());
        ps.setString(2, cart.getCartSessionId());
        ps.setInt(3, cart.getCartUserId());
        ps.setInt(4, cart.getCartStatus());
        ps.setBigDecimal(5, cart.getCartTotal());
        ps.setInt(6, cart.getCartItemqty());
        ps.setDate(7, cart.getCartEsdDeliveryDate());
        ps.setDate(8, cart.getCartPaymentDate());
        ps.setDate(9, cart.getCartShippingDate());
        ps.setDate(10, cart.getCartDeliveryDate());
        ps.executeUpdate();
        ps.close();

    }

    @Override
    public void updateCart(cart c) throws SQLException {
        

    }

    @Override
    public void deleteCart(int cartId) throws SQLException {
        Connection con= databaseConnection.getDatabaseConnection();
        PreparedStatement ps=con.prepareStatement("delete from cart where cart_id=?");
        ps.setInt(1, cartId);
        ps.executeUpdate();
        ps.close();

    }

}

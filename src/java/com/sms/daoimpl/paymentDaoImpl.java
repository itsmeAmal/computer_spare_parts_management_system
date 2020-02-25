/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sms.daoimpl;

import com.sms.connection.databaseConnection;
import com.sms.dao.paymentDao;
import com.sms.model.payment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author kushani
 */
public class paymentDaoImpl implements paymentDao {

    @Override
    public void addPayment(payment payment) throws SQLException {
        Connection con = databaseConnection.getDatabaseConnection();
        PreparedStatement ps=con.prepareStatement("insert into payment(payment_id,"
                + " payment_cart_id, payment_date, payment_card_type, payment_card_no,"
                + " payment_card_date_time, payment_amount, payment_status, payment_other) values(?,?,?,?,?,?,?,?)");
         
        ps.setInt(1,payment.getPaymentId());
        ps.setInt(2,payment.getPaymentCartId());
        ps.setDate(3,payment.getPaymentDate());
        ps.setInt(4, payment.getPaymentCardType());
        ps.setString(5,payment.getPaymentCardNo());
        ps.setBigDecimal(6,payment.getPaymentAmount());
        ps.setInt(7,payment.getPaymentStatus());
        ps.setString(8,payment.getPaymentOther());
        ps.executeUpdate();
        ps.close();
        
        
    }

    @Override
    public void updatePayment(payment payment) throws SQLException {
       
    }

    @Override
    public void deletePayment(int paymentId) throws SQLException {
        Connection con= databaseConnection.getDatabaseConnection();
        PreparedStatement ps=con.prepareStatement("delete from payment where payment_id=?");
         ps.setInt(1, paymentId);
        ps.executeUpdate();
        ps.close();
        
    }
    
}

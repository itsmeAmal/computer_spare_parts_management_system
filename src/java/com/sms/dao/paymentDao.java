/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sms.dao;

import com.sms.model.payment;
import java.sql.SQLException;

/**
 *
 * @author kushani
 */
public interface paymentDao {
    void addPayment(payment payment)throws SQLException;
    void updatePayment(payment payment) throws SQLException;
    void deletePayment(int paymentId)throws SQLException;
    
}

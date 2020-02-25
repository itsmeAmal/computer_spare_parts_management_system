/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sms.dao;

import com.sms.model.cartDetail;
import java.sql.SQLException;

/**
 *
 * @author kushani
 */
public interface cartDetailDao {
    void addCartDetail(cartDetail cartDetail)throws SQLException;
    void updateCartDetail(cartDetail cartDetail)throws SQLException;
    void deleteCartDetail(int cartDetailId)throws SQLException;
    
}

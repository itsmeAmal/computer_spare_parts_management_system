/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sms.dao;
import com.sms.model.brand;
import java.sql.SQLException;


/**
 *
 * @author kushani
 */
public interface brandDao {
    void addBrand(brand brand)throws SQLException;
    void updateBrand(brand brand)throws SQLException;
    void deleteBrand(int brand_Id)throws SQLException;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.control;

import com.sms.daoimpl.brandDaoImpl;
import com.sms.model.brand;
import static com.sms.model.brand.ACTIVE_BRAND;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kushani
 */
public class brandControl {

    public static void addBrand(String brand_name, String brand_description, String brand_country_of_origin) throws SQLException {
        brand brand = new brand();
        brand.setBrandName(brand_name);
        brand.setBrandDescription(brand_description);
        brand.setBrandCountryOfOrigin(brand_country_of_origin);
        brand.setBrandStatus(ACTIVE_BRAND);
        new brandDaoImpl().addBrand(brand);

    }

    public static ResultSet getAllBrand() throws SQLException {
        return new brandDaoImpl().getAllBrand();
    }
}

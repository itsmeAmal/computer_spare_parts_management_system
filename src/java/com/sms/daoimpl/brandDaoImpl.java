/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.daoimpl;

import com.sms.connection.databaseConnection;
import com.sms.dao.brandDao;
import com.sms.model.brand;
import static com.sms.model.brand.ACTIVE_BRAND;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kushani
 */
public class brandDaoImpl implements brandDao {

    private String selectQuerry = "select brand_id, brand_name, brand_description, brand_country_of_origin, brand_status from brand";

    @Override
    public void addBrand(brand brand) throws SQLException {
        Connection con = databaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into brand(brand_name, brand_description, brand_country_of_origin, brand_status) values(?,?,?,?)");
        ps.setString(1, brand.getBrandName());
        ps.setString(2, brand.getBrandDescription());
        ps.setString(3, brand.getBrandCountryOfOrigin());
        ps.setInt(4, ACTIVE_BRAND);
        ps.executeUpdate();
        ps.close();
    }

    @Override
    public void updateBrand(brand brand) throws SQLException {
        Connection con = databaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("update brand set brand_name=?, brand_description=?, country_of_origin=? ,status=? where brand_id=?");
        ps.setString(1, brand.getBrandName());
        ps.setString(2, brand.getBrandDescription());
        ps.setString(3, brand.getBrandCountryOfOrigin());
        ps.setInt(4, ACTIVE_BRAND);
        ps.setInt(5, brand.getBrandId());
        ps.executeUpdate();
        ps.close();

    }

    @Override
    public void deleteBrand(int brand_Id) throws SQLException {
        Connection con = databaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("delete from brand where brand_Id=?");
        ps.setInt(1, brand_Id);
        ps.executeUpdate();
        ps.close();

    }

    public ResultSet getAllBrand() throws SQLException {
        return new commonDaoImpl().getAllRecords(selectQuerry);
    }

}

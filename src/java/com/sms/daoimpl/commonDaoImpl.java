/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.daoimpl;

import com.sms.connection.databaseConnection;
import com.sms.core.CommonConstants;
import com.sms.dao.commonDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 4m4l
 */
public class commonDaoImpl implements commonDao {

    @Override
    public ResultSet getAllRecords(String selectQuery) throws SQLException {
        Connection con = databaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement(selectQuery);
        ResultSet rset = ps.executeQuery();
        return rset;
    }

    @Override
    public ResultSet getResultByAttribute(String selectQuery, String attribute, String condition, String value) throws SQLException {
        Connection con = databaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement(selectQuery + CommonConstants.sql.WHERE + attribute
                + condition + CommonConstants.sql.PARAMETER);
        ps.setString(1, value);
        ResultSet rset = ps.executeQuery();
        return rset;
    }

}

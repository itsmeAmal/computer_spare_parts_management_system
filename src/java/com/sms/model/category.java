/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.model;

/**
 *
 * @author kushani
 */
public class category {

    public static final int ACTIVE_CATEGORY = 1;
    public static final int INACTIVE_CATEGORY = 2;

    private int categoryId;
    private String categoryName;
    private String categoryCode;
    private int categoryStatus;

    /**
     * @return the categoryId
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId the categoryId to set
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return the categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName the categoryName to set
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * @return the categoryCode
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * @param categoryCode the categoryCode to set
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    /**
     * @return the categoryStatus
     */
    public int getCategoryStatus() {
        return categoryStatus;
    }

    /**
     * @param categoryStatus the categoryStatus to set
     */
    public void setCategoryStatus(int categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

}

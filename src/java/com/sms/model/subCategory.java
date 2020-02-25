/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sms.model;

/**
 *
 * @author user
 */
public class subCategory {
    
    private int subCategoryId;
    private String subCategoryName;
    private String categoryName;
    private int subCategoryStatus;

    /**
     * @return the subCategoryId
     */
    public int getSubCategoryId() {
        return subCategoryId;
    }

    /**
     * @param subCategoryId the subCategoryId to set
     */
    public void setSubCategoryId(int subCategoryId) {
        this.subCategoryId = subCategoryId;
    }


    /**
     * @return the subCategoryStatus
     */
    public int getSubCategoryStatus() {
        return subCategoryStatus;
    }

    /**
     * @param subCategoryStatus the subCategoryStatus to set
     */
    public void setSubCategoryStatus(int subCategoryStatus) {
        this.subCategoryStatus = subCategoryStatus;
    }

    /**
     * @return the subCategoryName
     */
    public String getSubCategoryName() {
        return subCategoryName;
    }

    /**
     * @param subCategoryName the subCategoryName to set
     */
    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
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
    
    
    
    
}

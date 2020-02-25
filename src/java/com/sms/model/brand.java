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
public class brand {
    
    public static final int ACTIVE_BRAND = 1;
    public static final int INACTIVE_BRAND = 2;
    
    private int brandId;
    private String brandName;
    private String brandDescription;
    private String brandCountryOfOrigin;
    private int brandStatus;

    /**
     * @return the brandId
     */
    public int getBrandId() {
        return brandId;
    }

    /**
     * @param brandId the brandId to set
     */
    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    /**
     * @return the brandName
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * @param brandName the brandName to set
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * @return the brandDescription
     */
    public String getBrandDescription() {
        return brandDescription;
    }

    /**
     * @param brandDescription the brandDescription to set
     */
    public void setBrandDescription(String brandDescription) {
        this.brandDescription = brandDescription;
    }

    /**
     * @return the brandCountryOfOrigin
     */
    public String getBrandCountryOfOrigin() {
        return brandCountryOfOrigin;
    }

    /**
     * @param brandCountryOfOrigin the brandCountryOfOrigin to set
     */
    public void setBrandCountryOfOrigin(String brandCountryOfOrigin) {
        this.brandCountryOfOrigin = brandCountryOfOrigin;
    }

    /**
     * @return the brandStatus
     */
    public int getBrandStatus() {
        return brandStatus;
    }

    /**
     * @param brandStatus the brandStatus to set
     */
    public void setBrandStatus(int brandStatus) {
        this.brandStatus = brandStatus;
    }
    
}

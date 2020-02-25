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
public class item {

    public static final int ACTIVE_ITEM = 1;
    public static final int INACTIVE_ITEM = 2;

    private int itemId;
    private String itemName;
    private String itemCode;
    private String itemCategoryName;
    private int itemStatus;
    private String itemDescription;
    private String itemImagePath;
    private String subCategoryName;
    private String brandName;

    /**
     * @return the itemId
     */
    public int getItemId() {
        return itemId;
    }

    /**
     * @param itemId the itemId to set
     */
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the itemStatus
     */
    public int getItemStatus() {
        return itemStatus;
    }

    /**
     * @param itemStatus the itemStatus to set
     */
    public void setItemStatus(int itemStatus) {
        this.itemStatus = itemStatus;
    }

    /**
     * @return the itemDescription
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * @param itemDescription the itemDescription to set
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * @return the itemImagePath
     */
    public String getItemImagePath() {
        return itemImagePath;
    }

    /**
     * @param itemImagePath the itemImagePath to set
     */
    public void setItemImagePath(String itemImagePath) {
        this.itemImagePath = itemImagePath;
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
     * @return the itemCategoryName
     */
    public String getItemCategoryName() {
        return itemCategoryName;
    }

    /**
     * @param itemCategoryName the itemCategoryName to set
     */
    public void setItemCategoryName(String itemCategoryName) {
        this.itemCategoryName = itemCategoryName;
    }

}

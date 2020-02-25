/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sms.model;

import java.math.BigDecimal;

/**
 *
 * @author kushani
 */
public class cartDetail {
    private int cartDetailId;
    private int cartDetailCartId;
    private int cartDetailItemId;
    private int cartDetailQty;
    private BigDecimal itemRetailPrice;
    private BigDecimal itemUnitPrice;

    /**
     * @return the cartDetailId
     */
    public int getCartDetailId() {
        return cartDetailId;
    }

    /**
     * @param cartDetailId the cartDetailId to set
     */
    public void setCartDetailId(int cartDetailId) {
        this.cartDetailId = cartDetailId;
    }

    /**
     * @return the cartDetailCartId
     */
    public int getCartDetailCartId() {
        return cartDetailCartId;
    }

    /**
     * @param cartDetailCartId the cartDetailCartId to set
     */
    public void setCartDetailCartId(int cartDetailCartId) {
        this.cartDetailCartId = cartDetailCartId;
    }

    /**
     * @return the cartDetailItemId
     */
    public int getCartDetailItemId() {
        return cartDetailItemId;
    }

    /**
     * @param cartDetailItemId the cartDetailItemId to set
     */
    public void setCartDetailItemId(int cartDetailItemId) {
        this.cartDetailItemId = cartDetailItemId;
    }

    /**
     * @return the cartDetailQty
     */
    public int getCartDetailQty() {
        return cartDetailQty;
    }

    /**
     * @param cartDetailQty the cartDetailQty to set
     */
    public void setCartDetailQty(int cartDetailQty) {
        this.cartDetailQty = cartDetailQty;
    }

    /**
     * @return the itemRetailPrice
     */
    public BigDecimal getItemRetailPrice() {
        return itemRetailPrice;
    }

    /**
     * @param itemRetailPrice the itemRetailPrice to set
     */
    public void setItemRetailPrice(BigDecimal itemRetailPrice) {
        this.itemRetailPrice = itemRetailPrice;
    }

    /**
     * @return the itemUnitPrice
     */
    public BigDecimal getItemUnitPrice() {
        return itemUnitPrice;
    }

    /**
     * @param itemUnitPrice the itemUnitPrice to set
     */
    public void setItemUnitPrice(BigDecimal itemUnitPrice) {
        this.itemUnitPrice = itemUnitPrice;
    }
    
    
}

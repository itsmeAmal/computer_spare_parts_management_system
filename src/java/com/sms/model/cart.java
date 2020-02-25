/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sms.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author kushani
 */
public class cart {
    private int cartId;
    private Timestamp cartDateTime;
    private String cartSessionId;
    private int cartUserId;
    private int cartStatus;
    private BigDecimal cartTotal;
    private int cartItemqty;
    private Date cartEsdDeliveryDate;
    private Date cartShippingDate;
    private Date cartDeliveryDate;
    private Date cartPaymentDate;

    /**
     * @return the cartId
     */
    public int getCartId() {
        return cartId;
    }

    /**
     * @param cartId the cartId to set
     */
    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    /**
     * @return the cartDateTime
     */
    public Timestamp getCartDateTime() {
        return cartDateTime;
    }

    /**
     * @param cartDateTime the cartDateTime to set
     */
    public void setCartDateTime(Timestamp cartDateTime) {
        this.cartDateTime = cartDateTime;
    }

    /**
     * @return the cartSessionId
     */
    public String getCartSessionId() {
        return cartSessionId;
    }

    /**
     * @param cartSessionId the cartSessionId to set
     */
    public void setCartSessionId(String cartSessionId) {
        this.cartSessionId = cartSessionId;
    }

    /**
     * @return the cartUserId
     */
    public int getCartUserId() {
        return cartUserId;
    }

    /**
     * @param cartUserId the cartUserId to set
     */
    public void setCartUserId(int cartUserId) {
        this.cartUserId = cartUserId;
    }

    /**
     * @return the cartStatus
     */
    public int getCartStatus() {
        return cartStatus;
    }

    /**
     * @param cartStatus the cartStatus to set
     */
    public void setCartStatus(int cartStatus) {
        this.cartStatus = cartStatus;
    }

    /**
     * @return the cartTotal
     */
    public BigDecimal getCartTotal() {
        return cartTotal;
    }

    /**
     * @param cartTotal the cartTotal to set
     */
    public void setCartTotal(BigDecimal cartTotal) {
        this.cartTotal = cartTotal;
    }

    /**
     * @return the cartItemqty
     */
    public int getCartItemqty() {
        return cartItemqty;
    }

    /**
     * @param cartItemqty the cartItemqty to set
     */
    public void setCartItemqty(int cartItemqty) {
        this.cartItemqty = cartItemqty;
    }

    /**
     * @return the cartEsdDeliveryDate
     */
    public Date getCartEsdDeliveryDate() {
        return cartEsdDeliveryDate;
    }

    /**
     * @param cartEsdDeliveryDate the cartEsdDeliveryDate to set
     */
    public void setCartEsdDeliveryDate(Date cartEsdDeliveryDate) {
        this.cartEsdDeliveryDate = cartEsdDeliveryDate;
    }

    /**
     * @return the cartShippingDate
     */
    public Date getCartShippingDate() {
        return cartShippingDate;
    }

    /**
     * @param cartShippingDate the cartShippingDate to set
     */
    public void setCartShippingDate(Date cartShippingDate) {
        this.cartShippingDate = cartShippingDate;
    }

    /**
     * @return the cartDeliveryDate
     */
    public Date getCartDeliveryDate() {
        return cartDeliveryDate;
    }

    /**
     * @param cartDeliveryDate the cartDeliveryDate to set
     */
    public void setCartDeliveryDate(Date cartDeliveryDate) {
        this.cartDeliveryDate = cartDeliveryDate;
    }

    /**
     * @return the cartPaymentDate
     */
    public Date getCartPaymentDate() {
        return cartPaymentDate;
    }

    /**
     * @param cartPaymentDate the cartPaymentDate to set
     */
    public void setCartPaymentDate(Date cartPaymentDate) {
        this.cartPaymentDate = cartPaymentDate;
    }
    
}

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
public class payment {
    private int paymentId;
    private int paymentCartId;
    private Date paymentDate;
    private int paymentCardType;
    private String paymentCardNo;
    private Timestamp paymentCardDateTime;
    private BigDecimal paymentAmount;
    private int paymentStatus;
    private String paymentOther;

    /**
     * @return the paymentId
     */
    public int getPaymentId() {
        return paymentId;
    }

    /**
     * @param paymentId the paymentId to set
     */
    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * @return the paymentCartId
     */
    public int getPaymentCartId() {
        return paymentCartId;
    }

    /**
     * @param paymentCartId the paymentCartId to set
     */
    public void setPaymentCartId(int paymentCartId) {
        this.paymentCartId = paymentCartId;
    }

    /**
     * @return the paymentDate
     */
    public Date getPaymentDate() {
        return paymentDate;
    }

    /**
     * @param paymentDate the paymentDate to set
     */
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * @return the paymentCardType
     */
    public int getPaymentCardType() {
        return paymentCardType;
    }

    /**
     * @param paymentCardType the paymentCardType to set
     */
    public void setPaymentCardType(int paymentCardType) {
        this.paymentCardType = paymentCardType;
    }

    /**
     * @return the paymentCardNo
     */
    public String getPaymentCardNo() {
        return paymentCardNo;
    }

    /**
     * @param paymentCardNo the paymentCardNo to set
     */
    public void setPaymentCardNo(String paymentCardNo) {
        this.paymentCardNo = paymentCardNo;
    }

    /**
     * @return the paymentCardDateTime
     */
    public Timestamp getPaymentCardDateTime() {
        return paymentCardDateTime;
    }

    /**
     * @param paymentCardDateTime the paymentCardDateTime to set
     */
    public void setPaymentCardDateTime(Timestamp paymentCardDateTime) {
        this.paymentCardDateTime = paymentCardDateTime;
    }

    /**
     * @return the paymentAmount
     */
    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * @param paymentAmount the paymentAmount to set
     */
    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /**
     * @return the paymentStatus
     */
    public int getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * @param paymentStatus the paymentStatus to set
     */
    public void setPaymentStatus(int paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    /**
     * @return the paymentOther
     */
    public String getPaymentOther() {
        return paymentOther;
    }

    /**
     * @param paymentOther the paymentOther to set
     */
    public void setPaymentOther(String paymentOther) {
        this.paymentOther = paymentOther;
    }
    
}

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
public class user {

    public static final int ACTIVE_USER = 1;
    public static final int INACTIVE_USER = 2;

    private int userId;
    private String userEmail;
    private String userName;
    private String userPassword;
    private int userStatus;
    private String userAddress;
    private String userContact;

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return the userEmail
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * @param userEmail the userEmail to set
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the userPassword
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * @param userPassword the userPassword to set
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * @return the userStatus
     */
    public int getUserStatus() {
        return userStatus;
    }

    /**
     * @param userStatus the userStatus to set
     */
    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * @return the userAddress
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * @param userAddress the userAddress to set
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    /**
     * @return the userContact
     */
    public String getUserContact() {
        return userContact;
    }

    /**
     * @param userContact the userContact to set
     */
    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

}

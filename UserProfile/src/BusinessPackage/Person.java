/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessPackage;

import java.awt.image.BufferedImage;
import java.util.Date;

/**
 *
 * @author ragha
 */
public class Person {
    
    private String firstName;
    private String lastName;
    private String emailID;
    private BufferedImage picture; 
    private Date date;
    private String phoneNum;
    private String genderValue;
    private String maritalStatus;


    
    Address address;
    LicenseData licenseData;
CreditCard creditCard;
FinancialAccounts finAccounts;

    public FinancialAccounts getFinAccounts() {
        return finAccounts;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    public String getGenderValue() {
        return genderValue;
    }

    public void setGenderValue(String genderValue) {
        this.genderValue = genderValue;
    }

    public void setFinAccounts(FinancialAccounts finAccounts) {
        this.finAccounts = finAccounts;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
    public LicenseData getLicenseData() {
        return licenseData;
    }

    public void setLicenseData(LicenseData licenseData) {
        this.licenseData = licenseData;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    public Person(){
        
    }
    
    public Person(Address address, LicenseData licenseData, CreditCard creditCard,FinancialAccounts finAccounts)
    {
        this.address = address;
        this.licenseData = licenseData;
        this.creditCard= creditCard;
        this.finAccounts = finAccounts;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public BufferedImage getPicture() {
        return picture;
    }

    public void setPicture(BufferedImage picture) {
        this.picture = picture;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}

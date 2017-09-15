/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessPackage;

import java.util.Date;

/**
 *
 * @author ragha
 */
public class CreditCard {
    
    private String creditNum;
    private String creditIssuePlace;
    private Date creditIssueDate;
    private String creditBank;
    private Date creditExpiry;

    public String getCreditNum() {
        return creditNum;
    }

    public void setCreditNum(String creditNum) {
        this.creditNum = creditNum;
    }

    public String getCreditIssuePlace() {
        return creditIssuePlace;
    }

    public void setCreditIssuePlace(String creditIssuePlace) {
        this.creditIssuePlace = creditIssuePlace;
    }

    public Date getCreditIssueDate() {
        return creditIssueDate;
    }

    public void setCreditIssueDate(Date creditIssueDate) {
        this.creditIssueDate = creditIssueDate;
    }

    public String getCreditBank() {
        return creditBank;
    }

    public void setCreditBank(String creditBank) {
        this.creditBank = creditBank;
    }

    public Date getCreditExpiry() {
        return creditExpiry;
    }

    public void setCreditExpiry(Date creditExpiry) {
        this.creditExpiry = creditExpiry;
    }
    
}

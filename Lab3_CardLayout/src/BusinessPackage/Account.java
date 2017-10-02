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
public class Account {
    
    private int accNum;
    private int routingNum;
    private String bankName;
    private int balance;
    private Date createdOn;

    public Account()
    {
        this.createdOn = new Date();
    }
    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public int getRoutingNum() {
        return routingNum;
    }

    public void setRoutingNum(int routingNum) {
        this.routingNum = routingNum;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

}

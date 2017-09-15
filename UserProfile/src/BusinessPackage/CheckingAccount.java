/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessPackage;

/**
 *
 * @author ragha
 */
public class CheckingAccount {
          private String accountDate;
    private String accountStatus;
    private String accountDebt;
    private String accountCredit;

    public String getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(String accountDate) {
        this.accountDate = accountDate;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountDebt() {
        return accountDebt;
    }

    public void setAccountDebt(String accountDebt) {
        this.accountDebt = accountDebt;
    }

    public String getAccountCredit() {
        return accountCredit;
    }

    public void setAccountCredit(String accountCredit) {
        this.accountCredit = accountCredit;
    }

    public String getAccountSecHolderName() {
        return accountSecHolderName;
    }

    public void setAccountSecHolderName(String accountSecHolderName) {
        this.accountSecHolderName = accountSecHolderName;
    }
    private String accountSecHolderName;
}

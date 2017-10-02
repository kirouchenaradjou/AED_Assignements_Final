/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessPackage;

import java.util.ArrayList;

/**
 *
 * @author ragha
 */
public class AccountDirectory {

    private ArrayList<Account> accountDirectory;

    public AccountDirectory() {
        accountDirectory = new ArrayList<Account>();
    }

    public ArrayList<Account> getAccountDirectory() {
        return accountDirectory;
    }

    public void setAccountDirectory(ArrayList<Account> accountDirectory) {
        this.accountDirectory = accountDirectory;
    }

    //operations
    public Account addAccount() {
        Account account = new Account();
        accountDirectory.add(account);
        return account;
    }

    public void deleteAccount(Account account) {
        accountDirectory.remove(account);
    }

    public Account searchAccount(int accNumber) {
        for (Account acc : accountDirectory) {
            if (String.valueOf(acc.getAccNum()).equalsIgnoreCase(String.valueOf(accNumber))) {
                return acc;
            }
        }
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author ragha
 */
public class UserAccountDirectory {
   private ArrayList<UserAccount> userAccountDir; 

    public UserAccountDirectory() {
        userAccountDir = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccountDir() {
        return userAccountDir;
    }

    public void setUserAccountDir(ArrayList<UserAccount> userAccountDir) {
        this.userAccountDir = userAccountDir;
    }
    public UserAccount addUser()
    {
        UserAccount ua = new UserAccount();
        userAccountDir.add(ua);
        return ua;
    }
    public UserAccount isValidUser(String userName, String password)
    {
        for(UserAccount ua: userAccountDir)
        {
            if(userName.equals(ua.getUserID()) && password.equals(ua.getPassword()))
            {
                return ua;
            }
         
        }
        return null;
    }
}

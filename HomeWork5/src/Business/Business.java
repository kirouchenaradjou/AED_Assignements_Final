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
public class Business {

    private PersonDirectory personDir;
    private UserAccountDirectory userAccDir;
    private String name;

    public Business(String n) {
        personDir = new PersonDirectory();
        userAccDir = new UserAccountDirectory();
        name = n;
    }

    public PersonDirectory getPersonDir() {
        return personDir;
    }

    public void setPersonDir(PersonDirectory personDir) {
        this.personDir = personDir;
    }

    public UserAccountDirectory getUserAccDir() {
        return userAccDir;
    }

    public void setUserAccDir(UserAccountDirectory userAccDir) {
        this.userAccDir = userAccDir;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

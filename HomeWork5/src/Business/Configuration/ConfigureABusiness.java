/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Configuration;

import Business.Business;
import Business.Person;
import Business.PersonDirectory;
import Business.UserAccount;
import Business.UserAccountDirectory;
import static UserInterface.AdminRole.ManageUserAccountJPanel.generateHash;
import java.util.Date;

/**
 *
 * @author ragha
 */
public class ConfigureABusiness {

    public static Business Initialize(String name) {
        Business b = new Business(name);
        PersonDirectory personDir = b.getPersonDir();
        Person p = personDir.addPerson();
        p.setFirstName("Deiva");
        p.setLastName("Dhanasegaran");
        p.setDob(new Date());
        p.setSocialSecurityNum("SSNDEIVA100");
        p.setAddress("Krishna Nagar");
        // creating a second person object 
        p = personDir.addPerson();
        p.setFirstName("Raghavi");
        p.setLastName("Kirouchenaradjou");
        p.setDob(new Date());
        p.setSocialSecurityNum("SSNRAGZ100");
        p.setAddress("Mudaliarpet");

        UserAccountDirectory uad = b.getUserAccDir(); // preparing to create user accounts
        Person p2 = personDir.findPersonByLastName("Dhanasegaran");
        if (p2 != null) {
            UserAccount ua = uad.addUser();
            ua.setP(p2);
            ua.setUserID("dk");
            String hashedPassword = generateHash("dkPassword");
            ua.setPassword(hashedPassword);
            ua.setRole("System Admin");
            ua.setStatus(true);
            ua.setAccType("Savings");
            ua.setCreationDate(new Date());
            ua.setStatus(true);
            p2.getUserAccount().add(ua);
        }

        return b;
    }
}

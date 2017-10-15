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
public class PersonDirectory {
    private ArrayList<Person> personDir;

    public PersonDirectory() {
        personDir = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonDir() {
        return personDir;
    }

    public void setPersonDir(ArrayList<Person> personDir) {
        this.personDir = personDir;
    }
    public Person addPerson()
    {
        Person p = new Person();
        personDir.add(p);
        return p;
    }
    public Person findPersonByLastName(String lastName)
    {
        for(Person p :personDir)
        {
            if(lastName.equals(p.getLastName()))
            {
                return p;
            }
        }
        return null;
    }
}

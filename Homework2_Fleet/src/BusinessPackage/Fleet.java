/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessPackage;

import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author ragha
 */
public class Fleet {

    private ArrayList<Airplane> fleet;
    private Timestamp timeStamp;
    
    public Fleet() {
        fleet = new ArrayList<Airplane>();
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    

    public ArrayList<Airplane> getFleet() {
        return fleet;
    }

    public void setFleet(ArrayList<Airplane> fleet) {
        this.fleet = fleet;
    }

    public Airplane addAirplane() {
        Airplane airplane = new Airplane();
        fleet.add(airplane);
        return airplane;
    }

}

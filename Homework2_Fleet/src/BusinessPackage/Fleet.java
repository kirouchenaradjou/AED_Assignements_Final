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
public class Fleet {

    private ArrayList<Airplane> fleet;

    public Fleet() {
        fleet = new ArrayList<Airplane>();
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

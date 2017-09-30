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

    private ArrayList<Flight> fleet;
    private String airlinerName;

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }
    public Fleet() {
        fleet = new ArrayList<Flight>();
    }

    public ArrayList<Flight> getFleet() {
        return fleet;
    }

    public void setFleet(ArrayList<Flight> fleet) {
        this.fleet = fleet;
    }

public Flight addAirplane() {
        Flight flight = new Flight();
        fleet.add(flight);
        return flight;
    }
}

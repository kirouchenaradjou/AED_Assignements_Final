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
public class Airline {
     private ArrayList<Fleet> airline;

    public ArrayList<Fleet> getAirline() {
        return airline;
    }

    public void setAirline(ArrayList<Fleet> airline) {
        this.airline = airline;
    }
        public Fleet addFleet() {
        Fleet fleet = new Fleet();
        airline.add(fleet);
        return fleet;
    }
        public Airline()
        {
            airline = new ArrayList<Fleet>();
        }
   
}

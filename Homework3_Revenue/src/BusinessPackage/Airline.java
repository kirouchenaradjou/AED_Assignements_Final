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
     private Fleet fleet;
     private int priceTotal_Airliner;
     private String airlineName;
     private int max_seats;

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public int getPriceTotal_Airliner() {
        return priceTotal_Airliner;
    }

    public void setPriceTotal_Airliner(int priceTotal_Airliner) {
        this.priceTotal_Airliner = priceTotal_Airliner;
    }

    public Fleet getFleet() {
        return fleet;
    }

    public void setFleet(Fleet airline) {
        this.fleet = airline;
    }

    
        public Fleet addFleet() {
        Fleet fleet = new Fleet();
        return fleet;
    }
      
   
}

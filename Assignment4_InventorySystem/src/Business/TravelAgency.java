/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ragha
 */
public class TravelAgency {
       private ArrayList<Airline> travelAgency;
private ArrayList<Customer> customerDirectory;

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

   
    
    public ArrayList<Airline> getTravelAgency() {
        return travelAgency;
    }

    public void setTravelAgency(ArrayList<Airline> travelAgency) {
        this.travelAgency = travelAgency;
    }
       
       public TravelAgency() {
        travelAgency = new ArrayList<Airline>();
    }
       
         public Airline addAirline() {
        Airline airline = new Airline();
        travelAgency.add(airline);
        return airline;
    }
           public Airline searchAirline(String airlineName) {
        for (Airline airline : travelAgency) {
            if (airline.getName().equalsIgnoreCase(airlineName)) {
                return airline;
            }
        }
        return null;
    }
 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessPackage;

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
private int revenue_TravelAgency;

    public int getRevenue_TravelAgency() {
        return revenue_TravelAgency;
    }

    public void setRevenue_TravelAgency(int revenue_TravelAgency) {
        this.revenue_TravelAgency = revenue_TravelAgency;
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
 /* public void add()
  {
              String csvFile = "details.csv";


       BufferedReader br = null;
        String line = "";
        String DELIMITER = ",";
  try{
       br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {
                                    String[] tokens = line.split(DELIMITER);
           Airline airliner = ;
travelAgency.add(airliner);
  }
  }
 catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
  }}*/
}

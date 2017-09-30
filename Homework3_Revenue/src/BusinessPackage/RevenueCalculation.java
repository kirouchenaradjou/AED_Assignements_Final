/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ragha
 */
public class RevenueCalculation {
    private static TravelAgency travelAgency;

    public RevenueCalculation()
    {
        //callhere();
        
    }
     public static void main(String[] args) {
                 travelAgency = new TravelAgency();

Airline  airline = travelAgency.addAirline();
Fleet fleet = airline.addFleet();
                   Flight flight = fleet.addAirplane();

String csvFile = "details.csv";
        BufferedReader br = null;
        String line = "";
        String DELIMITER = ",";
        int totalPrice=0,price=0,forSeats=0,remaining=0,forSeats1=0,remaining1=0;
        try {

            br = new BufferedReader(new FileReader(csvFile));
            
            while ((line = br.readLine()) != null) {

                   String[] tokens = line.split(DELIMITER);
              // System.out.println("Person");
                   Person person = new Person();
                   person.setPersonName(tokens[0]);
                   Seat seat = person.getSeat();
                   flight.setFlighName(tokens[1]);
                  // System.out.println(flight.getFlighName());
                   seat.setNumOfSeats(Integer.parseInt(tokens[2]));
                  
                   seat.setNumOfWindows(Integer.parseInt(tokens[3]));
                   seat.setNumOfMiddle(Integer.parseInt(tokens[4]));
                   seat.setNumOfAisle(Integer.parseInt(tokens[5]));
                   seat.setFlightName(tokens[1]);
                   //System.out.println(person.getPersonName()+" has paid "+(100*(seat.getNumOfWindows()) + 100 *(seat.getNumOfMiddle()) +10*(seat.getNumOfAisle())));
                   totalPrice = price + (100*(seat.getNumOfWindows()) + 100 *(seat.getNumOfMiddle()) +10*(seat.getNumOfAisle()));
                   price = totalPrice;
                   seat.setPrice(totalPrice);
                   flight.setSeat(seat);
                    if(flight.getFlighName().equals("Boeing700-707"))
                   {
                      forSeats = remaining+ flight.getSeat().getNumOfSeats();
                      remaining = forSeats;
                     // flight.setMaxNumOfSeats(150-forSeats);
                      flight.getSeat().setNumOfSeats(150-forSeats);
                   }
                     if(flight.getFlighName().equals("AA"))
                   {
                      forSeats1 = remaining1+flight.getSeat().getNumOfSeats();
                                            remaining1 = forSeats1;

                     // flight.setMaxNumOfSeats(150-forSeats);
                      flight.getSeat().setNumOfSeats(150-forSeats1);
                   }


            }
                                                       System.out.println(flight.getSeat().getNumOfSeats()+flight.getFlighName());

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

    }
            
     }

 
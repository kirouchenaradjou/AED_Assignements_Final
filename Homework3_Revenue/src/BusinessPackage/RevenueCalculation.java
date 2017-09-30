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
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ragha
 */
public class RevenueCalculation {

    private static TravelAgency travelAgency;

    public RevenueCalculation() {

    }

    public static void main(String[] args) {
        travelAgency = new TravelAgency();
        ArrayList<Fleet> fleetList = new ArrayList<Fleet>();
        Fleet jetAirways = new Fleet();
        Airline airline = travelAgency.addAirline();
        Fleet ba = new Fleet();

        String csvFile = "details.csv";
        BufferedReader br = null;
        String line = "";
        String DELIMITER = ",";
        int totalPrice = 0, price = 0, airlinerPrice = 0, airlinerPrice_ba = 0, forSeats1 = 0, remaining1 = 0, seats = 0;
        try {

            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(DELIMITER);
                jetAirways.setAirlinerName(tokens[6]);
                if (jetAirways.getAirlinerName().equals("Jet Airways")) {
                    Flight flight = jetAirways.addAirplane();
                    flight.setFlighName(tokens[1]);
                    flight.setMaxNumOfSeats(150);
                    Person person = new Person();
                    person.setPersonName(tokens[0]);
                    Seat seat = person.getSeat();
                    seat.setNumOfSeats(Integer.parseInt(tokens[2]));

                    seat.setNumOfWindows(Integer.parseInt(tokens[3]));
                    seat.setNumOfMiddle(Integer.parseInt(tokens[4]));
                    seat.setNumOfAisle(Integer.parseInt(tokens[5]));
                    seat.setFlightName(tokens[1]);
                    totalPrice = price + (100 * (seat.getNumOfWindows()) + 100 * (seat.getNumOfMiddle()) + 10 * (seat.getNumOfAisle()));

                    seat.setPrice(totalPrice);

                    flight.setSeat(seat);
                    person.setSeat(seat);
                    fleetList.add(jetAirways);

                }
                if (jetAirways.getAirlinerName().equals("British Airways")) {

                    Flight flight_ba = ba.addAirplane();

                    flight_ba.setFlighName(tokens[1]);
                    flight_ba.setMaxNumOfSeats(150);
                    Person person = new Person();
                    person.setPersonName(tokens[0]);
                    Seat seat = person.getSeat();
                    seat.setNumOfSeats(Integer.parseInt(tokens[2]));

                    seat.setNumOfWindows(Integer.parseInt(tokens[3]));
                    seat.setNumOfMiddle(Integer.parseInt(tokens[4]));
                    seat.setNumOfAisle(Integer.parseInt(tokens[5]));
                    seat.setFlightName(tokens[1]);
                    totalPrice = price + (100 * (seat.getNumOfWindows()) + 100 * (seat.getNumOfMiddle()) + 10 * (seat.getNumOfAisle()));

                    seat.setPrice(totalPrice);

                    flight_ba.setSeat(seat);
                    person.setSeat(seat);

                    fleetList.add(ba);

                }

            }
            airline.setAirline(fleetList);
            HashMap<String, Integer> hash = new HashMap<String, Integer>();
            HashMap<String, Integer> hashForBA = new HashMap<String, Integer>();

            for (Flight f : jetAirways.getFleet()) {
                String flightName = f.getFlighName();

                int seatNumbers = f.getSeat().getPrice();

                hash.merge(flightName, seatNumbers, Integer::sum);
            }
            for (Map.Entry m : hash.entrySet()) {
                System.out.println("Revenue from Flight " + m.getKey() + " is :  " + m.getValue());
                airlinerPrice = airlinerPrice + Integer.parseInt(m.getValue().toString());

            }
            for (Flight f : ba.getFleet()) {
                String flightName = f.getFlighName();

                int seatNumbers = f.getSeat().getPrice();

                hashForBA.merge(flightName, seatNumbers, Integer::sum);
            }
            for (Map.Entry m : hashForBA.entrySet()) {
                System.out.println("Revenue from Flight " + m.getKey() + " is : " + m.getValue());
                airlinerPrice_ba = airlinerPrice_ba + Integer.parseInt(m.getValue().toString());

            }

            System.out.println("Revenue by Airliner");
            System.out.println("Total Revenue for Airliner JET AIRWAYS " + airlinerPrice);

            System.out.println("Total Revenue for Airliner BRITISH AIRWAYS " + airlinerPrice_ba);

        } catch (FileNotFoundException e) {
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

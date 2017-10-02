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

    public static void main(String[] args) {
        travelAgency = new TravelAgency();

        String csvFile = "details.csv";
        BufferedReader br = null;
        String line = "";
        String DELIMITER = ",";
        int totalPrice = 0, price = 0, flightPrice = 0, maxSeats = 0, amount = 0;

        try {

            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {
                ArrayList<Airline> airlineList = travelAgency.getTravelAgency();
                String[] tokens = line.split(DELIMITER);
                if (airlineList.size() == 0) {
                    Airline airliner = travelAgency.addAirline();
                    airliner.setAirlineName(tokens[6]);

                    Fleet fleet = airliner.addFleet();
                    Flight flight = fleet.addAirplane();
                    flight.setFlighName(tokens[1]);
                    //flight.setMaxNumOfSeats(150);
                    flight.setAirlinerName(airliner.getAirlineName());
                    Customer person = new Customer();
                    person.setPersonName(tokens[0]);
                    Seat seat = person.getSeat();
                    seat.setNumOfSeats(Integer.parseInt(tokens[2]));
                    // flight.setMaxNumOfSeats((Integer.parseInt(tokens[2])));
                    maxSeats = flight.getMaxNumOfSeats() - seat.getNumOfSeats();
                    if (maxSeats < 150) {

                        flight.setMaxNumOfSeats(maxSeats);

                        seat.setNumOfWindows(Integer.parseInt(tokens[3]));
                        seat.setNumOfMiddle(Integer.parseInt(tokens[4]));
                        seat.setNumOfAisle(Integer.parseInt(tokens[5]));
                        seat.setFlightName(tokens[1]);
                        amount = (300 * (seat.getNumOfWindows()) + 200 * (seat.getNumOfMiddle()) + 100 * (seat.getNumOfAisle()));
                        totalPrice = price + amount;
                        seat.setPrice(totalPrice);

                        flight.setSeat(seat);
                        person.setSeat(seat);
                        System.out.println("Customer :" + person.getPersonName() + " has paid " + amount
                                + " and has booked for " + person.getSeat().getNumOfSeats() + " members in Flight " + person.getSeat().getFlightName());

                    } else {
                        System.out.println("Full!!!!! for Customer " + person.getPersonName() + " .Maximum number of seats is 250");
                        System.out.println("Available seat : " + (maxSeats + seat.getNumOfSeats()));
                    }
                    airliner.setFleet(fleet);

                } else {
                    int flag = 0;
                    maxSeats = 0;
                    for (Airline airlines : airlineList) {
                        if (airlines.getAirlineName().equalsIgnoreCase(tokens[6])) {

                            flag = 1;
                            Fleet airlineFleet = airlines.getFleet();
                            Flight flight = airlineFleet.addAirplane();
                            flight.setFlighName(tokens[1]);
                            flight.setAirlinerName(airlines.getAirlineName());

                            Customer person = new Customer();
                            person.setPersonName(tokens[0]);
                            Seat seat = person.getSeat();
                            seat.setNumOfSeats(Integer.parseInt(tokens[2]));
                            // flight.getSeat().getNumOfSeats();
                            //      flight.setMaxNumOfSeats((Integer.parseInt(tokens[2])));
                            maxSeats = flight.getMaxNumOfSeats() - seat.getNumOfSeats();

                            if (maxSeats < 150) {
                                flight.setMaxNumOfSeats(maxSeats);

                                seat.setNumOfWindows(Integer.parseInt(tokens[3]));
                                seat.setNumOfMiddle(Integer.parseInt(tokens[4]));
                                seat.setNumOfAisle(Integer.parseInt(tokens[5]));
                                seat.setFlightName(tokens[1]);
                                amount = (300 * (seat.getNumOfWindows()) + 200 * (seat.getNumOfMiddle()) + 100 * (seat.getNumOfAisle()));
                                totalPrice = price + amount;
                                seat.setPrice(totalPrice);

                                flight.setSeat(seat);
                                person.setSeat(seat);
                                System.out.println("Customer :" + person.getPersonName() + " has paid " + amount
                                        + " and has booked for " + person.getSeat().getNumOfSeats() + " members in Flight " + person.getSeat().getFlightName());

                            } else {
                                System.out.println("Full!!!!! for Customer " + person.getPersonName() + " .Maximum number of seats is 250");
                                System.out.println("Available seat : " + (maxSeats + seat.getNumOfSeats()));
                            }
                            airlines.setFleet(airlineFleet);

                        }

                    }

                    if (flag == 0) {
                        maxSeats = 0;
                        Airline airliner = travelAgency.addAirline();
                        airliner.setAirlineName(tokens[6]);

                        Fleet fleet = airliner.addFleet();
                        Flight flight = fleet.addAirplane();
                        flight.setAirlinerName(airliner.getAirlineName());

                        flight.setFlighName(tokens[1]);
                        flight.setMaxNumOfSeats(150);
                        Customer person = new Customer();
                        person.setPersonName(tokens[0]);
                        Seat seat = person.getSeat();
                        seat.setNumOfSeats(Integer.parseInt(tokens[2]));
                        // flight.setMaxNumOfSeats((Integer.parseInt(tokens[2])));
                        maxSeats = flight.getMaxNumOfSeats() - seat.getNumOfSeats();
                        if (maxSeats < 150) {

                            flight.setMaxNumOfSeats(maxSeats);
                            seat.setNumOfWindows(Integer.parseInt(tokens[3]));
                            seat.setNumOfMiddle(Integer.parseInt(tokens[4]));
                            seat.setNumOfAisle(Integer.parseInt(tokens[5]));
                            seat.setFlightName(tokens[1]);
                            amount = (300 * (seat.getNumOfWindows()) + 200 * (seat.getNumOfMiddle()) + 100 * (seat.getNumOfAisle()));
                            totalPrice = price + amount;
                            seat.setPrice(totalPrice);

                            flight.setSeat(seat);
                            person.setSeat(seat);
                            System.out.println("Customer :" + person.getPersonName() + " has paid " + amount
                                    + " and has booked for " + person.getSeat().getNumOfSeats() + " members in Flight " + person.getSeat().getFlightName());

                        } else {
                            System.out.println("Full!!!!! for Customer " + person.getPersonName() + " .Maximum number of seats is 250");
                            System.out.println("Available seat : " + (maxSeats + seat.getNumOfSeats()));
                        }
                        airliner.setFleet(fleet);

                    }

                }

            }
            HashMap<String, Integer> hash_flight = new HashMap<String, Integer>();
            HashMap<String, Integer> hash_airliner = new HashMap<String, Integer>();

            for (Airline airline : travelAgency.getTravelAgency()) {
                {
                    for (Flight f : airline.getFleet().getFleet()) {
                        if (f.getFlighName() != "" && f.getSeat() != null) {
                            String flightName = f.getFlighName();

                            int priceForJA = f.getSeat().getPrice();
                            String airlineName = f.getAirlinerName();

                            hash_flight.merge(flightName, priceForJA, Integer::sum);
                            hash_airliner.merge(airlineName, priceForJA, Integer::sum);

                        }
                    }

                }

            }
            System.out.println("================================================================");

            for (Map.Entry m : hash_flight.entrySet()) {
                System.out.println("Revenue from Flight " + m.getKey() + " is :  " + m.getValue());
                flightPrice = flightPrice + Integer.parseInt(m.getValue().toString());
                //            airline.getFleet().setFleetRevenue(flightPrice);

            }
            System.out.println("================================================================");
            int value = 0;
            for (Map.Entry m : hash_airliner.entrySet()) {

                System.out.println("Revenue from Airliner  " + m.getKey() + " is :  " + m.getValue());
                value = value + Integer.parseInt(m.getValue().toString());

            }
            Airline a = new Airline();
            a.setPriceTotal_Airliner(value);

            System.out.println("================================================================");
            System.out.println("Revenue from Travel Agency  " + value);

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

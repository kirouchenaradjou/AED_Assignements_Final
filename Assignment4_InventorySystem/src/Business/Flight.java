/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author ragha
 */
public class Flight {

    private String flightName;
    private String flightSerialNum;
    private String airlineName;
    private String source;
    private String destination;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
   
    
    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getFlightSerialNum() {
        return flightSerialNum;
    }

    public void setFlightSerialNum(String flightSerialNum) {
        this.flightSerialNum = flightSerialNum;
    }

    @Override
    public String toString() {
        return this.flightName;
    }
}

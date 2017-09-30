/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessPackage;

/**
 *
 * @author ragha
 */
public class Flight {

  private String flighName;
Seat seat;
private int maxNumOfSeats;
private String airlinerName;

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public int getMaxNumOfSeats() {
        return maxNumOfSeats;
    }

    public void setMaxNumOfSeats(int maxNumOfSeats) {
        this.maxNumOfSeats = maxNumOfSeats;
    }
    public String getFlighName() {
        return flighName;
    }

    public void setFlighName(String flighName) {
        this.flighName = flighName;
    }

    
}

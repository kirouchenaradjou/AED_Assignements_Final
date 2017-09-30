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
  private int numOfSeats;
Seat seat;
    public String getFlighName() {
        return flighName;
    }

    public void setFlighName(String flighName) {
        this.flighName = flighName;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }
public Flight(Seat seat)
{
    this.seat=seat;
}
    
}

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
public class Seat {
    private int numOfSeats;
    private char typeOfSeat;
    private int numOfWindows;
    private int numOfMiddle;
    private int numOfAisle;
    private int price;
private String flightName;

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }
public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getNumOfWindows() {
        return numOfWindows;
    }

    public void setNumOfWindows(int numOfWindows) {
        this.numOfWindows = numOfWindows;
    }

    public int getNumOfMiddle() {
        return numOfMiddle;
    }

    public void setNumOfMiddle(int numOfMiddle) {
        this.numOfMiddle = numOfMiddle;
    }

    public int getNumOfAisle() {
        return numOfAisle;
    }

    public void setNumOfAisle(int numOfAisle) {
        this.numOfAisle = numOfAisle;
    }
    

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public char getTypeOfSeat() {
        return typeOfSeat;
    }

    public void setTypeOfSeat(char typeOfSeat) {
        this.typeOfSeat = typeOfSeat;
    }
    
}

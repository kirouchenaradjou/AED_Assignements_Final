/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

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
    private Date departureDate;
    private ArrayList<Customer> customerList;
    private int price;
    private LocalTime deptTime;
    private LocalTime arrivalTime;
    private Seat seat;

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    

    public LocalTime getDeptTime() {
        return deptTime;
    }

    public void setDeptTime(LocalTime deptTime) {
        this.deptTime = deptTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Flight()
    {
      customerList = new ArrayList<Customer>();
    }
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

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
  public Customer addCustomer() {
        Customer customer = new Customer();
        customerList.add(customer);
        return customer;
    }
    @Override
    public String toString() {
        return this.flightName;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessPackage;

import java.util.Date;

/**
 *
 * @author ragha
 */
public class Airplane {
    
    private String airplaneManufacturer;
    private Date airplaneManufactureDate;
    private Integer airplaneSeats;
    private String airplaneSerialNum;
    private String airplaneModelNum;
    private Boolean isAvailable;
    private Boolean isExpired;

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Boolean getIsExpired() {
        return isExpired;
    }

    public void setIsExpired(Boolean isExpired) {
        this.isExpired = isExpired;
    }

    public String getAirplaneManufacturer() {
        return airplaneManufacturer;
    }

    public void setAirplaneManufacturer(String airplaneManufacturer) {
        this.airplaneManufacturer = airplaneManufacturer;
    }

    public Date getAirplaneManufactureDate() {
        return airplaneManufactureDate;
    }

    public void setAirplaneManufactureDate(Date airplaneManufactureDate) {
        this.airplaneManufactureDate = airplaneManufactureDate;
    }

    public Integer getAirplaneSeats() {
        return airplaneSeats;
    }

    public void setAirplaneSeats(Integer airplaneSeats) {
        this.airplaneSeats = airplaneSeats;
    }

    public String getAirplaneSerialNum() {
        return airplaneSerialNum;
    }

    public void setAirplaneSerialNum(String airplaneSerialNum) {
        this.airplaneSerialNum = airplaneSerialNum;
    }

    public String getAirplaneModelNum() {
        return airplaneModelNum;
    }

    public void setAirplaneModelNum(String airplaneModelNum) {
        this.airplaneModelNum = airplaneModelNum;
    }
    @Override
    public String toString(){
        return this.airplaneModelNum;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;



/**
 *
 * @author Anjali
 */
public class UberModel {
    public String manufactuer;
    public String model;
    public String makeYear;
    public int seatMin;
    public int seatMax;
    public String city;
    public Double time;
    public String serialNo;
    public String expired;
    public String availability;
    public Date UpdatedDate;

    public Date getUpdatedDate() {
        return UpdatedDate;
    }

    public void setUpdatedDate(Date UpdatedDate) {
        this.UpdatedDate = UpdatedDate;
    }

    public UberModel() { //no return type for constructor because object account itself returned
        
        }
    
         public void setManufactuer(String manufactuer) {
        this.manufactuer = manufactuer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public void setMakeYear(String makeYear) {
        this.makeYear = makeYear;
    }

    public void setSeatMin(int seatMin) {
        this.seatMin = seatMin;
    }

    public void setSeatMax(int seatMax) {
        this.seatMax = seatMax;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

   

    
    
    

    public String getManufactuer() {
        return manufactuer;
    }

    public String getModel() {
        return model;
    }

    public String getMakeYear() {
        return makeYear;
    }

    public int getSeatMin() {
        return seatMin;
    }

    public int getSeatMax() {
        return seatMax;
    }

    public String getCity() {
        return city;
    }

    public double getTime() {
        return time;
    }

    public String getSerialNo() {
        return serialNo;
    }

    
    @Override
    public String toString(){
        return serialNo;
    } 
}

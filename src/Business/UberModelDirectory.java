/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Anjali
 */
public class UberModelDirectory {
     private ArrayList<UberModel> UberList;
     
     public UberModelDirectory(){
     this.UberList = new ArrayList<UberModel>(); 
  }

    public ArrayList<UberModel> getUberList() {
        return UberList;
    }

    public void setUberList(ArrayList<UberModel> UberList) {
        this.UberList = UberList;
    }
     
       
public UberModel addAccount(){
    UberModel account = new UberModel();
    UberList.add(account);
    return account;
 }
    //as need to delete an account the account should be send
    public void deleteAccount(UberModel account){
    UberList.remove(account);
    }
  
    public UberModel searchModel(String model){
        for(UberModel uber: UberList){
            if(uber.getModel().equals(model))
                    {
                return uber;
            }
        }
        return null;
            }
    
    public UberModel searchManufactuer(String manufactuer){
        for(UberModel uber: UberList){
            if(uber.getManufactuer().equals(manufactuer))
                    {
                return uber;
            }
        }
        return null;
            }
    
    public UberModel searchSerial(String serialNo){
        for(UberModel uber: UberList){
            if(uber.getSerialNo().equals(serialNo))
                    {
                return uber;
            }
        }
        return null;
            }
    public UberModel searchMakeYear(String year){
        for(UberModel uber: UberList){
            if(uber.getMakeYear().equals(year))
                    {
                return uber;
            }
        }
        return null;
            }
    
    public UberModel searchCity(String city){
        for(UberModel uber: UberList){
            if(uber.getCity().equals(city))
                    {
                return uber;
            }
        }
        return null;
            }
    public String searchAvailability(){
       
        for(UberModel uber: UberList){
           if(uber.getAvailability().endsWith("Yes"))
           {
           return "Yes";
                }
       }
    return null;
        }
    
    public String searchExpired(){
       for(UberModel uber: UberList){
           if(uber.getExpired().endsWith("Yes"))
                {
                return "Yes";
                }
       }
    return null;
        }
    public double searchFirstAvail(){
        
        double min = Double.MAX_VALUE;
       for(UberModel uber: UberList){
         
           if(uber.getTime()<min)
                {
                min = uber.getTime();
                }
                   }
    return min;
        }
    
    
    public Date updatedDate()
    {   Date maxDate = new Date(0000,01,01);
        for(UberModel uber: UberList){
            
            if(uber.getUpdatedDate().compareTo(maxDate)>0)
            {maxDate=uber.getUpdatedDate();
            }
            else if(uber.getUpdatedDate().compareTo(maxDate)<0)
            {continue;
            }
                  }   
        
        return maxDate;
    }
}
        
    
    
    
    

    

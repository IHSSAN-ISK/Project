
package com.mycompany.ihssaniskandr;

import java.util.ArrayList;

public class Car {
private int ID;
private String Model;
private String Vendor;
private int Manufacturing_Year ; 
private float Price;
ArrayList<SubPart1>parts ; 
private boolean Used_Status;

    public Car(int ID, String Model, String Vendor, int Manufacturing_Year, float Price, boolean Used_Status) throws InvalidManufacturingYearException {
        this.ID = ID;
        this.Model = Model;
        this.Vendor = Vendor;
        setManufacturing_Year(Manufacturing_Year);
        this.Price = Price;
        parts = new ArrayList<SubPart1>();
        this.Used_Status = Used_Status;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getVendor() {
        return Vendor;
    }

    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    public int getManufacturing_Year() {
        return Manufacturing_Year;
    }

    public void setManufacturing_Year(int Manufacturing_Year) throws InvalidManufacturingYearException {
        if(Manufacturing_Year>=1900&&Manufacturing_Year<=2023)
        this.Manufacturing_Year = Manufacturing_Year;
        else 
            throw new InvalidManufacturingYearException("Manufacturing Year should be older than or equal to this year!");
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public boolean isUsed_Status() {
        return Used_Status;
    }

    public void setUsed_Status(boolean Used_Status) {
        this.Used_Status = Used_Status;
    }
    public void addPart(SubPart1 p)
    {
        parts.add(p);
    }

    @Override
    public String toString() {
        String s=  "ID=" + ID + ", Model=" + Model + ", Vendor=" + Vendor + ", Manufacturing_Year=" + Manufacturing_Year + ", Price=" + Price  + ", Used_Status=" + Used_Status+"\n" ;
        for (int i = 0; i < parts.size(); i++) {
        s=s+parts.get(i).toString();
        }
        return s;
    }

}


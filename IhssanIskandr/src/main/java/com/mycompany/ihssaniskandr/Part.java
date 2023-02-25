
package com.mycompany.ihssaniskandr;

public class Part {
 private int  ID;
 private String  Model;
 private String  Vendor ;

    public Part(int ID, String Model, String Vendor) {
        this.ID = ID;
        this.Model = Model;
        this.Vendor = Vendor;
    }

    @Override
    public String toString() {
        return   "ID=" + ID + ", Model=" + Model + ", Vendor=" + Vendor+"\n" ;
    }
 
}

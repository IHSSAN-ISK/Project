
package com.mycompany.ihssaniskandr;

public class SubPart1 extends Part implements InfoPart {

    public SubPart1(int ID, String Model, String Vendor) {
        super(ID, Model, Vendor);
    }
    public void printInfo()
    {
        System.out.println(" This car have new options will come in next model after 2023 \n");
    }
}
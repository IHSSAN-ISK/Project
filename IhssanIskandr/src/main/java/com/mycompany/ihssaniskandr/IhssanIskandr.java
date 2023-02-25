
package com.mycompany.ihssaniskandr;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author -
 */
public class IhssanIskandr {

    public static void main(String[] args) throws InvalidManufacturingYearException {
   
        Scanner input = new Scanner(System.in);
        ArrayList<Car> carlist = new ArrayList<Car>();
        ArrayList<SubPart1> partlist = new ArrayList<SubPart1>();
        
        int prog = 0;
        while (prog == 0) {
            System.out.println("1- Add a new car");
            System.out.println("2- Print all cars information");
            System.out.println("3- Add anew part ");
            System.out.println("4- Print all parts");
            System.out.println("5- Exit the program");
            int select = input.nextInt();
            if (select == 1) {

                System.out.println("Enter ID ");
                int i = input.nextInt();
                System.out.println("Enter model");
                String n = input.next();
                System.out.println("Enter Vendor");
                String a = input.next();
                System.out.println("Enter Manufacturing_Year");
                int d = input.nextInt();
                System.out.println("Enter Price");
                float b = input.nextFloat();
                System.out.println("Enter Used_Status");
                boolean e = input.nextBoolean();

                Car c1 = new Car(i, n, a, d, b, e);
                carlist.add(c1);
               
            } else if (select == 2) {
                for (int i = 0; i < carlist.size(); i++) {
                    System.out.println(carlist.get(i).toString());
                }
             
            } else if(select==3)
            {
                
                System.out.println("the sub Part in store");
                System.out.println("Enter ID ");
                int i = input.nextInt();
                System.out.println("Enter model");
                String n = input.next();
                System.out.println("Enter Vendor");
                String a = input.next(); 
                SubPart1 t1 = new SubPart1(i,n,a);
                partlist.add(t1);
            }
            
            else if (select == 4) {
                for (int i = 0; i < partlist.size(); i++) {
                    System.out.println(partlist.get(i).toString());
                }
                
                partlist.get(0).printInfo();
            }
            
            else if (select == 5) {
                prog = 1;
            } else {
                System.out.println("error.enter choise");
            }
        }
    }
}

package com.company;

import java.util.ArrayList;

public class Taxi {
    private Driver driver;
    private ArrayList<Passenger> passengers;
    public Taxi(Driver driver_i, ArrayList<Passenger> passengers_i){
        driver = driver_i;
        passengers = passengers_i;
    }

    public void Info(){
        System.out.print("Driver: "+((TaxiDriver)driver).info()+ " ");
        for(Passenger p: passengers){
            System.out.print(p.number + " ");
        }
        System.out.println();
    }
}

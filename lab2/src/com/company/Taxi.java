package com.company;

import java.util.ArrayList;

public class Taxi {
    private TaxiDriver driver;
    private ArrayList<TaxiPassenger> passengers;
    public Taxi(TaxiDriver driver_i, ArrayList<TaxiPassenger> passengers_i){
        driver = driver_i;
        passengers = passengers_i;
    }

    public void printInfo(){
        driver.printInfo();
        System.out.print(" ");
        for(TaxiPassenger p: passengers){
            System.out.print(p.info() + " ");
        }
        System.out.println();
    }
}

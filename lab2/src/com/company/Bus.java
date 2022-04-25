package com.company;

import java.util.ArrayList;

public class Bus {
    private BusDriver driver;
    private ArrayList<BusPassenger> passengers;
    public Bus(BusDriver driver_i, ArrayList<BusPassenger> passengers_i){
        driver = driver_i;
        passengers = passengers_i;
    }

    public void printInfo(){
        driver.printInfo();
        System.out.print(" ");
        for(BusPassenger p: passengers){
            System.out.print(p.info() + " ");
        }
        System.out.println();
    }
}

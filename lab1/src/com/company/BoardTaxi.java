package com.company;

import java.util.ArrayList;
import java.util.Queue;

public class BoardTaxi implements BoardAnyCar{
    private Driver driver;
    private ArrayList<Passenger> passengers;

    public void BoardDriver(Queue<Driver> drivers){
        driver = drivers.poll();
    }

    public void BoardPassengers(Queue<Passenger> passengers_i){
        passengers = new ArrayList<Passenger>();
        for(int i =0; i < 4; i++){
            passengers.add(passengers_i.poll());
        }
    }

    public Taxi getTaxi(){
        return new Taxi(driver, passengers);
    }
}

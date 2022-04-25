package com.company;

import java.util.Queue;

public class Director {
    private Queue<Passenger> passengers;

    public Director(Queue<Passenger> passengers_i){
        passengers = passengers_i;
    }

    public void constructBus(Builder builder){
        builder.setDriver((Driver) new BusDriver());
        builder.setPassengers(passengers);
        builder.getRaceRoute();
        builder.setSafetyBelt();
    }

    public void constructTaxi(Builder builder){
        builder.setDriver((Driver) new TaxiDriver());
        builder.setPassengers(passengers);
        builder.setChildChair();
        builder.getDestAddress();
        builder.setSafetyBelt();
    }
}

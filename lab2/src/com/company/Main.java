package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Queue<Passenger> passengers;
        passengers = new LinkedList<Passenger>();
        Random rn = new Random();

        for(int i = 0; i < 100; i+=2){
            passengers.offer(new BusPassenger(i,rn.nextInt(3)+1));
            passengers.offer(new TaxiPassenger(i+1,rn.nextInt(2)+1));
        }

        Director director = new Director(passengers);

        BusBuilder busB = new BusBuilder();
        director.constructBus(busB);
        Bus bus = busB.getBus();
        bus.printInfo();
//        Bus bus1 = busB.getBus();
//        bus1.printInfo();

        TaxiBuilder taxiB = new TaxiBuilder();
        director.constructTaxi(taxiB);
        Taxi taxi = taxiB.getTaxi();
        taxi.printInfo();


    }
}

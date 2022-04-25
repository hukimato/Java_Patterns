package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public Queue<Passenger> passengers;
    public Queue<BusDriver> busDrivers;
    public Queue<TaxiDriver> taxiDrivers;

    private void pass_init(){
        passengers = new LinkedList<Passenger>();
        for(int i = 0; i < 100; i++){
            passengers.offer(new Passenger(i));
        }

        busDrivers = new LinkedList<BusDriver>();
        busDrivers.offer(BusDriver.getInstance());

        taxiDrivers = new LinkedList<TaxiDriver>();
        taxiDrivers.offer(TaxiDriver.getInstance());
    }

    private void run(){
        BoardAnyCar carFactory;

        Driver bus_driver = BusDriver.getInstance();
        carFactory = new BoardBus();
        carFactory.BoardDriver(busDrivers);
        carFactory.BoardPassengers(passengers);
        Bus bus = ((BoardBus)carFactory).getBus();
        bus.Info();

        Driver taxi_driver = TaxiDriver.getInstance();
        carFactory = new BoardTaxi();
        carFactory.BoardDriver(taxiDrivers);
        carFactory.BoardPassengers(passengers);
        Taxi taxi = ((BoardTaxi)carFactory).getTaxi();
        taxi.Info();

        //carFactory = new BoardTaxi();
        carFactory.BoardDriver(taxiDrivers);
        carFactory.BoardPassengers(passengers);
        Taxi taxi1 = ((BoardTaxi)carFactory).getTaxi();
        taxi1.Info();
        taxi.Info();
    }

    public static void main(String[] args) {
	    Main main = new Main();
        main.pass_init();
        main.run();
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Queue;

public class BusBuilder implements Builder{
    private BusDriver driver;
    private ArrayList<BusPassenger> passengers;

    public void setDriver(Driver driver_i){
        driver = (BusDriver) driver_i;
    }

    public void setPassengers(Queue<Passenger> passengers_i){
        passengers = new ArrayList<BusPassenger>();
        for(int i =0; i < 30;){
                Passenger prob_pas = passengers_i.poll();
                if( prob_pas instanceof BusPassenger){
                    passengers.add((BusPassenger) prob_pas);
                    i++;
                } else {
                    System.out.println("Неверный билет. Пробуем следующего.");
                    passengers_i.offer(prob_pas);}

        }
    }

    public void setChildChair(){}

    public void setSafetyBelt(){System.out.println("Надеты ремни безопасности.");}

    public void getDestAddress(){}

    public void getRaceRoute(){System.out.println("Получен маршрут рейса.");}

    public Bus getBus(){
        Bus bus = new Bus(driver, passengers);
        driver = null;
        passengers = null;
        return bus;
    }
}

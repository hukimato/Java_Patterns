package com.company;

import java.util.ArrayList;
import java.util.Queue;

public class TaxiBuilder implements Builder{
    private TaxiDriver driver;
    private ArrayList<TaxiPassenger> passengers;

    public void setDriver(Driver driver_i){
        driver = (TaxiDriver) driver_i;
    }

    public void setPassengers(Queue<Passenger> passengers_i){
        passengers = new ArrayList<TaxiPassenger>();
        for(int i =0; i < 4;){
            Passenger prob_pas = passengers_i.poll();
            if( prob_pas instanceof TaxiPassenger){
                passengers.add((TaxiPassenger) prob_pas);
                i++;
            } else {
                System.out.println("Неверный билет. Пробуем следующего.");
                passengers_i.offer(prob_pas);}

        }
    }

    public void setChildChair(){
        System.out.println("Установлено детское кресло.");
    }

    public void setSafetyBelt(){
        System.out.println("Надеты ремни безопасности.");
    }

    public void getDestAddress(){
        System.out.println("Получен адресс назначения.");
    }

    public void getRaceRoute(){}

    public Taxi getTaxi(){
        Taxi taxi = new Taxi(driver, passengers);
        driver = null;
        passengers = null;
        return taxi;
    }
}

package com.company;

import java.util.ArrayList;

public class Class implements Component{
    private ArrayList<Component> passengers;
    private Types classType;
    private int maxPassengers;
    private int maxLuggageWeight;

    public Class(Types classType){
        this.classType = classType;
        if (classType == Types.FIRST){
            this.maxPassengers = 10;
            this.maxLuggageWeight = 100;
        } else if (classType == Types.BUSINESS){
            this.maxPassengers = 20;
            this.maxLuggageWeight = 35;
        } else if (classType == Types.ECONOMY){
            this.maxPassengers = 150;
            this.maxLuggageWeight = 20;
        }
        passengers = new ArrayList<Component>();
    }

    public void add(Passenger passenger){
        if (this.passengers.size() == this.maxPassengers)
            return;
        this.passengers.add(passenger);
    }

    public void remove(int i){
        this.passengers.remove(i);
    }

    @Override
    public void getOnPlane() {
        for (Component passenger: passengers){
            passenger.getOnPlane();
        }
    }

    @Override
    public int getLuggageWeight(){
        int sumWeight = 0;
        for (Component passenger: passengers){
            sumWeight += passenger.getLuggageWeight();
        }
        return sumWeight;
    }

    @Override
    public void print() {
        for (Component passenger: passengers){
            passenger.print();
        }
    }

    public boolean removeExtraWeight(int weightDiff){
        if (this.classType == Types.BUSINESS || this.classType == Types.FIRST) {
            System.out.println("Нельзя убирать багаж бизнесс или эконом класса");
            return false;
        }
        int curWeightRemoved = 0;
        for (Component passenger: passengers){
            curWeightRemoved += passenger.getLuggageWeight();
            ((Passenger)passenger).removeLuggage();
            if (curWeightRemoved >= weightDiff) {
                System.out.println("Убрали весь лишний багаж, взлетаем.");
                return true;
            }
        }
        System.out.println("Убрали весь багаж, но перевес остался");
        return false;
    }
}

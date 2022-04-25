package com.company;

public class Passenger implements Component{
    private String name;
    private int luggageWeight;

    public Passenger(String name){
        this.name = name;
        this.luggageWeight = (int)(5 + Math.random()*55);
    }

    public void removeLuggage(){
        System.out.println("Убран багаж весом "+this.luggageWeight);
        this.luggageWeight = 0;
    }

    @Override
    public void print(){
        System.out.println("Passenger: " + name + " Luggage weight: " + luggageWeight);
    }

    @Override
    public void getOnPlane() {
        System.out.println("Пассажир " + name + " поднялся на борт.");
    }

    @Override
    public int getLuggageWeight(){
        return luggageWeight;
    }
}

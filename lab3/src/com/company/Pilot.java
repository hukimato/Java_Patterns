package com.company;

public class Pilot implements Component {
    private String name;

    public Pilot(String name){
        this.name = name;
    }

    @Override
    public void print(){
        System.out.println("Pilot: " + name);
    }

    @Override
    public void getOnPlane() {
        System.out.println("Пилот " + name + " сел в кабину.");
    }

    @Override
    public int getLuggageWeight(){
        return 0;
    }
}

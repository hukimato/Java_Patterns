package com.company;

public class Stewardess implements Component{
    private String name;

    public Stewardess(String name){
        this.name = name;
    }

    @Override
    public void print(){
        System.out.println("Stewardess: " + name);
    }

    @Override
    public void getOnPlane() {
        System.out.println("Стюардесса " + name + " принимает пассажиров.");
    }

    @Override
    public int getLuggageWeight(){
        return 0;
    }
}

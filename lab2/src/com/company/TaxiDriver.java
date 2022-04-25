package com.company;

public class TaxiDriver extends Driver{
    private int number;

    public TaxiDriver(){

    }

    public void printInfo(){
        System.out.print("TaxiDriver");
    }

    public String getType() {return "TaxiDriver";}
}

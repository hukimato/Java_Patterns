package com.company;

public class TaxiPassenger extends Passenger{
    private TaxiPassType passType;
    private int number;

    public TaxiPassenger(int num, int type_num){
        number = num;
        if(type_num == 1)
            passType = TaxiPassType.ADULT;
        else
            passType = TaxiPassType.CHILD;
    }

    public String info(){
        return passType +":"+ Integer.toString(number);
    }
}

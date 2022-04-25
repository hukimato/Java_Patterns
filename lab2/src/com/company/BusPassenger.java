package com.company;

public class BusPassenger extends Passenger{
    private BusPassType passType;
    private int number;

    public BusPassenger(int num, int type_num){
        number = num;
        if(type_num == 1)
            passType = BusPassType.ADULT;
        else if(type_num == 2)
            passType = BusPassType.CHILD;
        else
            passType = BusPassType.PREFERENTIAL;
    }

    public String info(){
        return passType +":"+ Integer.toString(number);
    }
}

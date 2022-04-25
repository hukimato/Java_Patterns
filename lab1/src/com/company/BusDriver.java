package com.company;

public class BusDriver extends Driver{
    private static BusDriver instance;

    private BusDriver(){
        super();
    }

    public static BusDriver getInstance(){
        if(instance==null){
            instance = new BusDriver();
        }
        return instance;
    }

    public String info(){
        return "BusDriver";
    }
}

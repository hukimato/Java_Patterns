package com.company;

public class TaxiDriver extends Driver{
    private static TaxiDriver instance;

    public static int link_count = 0;

    private TaxiDriver(){
        super();
    }

    public static boolean exist(){
        return instance!=null;
    }

    public static TaxiDriver getInstance(){
        if(instance==null){
            instance = new TaxiDriver();
        }
        return instance;
    }

    public static String info(){
        return "TaxiDriver";
    }
}

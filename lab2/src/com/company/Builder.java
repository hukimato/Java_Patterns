package com.company;

import java.util.Queue;

public interface Builder {
    void setDriver(Driver drivers);
    void setPassengers(Queue<Passenger> passengers);
    void setChildChair();
    void setSafetyBelt();
    void getDestAddress();
    void getRaceRoute();
}

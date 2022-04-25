package com.company;

import java.util.ArrayList;
import java.util.Queue;

public interface BoardAnyCar {
    void BoardDriver(Queue<Driver> drivers);
    void BoardPassengers(Queue<Passenger> passengers);
}

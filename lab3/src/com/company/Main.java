package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int maxWeight = 20000;

        ArrayList<Component> plane = new ArrayList<>();
        // Подготовка данных
        plane.add(new Pilot("Пилот1"));
        plane.add(new Pilot("Пилот2"));
        for (int i = 0; i < 6; i ++){
            plane.add(new Stewardess("Стюардесса"+i));
        }
        Class firstClass = new Class(Types.FIRST);
        Class businessClass = new Class(Types.BUSINESS);
        Class economyClass = new Class(Types.ECONOMY);
        for(int i = 0; i < (int)(5 + Math.random()*5); i ++){
            firstClass.add(new Passenger("ПассажирПервогоКласса"+i));
        }
        for(int i = 0; i < (int)(10 + Math.random()*9); i ++){
            businessClass.add(new Passenger("ПассажирБизнессКласса"+i));
        }
        for(int i = 0; i < (int)(50 + Math.random()*99); i ++){
            economyClass.add(new Passenger("ПассажирЭкономКласса"+i));
        }

        plane.add(firstClass);
        plane.add(businessClass);
        plane.add(economyClass);

        // Проверка перевеса

        int curWeight = 0;
        for (Component comp : plane){
            comp.getOnPlane();
            curWeight += comp.getLuggageWeight();
        }
        System.out.println("Максимальный вес: "+maxWeight);
        System.out.println("Текущий вес: "+curWeight);

        if (curWeight > maxWeight){
            boolean tmp = economyClass.removeExtraWeight(curWeight-maxWeight);
        } else {
            System.out.println("Борт готов к вылету.");
        }
    }
}

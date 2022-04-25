package com.company;

public class TabsInterpreter extends Interpreter{

    public TabsInterpreter(int one) {
        super(one);
    }

    public String interpret(String context){
        while (context.contains("\t\t")){
            context = context.replace("\t\t", "\t");
        }
        return context;
    }
}
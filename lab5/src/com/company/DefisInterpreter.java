package com.company;

public class DefisInterpreter extends Interpreter{

    public DefisInterpreter(int one) {
        super(one);
    }

    public String interpret(String context){
        while (context.contains(" ‐ ")){
            context = context.replace(" ‐ ", " — ");
        }
        return context;
    }
}
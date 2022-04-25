package com.company;

public class SpaceInterpreter extends Interpreter{

    public SpaceInterpreter(int one) {
        super(one);
    }

    public String interpret(String context){
        while (context.contains("  ")){
            context = context.replace("  ", " ");
        }
        return context;
    }
}

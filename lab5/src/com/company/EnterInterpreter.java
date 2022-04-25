package com.company;

public class EnterInterpreter extends Interpreter{

    public EnterInterpreter(int one) {
        super(one);
    }

    public String interpret(String context){
        while (context.contains("\n\n")){
            context = context.replace("\n\n", "\n");
        }
        return context;
    }
}

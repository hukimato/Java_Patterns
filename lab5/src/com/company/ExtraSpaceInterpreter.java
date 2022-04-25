package com.company;

public class ExtraSpaceInterpreter extends Interpreter{

    public ExtraSpaceInterpreter(int one) {
        super(one);
    }

    public String interpret(String context){
        while (context.contains(" ,")){
            context = context.replace(" ,", ",");
        }
        while (context.contains(" .")){
            context = context.replace(" .", ".");
        }
        while (context.contains("( ")){
            context = context.replace("( ", "(");
        }
        while (context.contains(" )")){
            context = context.replace(" )", ")");
        }
        return context;
    }
}
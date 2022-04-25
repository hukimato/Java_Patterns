package com.company;

public class KovichkiInterpreter extends Interpreter{

    public KovichkiInterpreter(int one) {
        super(one);
    }

    public String interpret(String context){
        while (context.contains("“")){
            context = context.replace("“", "«");
        }
        while (context.contains("”")){
            context = context.replace("”", "»");
        }
        return context;
    }
}
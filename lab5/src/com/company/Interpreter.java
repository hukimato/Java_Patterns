package com.company;

public class Interpreter {
    public Interpreter space;
    public Interpreter enter;
    public Interpreter tabs;
    public Interpreter defis;
    public Interpreter kovichki;
    public Interpreter extraSpace;

    public Interpreter(){
        this.space = new SpaceInterpreter(1);
        this.enter = new EnterInterpreter(1);
        this.tabs = new TabsInterpreter(1);
        this.defis = new DefisInterpreter(1);
        this.kovichki = new KovichkiInterpreter(1);
        this.extraSpace = new ExtraSpaceInterpreter(1);
    }

    public Interpreter(int one){

    }

    public String interpret(String context){
        context = space.interpret(context);
        context = enter.interpret(context);
        context = tabs.interpret(context);
        context = defis.interpret(context);
        context = kovichki.interpret(context);
        context = extraSpace.interpret(context);
        return context;
    }
}

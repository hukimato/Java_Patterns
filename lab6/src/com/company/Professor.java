package com.company;

public class Professor {
    public Deccan events;
    public String name;

    public Professor(String name) {
        this.events = new Deccan(new String[]{"Maths", "Physics", "CS"});
        this.name = name;
    }

    public void maths() {
        events.notify("Maths", name);
    }

    public void physics() {
        events.notify("Physics", name);
    }

    public void cs() {
        events.notify("CS", name);
    }
}

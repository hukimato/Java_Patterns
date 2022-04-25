package com.company;

public class MathsDepartment implements Listener{
    private String title;

    public MathsDepartment(String title){
        this.title = title;
    }

    @Override
    public void update(String eventType, String professor) {
        System.out.println("MathsDepartment \"" + title + "\" got notification from professor "+ professor);
    }
}

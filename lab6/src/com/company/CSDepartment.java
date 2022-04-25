package com.company;

public class CSDepartment implements Listener{
    private String title;

    public CSDepartment(String title){
        this.title = title;
    }

    @Override
    public void update(String eventType, String professor) {
        System.out.println("CSDepartment  \"" + title + "\" got notification from professor "+ professor);
    }
}

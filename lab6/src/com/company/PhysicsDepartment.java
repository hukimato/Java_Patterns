package com.company;

public class PhysicsDepartment implements Listener {
    private String title;

    public PhysicsDepartment(String title){
        this.title = title;
    }

    @Override
    public void update(String eventType, String professor) {
        System.out.println("PhysicsDepartment  \"" + title + "\" got notification from professor "+ professor);
    }

}

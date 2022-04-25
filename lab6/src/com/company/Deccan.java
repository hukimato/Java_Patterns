package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deccan {
    Map<String, List<Listener>> listeners = new HashMap<>();

    public Deccan(String[] departments) {
        for (String department : departments) {
            this.listeners.put(department, new ArrayList<>());
        }
    }

    public void subscribe(String department, Listener listener) {
        List<Listener> users = listeners.get(department);
        users.add(listener);
    }

    public void unsubscribe(String department, Listener listener) {
        List<Listener> users = listeners.get(department);
        users.remove(listener);
    }

    public void notify(String department, String professor) {
        List<Listener> users = listeners.get(department);
        for (Listener listener : users) {
            listener.update(department, professor);
        }
    }
}

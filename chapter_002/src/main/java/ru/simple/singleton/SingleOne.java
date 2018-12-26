package ru.simple.singleton;

import ru.simple.start.Tracker;

public class SingleOne {
    private static SingleOne instance;
    public static SingleOne getInstance() {
        if (instance == null) {
            instance = new SingleOne();
        }
        return instance;
    }

    public Tracker getTraker(Tracker tracker){
        return tracker;
    }
}

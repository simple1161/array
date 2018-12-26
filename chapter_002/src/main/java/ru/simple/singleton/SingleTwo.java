package ru.simple.singleton;

import ru.simple.start.Tracker;

public enum SingleTwo {
    INSTANCE;

    public Tracker getTraker(Tracker tracker){
        return tracker;
    }
}

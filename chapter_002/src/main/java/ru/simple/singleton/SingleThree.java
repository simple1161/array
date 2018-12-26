package ru.simple.singleton;

import ru.simple.start.Tracker;

public class SingleThree {
    private static final SingleThree INSTANCE = new SingleThree();
    private SingleThree() {
    }

    public static SingleThree getInstance() {
        return INSTANCE;
    }

    public Tracker getTraker(Tracker tracker){
        return tracker;
    }
}

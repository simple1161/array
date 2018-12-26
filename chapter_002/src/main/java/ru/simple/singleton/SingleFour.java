package ru.simple.singleton;

import ru.simple.start.Tracker;

public class SingleFour {
    private SingleFour(){}

    public static SingleFour getInstance() {
        return Holder.INSTANCE;
    }

    public Tracker getTraker(Tracker tracker){
        return tracker;
    }

    private static final class Holder {
        private static final SingleFour INSTANCE = new SingleFour();
    }

}

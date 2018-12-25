package ru.simple.operations;

import ru.simple.start.Input;
import ru.simple.start.Tracker;

public class BaseAction implements UserAction{

    private final int key;
    private final String name;

    protected BaseAction(final int key, final String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public int key() {
        return this.key;
    }

    @Override
    public void execute(Input input, Tracker tracker) {

    }

    @Override
    public String info() {
        return String.format("%s : %s", this.key, this.name);
    }
}

package ru.simple.start;

import ru.simple.models.Item;

import java.util.ArrayList;
import java.util.List;

public class MenuTracker {

    /**
     * @param хранит ссылку на объект .
     */
    private Input input;
    /**
     * @param хранит ссылку на объект .
     */
    private Tracker tracker;
    /**
     * @param хранит ссылку на массив типа UserAction.
     */

    private List<UserAction> actions;
    /**
     * Конструктор.
     *
     * @param input   объект типа Input
     * @param tracker объект типа Tracker
     */
    public MenuTracker(Input input, Tracker tracker, List<UserAction> actions) {
        this.input = input;
        this.tracker = tracker;
        this.actions = actions;
    }

    public void select(String key) {
        this.actions.get(Integer.valueOf(key)).execute(this.input, this.tracker);
    }

    /**
     * Метод выводит на экран меню.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
}

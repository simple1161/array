package ru.simple.start;

import ru.simple.operations.*;

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

    private List<UserAction> actions = new ArrayList<>();
    /**
     * Конструктор.
     *
     * @param input   объект типа Input
     * @param tracker объект типа Tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;

    }

    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    public void fillActions() {
        this.actions.add(new AddItem());
        this.actions.add(new ShowItem());
        this.actions.add(new EditItem());
        this.actions.add(new DeleteItem());
        this.actions.add(new FindId());
        this.actions.add(new FindName());
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

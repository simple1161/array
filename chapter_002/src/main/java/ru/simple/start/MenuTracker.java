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
        this.actions.add(new AddItem(0, "Add Item"));
        this.actions.add(new ShowItem(1, "Show item"));
        this.actions.add(new EditItem(2, "Edit item"));
        this.actions.add(new DeleteItem(3, "Delete item"));
        this.actions.add(new FindId(4, "Find item by Id"));
        this.actions.add(new FindName(5, "Find items by name"));
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

    public int getCountItem(){
        return actions.size();
    }
}

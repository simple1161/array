package ru.simple.operations;

import ru.simple.models.Item;
import ru.simple.start.Input;
import ru.simple.start.Tracker;

public class AddItem extends BaseAction {

    public AddItem(int key, String name) {
        super(key, name);
    }

    public void execute(Input input, Tracker tracker){
        String name = input.ask("Введите имя заявки :");
        String desc = input.ask("Введите описание заявки :");
        tracker.add(new Item(name, desc));
    }
}

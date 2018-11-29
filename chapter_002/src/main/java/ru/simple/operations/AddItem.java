package ru.simple.operations;

import ru.simple.models.Item;
import ru.simple.start.Input;
import ru.simple.start.Tracker;

public class AddItem implements UserAction {
    public int key(){
        return  0;
    }

    public void execute(Input input, Tracker tracker){
        String name = input.ask("Введите имя заявки :");
        String desc = input.ask("Введите описание заявки :");
        tracker.add(new Item(name, desc));
    }

    public String info(){
        return String.format("%s. %s", this.key(), "Add new item");
    }

}

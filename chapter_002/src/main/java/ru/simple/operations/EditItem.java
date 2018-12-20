package ru.simple.operations;

import ru.simple.models.Item;
import ru.simple.start.Input;
import ru.simple.start.Tracker;

public class EditItem implements UserAction {
    public int key(){
        return  2;
    }

    public void execute(Input input, Tracker tracker){
        System.out.println("------------ Редоктирование заявки --------------");
        String id = input.ask("Введите id заявки :");
        String name = input.ask("Введите имя заявки :");
        String desc = input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        tracker.replace(id, item);
    }

    public String info(){
        return String.format("%s. %s", this.key(), "Edit item");
    }

}

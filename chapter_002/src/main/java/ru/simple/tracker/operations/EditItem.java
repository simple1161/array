package ru.simple.tracker.operations;

import ru.simple.tracker.models.Item;
import ru.simple.tracker.start.Input;
import ru.simple.tracker.start.Tracker;

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
        if(tracker.replace(id, item)){
            System.out.println("------------ Заявка отредактирована --------------");
        }else {
            System.out.println("------------ Заявка не отредактирована --------------");
        }
    }

    public String info(){
        return String.format("%s. %s", this.key(), "Edit item");
    }

}

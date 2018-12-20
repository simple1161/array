package ru.simple.operations;

import ru.simple.operations.UserAction;
import ru.simple.start.Input;
import ru.simple.start.Tracker;

public class DeleteItem implements UserAction {
    public int key(){
        return  3;
    }

    public void execute(Input input, Tracker tracker){
        System.out.println("------------ Удаление заявки --------------");
        String id = input.ask("Введите id заявки :");
        tracker.delete(id);
    }

    public String info(){
        return String.format("%s. %s", this.key(), "Delete item");
    }

}

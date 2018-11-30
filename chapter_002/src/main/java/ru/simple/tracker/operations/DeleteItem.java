package ru.simple.tracker.operations;

import ru.simple.tracker.start.Input;
import ru.simple.tracker.start.Tracker;

public class DeleteItem implements UserAction {
    public int key(){
        return  3;
    }

    public void execute(Input input, Tracker tracker){
        System.out.println("------------ Удаление заявки --------------");
        String id = input.ask("Введите id заявки :");
        if(tracker.delete(id)){
            System.out.println("------------ Заявка Удалена --------------");
        }else {
            System.out.println("------------ Заявка Не удалена --------------");
        }
    }

    public String info(){
        return String.format("%s. %s", this.key(), "Delete item");
    }
}

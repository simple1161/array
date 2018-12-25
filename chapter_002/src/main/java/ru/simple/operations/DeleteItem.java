package ru.simple.operations;

import ru.simple.start.Input;
import ru.simple.start.Tracker;

public class DeleteItem extends BaseAction {

    public DeleteItem(int key, String name) {
        super(key, name);
    }

    public void execute(Input input, Tracker tracker){
        System.out.println("------------ Удаление заявки --------------");
        String id = input.ask("Введите id заявки :");
        tracker.delete(id);
    }

}

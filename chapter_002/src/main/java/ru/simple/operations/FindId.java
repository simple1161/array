package ru.simple.operations;

import ru.simple.models.Item;
import ru.simple.start.Input;
import ru.simple.start.Tracker;

public   class FindId implements UserAction {
    public int key(){
        return  4;
    }

    public void execute(Input input, Tracker tracker){
        System.out.println("------------Поиск заявки по id --------------");
        String id = input.ask("Введите id заявки :");
        Item item = tracker.findById(id);
        System.out.println("Название заявки: "  + item.getName() + ", " + "Описание заявки: "  + item.getDescription() + ", "  + "id заявки: "  + item.getId());
    }

    public String info(){
        return String.format("%s. %s", this.key(), "Find item by Id");
    }

}

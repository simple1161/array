package ru.simple.tracker.operations;

import ru.simple.tracker.models.Item;
import ru.simple.tracker.start.Input;
import ru.simple.tracker.start.Tracker;

public   class FindId implements UserAction {
    public int key(){
        return  4;
    }

    public void execute(Input input, Tracker tracker){
        System.out.println("------------Поиск заявки по id --------------");
        String id = input.ask("Введите id заявки :");
        Item item = tracker.findById(id);
        if(item != null){
            System.out.println("Название заявки: "  + item.getName() + ", " + "Описание заявки: "  + item.getDescription() + ", "  + "id заявки: "  + item.getId());
        } else {
            System.out.println("Нет заявоки");
        }
    }

    public String info(){
        return String.format("%s. %s", this.key(), "Find item by Id");
    }

}

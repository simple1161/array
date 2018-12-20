package ru.simple.operations;

import ru.simple.models.Item;
import ru.simple.start.Input;
import ru.simple.start.Tracker;

public class FindName implements UserAction {
    public int key(){
        return  5;
    }

    public void execute(Input input, Tracker tracker){
        System.out.println("Поиск по имени заявки.");
        String name = input.ask("Введите имя заявки :");
        Item[] items = tracker.findByName(name);
        if (items.length != 0) {
            for (Item item: items) {
                System.out.println("Название заявки: "  + item.getName() + ", " + "Описание заявки: "  + item.getDescription() + ", "  + "id заявки: "  + item.getId());
            }
        } else {
            System.out.println("Нет доступных заявок");
        }
    }

    public String info(){
        return String.format("%s. %s", this.key(), "Find items by name");
    }

}

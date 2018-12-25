package ru.simple.operations;

import ru.simple.models.Item;
import ru.simple.start.Input;
import ru.simple.start.Tracker;

public class FindName extends BaseAction {

    public FindName(int key, String name) {
        super(key, name);
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
}

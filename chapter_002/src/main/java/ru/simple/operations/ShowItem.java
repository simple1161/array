package ru.simple.operations;


import ru.simple.models.Item;
import ru.simple.start.Input;
import ru.simple.start.Tracker;

public class ShowItem extends BaseAction {

    public ShowItem(int key, String name) {
        super(key, name);
    }

    public void execute(Input input, Tracker tracker){
        System.out.println("------------ Отображение всех заявок --------------");
        Item[] items = tracker.showAll();
        if (items.length != 0) {
            for (Item item: items) {
                System.out.println("Название заявки: "  + item.getName() + ", " + "Описание заявки: "  + item.getDescription() + ", "  + "id заявки: "  + item.getId());
            }
        } else {
            System.out.println("Нет доступных заявок");
        }
    }

}
package ru.simple.operations;


import ru.simple.models.Item;
import ru.simple.start.Input;
import ru.simple.start.Tracker;

public class ShowItem implements UserAction {
    public int key(){
        return  1;
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

    public String info(){
        return String.format("%s. %s", this.key(), "Show item");
    }

}
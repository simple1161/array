package ru.simple.start;
import ru.simple.models.Item;

import java.util.ArrayList;
import java.util.List;

public class StartUI {
    private Input input;
    private Tracker tracker;
    private List<UserAction> actions = new ArrayList<>();

    public StartUI(Tracker tracker, Input input) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        fillActions();
        MenuTracker menu = new MenuTracker( this.input, this.tracker, this.actions);
        do {
            menu.show();
            menu.select(this.input.ask("Введите пункт меню : "));
        } while (!"y".equals(this.input.ask("Exit?(y): ")));
    }

    private static class AddItem implements UserAction{
        public int key(){
            return  0;
        }

        public void execute(Input input, Tracker tracker){
            String name = input.ask("Введите имя заявки :");
            String desc = input.ask("Введите описание заявки :");
            tracker.add(new Item(name, desc));
        }

        public String info(){
            return String.format("%s. %s", this.key(), "Add new item");
        }

    }

    private static class ShowItem implements UserAction{
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

    private static class EditItem implements UserAction{
        public int key(){
            return  2;
        }

        public void execute(Input input, Tracker tracker){
            System.out.println("------------ Редоктирование заявки --------------");
            String id = input.ask("Введите id заявки :");
            String name = input.ask("Введите имя заявки :");
            String desc = input.ask("Введите описание заявки :");
            Item item = new Item(name, desc);
            tracker.replace(id, item);
        }

        public String info(){
            return String.format("%s. %s", this.key(), "Edit item");
        }

    }

    private static class DeleteItem implements UserAction{
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

    private static class FindId implements UserAction{
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

    private static class FindName implements UserAction{
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

    public void fillActions() {
        this.actions.add(new StartUI.AddItem());
        this.actions.add(new StartUI.ShowItem());
        this.actions.add(new StartUI.EditItem());
        this.actions.add(new StartUI.DeleteItem());
        this.actions.add(new StartUI.FindId());
        this.actions.add(new StartUI.FindName());
    }

    public static void main(String[] args) {
        new StartUI(new Tracker(), new ConsoleInput()).init();
    }
}

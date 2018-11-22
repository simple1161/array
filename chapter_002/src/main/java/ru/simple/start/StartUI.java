package ru.simple.start;
import ru.simple.models.Item;

public class StartUI {
    private Input input;
    private Tracker tracker;

    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";

    /**
     * Константа для показа всех заявок.
     */
    private static final String SHOW = "1";

    /**
     * Константа для редактирования заявок.
     */
    private static final String EDIT = "2";

    /**
     * Константа для редактирования заявок.
     */
    private static final String DELETE = "3";

    /**
     * Константа для поиска по id заявоки.
     */
    private static final String FINDID = "4";

    /**
     * онстанта для поиска по name заявоки.
     */
    private static final String FINDNAME = "5";

    /**
     * Константа для выхода из меню.
     */
    private static final String EXIT = "6";

    public StartUI(Tracker tracker, Input input) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        boolean exit = false;
        while (!exit) {
            showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            switch (answer) {
                case ADD: this.createItem();
                    break;
                case SHOW: this.showAllItems();
                    break;
                case EDIT: this.editItem();
                    break;
                case DELETE: this.deleteItem();
                    break;
                case FINDID: this.findId();
                    break;
                case FINDNAME: this.findName();
                    break;
                case EXIT: exit = true;
                    break;
                default: exit = true;

            }
        }
    }

    public static void showMenu() {
        String[] menu = {"0. Add new Item", "1. Show all items", "2. Edit item", "3. Delete item", "4. Find item by Id", "5. Find items by name", "6. Exit Program"};
        for (String str: menu) {
            System.out.println(str);
        }
    }

    public void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    public void showAllItems() {
        System.out.println("------------ Отображение всех заявок --------------");
        Item[] items = this.tracker.showAll();
        if (items.length != 0) {
            for (Item item: items) {
                System.out.println("Название заявки: "  + item.getName() + ", " + "Описание заявки: "  + item.getDescription() + ", "  + "id заявки: "  + item.getId());
            }
        } else {
            System.out.println("Нет доступных заявок");
        }
    }

    public void editItem() {
        System.out.println("------------ Редоктирование заявки --------------");
        String id = this.input.ask("Введите id заявки :");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        tracker.replace(id, item);
    }

    public void deleteItem() {
        System.out.println("------------ Удаление заявки --------------");
        String id = this.input.ask("Введите id заявки :");
        tracker.delete(id);
    }

    public void findId() {
        System.out.println("------------Поиск заявки по id --------------");
        String id = this.input.ask("Введите id заявки :");
        Item item = tracker.findById(id);
        System.out.println("Название заявки: "  + item.getName() + ", " + "Описание заявки: "  + item.getDescription() + ", "  + "id заявки: "  + item.getId());
    }

    public void findName() {
        System.out.println("------------ Поиск по имени заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        Item[] items = tracker.findByName(name);
        if (items.length != 0) {
            for (Item item: items) {
                System.out.println("Название заявки: "  + item.getName() + ", " + "Описание заявки: "  + item.getDescription() + ", "  + "id заявки: "  + item.getId());
            }
        } else {
            System.out.println("Нет доступных заявок");
        }
    }

    public static void main(String[] args) {
        new StartUI(new Tracker(), new ConsoleInput()).init();
    }
}

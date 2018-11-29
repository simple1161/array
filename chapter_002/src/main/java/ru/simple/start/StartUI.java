package ru.simple.start;

public class StartUI {
    private Input input;
    private Tracker tracker;


    public StartUI(Tracker tracker, Input input) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();
        do {
            menu.show();
            menu.select(this.input.ask("Введите пункт меню : "));
        } while (!"y".equals(this.input.ask("Exit?(y): ")));
    }

    public static void main(String[] args) {
        new StartUI(new Tracker(), new ConsoleInput()).init();
    }
}

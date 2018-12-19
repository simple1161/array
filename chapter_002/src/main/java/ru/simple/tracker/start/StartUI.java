package ru.simple.tracker.start;

public class StartUI {
    private Input input;
    private Tracker tracker;
    private int[] ranges = new int[] {0, 1, 2, 3, 4};


    public StartUI(Tracker tracker, Input input) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() throws MenuOutException {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();
        do {
            menu.show();
            menu.select(this.input.ask("Select number: ", ranges));
        } while (!"y".equals(this.input.ask("Exit?(y): ")));
    }

    public static void main(String[] args) throws MenuOutException {
        new StartUI(new Tracker(), new ValidateInput()).init();
    }
}

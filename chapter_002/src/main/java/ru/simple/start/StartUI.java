package ru.simple.start;

public class StartUI {
    private Input input;
    private Tracker tracker;
    private int[] ranges;

    public StartUI(Tracker tracker, Input input) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();
        do {
            menu.show();
            ranges = new int[menu.getCountItem()];
            for(int i=0; i<menu.getCountItem(); i++){
                ranges[i] = i;
            }
            menu.select(this.input.ask("Select number: ", ranges));
        } while (!"y".equals(this.input.ask("Exit?(y): ")));
    }

    public static void main(String[] args) {
        new StartUI(new Tracker(), new ValidateInput(new ConsoleInput())).init();
    }
}

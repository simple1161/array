package ru.simple;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.simple.models.Item;
import ru.simple.start.Input;
import ru.simple.start.StartUI;
import ru.simple.start.StubInput;
import ru.simple.start.Tracker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    // поле содержит дефолтный вывод в консоль.
    private final PrintStream stdout = System.out;
    // буфер для результата.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    @Test
    public void whenUserAddItem() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "y"});
        new StartUI(tracker, input).init();
        assertThat(tracker.showAll()[0].getName(), is("test name"));
    }

    @Test
    public void whenUserFundId() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Item previous = new Item("test1", "testDescription");
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2");
        tracker.add(next);
        Input input = new StubInput(new String[]{"4", previous.getId(), "y"});
        new StartUI(tracker, input).init();
        assertThat(tracker.findById(previous.getId()).getId(), is(previous.getId()));
    }

    @Test
    public void whenUserDeleteItem() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription");
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2");
        tracker.add(next);
        Input input = new StubInput(new String[]{"3", previous.getId(), "y"});
        new StartUI(tracker, input).init();
        assertThat(tracker.delete(previous.getId()), is(false));
    }

    @Test
    public void whenUserShowAll() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription");
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2");
        tracker.add(next);
        Input input = new StubInput(new String[]{"1", "y"});
        new StartUI(tracker, input).init();
        Item[] items = new Item[2];
        items[0] = previous;
        items[1] = next;
        assertThat(tracker.showAll(), is(items));
    }

    @Test
    public void whenUserEditItem() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription");
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2");
        tracker.add(next);
        Input input = new StubInput(new String[]{"2", previous.getId(), "new name", "new desc", "y"});
        new StartUI(tracker, input).init();
        assertThat(tracker.findByName("new name")[0].getName(), is("new name"));
    }

    @Test
    public void whenUserFindName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription");
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2");
        tracker.add(next);
        Input input = new StubInput(new String[]{"5", previous.getName(), "y"});
        new StartUI(tracker, input).init();
        assertThat(tracker.findByName("test2")[0].getName(), is("test2"));
    }
    @Test
    public void whenPrintUserFindName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription");
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2");
        tracker.add(next);
        Input input = new StubInput(new String[]{"5", previous.getName(), "y"});
        new StartUI(tracker, input).init();
        String[] sp = this.out.toString().split("\\r\\n");
        assertThat(sp[7], is("Название заявки:" + " " + previous.getName() + "," + " Описание заявки:" + " " + previous.getDescription() + "," + " id заявки:" + " " + previous.getId()));
    }

    @Test
    public void whenPrintUserShowAll() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription");
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2");
        tracker.add(next);
        Input input = new StubInput(new String[]{"1", "y"});
        new StartUI(tracker, input).init();
        String[] sp = this.out.toString().split("\\r\\n");
        String[] actual = new String[2];
        actual[0] = sp[7];
        actual[1] = sp[8];
        String[] items = new String[2];
        items[0] = "Название заявки:" + " " + previous.getName() + "," + " Описание заявки:" + " " + previous.getDescription() + "," + " id заявки:" + " " + previous.getId();
        items[1] = "Название заявки:" + " " + next.getName() + "," + " Описание заявки:" + " " + next.getDescription() + "," + " id заявки:" + " " + next.getId();
        assertThat(actual, is(items));
    }
}

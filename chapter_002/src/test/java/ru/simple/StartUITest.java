package ru.simple;

import org.junit.Test;
import ru.simple.models.Item;
import ru.simple.start.Input;
import ru.simple.start.StartUI;
import ru.simple.start.StubInput;
import ru.simple.start.Tracker;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenUserAddItem() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
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
        Input input = new StubInput(new String[]{"4", previous.getId(), "6"});
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
        Input input = new StubInput(new String[]{"3", previous.getId(), "6"});
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
        Input input = new StubInput(new String[]{"1", "6"});
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
        Input input = new StubInput(new String[]{"2", previous.getId(), "new name", "new desc", "6"});
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
        Input input = new StubInput(new String[]{"5", previous.getName(), "6"});
        new StartUI(tracker, input).init();
        assertThat(tracker.findByName("test2")[0].getName(), is("test2"));
    }
}

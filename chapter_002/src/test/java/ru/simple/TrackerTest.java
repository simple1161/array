package ru.simple;

import org.junit.Test;
import ru.simple.models.Item;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenReplaceNameThenReturnNewName() {
        ru.tracker.start.Tracker tracker = new ru.tracker.start.Tracker();
        Item previous = new Item("test1","testDescription",123L);
        tracker.add(previous);
        Item next = new Item("test2","testDescription2",1234L);
        tracker.replace(previous.getId(), next);
        Item[] items = tracker.findByName(next.name);
        assertThat(items[0].name, is("test2"));
    }

    @Test
    public void whenFindId() {
        ru.tracker.start.Tracker tracker = new ru.tracker.start.Tracker();
        Item previous = new Item("test1","testDescription",123L);
        tracker.add(previous);
        Item next = new Item("test2","testDescription2",1234L);
        tracker.add(next);
        Item item = tracker.findById(next.getId());
        assertThat(item.getId(), is(next.getId()));
    }

    @Test
    public void whenDelete() {
        ru.tracker.start.Tracker tracker = new ru.tracker.start.Tracker();
        Item previous = new Item("test1","testDescription",123L);
        tracker.add(previous);
        Item next = new Item("test2","testDescription2",1234L);
        tracker.add(next);
        String id = next.getId();
        tracker.delete(next.getId());
        Item item = tracker.findById(id);
        if(item == null) id = "deleted";
        else id = "exists";
        assertThat(id, is("deleted"));
    }

    @Test
    public void whenGetAll() {
        ru.tracker.start.Tracker tracker = new ru.tracker.start.Tracker();
        Item previous = new Item("test1","testDescription",123L);
        tracker.add(previous);
        Item next = new Item("test2","testDescription2",1234L);
        tracker.add(next);
        Item[] items = new Item[2];
        items[0] = previous;
        items[1] = next;
        assertArrayEquals(tracker.showAll(), items);
    }

    @Test
    public void whenFindName() {
        ru.tracker.start.Tracker tracker = new ru.tracker.start.Tracker();
        Item previous = new Item("test1","testDescription",123L);
        tracker.add(previous);
        Item next = new Item("test1","testDescription2",1234L);
        tracker.add(next);
        Item[] actual = {previous, next};
        Item[] items = tracker.findByName("test1");
        assertArrayEquals(items, actual);
    }
}

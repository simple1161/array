package ru.simple.start;
import ru.simple.models.*;
import java.util.Arrays;

public class Tracker {
    private Item[] items = new Item[100];
    private int position = 0;

    public Item add(Item item) {
        this.items[position++] = item;
        return item;
    }

    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    public Item[] showAll() {
        return Arrays.copyOf(items, position);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[position];
        int index = 0;
        for (Item item: items) {
            if (item != null && item.getName().equals(key)) {
                result[index] = item;
                index++;
            }
        }
        return result;
    }

    public boolean replace(String id, Item item) {
        item.setId(id);
        boolean execute = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
                items[i] = item;
                execute = true;
            }
        }
        return execute;
    }

    public boolean delete(String id) {
        boolean execute = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
                if (!items[0].getId().equals(id)) {
                    items[i] = items[0];
                }
                System.arraycopy(items, 1, items, 0, items.length - 1);
                execute = true;
                break;
            }
        }
        return execute;
    }
}


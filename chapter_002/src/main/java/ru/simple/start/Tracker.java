package ru.tracker.start;

import ru.simple.models.*;

import java.util.Random;
import java.util.Arrays;

public class Tracker {
    Item [] items = new Item[0];
    private int position = 0;
    private static final Random RN = new Random();

    public Item add(Item item){
        items = Arrays.copyOf(items, items.length + 1);
        item.setId(generateId());
        this.items[position++] = item;
        return item;
    }

    public Item findById(String id){
        Item result = null;
        for (Item item : items){
            if(item != null && item.getId().equals(id)){
                result = item;
                break;
            }
        }
        return result;
    }
    String generateId(){
        return String.valueOf(RN.nextInt() + System.currentTimeMillis());
    }


    public Item[] showAll(){
        Item[] result = new Item[position];
        for(int index = 0; index != position; index++){
            result[index] = this.items[index];
        }
        return result;
    }

    public Item[] findByName(String key){
        int index = 0;
        Item[] result = new Item[0];
        for(Item item: items){
            if(item != null && item.getName().equals(key)){
                index++;
                result = Arrays.copyOf(result, index);
                result[index - 1] = item;
            }
        }
        return result;
    }

    public void replace(String id, Item item){
        item.setId(id);
        for(int i=0; i<items.length; i++){
            if(items[i] != null && items[i].getId().equals(id)){
                items[i] = item;
            }
        }
    }

    public void delete(String id){
        for(int i=0; i<items.length; i++){
            if(items[i] != null && items[i].getId().equals(id)){
                if(items[i].getId().equals(id) && !items[i].getId().equals(items[items.length - 1].getId())){
                    items[i] = items[items.length - 1];
                }
                items = Arrays.copyOf(items, items.length - 1);
                position--;
            }
        }


    }
}


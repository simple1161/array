package ru.simple.start;

import ru.simple.models.*;

import java.util.Random;
import java.util.Arrays;

public class Tracker {
    private Item [] items = new Item[100];
    private int position = 0;
    private static final Random RN = new Random();

    public Item add(Item item){
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
        result = Arrays.copyOf(items, position);
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

    public Boolean replace(String id, Item item){
        item.setId(id);
        boolean execute = false;
        for(int i=0; i<items.length; i++){
            if(items[i] != null && items[i].getId().equals(id)){
                items[i] = item;
                execute = true;
            }
        }
        return execute;
    }

    public Boolean delete(String id){
        boolean execute = false;
        for(int i=0; i<items.length; i++){
            if(items[i] != null && items[i].getId().equals(id)){
                if (!items[0].getId().equals(id)){
                    items[i] = items[0];
                }
                System.arraycopy(items, 1, items, 0, items.length-1);
                execute = true;
                break;
            }
        }
        return execute;
    }
}


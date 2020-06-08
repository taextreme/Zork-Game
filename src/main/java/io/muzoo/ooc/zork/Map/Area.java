package io.muzoo.ooc.zork.Map;

import io.muzoo.ooc.zork.Item.Item;
import io.muzoo.ooc.zork.Monster.Monster;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Area {
    public String name;
    public String description;
    private final List<Item> items = new ArrayList<>();
    private final HashMap<String, Area> neighbor;
    int monsterCounter = 0;
    List<Monster> monsters;
    String temperature;

    public Area(String name) {
        this.name = name;
        neighbor = new HashMap<>();
    }

    public Area(String name, String description){
        this.name = name;
        this.description = description;
        neighbor = new HashMap<>();
    }

    public void setExit(String direction, Area neighbor) {
        this.neighbor.put(direction, neighbor);
    }

    public Area getExit(String direction) {
        return neighbor.get(direction);
    }

    public String getDescription() {
        return description;
    }

    public Item getItem(int index){
        return items.get(index);
    }

    public Item getItem(String itemName){
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                return item;
            }
        }
        return null;
    }

    public void removeItem(String itemname){
        for(int i = 0; i<items.size(); i++){
            if(items.get(i).getName().equals(itemname)){
                items.remove(i);
                break;
            }
        }
    }

    public void setItem(Item newitem){ items.add(newitem); }

    public void setItems(Collection<Item> items){
        for (Item item : items)
            setItem(item);
    }

    public String getRoomItem(){
        String ritem = "Nothing";
        for (Item item : items) {
            ritem = item.getName() + " ";
        }
        return ritem;
    }

    public void countMonster(){
        monsterCounter+=1;
    }
     
    public boolean monsterFull(){
        return monsterCounter >= 3;
    }

}

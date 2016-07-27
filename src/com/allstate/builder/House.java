package com.allstate.builder;

import java.util.ArrayList;

public class House {
    public House() {
        this.rooms = new ArrayList<>();
    }

    private ArrayList<Room> rooms;

    public double floorCost() {
        return this.rooms.stream().map(r -> r.floorCost()).reduce(0.0, (sum, val) -> sum + val);
    }
    public double paintCost () {
        return this.rooms.stream().map(r -> r.paintCost()).reduce(0.0, (sum, val) -> sum + val);
    }

    public double totalCost() {
        return paintCost() + floorCost();
    }

    public void addRoom(Room room){
        //Check if the room already exists
        if (this.rooms.stream().map(r -> r.getRoomName()).noneMatch(s -> s == room.getRoomName())) {
        this.rooms.add(room);
        }
        else{
            System.out.println("Duplicate Room");
        }
    }
}

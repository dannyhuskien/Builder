package com.allstate.builder;


public class Room {
    private String roomName;
    private FloorType floorType;
    private double costPerSqFootFloor;
    private PaintType paintType;
    private double costPerSqFootPaint;
    private int length;
    private int width;
    private int height;

    public Room(String roomName, FloorType floorType, double costPerSqFootFloor, PaintType paintType, double costPerSqFootPaint, int length, int width, int height) {
        this.roomName = roomName;
        this.floorType = floorType;
        this.costPerSqFootFloor = costPerSqFootFloor;
        this.paintType = paintType;
        this.costPerSqFootPaint = costPerSqFootPaint;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public FloorType getFloorType() {
        return floorType;
    }

    public void setFloorType(FloorType floorType) {
        this.floorType = floorType;
    }

    public double getCostPerSqFootFloor() {
        return costPerSqFootFloor;
    }

    public void setCostPerSqFootFloor(double costPerSqFootFloor) {
        this.costPerSqFootFloor = costPerSqFootFloor;
    }

    public PaintType getPaintType() {
        return paintType;
    }

    public void setPaintType(PaintType paintType) {
        this.paintType = paintType;
    }

    public double getCostPerSqFootPaint() {
        return costPerSqFootPaint;
    }

    public void setCostPerSqFootPaint(double costPerSqFootPaint) {
        this.costPerSqFootPaint = costPerSqFootPaint;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double floorCost(){
      return  this.length * this.width * costPerSqFootFloor;
    }

    public double paintCost(){
        return  costPerSqFootPaint * ((this.width * this.height * 2) + (this.length * this.height * 2));
    }
}

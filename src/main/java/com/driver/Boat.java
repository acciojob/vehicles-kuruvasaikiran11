package com.driver;

public class Boat implements WaterVehicle{

    public String name;
    public int capacity;
    Boat(){

    }
    Boat(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }
    /*public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }*/


    public String getVehicleName() {
        return name;
    }


    public int getVehicleCapacity() {
        return capacity;
    }
}

package com.driver;

public class Boat implements WaterVehicle{

    public String name;
    public int capacity;
    Boat(){

    }

    public String getVehicleName() {
        return name;
    }


    public int getVehicleCapacity() {
        return capacity;
    }
}

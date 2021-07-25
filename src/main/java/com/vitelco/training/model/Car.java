package com.vitelco.training.model;

public class Car {

    //state

    public String color;
    public String model;

    public void Drive(int speed){
        System.out.println(this.toString() + " is running in "
                + speed + " speed limit");
    }


    @Override
    public String toString() {
        return "Car[" +
                "color='" + color +
                ", model='" + model +
                ']';
    }
}

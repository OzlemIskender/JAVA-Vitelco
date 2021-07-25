package com.vitelco.training.model;

public class Car {

    //state

    public String color;
    public String model;

    public void Drive(int speed){
        Logger.info(this.toString() + " is running in "
                + speed + " speed limir. ");


    }



    @Override
    public String toString() {
        return "Car[" +
                "color='" + color +
                ", model='" + model +
                ']';
    }
}

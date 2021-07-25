package com.vitelco.training.model;

public class Math {

    public int sum(int x, int y){
        return x + y;

    }

    public int timeThree(int x){ //camelCasting

        return x * 3;

    }

    public void showResult(){

        Logger.info(String.valueOf(this.timeThree(8)));
    }
}

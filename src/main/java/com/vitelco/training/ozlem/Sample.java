package com.vitelco.training.ozlem;

import com.vitelco.training.model.Car;



public class Sample {

    public void myMethod(){

        Car pourche =new Car();
        pourche.color = "red";
        pourche.model = "Carrera GT";


        Car mercedes = new Car();
        mercedes.color = "blue";
        mercedes.model = "Carrera GT";

       mercedes.Drive(110);
       pourche.Drive(120);


    }





}

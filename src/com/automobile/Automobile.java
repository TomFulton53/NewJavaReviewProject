package com.automobile;

public class Automobile {
    Engine engine = new Engine();
    public void start( ){
        turnKey();
//        System.out.println("Car Starting");
        engine.startEngine();
    }
    public void accelerate(){
        pressPedal();
//        System.out.println("Car Accelerating");
        engine.accelerateEngine();
    }
    private void turnKey( ){
        System.out.println("Inserting key");
    }
    private void pressPedal( ){
        System.out.println("Pressing on pedal");
    }
}

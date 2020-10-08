package com.automobile;

public class Engine {
    // package private because the whole world doesn't need this
    void startEngine( ){
        System.out.println("Engine Starting");
    }
    void accelerateEngine( ){
        System.out.println("Engine Accelerating");
    }
}

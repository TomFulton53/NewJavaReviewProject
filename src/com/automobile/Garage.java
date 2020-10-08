package com.automobile;

public class Garage {

    public static void main(String[] args) {

//        Automobile myAuto = new Automobile();
////        myAuto.engine.startEngine();
//        myAuto.start();
//        myAuto.accelerate();
//        int minimum = min(4, 12, 9, 2);
//        System.out.println("The minimum value is " + minimum);
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b){
        int aAbs = abs(a-10);
        int bAbs = abs(b-10);

        if (aAbs<bAbs){
            System.out.println(a + " is closest to 10");
        }
        else{
            System.out.println(b + " is closest to 10");
        }
    }

    public static int abs(int a){
        if (a<0){
            return -a;
        }
        return a;
    }


    public static int min(int a, int b, int c, int d){
        int min1 = min(a, b);
        int min2 = min(c, d);
        return min(min1, min2);

    }


    public static int min(int a, int b){
        if (a<b){
            return a;
        }
        else{
            return b;
        }

    }

}

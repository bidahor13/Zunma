package com.Babatunde;

/**
 * Created by Babatunde on 8/26/2016.
 */
public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;

    public Fish( String name, int size, int weight, int gills,int eyes,int fins){
        super(name, 1, 1, 50 ,20);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }


    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);

    }
}

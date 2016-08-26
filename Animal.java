package com.Babatunde;

/**
 * Created by Babatunde on 8/26/2016.
 */
public class Animal { // base class
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;
    //private int speed = 99;


    public Animal(String name, int brain, int body, int size, int weight){
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    //Method to eat
    public void eat(){
        System.out.println("Animal.eat() called- eating!!!!!!");
    }


    public String getName(){
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public void move(int speed){
        speed = speed*2;
        System.out.println("Animal move() called " + speed);
    }
}

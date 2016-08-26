package com.Babatunde;

/**
 * Created by Babatunde on 8/26/2016.
 */
public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

     public Dog(String name, int size, int weight, int eyes, int legs, int teeth, int tail, String coat){
         /* super(): calls the constructor of the Animal class that we are inheriting from */
         super(name, 1, 1, size, weight);
         this.eyes = eyes;
         this.legs = legs;
         this.tail = tail;
         this.teeth = teeth;
         this.coat =  coat;
     }

     private void chew(){
         System.out.println("Dog.chew() called");
     }


     @Override
     public void eat(){
         System.out.print("Dog.eat() called" + "\n");
         chew();
         super.eat();
    }

     @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);

    }

    public void walk(){
        System.out.println("Dog.walk() called");
        }

        public void run(){
            System.out.println("Dog.run() called");
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called: " + speed);
    }



}

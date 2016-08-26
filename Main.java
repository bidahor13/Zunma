package com.Babatunde;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Breed", 1 , 1, 5, 4);
        Dog dog = new Dog("Zaza", 8, 20, 2, 4 ,1 ,20, "dark and silky");
        //dog.eat();  // the method eat() located in animal class
        dog.move(20);
        //dog.walk();
        //dog.run();


        System.out.println(" ");
        System.out.println("=================================");
        animal.move(100);



    }
}

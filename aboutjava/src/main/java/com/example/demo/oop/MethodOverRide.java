package com.example.demo.oop;

public class MethodOverRide {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise();
        Animal dog = new Dog();
        dog.makeNoise();
        Dog dog1 = new Dog();
        dog1.animalEat();

        Cat  cat = new Cat();
        cat.makeNoise();
        cat.animalEat();
    }
}
//Polymorphism override example
// if method isnt found locally it will go to  parent  class
//if method is found locally it will go to child class
class Animal{
    void makeNoise(){
        System.out.println("Animal Make Noise!");
    }

    void animalEat(){
        System.out.println("Animal will eat");
    }
}

class Dog extends Animal{
    void makeNoise(){
        System.out.println("Dog make Noise!");
    }
}

class Cat extends Animal{
    void makeNoise(){
        System.out.println("Cat makes noise!");
    }
}

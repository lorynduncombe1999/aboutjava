package com.example.demo.oop;

public class IntroToAbstraction extends User {

    public static void main(String[] args) {
        IntroToAbstraction introToAbstraction = new IntroToAbstraction();
        introToAbstraction.printInfo();
    }

    @Override
    void printInfo() {
        System.out.println("User related info");
    }
}

abstract class User{

    //abstraction if you want to use this class  you  have to implement this method HOWEVER YOU  WANT
    abstract void printInfo();
}

package com.example.demo.oop;

import ch.qos.logback.core.net.SyslogOutputStream;

public class IntroToOOP {
    /*
    1.Constructor

    2.Static

    3.Inheritance, Polymorphism, Abstraction, Encapsulation
     */

   /*
   What is constructor?
   builds the object
   allows you to create an instance of your object
   allows more than one constructor in class
   1.Default(automadically added by JVM) when you dont create one
   2.no-arguments
   3.with args

   Signiture: public class name(){}
   no void or return type
   never static
    */

    public IntroToOOP(){
        System.out.println("This is no-args constructor");
    }
    public IntroToOOP(String className){
        System.out.println("This is args constructor");
    }

    String carModel;
    String carColor;
    String engineType;
    public IntroToOOP(String carModel, String carColor, String engineType){
        System.out.println("I am a " +carModel+ " My color is " + carColor +" my engine type is:"+ engineType + ".");
    }

    public static void main(String[] args) {
      //Calling no-args constructor
        IntroToOOP constOne = new IntroToOOP();

    //Calling args constructor
        IntroToOOP Model1 = new IntroToOOP("Kia","blue","v4");
        IntroToOOP Model2 = new IntroToOOP("Subaru","white","v6");
        IntroToOOP Model3 = new IntroToOOP("Audi","black","v8");
    }
}

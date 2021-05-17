package com.example.demo.oop;

public class aboutStaticIntro {

    /*
    Keyword static
    1.class
    2.method
    3.variables
    4.block (Not a  method or variable)

     */
    static  boolean isActive; // false
    static double price;
    //static block loads into memory before  the main memory
    // because of this static block will always  run in  jvm before any method
    static{
        isActive = true;
        price = 12.89;

    }
    static String name;
    String someName;

    //Static vs Non-static
    //static cannot  be accesed by instance of class(object)
    //non static can only be  accessed by the  instance  of  class.
        // you have to create object and call on object
    //If there aspects/ variables that you do not want an instance  of the class to have access to
    //make it a  static variable  ex:
    //car factory (built room, worker)
    //car (wheels, color, engine type)
    /*
    If you  dont want car to have access to certain variables in carFactory,  make variables in car factory
    static
     */
    public static void main(String[] args) {

        System.out.println(isActive);
        name = "test user";
        name = "demo user";
        System.out.println(name);
        // call constructor  to access  variable outside of main method
        aboutStaticIntro intro = new aboutStaticIntro();
            intro.someName = "Non static value one";
            System.out.println(intro.someName);


    }
}

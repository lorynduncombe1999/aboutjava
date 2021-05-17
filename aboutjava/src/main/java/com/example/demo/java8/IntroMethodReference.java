package com.example.demo.java8;

public class IntroMethodReference {
    /*
    Object::instance method
    Class::static method
    Class:: instance Method
    Class:: new Contructor
    only supports lambda  expression
     */

    public static void main(String[] args) {
//        MethodReference taskOne= () ->{
//            System.out.println("Display Method");
//        };
//
//        taskOne.display();

        IntroMethodReference reference = new IntroMethodReference();
//  reference.myDisplayMethod();

        MethodReference ref = reference::myDisplayMethod;
        ref.display();
    }


    public void myDisplayMethod(){
        System.out.println("My Display Method...");
    }

    {
        System.out.println("My Display Mehtod");
    }


    @FunctionalInterface
    interface MethodReference {
        void display();
    }
}

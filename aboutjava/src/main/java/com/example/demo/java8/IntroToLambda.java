package com.example.demo.java8;

public class IntroToLambda {
    public static void main(String[] args) {
        printInfo("Print  something");

        Myinterface myinterface = ()-> {
            return "String from lambda";
        };
        System.out.println(myinterface.getInfo());
    }
    /*
    Method
    1.Name
    2.Args List/ no  arg
    3.Body
    4.Return Type/void
    //public static/nonstatic void/return type  name(args/no args){}
    Lambda
    1. No name
    2. Args List/ no   arg
    3. body
    4 No return  type
    (args)->{body}
    functional interface (must have only one abstract method)
        if have more than one abstract method], you cant  use it with lambda
     */
    public static void printInfo(String message){
        System.out.println(message);

    }
}
//functional interface indicates to not  add any additional  methods in the feature
@FunctionalInterface
interface Myinterface{
    String getInfo();

}
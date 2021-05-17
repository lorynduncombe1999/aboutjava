package com.example.demo.oop;

public class IntroToEncapsulation {

//always  want to protect global variable and not  let it be  used by other classes
// create constructor to access variable without creating a relationship between classes (inheritance)
    /*
    4 different types of scopes in java
    public
    private
    default
    scope
     */

    /*
    Getters an  setters apply to objects  ONLY
     */

    private String name;
    private int age;



}

class  Result{
    void  getInfo(){
        IntroToEncapsulation intro = new IntroToEncapsulation();


    }
}

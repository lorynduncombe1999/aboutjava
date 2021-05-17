package com.example.demo.oop;

//Child/Sub class
public class IntroToInheritance extends Person {
    /*
    Types of Inheritance - inherit property of one class to another
    1. Simple inheritance
        Class  A -> class B
        does not work for private variables
    2. Multi-level
        class A-> class B -> Class C
        class c inherits all from class A and B
    3.Organization (One to many)
        Class  A->B Class A-> Class C  Class A-> class D
        all have access to class A but not to other class
        for example B has access  to A but not  to C  and D
    4. Multiple (Not  supported by JAVA)
     */
    public static void main(String[] args) {
        IntroToInheritance inheritance =  new IntroToInheritance();
        inheritance.name = "Jack";
        inheritance.age = 33;
        inheritance.getPersonInfo();


    }

    public void printPersonInfo(){
       name = "Jack R";
        age = 43;
    }
}

//Super/Parent class
class Person{
    String name;
    int age;

    void getPersonInfo(){
        System.out.println(name);
        System.out.println(age);
    }

    void setName(String  personName){
        this.name = personName;
    }
}

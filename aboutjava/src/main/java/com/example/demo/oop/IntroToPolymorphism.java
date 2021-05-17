package com.example.demo.oop;

public class IntroToPolymorphism {
    /*
    1.Compile time (method overload) with same class - same name different arguments
    2.run time  (method override) with another class
     */
//print total of 2 numbers overloading  example
    public static int add(int  numOne,int numTwo){
        return numOne + numTwo;
    }

    public static double add(double  numOne,double numTwo){
        return numOne + numTwo;
    }

    public static int maxNumber(int a, int b){
        return Math.max(a,b);
    }
    public static double maxNumber(double a, double b){
        return Math.max(a,b);
    }
    public static void main(String[] args) {
       System.out.println(add(234,356));
       System.out.println(add(12.99,34.89));
       System.out.println(maxNumber(345,245));
        System.out.println(maxNumber(234.23,432.56));

    }
}

package com.example.demo.java8;

import java.util.ArrayList;
import java.util.List;
//lambda  allows  you  to call a  mehtod  inside of  a  method
public class MoreIntoLambda {
    public static void main(String[] args) {
        TaskOne one = ()-> {
            return 12.99;
        };
        getNames();

        //This is a variable NOT creating an object
        TaskTwo two= (fName, lName)->{
            return fName + "  "+ lName;
        };
        String result = two.printName("Loryn","Duncombe");
        System.out.println(result);
        double  price = one.sumOfNumber();
        System.out.println(price);

        TaskThree three = ()->{
            System.out.println("Print number three  interface");
        };
        three.printVoid();
    }


    public static void getNames(){
        List<String> nList  = new ArrayList<>();
        nList.add("Loryn");
        nList.add("Toni");
        nList.add("Trey");
        nList.add("Deuce");
        System.out.println(nList);
        nList.forEach((names)->{
            System.out.println(nList);
        });
    }
}

@FunctionalInterface
interface TaskOne{
    double sumOfNumber();
}

@FunctionalInterface
interface TaskTwo{
    String printName (String firstName, String lastName);
}

@FunctionalInterface
interface TaskThree{
    void  printVoid();
}
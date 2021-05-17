package com.example.demo.multithreading;

import java.io.IOException;
//Throws is  in method signiture
//throw is used in the body

public class ThrowVsThrows {

    public static void main(String[] args) {
        checkEligibility(10,34);
        ThrowsDemo demo  = new ThrowsDemo();
        try {
            demo.myMethod(1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    //Studen  age and weight
    static void checkEligibility(int age, int weight){
        //Student minimum 12 and 40 pounds
        if (age< 12 && weight<40){
            throw new MyCustomException("Student age or weight is not eligible");
        }
        else {

            System.out.println("Student is eligible");
        }
    }
}
class MyCustomException extends ArithmeticException{
    MyCustomException(String message){
        super(message);
    }
}
class ThrowsDemo{
    //will throw but wont  handle  exception
    void myMethod(int num) throws IOException, ClassNotFoundException{
        if(num%2 == 0)
            throw new IOException("Number is even, therefore an IO exception");
            else
                throw new ClassNotFoundException("Number is odd therefore ClassnotFound");
    }
}
package com.example.demo.oop;

public class AboutSuperKeyword extends AboutSuper {


    public AboutSuperKeyword(int numOne, String info) {

        //super keyword means refrence  to  parent class
        super(numOne, info);
    }


}

class AboutSuper{
    int numOne;
    String info;

    public AboutSuper(int numOne, String info) {
        this.numOne = numOne;
        this.info = info;
    }
}

package com.example.demo.oop;

public class AboutInterface implements DemoInterface {
    @Override
    public void getName() {
        System.out.println("This is an  override method  from interface.");
        DemoInterface.printInfo(); // how you call  static methods (classname.staticmethod)
    }
}


interface DemoInterface{
    /*
    Don't do in  interface
    1. method in interface  must  not have  body
    2.Constructor
    3.should not  have object

    should  have  in interface
    1. All method  in interface public and abstract,
    2. Static is optional
        static methods can have body  inside interface
    3. Can  implement more than  one  in  the  same class
     */
    //can  write  public and  abstract but  it  isnt   needed

    public  abstract void getName();

    public static void printInfo() {
        System.out.println("this is a  static method from and interace...");
        //cant call static methods on instance of classes
    }
}
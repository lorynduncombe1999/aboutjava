package com.example.demo.multithreading;
// void thread means that the  thread  will not return anything  to memory
public class ThreadCall {
    public static void main(String[] args) {
        Thread one=  new ThreadOne();
        one.start();
        ThreadTwo two = new ThreadTwo();
        two.run();
        RunWithClass three = new RunWithClass();
        three.runnable.run();
        three.runnableTwo.run();
        three.runnableThree.run();
    }

}

//Diffrent  ways  to create  threads  (Shown  by  classes)
class ThreadOne extends Thread{
    public void run(){
        System.out.println("Inside: thread  one " + Thread.currentThread().getName());
    }
}

class ThreadTwo implements Runnable{

    @Override
    public void run() {
        System.out.println("Inside: thread  Two " + Thread.currentThread().getName());

    }
}

//class  within class = annoynomous  class

class RunWithClass {
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Inside: thread  Two " + Thread.currentThread().getName());
        }
    };

        //Lambda call
        Runnable runnableTwo = () -> {
            System.out.println("Inside: thread  Two " + Thread.currentThread().getName());
        };

        String[]  names = {"Mike", "Jack", "John", "Bob"};
        Runnable  runnableThree = ()->  {
            System.out.println("Inside: thread  Two " + Thread.currentThread().getName());
       for(String name: names){
           System.out.println(name);
           try {
               Thread.sleep(2,000);
           } catch (InterruptedException e) {
             e.getMessage();
           }
       }
        };

    }

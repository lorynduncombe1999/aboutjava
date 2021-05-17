package com.example.demo.multithreading;

public class IntroToThread implements Runnable {

    //Thread  is  a  task (piece of code)
    //Multi  thread- simultaneously process  millions  of users/ tasks

    public static void main(String[] args) {
        Thread threadOne = new Thread("Thread one");
        Thread threadTwo = new Thread("Thread Two");
        threadOne.start();
        threadTwo.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            threadOne.sleep(2000) ;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadOne.getName());
        System.out.println(threadTwo.getName());
    }

    @Override
    public void run() {

    }
}

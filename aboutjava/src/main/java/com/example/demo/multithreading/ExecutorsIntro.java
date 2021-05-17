package com.example.demo.multithreading;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsIntro {
    /*
   1.Executor - only for  Runnable
   2. Executor Service - for  runnable and callable
   3.Scheduled Executor Service for runnable and callable
     */


    public static void main(String[] args) {
        aboutExecutor();
        aboutExecutorService();
    }
    public static void aboutExecutor(){
        System.out.println("Inside"+ Thread.currentThread().getName());
        System.out.println("Executor  basics...");

        ExecutorService service  = Executors.newSingleThreadExecutor();

        System.out.println("Creating Runable");
        Runnable runnable = ()-> {
            System.out.println("Inside Runnable: " + Thread.currentThread().getName());
        };
        service.submit(runnable);

        service.shutdown();
        }


        public static  void aboutExecutorService(){
        //Makes sure at  least 2 runs simotaniously line 37.
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Runnable  runnableOne = ()->{
            System.out.println("Running Thread:  " + Thread.currentThread().getName());
            try{
                TimeUnit.SECONDS.sleep(2);
            }catch (InterruptedException e){
                e.getMessage();
            }
        };

            Runnable  runnableTwo = ()->{
                System.out.println("Running Thread:  " + Thread.currentThread().getName());
                try{
                    TimeUnit.SECONDS.sleep(4);
                }catch (InterruptedException e){
                    e.getMessage();
                }
            };

            Runnable  runnableThree = ()->{
                System.out.println("Running Thread:  " + Thread.currentThread().getName());
                try{
                    TimeUnit.SECONDS.sleep(6);
                }catch (InterruptedException e){
                    e.getMessage();
                }

            };

            executorService.submit(runnableOne);
            executorService.submit(runnableTwo);
            executorService.submit(runnableThree);
            executorService.shutdown();
        }


    }


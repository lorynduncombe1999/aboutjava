package com.example.demo.multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class CallableWithService {
    static ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        callableWithFuture();
    }

    public static void callableWithFuture() throws ExecutionException, InterruptedException {
        Callable<String> callable = () -> {
            System.out.println("Callable  Threads...");
            Thread.sleep(2000);
            return "Hello from collable";
        };
        Callable<String> Callable1 = ()->{
            Thread.sleep(1000);
            return "Result from callable   one";
        };
        Callable<String> Callable2 = ()->{
            Thread.sleep(1000);
            return "Result from callable two";
        };
        //allows you to check status of the thread while  its running
        //. submit takes care of first four sections of life cycle
        //shutdown takes care of final section of life cycle
        //thread life cycle- thread, start,  run, stop, shut down
        List<Callable<String>> taskList  = Arrays.asList(callable,Callable1,Callable2);
        List <Future<String>> futures = executorService.invokeAll(taskList);
       // Future<String> future = executorService.submit(callable);
        System.out.println("Perform another  task");
        for(Future<String>key: futures ){
            System.out.println(key.get());
        }
       // System.out.println("Perform another task");
       // String result = future.get();
        //System.out.println(result);
        executorService.shutdown();
    }
}

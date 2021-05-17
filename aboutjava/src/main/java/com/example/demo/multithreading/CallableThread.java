//package com.example.demo.multithreading;
//
//import java.util.concurrent.Callable;
//
//public class CallableThread {
//    public static void main(String[] args) {
//        CallableThread callableThread = new CallableThread();
//        try{
//        String message = callableThread.callableString.call();
//        System.out.println(message);
//        message = callableThread.callableString.call();
//            System.out.println(message);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        Callable<String> callable = new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                return "This is a thread callable object ";
//            }
//
//    };
//        Callable<String> callableString = () ->{
//            return "This is thread lambda callable object";
//        };
//
//    }
//}

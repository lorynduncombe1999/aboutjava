package com.example.demo.multithreading;

import java.util.concurrent.Callable;

public class CallableTest {
    public static void main(String[] args) throws Exception {
        CallableTest test = new CallableTest();
        Boolean TestOne = test.callableOne.call();
        System.out.println(TestOne);

    }


    Callable<Boolean> callableOne = new Callable<Boolean>() {
        @Override
        public Boolean call() throws Exception {
            int[] arrayone = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            for (int i = 0; i < arrayone.length - 1; i++) {
                if (arrayone[i] == 7)
                    return true;

            }
            return false;
        };

    };
}

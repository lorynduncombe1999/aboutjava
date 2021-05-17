package com.example.demo.taskOne;

import java.util.ArrayList;
public class myUtils {

        public static <T>  void iterateList(ArrayList<T> anyList){
            for(T temp: anyList){
                System.out.println(temp);
            }
        }
}


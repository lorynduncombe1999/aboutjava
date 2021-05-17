package com.example.demo.Generics;

import java.security.Key;
import java.util.*;

public class WildCardGenerics {

    public static void printCollection(List<?> collections){
        for(Object obj: collections){
            System.out.println(obj);
        }
    }

    //Method that print any mab object
    public static void printMap(Map<?,?> map) {
        Iterator<?> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<?, ?> entry = (Map.Entry<?, ?>) iterator.next();
            System.out.println(entry);
        }
    }
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Wild Card");
        printCollection(stringList);

        List<Double> DoubleList = new ArrayList<>();
        DoubleList.add(12.33);
        printCollection(DoubleList);

        Map<Integer,Integer> mapNums = new HashMap<>();
        mapNums.put(1,2);
        printMap(mapNums);

    }
}

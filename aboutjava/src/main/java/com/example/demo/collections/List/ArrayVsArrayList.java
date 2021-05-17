package com.example.demo.collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayVsArrayList {
    public static void main(String[] args) {
       aboutArrayList();
       ListToArray();
       ArrayIntoList();
    }

    static void aboutArrayList(){
        //Array
        // 12,99, 56.89 57.69
        double [] nums = new double[3];
        //will printout whole array
        System.out.println(Arrays.toString(nums));
        nums[0] = 12.99;
        nums[1] = 56.69;
        //different object then the one on line 8
        nums = new double[]{14.89, 45.90,95, 58.89};

        //--------------------------------------------
        //No primitive data types
        //ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        list.add(3);
        list.add(74);
        list.add(6);
        System.out.println(list.size());
        //prints entire list
        System.out.println(list);
        //by value
        System.out.println(list.indexOf(3));
        //by index
        System.out.println(list.get(2));

        //remove value
        list.remove(1);
        System.out.println(list);

        //check value returns  true or false
        list.contains(74);

    }

    static void ListToArray(){
        List al = new ArrayList<String>();
        al.add("One");
        al.add("Two");
        al.add("Three");
        al.add("Four");
        al.add("Five");
        //how to convert Arraylist into array...

        int arraySize = al.size();
        String[] newArray = new String[arraySize];
        //will add values from array list to array
        al.toArray(newArray);
        System.out.println(Arrays.toString(newArray));

    }

    static void ArrayIntoList(){
        String[] array = {"a","b","c",};
        ArrayList<String> arrayOne= new ArrayList<>();
        Collections.addAll(arrayOne,array);
    }

}

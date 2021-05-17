package com.example.demo.collections.set;

import java.util.HashSet;

public class SetIntro {
    /*
    Set <Class>
    1.HashSet
    2. TreeSet
    3.LinkedHashSet
    sets cannot have duplicates
        will get   rid  of  everything  shift  the set  up
     */
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<String>();
        names.add("UserOne");
        names.add("UserTwo");
        names.add("UserOne");
        System.out.println(names);
    }
}

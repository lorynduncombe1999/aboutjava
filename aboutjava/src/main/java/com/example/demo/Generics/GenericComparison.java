package com.example.demo.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericComparison {
    public static void main(String[] args) {
        ObjectPair<Integer,String> pairOne = new ObjectPair<>(1,"Apple");
        ObjectPair<Integer,String> pairTwo = new ObjectPair<>(1,"Orange");
        boolean result = ObjectCompare.compare(pairOne,pairTwo);
        System.out.println(result);

        List<String> names  = new ArrayList<>();
        names.add("java");
        names.add("С++");
        names.add("JavaScript");
       boolean searchresult =  ObjectCompare.contains(names.toArray(), "java");
        System.out.println(searchresult);
    }
}

class ObjectCompare{

    //Compare two objects and return true or false
    public static <K,V> boolean compare(ObjectPair<K,V> pair1, ObjectPair<K,V> pair2){
        return pair1.getKey().equals(pair2.getKey()) &&
        pair1.getValue().equals(pair2.getValue());
    }
    // CHeck the elements
    public static final <T> boolean contains (final T[] array, final T v){
        for (final T e: array) {
            if (e==v || v!= null && v.equals(e))
            return true;

        }
        return false;
    }
}

class ObjectPair<K,V>{
    private K key;
    private V value;

    @Override
    public String toString() {
        return "ObjectPair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public ObjectPair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
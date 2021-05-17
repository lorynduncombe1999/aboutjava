package com.example.demo.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        System.out.println(userNames());
        getCount();
        withOutStream();
        withStream();

    }
    public static void withOutStream() {
        for(String name: userNames()){
            if(name.length()<=4){
                System.out.println(name);
            }
        }
    }


    public static void withStream(){
      List<String> result = userNames().stream().filter(name -> name.length()<=4).collect(Collectors.toList());

    }
public static void getCount(){
        Stream.iterate(1,count-> count +1).filter(num->num%2 ==0).limit(6).forEach(System.out::println);
}
    public static List<String> userNames(){
        List <String> userNameList = new ArrayList<>();
        userNameList.add("Loryn");
        userNameList.add("Trey");
        userNameList.add("Toni");
        userNameList.add("Deuce");
        userNameList.add("Kitty");
        userNameList.add("Lilly");
        return userNameList;
    }

}

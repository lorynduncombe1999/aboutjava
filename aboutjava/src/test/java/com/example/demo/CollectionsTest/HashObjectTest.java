package com.example.demo.CollectionsTest;

import org.junit.jupiter.api.Test;

import java.util.Map;

public class HashObjectTest {
    /*
    Modify and return the given map as follows:
if the key "a" has a value, set the key "b"
to have that same value. In all cases remove the key "c",
leaving the rest of the map unchanged.
mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
     */

    public Map<String,String> mapShare(Map<String,String> map){
        if(map.containsKey("a")){
            map.replace("b","bbb",map.get("a"));
            map.remove("c");
            return map;
        }
        else if(!map.containsKey("a")){
            map.remove("c");
            return map;
        }
       else if (map.size()>4 && !(map.containsKey("b"))){
            map.remove("c");
            map.put("b",map.get("a"));
            return map;
        }
        return map;
    }
}

/*
public void mapShareTest(){
    Map<String,String> test1 = new Map<String, String>() {
    }
}
*/
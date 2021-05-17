package com.example.demo.CollectionsTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListObjectTest {

    /*
    Use ArrayList or set interface
    May use lambda
    Given a list of integers, return a
list where each integer is multiplied by 2.
doubling([1, 2, 3]) → [2, 4, 6]
doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
doubling([]) → []
     */
    public void Alternate(List<Integer> nums){
        nums.replaceAll(n->n*2);
    }

    public List<Integer> doubling(List<Integer> nums){
        if(!nums.isEmpty()){
            for (int i =0; i<nums.size();i++){
                nums.set(i, nums.get(i) *2);
            }
            return nums;
        }

        return nums;
    }


/*
Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
copies3([“a”, “bb”, “ccc”]) → [“aaa”, “bbbbbb”, “ccccccccc”]
copies3([“24”, “a”, “”]) → [“242424", “aaa”, “”]
copies3([“hello”, “there”]) → [“hellohellohello”, “theretherethere”]
 */

    public List<String> copies(List<String> strings){
        strings.replaceAll(str -> str + str + str);
        return strings;
    }

@Test
public void testStringList(){
    ArrayList<String> lists1 = new ArrayList<>(Arrays.asList("a","bb","ccc"));
    ArrayList<String> lists2 = new ArrayList<>(Arrays.asList("aaa","bbbbbb","ccccccccc"));
    Assertions.assertEquals(lists2,copies(lists1));

    ArrayList<String> lists3 = new ArrayList<>(Arrays.asList("24","a",""));
    ArrayList<String> lists4 = new ArrayList<>(Arrays.asList("242424", "aaa",""));
    Assertions.assertEquals(lists4,copies(lists3));

    ArrayList<String> lists5 = new ArrayList<>(Arrays.asList("hello","there,"));
    ArrayList<String> lists6 = new ArrayList<>(Arrays.asList("hellohellohello", "theretherethere"));
    Assertions.assertEquals(lists6,copies(lists5));


}

    @Test
    public void doubleTheNumbers(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        //different way to add to an array list
    ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(2,4,6));


        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(-1,9,0));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(-2,18,0));
        ArrayList<Integer> list4 = new ArrayList<>();
        ArrayList<Integer> list5 = new ArrayList<>();
        System.out.println(list);
        System.out.println(list1);

    Assertions.assertEquals(list1,doubling(list));
        System.out.println(list2);
        System.out.println(list3);

    Assertions.assertEquals(list3,doubling(list2));
        System.out.println(list4);
        System.out.println(list5);
    Assertions.assertEquals(list5,doubling(list4));


    }
}

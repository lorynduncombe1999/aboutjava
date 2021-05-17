package com.example.demo.taskOne;
import java.util.*;
public class AuthorAgeComparator implements Comparator<Author> {
    public int compare(Author a1,Author a2){
        if(a1.getAge()==a2.getAge())
            return 0;
        else if(a1.getAge()>a2.getAge())
            return 1;
        else
            return -1;
    }
}

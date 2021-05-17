package com.example.demo.taskOne;

import org.apache.tomcat.jni.Library;
import org.springframework.boot.availability.LivenessState;

import java.util.ArrayList;




public class Author implements Comparable<Author>  {

    private String firstName;
    private String lastName;
    private int age;
    private String bookName;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }





// constructor
    public Author(String firstName, String lastName, int age, String bookName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.bookName = bookName;
    }

    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", bookName='" + bookName + '\'' +
                '}';
    }




    @Override
    public int compareTo(Author o) {
        //-integer means  if current object is less than specified  object

        //+integer means if current object is more than specified  object
        return this.getFirstName().compareTo(o.getFirstName());
    }



}




package com.example.demo.taskOne;
import java.util.ArrayList;
import java.util.Collections;


public class Library{
    public static void main(String[] args) {
        ArrayList<Author> bookCollection = new ArrayList<>();
        Author one = new Author("Loryn", "Duncombe", 21, "FirstBook");
        Author two = new Author("Trey", "Smith", 35, "SecondBook");
        Author three = new Author("Deuce", "Joe", 43, "ThirdBook");
        Author four = new Author("Antoinette", "Williams", 32, "FourthBook");
        Author five = new Author("Toni", "James", 33, "FifthBook");

       bookCollection.add(one);
        bookCollection.add(two);
        bookCollection.add(three);
        bookCollection.add(four);
        bookCollection.add(five);

    myUtils.iterateList(bookCollection);

    //Sorts by first name

        Collections.sort(bookCollection);
        System.out.println("After sorting  by First  Name");
        myUtils.iterateList(bookCollection);



        //Sorts by Age
        Collections.sort(bookCollection, new AuthorAgeComparator());
        System.out.println("After Sorting by age");
        myUtils.iterateList(bookCollection);

        //Sorts by BookName
        Collections.sort(bookCollection, new BookNameComparator());
        System.out.println("After Sorting by Book Name");
        myUtils.iterateList(bookCollection);

    }
}




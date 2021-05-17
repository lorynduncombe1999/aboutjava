package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CodeTestTwo {

    /*
    Given 2 int values, return true if they are
    both in the range 30..40 inclusive, or they are
    both in the range 40..50 inclusive
     */
    public boolean range(int numOne, int numTwo) {
        if (numOne >= 30 && numOne <= 40 && numTwo >= 30 && numTwo <= 40) {
            return true;
        }
        if (numOne >= 40 && numOne <= 50 && numTwo >= 40 && numTwo <= 50) {
            return true;
        }
        return false;
    }
    public static void printOut(String str, int n){
        //base case
        if(n == 0){
            System.out.println("Done Printing");

        }

        //recursive case
        else{
            System.out.println(str);
            //decrement n to reach base case (stops infinite loops)
            n--;
            printOut(str,n);
        }
    }


    @Test
    public void testRange() {
        Assertions.assertTrue(range(30,31));
        Assertions.assertTrue(range(40,50));
        Assertions.assertFalse(range(40,51));
    }




    //study Junit library (Junit 5)
    /*
 1. void assertEquals(boolean expected, boolean actual)
Checks that two primitives/objects are equal.

2.void assertTrue(boolean condition)
Checks that a condition is true.

3. void assertFalse(boolean condition)
Checks that a condition is false.

4.void assertNotNull(Object object)
Checks that an object isn't null.

5. 	void assertNull(Object object)
Checks that an object is null.

6.void assertSame(object1, object2)
The assertSame() method tests if two object references
 point to the same object.

 7.void assertNotSame(object1, object2)
The assertNotSame() method tests if two object references
 do not point to the same object.

 8. void assertArrayEquals(expectedArray, resultArray);
The assertArrayEquals() method will test whether two
arrays are equal to each other.

     */

    /*
    Annotations

1.@Test
The Test annotation tells JUnit that the public void method
to which it is attached can be run as a test case.

2.@Before
Several tests need similar objects created before they
can run. Annotating a public void method with @Before
 causes thatmmethod to be run before each Test method.

 3.@After
If you allocate external resources in a Before method,
you need to release them after the test runs.
Annotating a public void method with
@After causes that method to be run after the Test method.

4.@BeforeClass
Annotating a public static void method with
@BeforeClass causes it to be run once before
any of the test methods in the class.

5.@AfterClass
This will perform the method after all tests have finished.
This can be used to perform clean-up activities.

6.@Ignore
The Ignore annotation is used to ignore
the test and that test will not be executed.

     */
    //OOP -object orient programming language
}

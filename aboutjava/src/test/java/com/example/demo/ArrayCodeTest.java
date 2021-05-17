package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayCodeTest {
    public int even(int[] numList) {
        int counter = 0;

        for (int i = 0; i < numList.length - 1; i++) {
            if (numList[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    @DisplayName("even")
    @Test
    public void testEven() {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assertions.assertEquals(4, even(intArray));
        Assertions.assertEquals(1, even(new int[]{3, 5, 2, 7}));
        Assertions.assertEquals(0, even(new int[]{1, 3, 5, 7}));


    }

    @DisplayName("equalseight")
    @Test
    public void testEqualsEight() {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assertions.assertFalse(equalsEight(intArray));
    }


        public boolean equalsEight(int[] numList) {
            int counter = 0;

            for (int i = 0; i < numList.length - 1; i++) {
                if (numList[i] == 2) {
                    counter += 2;
                }
            }
            if (counter == 8)
                return true;
            else
                return false;

        }

        @DisplayName("zerFront")
        @Test
        public void testZeroFront(){
            int[] intArray = {1, 0};
           Assertions.assertArrayEquals(new int[]{0,1},zeroFront(intArray));
        }
        public int[] zeroFront(int[] numList){
        for(int j = 0; j<numList.length-1; j++){
            if(numList[j]==0){
                //swap method
                int  temp  = numList[j];
                numList[j] = numList[j+1];
                numList[j+1]  = temp;
            }
        }
        return numList;
        }

    }




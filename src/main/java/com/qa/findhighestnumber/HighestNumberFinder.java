package com.qa.findhighestnumber;

public class HighestNumberFinder implements IHighestNumberFinder {
    public int findHighestNumber(int[] array) {
//        return array[0];
        int highestSoFar = array[0];

        for (int val : array)
        {
            if (val > highestSoFar){
                highestSoFar = val;
            }
        }
//        if( array.length > 1 && array[1] > highestSoFar )
//            highestSoFar = array[1];

        return highestSoFar;
    }
}

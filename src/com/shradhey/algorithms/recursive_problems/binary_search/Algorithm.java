package com.shradhey.algorithms.recursive_problems.binary_search;

/**
 * Created by Shradhey Tripathi on 12/16/2018
 */
public class Algorithm {
    private int[] array;

    public Algorithm(int[] array) {
        this.array = array;
    }

    public int binarySearch(int item) {
        return binarySearch(0, array.length - 1, item);
    }
    private int binarySearch(int startIndex, int endIndex, int item) {
        if(endIndex < startIndex) {
            System.out.println("Item is not present in the array");
            return -1;
        }

        int middleIndex = (startIndex + endIndex) / 2;

        if(item == array[middleIndex]) {
            return middleIndex;
        }
        else if(item < array[middleIndex]) {
            return binarySearch(startIndex, middleIndex - 1, item);
        } else {
            return binarySearch(middleIndex + 1, endIndex, item);
        }
    }
}

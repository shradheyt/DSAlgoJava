package com.shradhey.datastructures.Arrays;

/**
 * Created by Shradhey Tripathi on 1/19/2019
 */
public class DuplicateInArray {
    public static int duplicate(int[] arr){

        int sum=0;
        for(int i = 0;i<arr.length;i++) {
            sum = sum + arr[i];
        }
        int actualSum = (arr.length - 2) * (arr.length-1) / 2;
        return sum - actualSum;
    }
}

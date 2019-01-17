package com.shradhey.algorithms.recursive_problems;

/**
 * Created by Shradhey Tripathi on 1/17/2019
 */
public class LastIndexOfNumber {
    public static int lastIndex(int input[], int x) {

        return helper(input,x,0,-1);
    }
    private static int helper(int[] arr, int x, int index, int lastIndex) {
        if(index == arr.length) {
            return lastIndex;
        }
        if(arr[index] == x) lastIndex = index;
        return helper(arr,x,index+1,lastIndex);
    }
}

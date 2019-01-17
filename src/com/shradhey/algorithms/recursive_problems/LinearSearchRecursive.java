package com.shradhey.algorithms.recursive_problems;

/**
 * Created by Shradhey Tripathi on 1/17/2019
 */
public class LinearSearchRecursive {
    public static boolean checkNumber(int input[], int x) {
        return helper(input,x,input.length-1);

    }
    private static boolean helper(int[] arr, int x , int n) {
        if(n == -1) return false;
        return arr[n] == x || helper(arr,x, n -1);
    }
}

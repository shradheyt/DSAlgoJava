package com.shradhey.algorithms.recursive_problems;

/**
 * Created by Shradhey Tripathi on 1/17/2019
 */
public class FirstIndexOfNumber {
    public static int firstIndex(int input[], int x) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        return helper(input,x,0);
    }

    private static int helper(int[] arr, int x, int index) {
        if(index == arr.length) {
            return -1;
        }
        if(arr[index] == x) return index;
        return helper(arr,x,index+1);
    }

}

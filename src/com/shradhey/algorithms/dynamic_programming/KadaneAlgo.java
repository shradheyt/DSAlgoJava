package com.shradhey;

/**
 * Created by Shradhey Tripathi on 1/18/2019
 */
public class KadaneAlgo {
    private static int maxContigousSubArraySum(int[] arr) {
        if(arr.length == 0 || arr == null) return 0;
        int currentsum = 0;
        int bestsum = 0;
        for(int i = 0;i < arr.length;i++) {
            currentsum += arr[i];
            if(bestsum < currentsum) bestsum = currentsum;
            if(currentsum < 0) currentsum = 0;
        }
        return bestsum;
    }
    public static void main(String[] args) {
        int[] arr = {-5,2,3,4,-7,-8,1,2,3,9,-6,1,2,4,9,-1};
        System.out.println(maxContigousSubArraySum(arr));
    }
}

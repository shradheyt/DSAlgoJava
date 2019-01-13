package com.shradhey.algorithms.sorting;

/**
 * Created by Shradhey Tripathi on 1/13/2019
 */
public class BubbleSort {

    public int[] bubbleSort(int[] arr) {
        boolean swapped = false;
        for(int i = 0;i<arr.length-1;i++) {
            for(int j = 0;j<arr.length-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
             if(swapped ==false) break;
        }

        return arr;

    }

    public static void main(String[] args) {

        int[] array = {9,8,7,6,5,4,3,2,1};
        BubbleSort bs = new BubbleSort();
        array = bs.bubbleSort(array);
        bs.printArray(array);
    }

    private void printArray(int[] array) {
        for(int i = 0;i < array.length;i++) {
            System.out.print(array[i] + " - ");
        }
    }

}

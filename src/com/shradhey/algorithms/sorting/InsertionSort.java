package com.shradhey.algorithms.sorting;

/**
 * Created by Shradhey Tripathi on 1/13/2019
 */
public class InsertionSort {
    public int[] selectionSort(int[] arr) {

        for(int i = 1;i < arr.length;i++) {
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }

        }

        return arr;
    }

    public static void main(String[] args) {

        int[] array = {9,8,7,6,5,4,3,2,1};
        InsertionSort bs = new InsertionSort();
        array = bs.selectionSort(array);
        bs.printArray(array);
    }

    private void printArray(int[] array) {
        for(int i = 0;i < array.length;i++) {
            System.out.print(array[i] + " - ");
        }
    }
}

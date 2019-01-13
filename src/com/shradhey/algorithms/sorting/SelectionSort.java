package com.shradhey.algorithms.sorting;

/**
 * Created by Shradhey Tripathi on 1/13/2019
 */
public class SelectionSort {

    public int[] selectionSort(int[] arr) {

        int index;
        for(int i = 0;i < arr.length-1;i++) {
            index = i;
            for(int j = i+1;j<arr.length;j++) {
                if(arr[j] < arr[index]) {
                    index = j;
                }
            }
            if(index != i) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] array = {9,8,7,6,5,4,3,2,1};
        SelectionSort bs = new SelectionSort();
        array = bs.selectionSort(array);
        bs.printArray(array);
    }

    private void printArray(int[] array) {
        for(int i = 0;i < array.length;i++) {
            System.out.print(array[i] + " - ");
        }
    }
}

package com.shradhey.algorithms.recursive_problems.binary_search;

/**
 * Created by Shradhey Tripathi on 12/16/2018
 */
public class App {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,8,9};
        Algorithm algorithm = new Algorithm(array);
        System.out.println(algorithm.binarySearch(9));
    }
}

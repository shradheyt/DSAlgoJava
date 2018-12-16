package com.shradhey.algorithms.recursive_problems.factorial;

/**
 * Created by Shradhey Tripathi on 12/16/2018
 */
public class Algorithm {

    public int factorial(int accumulator, int n) {
        if(n == 1) return accumulator;

        return factorial(accumulator * n, n - 1);
    }

    public int calculateFactorial(int n) {
        return factorial(1,n);
    }
}

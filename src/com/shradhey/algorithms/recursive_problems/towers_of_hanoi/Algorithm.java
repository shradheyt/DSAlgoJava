package com.shradhey.algorithms.recursive_problems.towers_of_hanoi;

/**
 * Created by Shradhey Tripathi on 12/16/2018
 */
public class Algorithm {
    public void solveHanoi(int n, char rodFrom, char midRod, char rodTo) {
        if(n == 1) {
            System.out.println("Plate 1 from " + rodFrom + " to " + rodTo);
            return;
        }

        solveHanoi(n - 1, rodFrom,rodTo,midRod);
        System.out.println("Plate " + n + " from " + rodFrom + " to " + rodTo);
        solveHanoi(n - 1, midRod, rodFrom, rodTo);
    }
}

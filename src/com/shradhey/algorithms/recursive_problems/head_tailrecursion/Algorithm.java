package com.shradhey.algorithms.recursive_problems.head_tailrecursion;

/**
 * Created by Shradhey Tripathi on 12/16/2018
 */
public class Algorithm {

    //HEAD RECURSION
    public void buildLayer(int height) {

        if(height == 0) return;

        buildLayer(height - 1);  //Uses OS stack to maintain memory

        System.out.println(height);  //print ascending order
    }

    //TAIL RECURSION
    public void buildLayer2(int height) {

        if(height == 0) return;

        System.out.println(height);  //print descending order

        buildLayer2(height - 1);
    }
}

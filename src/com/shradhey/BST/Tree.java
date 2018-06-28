package com.shradhey.BST;

/**
 * Created by Shradhey Tripathi on 29-Jun-18.
 */
public interface Tree<T extends Comparable<T>> {
    void traverse();
    void insert(T data);
    void delete(T data);
    T getMaxValue();
    T getMinValue();
}

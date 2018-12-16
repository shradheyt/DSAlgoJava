package com.shradhey.datastructures.LinkedList;

/**
 * Created by Shradhey Tripathi on 23-Jun-18.
 */
public class Test {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.insert("Shradhey");
        list.insert("tripathi");
        list.insert("Amit");
        list.insert("Hello");

        list.remove("Hello");
        list.traverseList();
    }
}

package com.shradhey.datastructures.BST;

/**
 * Created by Shradhey Tripathi on 29-Jun-18.
 */
public class App {
    public static void main(String[] args) {

        Tree<String> bst = new BinarySearchTree<>();

        bst.insert("Adam");
        bst.insert("Shradhey");
        bst.insert("Brahmin");
        bst.insert("Gagan");
        bst.insert("Shivam");
        bst.insert("tripathi");

        System.out.println(bst.getMinValue());
        System.out.println(bst.getMaxValue());
        bst.traverse();
    }
}

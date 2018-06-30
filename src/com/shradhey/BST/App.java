package com.shradhey.BST;

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
        bst.delete("Adam");
        bst.traverse();
    }
}

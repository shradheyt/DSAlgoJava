package com.shradhey.datastructures.LinkedList;

/**
 * Created by Shradhey Tripathi on 23-Jun-18.
 */
public class LinkedList<T extends Comparable<T>> implements List<T>{
    private Node<T> root;
    private int sizeOfList;

    @Override
    public void insert(T data) {
        ++this.sizeOfList;
        if(root == null) {
            this.root = new Node<>(data);
        } else {
            insertDataAtBeginning(data);
        }
    }

    private void insertDataAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        this.root = newNode;
    }

    private void insertDataAtEnd(T data,Node<T> node) {
        if(node.getNextNode() != null) {
            insertDataAtEnd(data, node.getNextNode());
        } else {
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }
    }

    @Override
    public void remove(T data) {
        if(this.root == null) return;

        --this.sizeOfList;

        if(this.root.getData().compareTo(data) == 0) {
            this.root = this.root.getNextNode();
        } else {
            remove(data,root,root.getNextNode());
        }
    }

    private void remove(T dataToRemove, Node<T> previousNode, Node<T> currentNode) {
        while(currentNode != null) {
            if(currentNode.getData().compareTo(dataToRemove) == 0) {
                previousNode.setNextNode(currentNode.getNextNode());
                currentNode = null;
                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
    }

    @Override
    public void traverseList() {

        if(this.root == null) return;
        Node<T> currentNode = this.root;
        while( currentNode != null ) {
            System.out.print(currentNode + " -> ");
            currentNode = currentNode.getNextNode();
        }

    }

    @Override
    public int size() {
        return this.sizeOfList;
    }
}

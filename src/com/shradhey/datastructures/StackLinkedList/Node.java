package com.shradhey.datastructures.StackLinkedList;

/**
 * Created by Shradhey Tripathi on 25-Jun-18.
 */
public class Node<T extends Comparable<T>> {

    private T data;
    private Node<T> nextNode;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public String toString() {
        return this.data.toString();
    }
}

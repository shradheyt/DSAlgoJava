package com.shradhey.datastructures.BST;

/**
 * Created by Shradhey Tripathi on 29-Jun-18.
 */
public class BinarySearchTree<T extends Comparable<T>> implements Tree<T>  {

    private Node<T> root;

    public void insert(T data) {
        if(root == null) {
            root = new Node<T>(data);
        } else {
            insertNode(data,root);
        }
    }
    @Override
    public void traverse() {
        if(root != null) {
            inOrderTraversal(root);
        }
    }

    private void inOrderTraversal(Node<T> node) {
        if(node.getLeftChild() != null) {
            inOrderTraversal(node.getLeftChild());
        }

        System.out.print(node+ " --> ");

        if(node.getRightChild() != null) {
            inOrderTraversal(node.getRightChild());
        }
    }

    private void insertNode(T data,Node<T> node) {

        if(data.compareTo(node.getData()) < 0) {
            if(node.getLeftChild() != null) {
                insertNode(data,node.getLeftChild());
            } else {
                Node<T> newNode = new Node<T>(data);
                node.setLeftChild(newNode);
            }
        } else {
            if(node.getRightChild() != null) {
                insertNode(data,node.getRightChild());
            } else {
                Node<T> newNode = new Node<T>(data);
                node.setRightChild(newNode);
            }
        }

    }

    @Override
    public void delete(T data) {
        if(root != null) {
            root = delete(root,data);
        }
    }

    private Node<T> delete(Node<T> node,T data) {

        if(node == null) return node;

        if(data.compareTo(node.getData()) < 0) {
            node.setLeftChild(delete(node.getLeftChild(),data));
        } else if(data.compareTo(node.getData()) > 0){
            node.setRightChild(delete(node.getRightChild(),data));

        } else {
            //we have found the node to remove
            if(node.getLeftChild() == null && node.getRightChild() == null) {
                System.out.println("Removing a leaf node");
                return null;
            }
            if(node.getLeftChild() == null) {
                System.out.println("Removing the right child node");
                Node<T> temp = node.getRightChild();
                node = null;
                return temp;
            }
            else if(node.getRightChild() != null) {
                System.out.println("Removing the left child node");
                Node<T> temp = node.getLeftChild();
                node = null;
                return temp;
            }
        }
        return null;
    }
    @Override
    public T getMaxValue() {
        if(root == null) return null;
         return getMax(root);
    }


    private T getMax(Node<T> node) {
        if(node.getRightChild() != null) {
            return getMax(node.getRightChild());
        }
        return node.getData();
    }
    @Override
    public T getMinValue() {
        if(root == null) return null;
        return getMin(root);
    }


    private T getMin(Node<T> node) {
        if(node.getLeftChild() != null) {
            return getMin(node.getLeftChild());
        }
        return node.getData();
    }
}

package com.shradhey.StackLinkedList;

/**
 * Created by Shradhey Tripathi on 25-Jun-18.
 */
public class App {

    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();
        myStack.push("Shradhey");
        myStack.push("Amit");
        myStack.push("tripathi");
        myStack.push("abcd");
        System.out.println(myStack.size());

        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }

}

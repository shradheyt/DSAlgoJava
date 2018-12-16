package com.shradhey.datastructures.StackArray;

/**
 * Created by Shradhey Tripathi on 25-Jun-18.
 */
public class App {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(100);
        stack.push(1000);

        System.out.println(stack.size());
        System.out.println(stack.pop());
    }
}

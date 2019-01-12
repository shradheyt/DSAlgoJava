package com.shradhey;

/**
 * Created by Shradhey Tripathi on 1/12/2019
 */
public class FibonacciDP {

    public int fibonacci(int n) {
        int[] fib = new int[n+1];
        fib[0]=1;
        fib[1]=1;
        for(int i=2;i <= n;i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        FibonacciDP fibo = new FibonacciDP();
        System.out.println(fibo.fibonacci(6));
    }
}

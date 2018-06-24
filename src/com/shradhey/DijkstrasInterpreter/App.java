package com.shradhey.DijkstrasInterpreter;

/**
 * Created by Shradhey Tripathi on 25-Jun-18.
 */
public class App {
    public static void main(String[] args) {
        Algorithm algo = new Algorithm();
        algo.interpretExpression("( ( 1 + 2 ) * ( 2 + 1 ) )");
        algo.result();
    }
}

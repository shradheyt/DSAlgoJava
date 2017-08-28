package com.shradhey.GraphSort;


public class MainClass
{
    public static void main(String[] args)
    {
        AdjacencyListGraph graph = new AdjacencyListGraph(10, Graph.GraphType.DIRECTED);
        int[] visited = new int[10];
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,5);
        graph.addEdge(3,2);
        graph.addEdge(3,5);
        graph.addEdge(4,1);
        graph.addEdge(4,3);
        graph.addEdge(4,5);
        graph.addEdge(5,1);
        graph.addEdge(1,4);
        graph.addEdge(9,3);
        graph.addEdge(7,5);
        graph.addEdge(5,6);

        graph.displayGraph();

        System.out.println("\nSorted Graph\n");

        TopologicalSort.sort(graph);
    }
}

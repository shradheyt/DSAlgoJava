package com.shradhey.datastructures.GraphSort;

import java.util.List;

public class MainClass
{
    public static void main(String[] args)
    {
        AdjacencyListGraph graph = new AdjacencyListGraph(6, Graph.GraphType.DIRECTED);

        graph.addEdge(0,1);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(3,4);
        graph.addEdge(4,1);
        graph.addEdge(1,2);
        graph.addEdge(4,2);

        graph.displayGraph();

        System.out.println("\nSorted Graph\n");

        List<Integer> sortedList = TopologicalSort.sort(graph);

        for(int i : sortedList)
        {
            System.out.print(i + "->");
        }
    }

}

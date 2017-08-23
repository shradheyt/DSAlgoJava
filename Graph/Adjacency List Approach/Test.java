package com.shradhey.GraphList;

public class Test
{
    public static void main(String[] args)
    {
        AdjacencyListGraph graph = new AdjacencyListGraph(6, Graph.GraphType.DIRECTED);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,5);
        graph.addEdge(3,2);
        graph.addEdge(3,5);
        graph.addEdge(4,1);
        graph.addEdge(4,3);
        graph.addEdge(4,5);
        graph.addEdge(5,1);

        graph.displayGraph();
    }
}

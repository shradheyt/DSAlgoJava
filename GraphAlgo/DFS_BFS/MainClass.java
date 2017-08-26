package com.shradhey.GraphList;

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

        for(int i = 0;i < 10;i++)
        {
            visited[i] = 0;
        }

        for(int i = 1;i < 10;i++)
        {
            DFS.depthFirstTraversal(graph,visited,i);
        }

        System.out.println("\n===BFS");
        for(int i = 0;i < 10;i++)
        {
            visited[i] = 0;
        }

        for(int i = 1;i < 10;i++)
        {
            BFS.breadthFirstTraversal(graph,visited,i);
        }

    }
}

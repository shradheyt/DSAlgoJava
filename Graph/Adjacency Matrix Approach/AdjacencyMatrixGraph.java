package com.shradhey;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Graph Interface to describe property and behaviours of Graph
interface Graph
{
    enum GraphType
	{
        DIRECTED,UNDIRECTED
    }
    void addEdge(int v1,int v2);
    List<Integer> getAdjacentVertices(int v);
}
//Using Adjacency Matrix to implement Graph
public class AdjacencyMatrixGraph implements Graph 
{
    private int[][] adjacencyMatrix;
    private GraphType graphType = GraphType.DIRECTED;
    private int numVertices =   0;

    AdjacencyMatrixGraph(int numVertices,GraphType graphType)
    {
        this.numVertices = numVertices;
        this.graphType = graphType;

        adjacencyMatrix = new int[numVertices][numVertices];
        for(int i=0;i<numVertices;i++)
        {
            for(int j=0;j<numVertices;j++)
            {
                adjacencyMatrix[i][j] = 0;
            }
        }
    }
	
    @Override
    public void addEdge(int v1,int v2)
    {
        if(v1 < 0 || v2 < 0 || v1 >= numVertices || v2 >= numVertices)
        {
            throw new IllegalArgumentException("Illegal number of arguements");
        }
        adjacencyMatrix[v1][v2] = 1;
        if(graphType == GraphType.UNDIRECTED)
        {
            adjacencyMatrix[v2][v1] = 1;
        }
    }
    @Override
    public List<Integer> getAdjacentVertices(int v)
    {
        if(v < 0 || v >= numVertices)
        {
            throw new IllegalArgumentException("Illegal number of arguement");
        }

        List<Integer> adjacentVerticesList = new ArrayList<>();
        for(int i=0;i<numVertices;i++)
        {
            if(adjacencyMatrix[v][i] == 1)
                adjacentVerticesList.add(i);
        }
        Collections.sort(adjacentVerticesList);
        return adjacentVerticesList;
    }
     void displayGraph()
    {
        for(int i=0;i<numVertices;i++)
        {
            for(int j=0;j<numVertices;j++)
            {
                System.out.print(" " + adjacencyMatrix[i][j]);
            }
            System.out.println();
        }
    }



}
class Tester
{
    public static void main(String[] args) 
	{
        AdjacencyMatrixGraph graph = new AdjacencyMatrixGraph(6, Graph.GraphType.DIRECTED);
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

      List<Integer> adjacentResult = graph.getAdjacentVertices(4);
      for(int i : adjacentResult)
          System.out.println(i);
    }
}

package com.shradhey.GraphList;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyListGraph implements Graph
{
    private List<Node> vertexList  = new ArrayList<>();
    private GraphType graphType = GraphType.DIRECTED;
    private int numVertices = 0;

    public AdjacencyListGraph(int numVertices,GraphType graphType)
    {
        this.numVertices = numVertices;
        for(int i = 0;i < numVertices;i++)
        {
            vertexList.add(new Node(i));
        }
        this.graphType = graphType;
    }
    @Override
    public void addEdge(int v1,int v2)
    {
        if(v1<0 || v2<0 || v1>=numVertices || v2>=numVertices)
        {
            throw new IllegalArgumentException("Illegal number of arguements");
        }
       vertexList.get(v1).addVertex(v2);
        if(graphType==GraphType.UNDIRECTED)
        {
            vertexList.get(v2).addVertex(v1);
        }
    }

    @Override
    public List<Integer> getAdjacentVertices(int v)
    {
        if(v<0 || v>=numVertices)
        {
            throw new IllegalArgumentException("Illegal number of argument");
        }
        return vertexList.get(v).getAdjacentVertices();
    }

    public void displayGraph()
    {
        for(int i=0;i<numVertices;i++)
        {
            System.out.println(i + "==>" + vertexList.get(i).getAdjacentVertices());
        }
    }
}

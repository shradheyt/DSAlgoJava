package com.shradhey.GraphList;

import java.util.*;

public class Node {

    private int vertexNumber;
    private List<Integer> adjacencyList = new ArrayList<>();

    public Node(int vertexNumber)
    {
        this.vertexNumber = vertexNumber;
    }

    public int getVertexNumber()
    {
        return vertexNumber;
    }

    public void addVertex(int vertexNumber)
    {
        adjacencyList.add(vertexNumber);
    }

    public List<Integer> getAdjacentVertices()
    {
        List<Integer> sortedList = new ArrayList<>(adjacencyList);
        Collections.sort(sortedList);
        return sortedList;
    }
}

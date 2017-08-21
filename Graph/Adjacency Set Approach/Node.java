package com.shradhey.GraphSet;

import java.util.*;

public class Node {

    private int vertexNumber;
    private Set<Integer> adjacencySet = new HashSet<>();

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
        adjacencySet.add(vertexNumber);
    }

    public List<Integer> getAdjacentVertices()
    {
        List<Integer> sortedList = new ArrayList<>(adjacencySet);
        Collections.sort(sortedList);
        return sortedList;
    }
}

package com.shradhey.GraphSort;

import java.util.*;

public class TopologicalSort {

    public static List<Integer> sort(AdjacencyListGraph graph)
    {
        List<Integer> queue = new LinkedList<>();
        Map<Integer,Integer> inDegreeMap = new HashMap<>();

        for(int vertex = 0;vertex<graph.getNumVertices();vertex++)
        {
            int indegree = graph.getIndegree(vertex);
            inDegreeMap.put(vertex,indegree);
            if(indegree == 0)
            {
                queue.add(vertex);
            }
        }
        List<Integer> sortedList = new ArrayList<>();
        while(!queue.isEmpty())
        {
            int vertex = queue.get(0);
            sortedList.add(vertex);

            List<Integer> adjacentVertices = graph.getAdjacentVertices(vertex);

            for(int adjacentVertex:adjacentVertices)
            {
                int updatedIndegree = inDegreeMap.get(adjacentVertex) - 1;
                inDegreeMap.remove(adjacentVertex);
                inDegreeMap.put(adjacentVertex,updatedIndegree);

                if(updatedIndegree ==0)
                {
                    queue.add(adjacentVertex);
                }
            }
            if(sortedList.size() != graph.getNumVertices())
                throw new RuntimeException("The graph contains cycle");
        }
        return sortedList;
    }
}

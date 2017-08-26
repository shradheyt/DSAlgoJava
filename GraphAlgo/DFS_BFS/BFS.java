package com.shradhey.GraphList;

import java.util.*;

public class BFS {

    public static void breadthFirstTraversal (Graph graph,int[] visited,int currentVertex)
    {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(currentVertex);

        while(!queue.isEmpty())
        {
            int vertex = queue.remove();
            if(visited[vertex] == 1)
            {
                continue;
            }
            System.out.print(vertex + "->");
            visited[vertex] = 1;

            List<Integer> list = graph.getAdjacentVertices(vertex);
            for(int v : list)
            {
                if(visited[v] != 1)
                {
                    queue.add(v);
                }
            }
        }


    }
}

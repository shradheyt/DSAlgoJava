package com.shradhey.algorithms.backtracking;

/**
 * Created by Shradhey Tripathi on 1/29/2019
 */
public class GraphColoring {
    private int numOfVertex;
    private int numOfColors;
    private int[] colors;
    private int[][] adjacencyMatrix;

    public GraphColoring(int[][] adjacencyMatrix, int numOfColors) {
        this.numOfColors = numOfColors;
        this.adjacencyMatrix = adjacencyMatrix;
        this.numOfVertex = adjacencyMatrix.length;
        this.colors = new int[numOfVertex];
    }

    public void solve() {
        if(solveProblem(0)) {
            showResults();
        } else {
            System.out.println("No Solution");
        }
    }

    private boolean solveProblem(int vertex) {
        if(vertex == numOfVertex) {
            return true;
        }
        for(int colorIndex = 1;colorIndex <= numOfColors;colorIndex++) {
            if(isColorValid(vertex,colorIndex)) {
                colors[vertex] = colorIndex;
                if(solveProblem(vertex + 1)) {
                    return true;
                }
                //BACKTRACK
            }
        }
        return false;
    }

    private boolean isColorValid(int vertex, int colorIndex) {
        for(int i = 0;i < numOfVertex;i++) {
            if(adjacencyMatrix[vertex][i] == 1 && colors[i] == colorIndex) {
                return false;
            }
        }
        return true;
    }

    private void showResults() {
        for(int i=0;i < numOfVertex;i++) {
            System.out.println("Node " + (i+1) + " has color Index:" + colors[i]);
        }
    }

    public static void main(String[] args) {

        int[][] graphMatrix = new int[][]{
                {0,1,0,1,0},
                {1,0,1,1,0},
                {0,1,0,1,0},
                {1,1,1,0,1},
                {0,0,0,1,0},
        };
        GraphColoring graphColoring = new GraphColoring(graphMatrix,3);
        graphColoring.solve();

//        Output:
//        Node 1 has color Index:1
//        Node 2 has color Index:2
//        Node 3 has color Index:1
//        Node 4 has color Index:3
//        Node 5 has color Index:1
    }
}

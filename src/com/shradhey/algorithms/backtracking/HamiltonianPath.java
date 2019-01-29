package com.shradhey.algorithms.backtracking;

/**
 * Created by Shradhey Tripathi on 1/29/2019
 */
public class HamiltonianPath {
    private int numOfVertices;
    private int[][] adjMatrix;
    private int[] hamiltonianPath;

    public HamiltonianPath (int[][] adjMatrix) {
        this.adjMatrix = adjMatrix;
        this.numOfVertices = adjMatrix.length;
        this.hamiltonianPath = new int[this.numOfVertices];

        this.hamiltonianPath[0] = 0;
    }

    public void solve() {
        if(isFeasibleSolution(1)) {
            printHamiltonianPath();
        } else {
            System.out.println("No Feasible Solution ...");
        }
    }

    private void printHamiltonianPath() {
        for(int i = 0;i < hamiltonianPath.length;i++) {
            System.out.print(hamiltonianPath[i] + " ");
        }
        System.out.print(hamiltonianPath[0]);
        return;
    }

    public boolean isFeasibleSolution(int location) {
        if(location == numOfVertices) {
            if(adjMatrix[hamiltonianPath[numOfVertices-1]][hamiltonianPath[0]] == 1) {
                return true;
            }
        }
        for(int vertexIndex = 1;vertexIndex < numOfVertices;vertexIndex++) {
            if(isValid(vertexIndex,location)) {
                hamiltonianPath[location] = vertexIndex;
                if(isFeasibleSolution(location + 1)) {
                    return true;
                }
            }

            //BACKTRACK
        }


        return false;
    }

    public boolean isValid(int vertexIndex, int location){
        //first criteria - vertex should be connected
        if(adjMatrix[hamiltonianPath[location - 1]][vertexIndex] == 0) {
            return false;
        }

        //second criteria - vertex should not be present in hamiltonian path
        for(int i = 0;i < location;i++) {
            if(hamiltonianPath[i] == vertexIndex){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,1,1,0,0},
                {1,0,1,0,1,0},
                {1,1,1,1,0,1},
                {1,0,1,0,0,1},
                {0,1,0,0,0,1},
                {0,1,1,1,1,1}
        };
        HamiltonianPath ham = new HamiltonianPath(matrix);
        ham.solve();
    }
}

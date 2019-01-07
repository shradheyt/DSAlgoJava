package com.shradhey;

/**
 * Created by Shradhey Tripathi on 1/7/2019
 */
public class RatInAMaze {

    public boolean solveMaze(int[][] maze, int n) {
        int[][] path = new int[n][n];
        return solver(maze,n,0,0,path);
    }

    public boolean solver(int[][] maze,int n,int x,int y, int[][] path) {
        //Case 1: boundary cases
        if(x < 0 || y < 0 || x > n-1 || y > n-1) {
            return false;
        }
        //Case 2: if path is already visited or maze has 0
        if(path[x][y] == 1 || maze[x][y] == 0) {
            return false;
        }
        //Case 3: If we reach to last address
        if(x == n-1 && y == n-1) {
            return true;
        }

        path[x][y] = 1;
        //Go Right
        if(solver(maze,n,x,y+1,path)) {
            path[x][y] = 0;
            return true;
        }
        //Go Left
        if(solver(maze,n,x,y-1,path)) {
            path[x][y] = 0;
            return true;
        }
        //Go Up
        if(solver(maze,n,x+1,y,path)) {
            path[x][y] = 0;
            return true;
        }
        //Go Down
        if(solver(maze,n,x-1,y,path)) {
            path[x][y] = 0;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        RatInAMaze r = new RatInAMaze();
        int[][] maze = {{1,1,0},{1,1,0},{0,1,1}};
        System.out.println(r.solveMaze(maze,3));
    }
}

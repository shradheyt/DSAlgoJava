package com.shradhey;

/**
 * Created by Shradhey Tripathi on 1/7/2019
 */
public class RatInAMazePrint {

    public static void solveMaze(int[][] maze, int n) {
        int[][] path = new int[n][n];
         solver(maze,n,0,0,path);
    }

    private static void solver(int[][] maze,int n,int x,int y, int[][] path) {
        //Case 1: boundary cases
        if(x < 0 || y < 0 || x > n-1 || y > n-1) {
            return;
        }

        //Case 2: If we reach to last address
        if(x == n-1 && y == n-1) {
            path[x][y] = 1;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(path[i][j] + "  ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        //Case 3: if path is already visited or maze has 0
        if(path[x][y] == 1 || maze[x][y] == 0) {
            return ;
        }


        path[x][y] = 1;
        //Go Right
        solver(maze,n,x,y+1,path);
        //Go Left
        solver(maze,n,x,y-1,path);
        //Go Up
        solver(maze,n,x+1,y,path);
        //Go Down
        solver(maze,n,x-1,y,path);

        path[x][y] = 0;

    }

    public static void main(String[] args) {
        RatInAMaze r = new RatInAMaze();
        int[][] maze = {{1,1,0},{1,1,0},{0,1,1}};
        solveMaze(maze,3);
    }
}

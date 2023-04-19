package Recursion.Intro.Backtracking;

import java.util.Arrays;

public class PrintPath {


    public static void main(String[] args) {

        boolean[][] maze2 = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };

        int[][] path = new int[maze2.length][maze2[0].length];
        AllPathPrint("",maze2,0,0,path,1);
    }

    static void AllPathPrint( String p,boolean[][] maze,int r , int c,int[][] path , int step)
    {
        path[r][c]=step;

        if(r== maze.length-1 && c== maze[0].length-1)
        {

            for (int[] num: path) {

                System.out.println(Arrays.toString(num));
            }
            System.out.println(p+ " ");
            System.out.println();
            return;
        }

        if(!maze[r][c])
        {
            return;
        }

        // i am considering this block in my path
        maze[r][c] =false;
        path[r][c]=step;

        if(r < maze.length-1)
        {
            AllPathPrint(p +'D',maze,r+1,c,path,step+1);
        }

        if(c < maze[0].length-1)
        {
            AllPathPrint(p +'R',maze,r,c+1,path,step+1);
        }

        if(r>0)
        {
            AllPathPrint(p +'U',maze,r-1,c,path,step+1);
        }

        if(c>0)
        {
            AllPathPrint(p +'L',maze,r,c-1,path,step+1);
        }

        // this is where this function will over
        // so before the function get removed , also remove the changes that were  made by that function

        maze[r][c] =true;  // it just used to remove the history you made with our array
        path[r][c]=0;

    }
}

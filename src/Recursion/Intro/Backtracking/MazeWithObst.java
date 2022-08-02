package Recursion.Intro.Backtracking;

public class MazeWithObst {


    public static void main(String[] args) {

        boolean[][] maze1 = {
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };

        pathWithObst("",maze1,0,0);
        System.out.println();
        boolean[][] maze2 = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        AllPath("",maze2,0,0);
    }

    static void pathWithObst( String p,boolean[][] maze,int r , int c)
    {
        if(r== maze.length-1 && c== maze[0].length-1)
        {
            System.out.print(p+ " ");
            return;
        }

        if(!maze[r][c])
        {
            return;
        }

        if(r < maze.length-1)
        {
            pathWithObst(p +'D',maze,r+1,c);
        }

        if(c < maze[0].length-1)
        {
            pathWithObst(p +'R',maze,r,c+1);
        }

    }




// ALL PATHS with R,L,U,D  ( USing BACK TRACKING ) all direction are allowed

    static void AllPath( String p,boolean[][] maze,int r , int c)
    {
        if(r== maze.length-1 && c== maze[0].length-1)
        {
            System.out.print(p+ " ");
            return;
        }

        if(!maze[r][c])
        {
            return;
        }

        // i am considering this block in my path
        maze[r][c] =false;

        if(r < maze.length-1)
        {
            AllPath(p +'D',maze,r+1,c);
        }

        if(c < maze[0].length-1)
        {
            AllPath(p +'R',maze,r,c+1);
        }

        if(r>0)
        {
            AllPath(p +'U',maze,r-1,c);
        }

        if(c>0)
        {
            AllPath(p +'L',maze,r,c-1);
        }

        // this is where this function will over
        // so before the function get removed , also remove the changes that were  made by that function

        maze[r][c] =true;  // it just used to remove the history you made with our array

    }


}

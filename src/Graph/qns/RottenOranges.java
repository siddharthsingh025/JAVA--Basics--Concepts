package Graph.qns;

import java.util.LinkedList;
import java.util.Queue;

//https://practice.geeksforgeeks.org/problems/rotten-oranges2536/1
public class RottenOranges {
    //we use here BFS algorithm , bcoz as we have to rotten all the neighbour
    // oranges at the same time for all the rotten oranges at same level,
    // or we can say we want minimum time required to rotten all the oranges
    // in DFS it will be rotten oranges until the depth what we don't want to , we just want to rotten oranges at eqiDistance(1)
    // from all the rotten oranges at same time .


    //Function to find minimum time required to rot all oranges.
    public int orangesRotting(int[][] grid)
    {
        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();
        int [][] vis = new int[n][m];
        int cntFresh=0;
        for(int i =0;i<n;i++){
            for (int j=0;j<m;j++)
            {
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }
                else {
                    vis[i][j]=0;
                }

                if(grid[i][j]==1) cntFresh++;
            }
        }
         int[] drow={0,-1,0,1};
        int[] dcol={-1,0,1,0};

        int tm=0; //for calculating maximum time
        int cnt=0;  // for calculating how many fresh oranges are got rotten
        while (!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().tm;
            tm = Math.max(tm,t);
            q.remove();// remove element form front, or we can say bottom if you are seeing it like stack

            for(int k=0;k<4;k++){
                int nrow = r + drow[k];
                int ncol = c + dcol[k];

                if( nrow >=0 && nrow<n && ncol >=0 && ncol<m && grid[nrow][ncol]==1 && vis[nrow][ncol]==0){
                    q.add(new Pair(nrow,ncol,t+1));
                    vis[nrow][ncol]=2;
                    cnt++;
                }

            }
        }

        if(cnt!=cntFresh) return -1; // not all oranges are got rotten

        return tm;
    }

}


class Pair{
    int row;
    int col;
    int tm;
    Pair(int r, int c, int t){
        this.row =r;
        this.col=c;
        this.tm=t;
    }
}

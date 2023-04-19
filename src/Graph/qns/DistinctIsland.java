package Graph.qns;

import java.util.ArrayList;
import java.util.HashSet;

public class DistinctIsland {


    public void dfs(int row , int col , ArrayList<String> vec ,int[][] grid ,int[][] vis , int row0 , int col0){
        vis[row][col]=1;
        vec.add(toString(row-row0,col-col0));
        int n = grid.length;
        int m = grid[0].length;
        int[]  drow={-1,0,1,0};
        int[] dcol ={0,-1,0,1};
        for(int k =0 ; k<4 ; k++){
            int nrow = row+ drow[k];
            int ncol = col + dcol[k];
            if(nrow>=0 && nrow <n && ncol>=0 && ncol < m
                && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){   // doesn't call next recursion if grid element is 0; or visited = 1;
                dfs(nrow,ncol,vec,grid,vis,row0,col0);
            }
        }
    }


    public String toString(int x ,int y){
        return Integer.toString(x) + " " + Integer.toString(y);
    }

    int countDistinctIslands(int[][] grid) {
        // Your Code here

        int n = grid.length;
        int m = grid[0].length;
        int [][] vis = new int[n][m];
        HashSet<ArrayList<String>> st = new HashSet<>();
        for(int i = 0; i<n ;i++){
            for(int j=0; j<m ;j++){

                if(vis[i][j]==0&&grid[i][j]==1)
                {
                    ArrayList<String> list = new ArrayList<>();
                    dfs(i,j,list,grid,vis,i,j);
                    st.add(list);
                }
            }
        }
        return  st.size();
    }
}


package Graph.qns;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {

    public boolean check(int start ,int[] color ,ArrayList<ArrayList<Integer>>adj ){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start]=0;
        while (!q.isEmpty()){
            int node = q.peek();
            q.remove();

            for(int it : adj.get(node)){
                //if not colored yet color it with opposite
                if(color[it]==-1){
                    color[it]=1-color[node];
                    q.add(it);
                }
                else if(color[it]==color[node]) return false;
            }
        }
return true;
    }



    public boolean check_dfs(int node , int col, int color[] ,  ArrayList<ArrayList<Integer>> adj ){

        color[node]=col;

        for(int it: adj.get(node)){
            if(color[it]==-1){
                if(check_dfs(it,1-col,color,adj)==false)  return false;
            }
            else if(color[it]==col) return false;
        }

        return true;
    }

    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int[] color = new int[V];
        for(int i=0; i<V;i++)color[i]=-1;

        //loop for components of graph
        for(int i =0; i<V;i++){

            if(color[i]==-1){
                if(check(i,color,adj)==false)return false;
            }
        }

return true;
    }
}

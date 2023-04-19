package Graph.qns;

import java.util.ArrayList;

public class DetectCycleDirected {



    public boolean dfs_check(int node , int[] vis, int[] pathVis ,ArrayList<ArrayList<Integer>> adj ) {

        vis[node]=1;
        pathVis[node]=1;

        for(int it : adj.get(node)){

            if(vis[it]==0){

                if(dfs_check(it,vis,pathVis,adj)==true) return true;
            }

            //if it's not visited and also  in path means  pathVisited than it's a cycle
            else if(pathVis[it]==1)return true;
        }

        pathVis[node]=0;  // on returning back make visited path 0 (not visited )
        return false;
    }


    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int[] vis = new int[V];
        int[] pathVis= new int[V];

        for(int i=0 ; i<V;i++){

            if(vis[i]==0){
                if(dfs_check(i,vis,pathVis,adj)==true) return true;
            }
        }
        return false;
    }
}

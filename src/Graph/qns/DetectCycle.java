package Graph.qns;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1

public class DetectCycle {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> grp = new ArrayList<>();


    }


    //using BFS

    public boolean checkForCycle(int src , int v , ArrayList<ArrayList<Integer>> grp , boolean[] vis){

        vis[src]=true;
        Queue<Pairs> q = new LinkedList<>();
        q.add(new Pairs(src,-1));

        while (!q.isEmpty()){
            int node = q.peek().node;
            int parent = q.peek().parent;
            q.poll();
            for(Integer it:grp.get(node)){
                if(vis[it]==false){
                    vis[it]=true;
                    q.add(new Pairs(it,node));
                }
                else if(parent!=it){
                    return true; // cycle detected { parent and node collides
                }
            }
        }
return false;
    }


    //using DFS
    public boolean dfs(int node , int parent , boolean[] vis, ArrayList<ArrayList<Integer>> grp){
        vis[node]=true;

        for (Integer it:grp.get(node)){
            if(!vis[it]){
                if(dfs(it,node,vis,grp)) return true;
            }
            else if(it!=parent) return true;  // this will break the recursion loop when cycle is detected;
        }

        return false; // when reaches to end and didn't find cycle
    }


    public boolean isCycle(int n ,ArrayList<ArrayList<Integer>> grp){
        boolean[] vis = new boolean[n];

        for(int i =0 ; i<n;i++){
            if(vis[i]==false){
                if(checkForCycle(i,n,grp,vis))return true;
            }
        }
        return false;
    }
}

class Pairs {
    int parent;
    int node;
    Pairs(int n , int p){
        this.parent=p;
        this.node=n;
    }
}

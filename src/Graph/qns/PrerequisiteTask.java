package Graph.qns;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrerequisiteTask {

    public boolean isPossible(int N, int[][] prerequisites)
    {
        // Your Code goes here

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<N;i++){
            adj.add(new ArrayList<>());
        }

        int m = prerequisites.length;
        for (int i=0; i<m;i++){
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }


        int indegree[] = new int[N];
        for (int i=0;i<N;i++){
            for(int it: adj.get(i)){
                indegree[it]++;
            }
        }

        Queue<Integer> q =new LinkedList<>();
        for (int i=0;i<N;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }

        List<Integer> topo = new ArrayList<>();

        while (!q.isEmpty()){
            int node=q.peek();
            q.remove();
            topo.add(node);


            for (int it: adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0) q.add(it);
            }
        }

        if(topo.size()==N)return true;

        return false;
    }
}

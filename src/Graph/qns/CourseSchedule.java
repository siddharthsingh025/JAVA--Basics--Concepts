package Graph.qns;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {
    static int[] findOrder(int N, int m, ArrayList<ArrayList<Integer>> prerequisites)
    {
        // add your code here


        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<N;i++){
            adj.add(new ArrayList<>());
        }

        for (int i=0; i<m;i++){
            adj.get(prerequisites.get(i).get(1)).add(prerequisites.get(i).get(0));
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

        int[] topo = new int[N];
        int i=0;
        while (!q.isEmpty()){
            int node=q.peek();
            q.remove();
            topo[i++]=node;


            for (int it: adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0) q.add(it);
            }
        }

        if(i==N)return topo;

        return new int[]{};
    }
}

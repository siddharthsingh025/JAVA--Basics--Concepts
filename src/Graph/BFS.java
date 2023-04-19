package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {



    public ArrayList<Integer> graphBFS(int n , ArrayList<ArrayList<Integer>> grp){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] vist = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        vist[0]=true;

        while (!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);


            for(Integer it:grp.get(node)){
                if(vist[it]==false){

                        vist[it]=true;
                        q.add(it);

                }
            }
        }
        return bfs;
    }
}

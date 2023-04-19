package Graph;

import java.util.ArrayList;

public class DFS {
    public ArrayList<Integer> graphDFS(int n , ArrayList<ArrayList<Integer>> grp){
        ArrayList<Integer> ls = new ArrayList<>();
        boolean[] vist = new boolean[n];
        vist[0]=true;
        dfs(0,vist,grp,ls);
        return ls;
    }

    public static void dfs(int node , boolean[] vist ,ArrayList<ArrayList<Integer>> grp ,ArrayList<Integer> ls ){
        vist[node]=true;
        ls.add(node);

        for(Integer it:grp.get(node)){

            if(vist[it]==false){
                dfs(it,vist,grp,ls);
            }
        }
    }
}

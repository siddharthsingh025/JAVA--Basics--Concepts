package trees.binaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import javax.management.Query;

public class TBview {

    static ArrayList<Integer> topView(node root){

        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer , Integer> map = new TreeMap<>();

        q.add(new Pair(0, root));
        while(!q.isEmpty())
        {
            Pair cur = q.poll();

            if(!map.containsKey(cur.hd))
            {
                    map.put(cur.hd, cur.Node.data);
            }

            if(cur.Node.lefNode!=null)
            {
                q.add(new Pair(cur.hd-1,cur.Node.lefNode));
            }

            if(cur.Node.riNode!=null)
            {
                q.add(new Pair(cur.hd+1, cur.Node.riNode));
            }

        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            ans.add(entry.getValue());
        }

        return ans;
        
    }





    
    static class Pair
{
    node Node;
    int hd;
    
    public Pair(int hd , node  Node)
    {
        this.Node = Node;
        this.hd = hd;
    }

}
    
}



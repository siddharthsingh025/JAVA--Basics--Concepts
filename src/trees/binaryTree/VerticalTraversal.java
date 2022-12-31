package trees.binaryTree;

import trees.binarySearchTree.Node;

import java.util.*;

public class VerticalTraversal {

    static ArrayList<Integer> verticalOrder (Node root) {
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        q.add(new Pair(0, root));
        while (!q.isEmpty()) {
            Pair cur = q.poll();
            if (map.containsKey(cur.hd)) {
                map.get(cur.hd).add(cur.node.data);
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(cur.node.data);
                map.put(cur.hd, temp);
            }
            if (cur.node.left != null) {
                q.add(new Pair(cur.hd - 1, cur.node.left));
            }

            if (cur.node.right != null) {
                q.add(new Pair(cur.hd + 1, cur.node.right));
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            ans.addAll(entry.getValue());
        }
        return ans;
    }
}


 class Pair
{
    Node node;
    int hd;

    public Pair(int hd , Node  Node)
    {
        this.node = Node;
        this.hd = hd;
    }

}

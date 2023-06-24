package Leetcode_QNS;

import trees.binarySearchTree.Node;

import java.util.*;


class Node2 {
    int data,hd;
    Node2 left;
    Node2 right;
    Node2() {}
    Node2(int val) {
        this.data = val;
    }
}


public class bottomView_BinaryTree {

    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node2 root)
    {
        // Code here
        ArrayList<Integer> ans = new ArrayList();
        if(root==null) return ans;

        Map<Integer , Integer > map = new TreeMap<>();
        Queue<Node2> q = new LinkedList<Node2>();
        root.hd=0;
        q.add(root);

        while(!q.isEmpty()){

            Node2 temp = q.remove();
            int hd = temp.hd;
            map.put(hd,temp.data);

            if(temp.left!=null){
                temp.left.hd=hd-1;
                q.add(temp.left);
            }

            if(temp.right!=null){
                temp.right.hd = hd+1;
                q.add(temp.right);
            }
        }


        for(Map.Entry<Integer, Integer> entry : map.entrySet()){

            ans.add(entry.getValue());

        }

        return ans;

    }



}



package Leetcode_QNS;

import trees.binarySearchTree.Node;

import java.util.ArrayList;

public class levelOrder_qns {

    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        // Your code here
        ArrayList<Integer> ls = new ArrayList();
        rec(root,ls,0);

        return ls;

    }

    void rec(Node node , ArrayList<Integer> ls , int lvl){

        if(node ==null){
            return;
        }

        if(ls.size()==lvl){
            ls.add(node.data);
        }

        rec(node.left,ls,lvl+1);
        rec(node.right,ls,lvl+1);

    }

}

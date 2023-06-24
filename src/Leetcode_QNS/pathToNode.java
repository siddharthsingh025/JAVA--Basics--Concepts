package Leetcode_QNS;

import trees.binarySearchTree.Node;

import java.util.ArrayList;

public class pathToNode {
    static boolean getPath3(Node root, ArrayList< Integer > arr, int x) {
        if (root == null)
            return false;
        arr.add(root.data);
        if (root.data == x)
            return true;

        // else check whether the required node lies
        // in the left subtree or right subtree of
        // the current node
        if (getPath3(root.left, arr, x) ||
                getPath3(root.right, arr, x))
            return true;

        // required node does not lie either in the
        // left or right subtree of the current node
        // Thus, remove current node's value from
        // 'arr' and then return false
        arr.remove(arr.size() - 1);
        return false;
    }
}

package trees.binarySearchTree;

public class SearchNode {

    boolean search(Node root, int x) {
        if(root == null) return false;
        if(root.data ==x) return true;
        if(root. data > x) {
            return search(root.left, x);
        }
        return search(root .right,x);
    }
}

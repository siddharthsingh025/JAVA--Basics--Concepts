package trees.binarySearchTree;

public class Node {

    public int data;
    public Node left;
    public Node right;

    public Node(int data) {

        this.data = data;
        left=right=null;
    }

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

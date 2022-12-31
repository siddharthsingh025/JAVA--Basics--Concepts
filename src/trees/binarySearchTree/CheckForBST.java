package trees.binarySearchTree;

public class CheckForBST {

    boolean isBSTUtil(Node node, int min, int max) {
        if (node == null)
            return true;

        if (node.data < min || node.data > max)
        return false;

        return (isBSTUtil(node.left, min, node.data - 1) && isBSTUtil(node.right, node.data + 1, max));
    }

    Node prev = null;
    boolean isBST(Node node) {
        if (node != null) {
            if (!isBST(node.left))
                return false;
            if (prev != null && node.data <= prev.data)
                return false;
            prev = node;
            return isBST(node.right);
        }
            return true;

        }
    }
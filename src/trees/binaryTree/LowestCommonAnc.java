package trees.binaryTree;

public class LowestCommonAnc {

    class Node{
        int data;
        Node left , right ;

        public Node(int data) {
            this.data = data;
          right=left=null;
        }
    }


//        //Function to return the lowest common ancestor in a Binary Tree.
//     static    Node lca(Node root, int n1, int n2)
//        {
//            if(root == null) return null;
//            if(root.data == n1 || root.data == n2) return root;
//            Node left = lca(root.left, n1, n2);
//            Node right = lca(root. right, n1, n2);
//            if(left == null) return right; if(right == null) return left;
//            return root;
//        }


        //for node i creat
    static    node lca(node root, int n1, int n2)
    {
        if(root == null) return null;  // if any of them does not contain any elements than return null
        if(root.data == n1 || root.data == n2) return root;  // if any of search left or right may found n1 or n2 so it has to go back from this point
        node left = lca(root.lefNode, n1, n2);
        node right = lca(root. riNode, n1, n2);
        if(left == null) return right; if(right == null) return left;  //if left or right any of them does not contain n1 or n2 and return as null means their opposite may contain both so return it
        return root;  // if both n1 and n2 are on both side of current node then means current node is their lowest ancs
    }
    }

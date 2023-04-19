package trees.binarySearchTree;

public class Deletion {

    public static Node deleteNode(Node root,int key)
    {
        if(root ==null) return root;

        if(key < root.data)
            root.left = deleteNode(root.left,key);
        else if (key > root.data)
            root.right = deleteNode(root.right,key);
        else
        {
            if(root.left==null) return root.right;

            else if(root.right==null)  return root.left;

            root.data = minValue(root.right);
            root.right = deleteNode(root.right, root.data);
        }
            return root;
    }

    static int minValue(Node node)
    {
        int min = node.data;
        while (node.left!=null)
        {
            min = node.left.data;
            node = node.left;
        }

        return min;
    }
}

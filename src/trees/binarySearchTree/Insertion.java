package trees.binarySearchTree;

public class Insertion {
    // Function to insert a node in a BST.
    Node insert(Node root, int key) {
        if(root == null) {
            return new Node(key);
        }
        if(root.data > key) {
            root. left = insert(root. left, key);
        } else if(root. data < key) {
            root.right = insert(root.right, key);
        }
        return root;
    }
    }

// class Solution {
//     public TreeNode insertIntoBST(TreeNode root, int val) {

//       TreeNode temp = new TreeNode(val);
//       TreeNode parent =null;
//       TreeNode cur = root;

//      while(cur!=null)
//      {
//          parent = cur;
//          if(val < cur.val)
//          {
//              cur = cur.left;
//          }
//          else if(val > cur.val)
//          {
//              cur = cur.right;
//          }
//      }

//      if(parent==null) return temp;

//      else if(val<parent.val)
//      {
//          parent.left = temp;
//      }

//      else if (val>parent.val)
//      {
//          parent.right = temp;
//      }

//      return root;
//     }
// }






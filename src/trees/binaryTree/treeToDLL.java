package trees.binaryTree;

import LinkedList.DoubleLL;

public class treeToDLL {
  static   node prev =null, Head=null;

   static void convertToOLL (node root) {

        if(root==null) return;
        convertToOLL(root.lefNode);
        if(prev ==null) Head =root;
        else
        {
            root.lefNode = prev;
            prev.riNode = root;
        }
        prev =root;

        convertToOLL(root.riNode);
    }

   static void displayDLL()
    {
        node cur =Head;
        while (cur!=null)
        {
            System.out.print(cur.data + " -> ");
            cur = cur.riNode;
        }
        System.out.println("END");

   }

}

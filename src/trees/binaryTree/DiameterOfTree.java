package trees.binaryTree;

public class DiameterOfTree {


    // UnOptimize solution O(N^2)
   static int diameter(node root)
    {
        if(root==null) return 0;

        int dl = diameter(root.lefNode);
        int dr = diameter(root.riNode);

        int cur = 1 + height(root.lefNode)+height(root.riNode);

        return Math.max(Math.max(dl,dr),cur);
    }


  static   int height(node Node)
    {
        if(Node==null) return 0;

        return 1+ Math.max(height(Node.lefNode),height(Node.riNode));
     }




     //Optimize Solution O(N)

    static int ans =0;
   static int diameter2(node root)
    {
        if(root==null) return 0;

        int dl = diameter(root.lefNode);
        int dr = diameter(root.riNode);

         ans= Math.max(ans,1+dl+dr);

        return 1+ Math.max(dl,dr);
    }
}

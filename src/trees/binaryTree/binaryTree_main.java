package trees.binaryTree;

import java.util.Scanner;

public class binaryTree_main {

    static Scanner in = new Scanner(System.in);

  static  node builTree(node root)
    {
        System.out.println("enter data for root : ");
        int data =  in.nextInt();
    
        root = new node(data);
        if(data==-1)
        {
            return null;
        }

        System.out.println("enter data for inserting in  left of "+ data + " :");
       root.lefNode = builTree(root.lefNode);

       System.out.println("enter data for inserting in  right of "+ data + " :");
       root.riNode = builTree(root.riNode);
        
       return root;
    }

    

public static void main(String[] args) {

    node root =null;

    root = builTree(root);

     //2 4 7 -1 -1 -1 1 8 -1 -1 3 -1 -1       (input)

    System.out.println("printing....................................");
    System.out.println("");
   

    //levelOrderTraversal

    levelOrderTV.levelOrderTr(root,2);

    System.out.println("");
    System.out.println("printing....................................");
    System.out.println("");

    levelOrderTV.levelOrderTr2(root);

    System.out.println("");
    System.out.println("printing....................................");
    System.out.println("");


   levelOrderTV. levelOrderTr3(root);
    


   //leftView

//    System.out.println("");
//    System.out.println("printing....................................");
//    System.out.println("");
//
//    LRview.printView(root);

    System.out.println("");
    System.out.println("printing....................................");
    System.out.println("");
    System.out.println(LowestCommonAnc.lca(root,7,3).data);
    

}



  }
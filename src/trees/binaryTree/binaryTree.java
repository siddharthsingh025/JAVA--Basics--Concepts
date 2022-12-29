package trees.binaryTree;

import java.util.Scanner;

/**
 * binaryTree
 */
public class binaryTree {

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

        System.out.println("printing....................................");
        System.out.println("");
        System.out.println("");

        inOrderTrv(root);

        System.out.println("");
        preOrderTrv(root);

        System.out.println("");
        postOrderTrv(root);

        System.out.println("" );
        System.out.println( heightOfTree(root));
       

    }

    //2 4 7 -1 -1 -1 1 8 -1 -1 3 -1 -1       (input)


    // InOrder traversal   (L N R)

static void inOrderTrv(node root)
{
    if(root ==null) return;

    inOrderTrv(root.lefNode);
    System.out.print(root.data + " " );  
    inOrderTrv(root.riNode);
}


// preOrder traversal   ( N L R)

static void preOrderTrv(node root)
{
    if(root ==null) return;

    System.out.print(root.data + " " );  
    preOrderTrv(root.lefNode);
    preOrderTrv(root.riNode);
}


// postOrder traversal   (L R N)

static void postOrderTrv(node root)
{
    if(root ==null) return;

    postOrderTrv(root.lefNode);
    postOrderTrv(root.riNode);
    System.out.print(root.data + " " );  
}

//find height of the B.T

static int heightOfTree(node root)
{
    if(root==null) return 0;

    return Math.max(heightOfTree(root.lefNode), heightOfTree(root.riNode))+1;

}

}





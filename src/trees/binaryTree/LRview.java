package trees.binaryTree;

import java.util.ArrayList;

import trees.binaryTree.node;

public class LRview {


public static void printView(node root)
{
    ArrayList<node> list1 = new ArrayList<>();

    ArrayList<node> list2 = new ArrayList<>();

    

    printLeftView(root,list1,0);

    for(node curNode:list1)
{
   System.out.print(curNode.data + "");  

}

System.out.println();

// printRightView(root,list2,0);

//     for(node curNode:list1)
// {
//    System.out.print(curNode.data + "");  
// }

}





// static void printRightView(node root, ArrayList<node> list2, int l) {

//     if(root==null) return;

    
//     if(list2.get(l)==null) list2.add(root);

//     printLeftView(root.riNode, list2, l+1);
//     printLeftView(root.lefNode, list2, l+1);
   
// }




static void printLeftView(node root, ArrayList<node> list1, int l) {

    if(root==null) return;
    
    if(list1.get(l)==null) list1.set(l, root);

    printLeftView(root.lefNode, list1, l+1);
    printLeftView(root.riNode, list1, l+1);
}
    
}

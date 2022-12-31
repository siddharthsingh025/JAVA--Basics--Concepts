package trees.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTV {
    //Level order traversal - 2 Approches 
 /* 
     i) take level variable and reduce it till you reches to our particular level and then print this data
          O(n^2)
    ii) use queue dataStructure  
          O(n)      
  */


  //1st approche {O(N^2)}

static void levelOrderTr(node root, int level)
{
    if(root == null) return;

    if(level==1) System.out.print( root.data+"");

   else if(level>=2)
    {
        levelOrderTr(root.lefNode, level-1);
        levelOrderTr(root.riNode, level-1);
    }
}
    





  //2st approche  {O(N)}

  static void levelOrderTr2(node root)
  {
     Queue<node> queue = new LinkedList<>();
    

     queue.add(root);

     while(!queue.isEmpty())
     {
        node curNode = queue.poll();
        System.out.print(curNode.data+ "");

        if(curNode.lefNode!=null)
        {
            queue.add(curNode.lefNode);
        }
        if(curNode.riNode!=null)
        {
            queue.add(curNode.riNode);
        }
     }
  }


  //2st approche  with nextline order {O(N)}

  static void levelOrderTr3(node root)
  {
     Queue<node> queue = new LinkedList<>();

     queue.add(root);
     queue.add(null);

     while(!queue.isEmpty())
     {
        node curNode = queue.poll();

        if(curNode==null) 
        {

          if(queue.isEmpty()) return;

         queue.add(null);
         System.out.println();
         continue;
        }

        System.out.print(curNode.data+ "");

        if(curNode.lefNode!=null)
        {
            queue.add(curNode.lefNode);
        }
        if(curNode.riNode!=null)
        {
            queue.add(curNode.riNode);
        }
     }
  }
      
    
}

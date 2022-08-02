package LinkedList;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class qns1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(4);
        list.insertLast(4);
        list.display();
        list.removeDuplicates();
        list.display();

    }
}


// solution code
/*
  +++++++++ remove duplicates++++++++++++

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
         ListNode node = head;

          if(node==null)
        {
            return node;
        }

     while (node.next!=null)
     {

         if(node.val == node.next.val)
         {
             node.next = node.next.next;
         }
         else
         {
             node = node.next;
         }
     }

        return head;
    }
}
 */


package LinkedList;
import LinkedList.LinkedList.Node;

//https://leetcode.com/problems/merge-two-sorted-lists/
public class qns2 {

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insertLast(4);
        list1.insertLast(6);
        list1.insertLast(10);
        list1.insertLast(14);
        list1.insertLast(17);

        System.out.println(" LIST 1");

        list1.display();
        System.out.println(" ");

        LinkedList list2 = new LinkedList();
        list2.insertLast(4);
        list2.insertLast(5);
        list2.insertLast(7);
        list2.insertLast(12);
        list2.insertLast(15);
        list2.insertLast(19);
        System.out.println(" LIST 2");
        list2.display();
        System.out.println(" AFTER MERGING");

        LinkedList ans = mergeTwoList(list1,list2);
        ans.display();
    }

    //qns2
    //merge two list ++ sorted

   static public LinkedList mergeTwoList(LinkedList l1 , LinkedList l2)
    {
       Node f = l1.head;
      Node s = l2.head;

        LinkedList list = new LinkedList();

        while (f!=null && s!=null)
        {

            if(f.Value < s.Value)
            {
                list.insertLast(f.Value);
                f = f.next;
            }
            else {
                list.insertLast(s.Value);
                s = s.next;
            }
        }

        while (f!=null)
        {
            list.insertLast(f.Value);
            f=f.next;
        }

        while (s!=null)
        {
            list.insertLast(s.Value);
            s=s.next;
        }

        return list;
    }

}


//class Solution {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//
//
//        ListNode f = list1;
//      ListNode s = list2;
//
//        ListNode list = new ListNode();
//
//        ListNode tail = list;
//
//        while (f!=null && s!=null)
//        {
//
//            if(f.val < s.val)
//            {
//
//                tail.next = f;
//                f = f.next;
//                tail = tail.next;
//
//            }
//            else {
//                 tail.next = s;
//                s = s.next;
//                tail = tail.next;;
//            }
//        }
//
//        tail.next = (s!=null)?s:f;
//        return list.next;
//
//    }
//
//
//}

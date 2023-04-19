package LinkedList;
//https://leetcode.com/problems/linked-list-cycle/
public class qns3 {

    public boolean hasCycle(ListNode head) {

        ListNode f = head;
        ListNode s = head;

        while(f!=null && f.next !=null)
        {
            f=f.next.next;
            s=s.next;

            if(f==s)
            {
                return true;
            }
        }

        return false;
    }


    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}

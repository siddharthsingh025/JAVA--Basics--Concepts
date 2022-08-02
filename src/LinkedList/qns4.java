package LinkedList;


// Find length of cycle
public class qns4 {

    public int hasCycle(List_Node head) {

       List_Node f = head;
     List_Node s = head;

        while(f!=null && f.next !=null)
        {
            f=f.next.next;
            s=s.next;

            if(f==s)
            {
              List_Node temp = s;
                int length=0;
              do{
                  temp = s.next;
                  length++;
              }while (temp!= s);

                  return length;
            }
        }

        return 0;
    }


    class List_Node {
        int val;
        List_Node next;
        List_Node(int x) {
            val = x;
            next = null;
        }
    }
}

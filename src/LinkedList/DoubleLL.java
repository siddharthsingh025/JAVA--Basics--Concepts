package LinkedList;

public class DoubleLL {
   private Node head;
   private Node tail;
  private   int size=0;

    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next =head;
        node.prev=null;
        if(head!=null){
            head.prev =node;
        }

        head = node;
        size++;
    }


    public void insertLast(int val)
    {
        Node node = new Node(val);
        Node last = head;

        node.next=null;

        if(head==null)
        {
            node.prev=null;
            head =node;
            return;
        }

        while (last.next!=null)
        {
            last=last.next;
        }
        last.next =node;
        node.prev =last;

    }


    public void insertAfter(int val , int after)
    {
        Node p = find(after);

        if(p==null)
        {
            System.out.println("Does not exist");
            return;
        }

        Node node = new Node(val);

        node.next = p.next;
        p.next =node;
        node.prev =p;
        if(node.next!=null)
        {
            node.next.prev = node;
        }
    }





    public Node find(int val)
    {
     Node node = head;
        while (node!=null)
        {
            if(node.val==val)
            {
                return node;
            }
            node=node.next;
        }

        return null;
    }



    public  void display()
    {
        Node temp = head;
        while (temp!=null)
        {
            System.out.print(temp.val + " -> ");
            tail = temp;
            temp= temp.next;

        }
        System.out.println("END");
    }

    public  void displayRev()
    {
        Node temp = tail;
        while (temp!=null)
        {
            System.out.print(temp.val + " -> ");
            temp= temp.prev;
        }
        System.out.println("START ");
    }

   private  class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

}

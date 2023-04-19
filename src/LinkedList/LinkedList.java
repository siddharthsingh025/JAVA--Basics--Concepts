package LinkedList;

public class LinkedList {

    public Node head;
    private Node tail;

    private int size;

    public LinkedList() {

        this.size =0;
    }


public void insertFirst(int val){

        Node node = new Node(val);
        node.next = head;
        head=node;

        if(tail==null){
            tail=head;
        }

        size += 1;
}



public void insertLast(int val)
{

    if(tail==null)
    {
        insertFirst(val);
        return;
    }
    Node node = new Node(val);
    tail.next = node;
    tail=node;
    size++;
}




public void insert(int val , int index){



        if(index==0)
        {
            insertFirst(val);
            return;
        }

        if(index==size)
        {
            insertLast(val);
            return;
        }
    Node temp = head;

    for (int i = 1; i <index; i++) {

        temp = temp.next;
    }
    Node node = new Node(val , temp.next);
    temp.next =node;

    size++;
}

public Node get(int index)
{
    Node node = head;

    for (int i = 0; i < index; i++) {

        node=node.next;
    }

    return node;
}

public int deleteLast(){

        if(size<=1)
        {
            deleteFirst();
        }

        Node secondLast = get(size-2);
    int val = tail.Value;
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
}



public int  deleteFirst()
{
    int val = head.Value;
    head= head.next;

    if(head==null)
    {
     tail=null;
    }
    size--;

    return val;
}


public int delete(int index)
{

    if(index==0){
        return deleteFirst();
    }
    if(index==size-1)
    {
        return  deleteLast();
    }
    Node pre = get(index-1);
    int val = pre.next.Value;
    pre.next = pre.next.next;

    size--;

    return val;
}

public Node find(int val)
{
    Node node = head;
    while (node!=null)
    {
        if(node.Value==val)
        {
            return node;
        }
        node=node.next;
    }

    return null;
}





//insertion using recursion

    public void insertRec(int val , int index){

        head = insertRec(val,index,head);
    }

    //2nd method recursion
    private Node insertRec(int val , int index , Node node)
    {

        if(index==0)
        {
            Node nodeNew =  new Node(val,node);
            size++;
             return nodeNew;
        }

        node.next = insertRec(val,--index,node.next);

        return node;
    }



public void display(){

        Node temp = head;
        while (temp!=null)
        {
            System.out.print(temp.Value + " -> ");
            temp = temp.next;
        }

    System.out.println("END");
}


    public class Node{
        public int Value;
        public Node next;


        public Node(int value) {
            Value = value;
        }

        public Node(int value, Node next) {
            Value = value;
            this.next = next;
        }

    }




    // qns1

    // remove duplicates

    public void removeDuplicates()
    {
     Node node = head;
     while (node.next!=null)
     {

         if(node.Value == node.next.Value)
         {
             node.next = node.next.next;
             size--;
         }
         else
         {
             node = node.next;
         }
     }
     tail = node;
     tail.next =null;

    }



}

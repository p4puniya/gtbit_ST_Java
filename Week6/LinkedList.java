package Week6;

public class LinkedList {
    class Node{
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;
    //TC: O(1)
    public void addFirst(int item){
        Node nn= new Node();
        nn.data= item;
        if(size==0){
            head= nn;
            tail= nn;
        }else{
            nn.next= head;
            head= nn;
        }size++;
    }
    //Add element to the end: O(1)
    public void addLast(int item){
        if(size==0)
            addFirst(item);
        else{
            Node nn= new Node();
            nn.data= item;
            tail.next= nn;
            tail= nn;
            size++;
        }
    }

    //Function to get a node
    public Node getNode(int index){
        Node temp = head;
        for(int i=0;i<index;i++)
            temp= temp.next;
        return temp;
    }

    public void addAtIndex(int item, int index){
        if(index==0)
            addFirst(item);
        else if(index==size)
            addLast(item);
        else{
            Node nn= new Node();
            nn.data= item;
            Node k_1th= getNode(index-1);
            nn.next= k_1th.next;
            k_1th.next= nn;
            size++;
        }
    }

    public int getStart(){
        return head.data;
    }

    public int getEnd(){
        return tail.data;
    }

    public int getIndex(int index){
        if(index==0)
            return getStart();
        else if(index==size-1)
            return getEnd();
        else{
            return getNode(index).data;
        }
    }

    //Remove from start: 
    public int removeFirst(){
        int rn= head.data;
        if(size==1){
            head=null;
            tail=null;
        }else{
            Node temp= head;
            head= head.next;
            temp.next= null;
        }
        size--;
        return rn;
    }

    //Remove from end
    public int removeEnd(){
        if(size==1)
            return removeFirst();
        else{
            int rn= tail.data;
            Node sl= getNode(size-2);
            sl.next= null;
            tail= sl;
            size--;
            return rn;
        }
    }

    //Remove at index
    public int removeIndex(int index){
        if(index==0)
            return removeFirst();
        else if(index==size-1)
            return removeEnd();
        else{
            Node k_1th= getNode(index-1);
            Node temp= k_1th.next;
            k_1th.next= temp.next;
            temp.next=null;
            size--;
            return temp.data;
        }
    }

    //Display
    public void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp= temp.next;
        }
        System.out.println("Null");
    }

    public int size(){
        return size;
    }
}

package LinkedList;

public class DoublyLL {
    private Node head;
    private int size;
    public DoublyLL(){
        this.size=0;
    }


    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }
    public void insertLast(int val){
        Node node=new Node(val);
        if(head==null){
            node.prev=null;
            head=node;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=node;
        node.prev=temp;
        node.next=null;


    }

    public Node find(int value){
        Node node=head;
        while (node!=null){
            if(node.value==value){

                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void insert(int after,int val){
        Node p=find(after);
        if(p==null){
            System.out.println("Node doesn't exist");
            return;
        }
        Node node=new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){
            node.next.prev=node;
        }
    }

    public void display(){
        Node node=head;
        Node last=null;
        while(node!=null){
            System.out.print(node.value+"-->");
            last=node;
            node=node.next;
        }
        System.out.println("END");
        System.out.println("Print in reverse");
        while(last!=null){
            System.out.print(last.value+"--->");
            last=last.prev;
        }
        System.out.println("START");
    }



    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next,Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
}

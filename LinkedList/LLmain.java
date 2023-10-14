package LinkedList;

public class LLmain {

    public static void main(String[] args) {
        LL list =new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(23);
        list.insert(30,4);
        list.display();
        list.deleteFirst();
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        System.out.println(list.find(8));
        list.insertRec(99,1);
        list.display();

//        DoublyLL list=new DoublyLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(30);
//        list.insert(8,65);
//        list.display();

//        CLL list=new CLL();
//        list.insert(23);
//        list.insert(3);
//        list.insert(19);
//        list.insert(75);
//        list.display();
//        list.delete(75);
//        list.display();

    }
}

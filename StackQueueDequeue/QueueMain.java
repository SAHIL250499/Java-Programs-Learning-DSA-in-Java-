package StackQueueDequeue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue=new CircularQueue(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);

        queue.display();
        System.out.println(queue.remove());
        queue.insert(80);
        System.out.println(queue.insert(99));
        queue.display();
    }
}

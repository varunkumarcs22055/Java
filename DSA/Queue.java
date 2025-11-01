class QueueImplementation {
    int Queue[] = new int[5];
    int size = 0;
    int front = 0;
    int rear = 0;
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        Queue[rear] = data;
        rear = (rear + 1) % Queue.length;
        size = size + 1;
        
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int data = Queue[front];
        front = (front + 1) % Queue.length;
        size = size - 1;
        return data;
    }

    public void show(){
        for(int i=front,j=0;j<size;j++,i=(i+1)%Queue.length){
            System.out.print(Queue[i] + " ");
        }
        System.out.println();
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == Queue.length;
    }
}

public class Queue {
    public static void main(String args[]){
        QueueImplementation queue = new QueueImplementation();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.show();
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        queue.show();
        queue.enqueue(60);
        queue.enqueue(70);
        queue.show();
    }
}

class Node{
    int data;
    Node next;
}

class LL{
    Node head;
    //methods to manipulate linked list can be added here
    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next != null){
                n= n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(index == 0){
            insertAtStart(data);
        }
        else{
        Node n = head;
        for(int i=0;i<index-1;i++){
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
      }
    }

    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
            return;
        }
        Node n = head;
        for(int i=0;i<index-1;i++){
            n = n.next;
        }
        n.next = n.next.next;
    }

    public void display() {
        Node n = head;
        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

}


public class LinkedList {
    public static void main(String[] args) {
        System.out.println("This is LinkedList file.");
        LL list = new LL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insertAtStart(5);
        list.insertAt(2,15);
        list.display();
        list.deleteAt(3);
        System.out.println();
        list.display();
    }
}

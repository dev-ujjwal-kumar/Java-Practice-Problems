package org.example;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedListOperation{
    public Node head = null;
    public Node tail = null;
    public void insertNode(int data){
        System.out.println("Adding "+ data +" to end of list");
        Node newNode = new Node(data);

        //inserting 1st element
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }

        //if nodes are already present
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int listLength(){
        Node curr = head;
        int len = 0;
        while(curr != null){
            len++;
            curr = curr.next;
        }
        return len;
    }
    public void insertAtPosition(int data, int pos){
        Node newNode = new Node(data);
        Node curr = head;
        Node prev = null;
        int length = listLength();

        if(pos < 0 || length+2 < pos){
            System.out.println("Invalid position");
            return;
        }

        if(pos == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
        else if(pos == length+1){
            tail.next = newNode;
            newNode.next = null;
            return;
        }
        while(pos-1 != 0){
            prev = curr;
            curr = curr.next;
            pos--;
        }
        prev.next = newNode;
        newNode.next = curr;
    }

    public void printList(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
public class LinkedList {
    public static void main(String[] args){
        LinkedListOperation linkedListOperation = new LinkedListOperation();
        linkedListOperation.insertNode(1);
        linkedListOperation.printList();

        linkedListOperation.insertNode(2);
        linkedListOperation.insertNode(3);
        linkedListOperation.printList();

        linkedListOperation.insertAtPosition(20, 1);
        linkedListOperation.printList();

        linkedListOperation.insertAtPosition(30, 4);
        linkedListOperation.printList();

        linkedListOperation.insertAtPosition(20, 6);
        linkedListOperation.printList();
    }
}

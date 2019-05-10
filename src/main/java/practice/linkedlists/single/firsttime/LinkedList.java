package practice.linkedlists.single.firsttime;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class LinkedList {
    Node root;

    LinkedList() {
        root = null;
    }

    public void createRoot(int a) {
        this.root = new Node(10, null);
    }

    public void addNode(int a) {
        Node pointer = root;
        while (pointer.next != null) {
            pointer = pointer.next;
        }
        pointer.next = new Node(a, null);
    }

    public void deleteNodeAt(int pos) {
        if (pos < 0) {
            System.out.println("position should be a positive number");
        } else if (pos == 0) {
            Node pointer = root;
            root = pointer.next;
        } else {
            Node pointer = root;
            Node previous = null;

            for (int i = 0; i < pos; i++) {
                previous = pointer;
                pointer = pointer.next;
            }
            previous.next = pointer.next;
        }
    }

    public void reverse() {
        Node previous = null;
        Node pointer = root;
        Node temp = new Node(0, null);
        while (pointer.next != null) {
            temp = pointer.next;
            pointer.next = previous;
            previous = pointer;
            pointer = temp;
        }
        pointer.next = previous;
        root = pointer;
    }

    public void recursiveReverse() {
        Node pointer = root;
        Node previous = null;
        Node temp = null;

        recursive(pointer, previous, temp);
    }

    public void recursive (Node pointer, Node previous, Node temp){
        if (pointer.next == null) {
            pointer.next = previous;
            root = pointer;
        } else {
            temp = pointer.next;
            pointer.next = previous;
            previous = pointer;
            pointer = temp;
            recursive(pointer, previous, temp);
        }
    }

    public void display() {
        Node pointer = root;
        if (pointer == null) {
            System.out.println("linked list is empty");
        } else {
            while (pointer != null) {
                System.out.println(pointer.a);
                pointer = pointer.next;
            }
        }
    }
}

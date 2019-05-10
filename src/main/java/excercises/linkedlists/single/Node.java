package excercises.linkedlists.single;

import java.util.ArrayList;

public class Node {
    int data;
    Node link = null;

    public Node(int d) {
        this.data = d;
        this.link = null;
    }

    public void addNewNode(Node n) {
        Node position = this;

        while (position.link != null) {
            position = position.link;
        }

        position.link = n;
    }

    public Node getLastNode() {
        Node position = this;

        while (position.link != null) {
            position = position.link;
        }
        return position;
    }

    public Node getNodeAt(int pos) {
        Node position = this;

        for (int i = 0; i < pos; i++) {
            position = position.link;
        }
        return position;
    }

    public void printNodeTree() {
        Node position = this;

        while (position.link != null) {
            System.out.println(position.data);
            position = position.link;
        }
        System.out.println(position.data);
    }

    @Override
    public String toString() {
        return "[" + this.data + ", " + this.link + "]";
    }

    public Node reverse(Node node) {

        Node previous = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.link;
            current.link = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}

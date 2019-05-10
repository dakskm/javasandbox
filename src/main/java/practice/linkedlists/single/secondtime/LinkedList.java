package practice.linkedlists.single.secondtime;

public class LinkedList {
    Node root = null;

    public LinkedList(int i) {

        root = new Node(i, null);
    }

    void addNode(int i) {
        Node pointer = root;

        while (pointer.next != null) {
            pointer = pointer.next;
        }
        pointer.next = new Node(i, null);
    }

    int getSize() {
        int i = 0;
        Node pointer = root;

        while (pointer.next != null) {
            i++;
            pointer = pointer.next;
        }

        return i + 1;
    }

    void deleteNodeAt(int pos) {
        int size = this.getSize();

        if (pos > 0 && pos <= size) {
            if (pos == 1) {
                if (root.next != null) {
                    root = root.next;
                }
            } else {
                Node previous;
                Node pointer = root;
                for (int i = 2; i < pos; i++) {
                    pointer = pointer.next;
                }
                previous = pointer;
                pointer = pointer.next;
                previous.next = pointer.next;
            }
        } else {
            System.out.println("deletion is out of range");
        }
    }

    public void reverse() {
        Node previous = null;
        Node pointer = root;
        Node temp = null;

        while (pointer.next != null) {
            temp = previous;
            previous = pointer;
            pointer = pointer.next;
            previous.next = temp;
        }
        temp = previous;
        previous = pointer;
        previous.next = temp;
        root = previous;
    }

    public void recurReverse() {
        Node previous = null;
        Node pointer = root;
        Node temp = null;

        rev(previous, pointer, temp);
    }

    public void rev(Node previous, Node pointer, Node temp) {
        if(pointer.next==null) {
            temp = previous;
            previous = pointer;
            previous.next = temp;
            root = previous;
        } else {
            temp = previous;
            previous = pointer;
            pointer = pointer.next;
            previous.next = temp;
            rev(previous, pointer, temp);
        }
    }

    public void display() {
        Node pointer = root;
        while (pointer != null) {
            System.out.print("[" + pointer.i + "] ");
//            System.out.print("[" + pointer.i + "," + pointer.next + "] ");
            pointer = pointer.next;
        }
        System.out.println();
    }

}

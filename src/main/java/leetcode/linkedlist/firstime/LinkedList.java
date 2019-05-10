package leetcode.linkedlist.firstime;

public class LinkedList {
  Node root;

  LinkedList(int x) {
    Node n = new Node(x);
    n.next = null;
    root = n;
  }

  public void addNode(int x) {
    Node pointer = root;

    while (pointer.next != null) {
      pointer = pointer.next;
    }
    pointer.next = new Node(x);
  }

  public void display() {
    Node pointer = root;

    if (root != null) {
      System.out.print("[");
      while (pointer.next != null) {
        System.out.print(pointer.x + " ");
        pointer = pointer.next;
      }
      System.out.print(pointer.x + "]");
      System.out.println();
    } else {
      System.out.println("linked list is empty");
    }
  }

  public int getNodeCount() {
    Node pointer = root;
    int count = 0;

    while (pointer.next != null) {
      count++;
      pointer = pointer.next;
    }
    return count + 1;
  }

  public void deleteNodeAt(int pos) {
    Node pointer = root;
    int nodeCount = getNodeCount();

    if (pos == 1) {
      if (nodeCount == 1) {
        root = null;
      } else if (nodeCount > 1) {
        root = pointer.next;
      }
    } else if (pos > 1 && pos <= nodeCount) {
      for (int i = 1; i < pos - 1; i++) {
        if (pointer.next != null)
          pointer = pointer.next;
      }
      if (pos < nodeCount)
        pointer.next = pointer.next.next;
      else
        pointer.next = null;
    }
  }
}

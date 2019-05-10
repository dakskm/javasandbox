package leetcode.linkedlist.firstime;

public class LinkedListTest {
  public static void main(String args[]) {
    LinkedList l1 = new LinkedList(1);

    l1.addNode(2);
    l1.addNode(3);
    l1.addNode(4);
    l1.addNode(5);

    l1.display();

    int nodeCount = l1.getNodeCount();
    int deleteFromLast = 2;

    System.out.println(l1.getNodeCount());

    l1.deleteNodeAt(2);
    l1.display();

    l1.deleteNodeAt(4);
    l1.display();

    l1.deleteNodeAt(1);
    l1.display();

    l1.deleteNodeAt(1);
    l1.display();

    l1.deleteNodeAt(1);
    l1.display();
  }
}

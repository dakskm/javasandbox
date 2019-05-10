package excercises.linkedlists.single;

public class SimpleLinkedList {
    public static void main(String args[]) {
        Node tree = new Node(10);

        Node node1 = new Node(20);
        tree.addNewNode(node1);

        Node node2 = new Node(30);
        tree.addNewNode(node2);

        Node node3 = new Node(40);
        tree.addNewNode(node3);

        tree.printNodeTree();

        tree = tree.reverse(tree);

        tree.printNodeTree();
    }
}


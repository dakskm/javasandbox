package practice.linkedlists.single.firsttime;

public class LinkedListTest {
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();

        ll.createRoot(10);
        ll.addNode(20);
        ll.addNode(30);
        ll.addNode(40);

        System.out.println("original");
        ll.display();

//        ll.reverse();
//        System.out.println("reverse first time");
//        ll.display();
//
//        ll.reverse();
//        System.out.println("reverse second time");
//        ll.display();

        ll.recursiveReverse();
        System.out.println("recursiveReverse first time");
        ll.display();
    }
}

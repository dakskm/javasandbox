package practice.linkedlists.single.secondtime;

public class LinkedListTest {
    public static void main(String args[]) {
        LinkedList l1 = new LinkedList(10);

//        System.out.println(l1.getSize());
//        l1.display();

        l1.addNode(20);
//        l1.display();
//        System.out.println(l1.getSize());

        l1.addNode(30);
        l1.addNode(40);
        l1.display();
        System.out.println(l1.getSize());

//        l1.deleteNodeAt(4);
        l1.reverse();
        l1.display();

        l1.recurReverse();
        l1.display();
    }

}

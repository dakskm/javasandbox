package excercises.queue;

public class QueueClass {

    int size;
    static String elements[];

    static int pos = 0;
    static int st = 0;

    QueueClass(int size) {
        this.size = size;
        elements = new String[size];
    }

    int positionCheck(int index) {
        if (index >= size)
            return 0;
        else
            return index;
    }

    void push(String element) {
        if (pos <= size - 1 && elements[pos] == null) {
            System.out.println("pushing: " + element);
            elements[pos] = element;
            pos++;
            pos = positionCheck(pos);
        } else {
            System.out.println("queue is full");
        }
    }

    void pop() {

        String temp;

        if(elements[st]!=null) {
            temp = elements[st];
            elements[st] = null;
            st++;
            st = positionCheck(st);
        } else {
            temp= "queue is empty";
        }

        System.out.println(temp);
    }

    void getSt() {
        System.out.println("st: " + st);
    }

    void getPos() {
        System.out.println("pos: " + pos);
    }

    void printArray() {
        System.out.println("st: " + st);
        System.out.println("pos: " + pos);

        for(String element: elements) {
            System.out.print(element + "\t");
        }

        System.out.println("\n");
    }
}

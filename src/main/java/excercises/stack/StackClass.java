package excercises.stack;

public class StackClass {

    int size;
    String elements[];
    static int pos = -1;

    StackClass(int size) {
        this.size = size;
        elements = new String[size];
    }

    void push(String str) {
        if (pos < size - 1) {
            System.out.println("pushing to array: " + str);
            elements[++pos] = str;
        } else
            System.out.println("array is full");
    }

    void pop() {
        if (pos > -1) {
            String temp = elements[pos];
            elements[pos] = null;
            pos--;
            System.out.println(temp);
        } else {
            System.out.println("array is empty");
        }
    }

    void currentPosition() {
        System.out.println("current position: " + pos);
    }

    void printArray() {
        System.out.println("------------");
        for(String element: elements) {
            System.out.println(element);
        }
        System.out.println("------------");
    }
}

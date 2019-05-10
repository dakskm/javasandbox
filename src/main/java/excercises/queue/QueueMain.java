package excercises.queue;

public class QueueMain {
    public static void main(String args[]) {
        QueueClass q1 = new QueueClass(3);

        q1.pop();
        q1.printArray();

        q1.push("1");
        q1.printArray();

        q1.push("2");
        q1.printArray();

        q1.push("3");
        q1.printArray();

        q1.push("extra");
        q1.printArray();

        q1.pop();
        q1.printArray();

        q1.push("4");
        q1.printArray();

        q1.pop();
        q1.printArray();

        q1.push("5");
        q1.printArray();

        q1.pop();
        q1.printArray();

        q1.push("6");
        q1.printArray();

        q1.pop();
        q1.printArray();

        q1.pop();
        q1.printArray();

        q1.pop();
        q1.printArray();

        q1.pop();
        q1.printArray();

    }
}

package multithreading.threadexample;

public class MutithreadMain {
    public static void main(String args[]) {
        int threadCount = 8;

        for(int i=0;i<threadCount;i++) {
            MultithreadingDemo threads = new MultithreadingDemo();
            threads.start();
        }
    }
}

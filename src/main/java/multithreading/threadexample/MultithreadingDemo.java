package multithreading.threadexample;

public class MultithreadingDemo extends Thread {
    public void run() {
        try {
            System.out.printf("Thread count is %d ", Thread.activeCount());
            System.out.printf("Thread %d is running ", Thread.currentThread().getId());
            System.out.println();
            Thread.sleep(50000);
        } catch (Exception e) {
            System.out.println("exception occurred " + e.getMessage());
        }
    }
}

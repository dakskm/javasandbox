package multithreading.runnableexample;

public class MutithreadingDemo implements Runnable {
    public void run() {
        try {
            System.out.println("Thread id : " + Thread.currentThread().getId());
        } catch (Exception e) {
            System.out.println("Exception " + e.getMessage());
        }
    }
}

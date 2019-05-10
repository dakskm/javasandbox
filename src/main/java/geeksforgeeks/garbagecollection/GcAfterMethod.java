package geeksforgeeks.garbagecollection;

public class GcAfterMethod {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("I'm from main");
        m1();
        System.gc();
        Thread.sleep(2000);
        System.out.println("I'm end of main");
    }

    @Override
    public void finalize() {
        System.out.println("I'm finalize");
    }

    static void m1() {
        /**
         * Since t1 and t2 are local objects of m1() method,
         * so they become eligible for garbage collection after
         * complete execution of method unless any of them is returned.
         */
        GcAfterMethod g1 = new GcAfterMethod();
        GcAfterMethod g2 = new GcAfterMethod();
    }
}

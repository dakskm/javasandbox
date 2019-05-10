/**
 * This program describes how garbage collection works
 */

package geeksforgeeks.garbagecollection;

public class FinalizeOverride {
    public static void main(String[] args) throws InterruptedException {
        FinalizeOverride t1 = new FinalizeOverride();

        //object initialized to null, ready for gc
        t1 = null;

        //calling garbage collector
        System.gc();

        //giving
        Thread.sleep(1000);

        System.out.println("end of main");
    }

    public void display() {
        System.out.println("I'm test object: " + this.toString() + " " + this.hashCode());
    }

    protected void finalize() {
        System.out.println("Test obj finalize calleds " + this.toString() + " " + this.hashCode());
    }
}

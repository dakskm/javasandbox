package practice.callbyref.example2;

public class CallByRefArrayTest {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3};

        update(arr);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }

    static void update(int[] arr) {
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
    }
}

package practice.febonacci;

public class FebonacciTest2 {
  public static void main(String args[]) {
    int i = febo(11);
    System.out.println(i);

    printFebos(0, 1, 100);
  }

  static int febo(int n) {
//    System.out.print(n + " ");
    if (n <= 1) return n;
    else {
      return febo(n - 1) + febo(n - 2);
    }
  }

  static void printFebos(int a, int b, int n) {
      int sum = a + b;
      if(sum <= n) {
          System.out.print(sum + " ");
          printFebos(b, sum, n);
      }
  }
}

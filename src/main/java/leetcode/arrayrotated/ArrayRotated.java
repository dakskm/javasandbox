package leetcode.arrayrotated;

public class ArrayRotated {
  public static void main(String args[]) {
    int a[] = {4,5,6,7,0,1,2};

    System.out.println(findElementIndex(a, 6));
  }

  public static int findElementIndex(int a[], int x) {
    int l = 0;
    int len = a.length;
    int r = len - 1;

    while(l < r) {
      if(a[l] == x)
        return l;

      if (a[r] == x)
        return r;

      if(x > a[l])
        l++;

      if(x < a[r])
        r--;
    }

    return -1;
  }
}

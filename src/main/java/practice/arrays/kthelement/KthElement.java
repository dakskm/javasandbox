package practice.arrays.kthelement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KthElement {
  public static void main(String args[]) {
    int elements[] = {7, 5, 2, 4, 9, 6};
    Integer iElements[] = Arrays.stream(elements).boxed().toArray(Integer[]::new);

    Arrays.sort(iElements, Collections.reverseOrder());

    for (int element : elements) {
      System.out.println(element + " ");
    }

    System.out.println();

    for (int element : iElements) {
      System.out.println(element + " ");
    }

//    System.out.println(iElements.toString());
  }
}

package practice.arrays.firstnonrepeating;

/*
How to find first non-repeating element in array of integers? (solution)
This array interview question is exactly opposite of previous problem, In that you need to
find first repeating element while in this you need to find first non-repeating element.
I am sure you can use similar approach to solve this problem, just need to consider non repeating element though.


Read more: https://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz5ODbIYpKs
 */

public class FirstNonRepeating {
  public static void main(String args[]) {
    int[] elements = {2, 2, 6, 7, 7, 6, 9, 1, 4, 4, 1, 8, 8, 1, 0, 0};

    firstNonRepeatingNumber(elements);
  }

  static void firstNonRepeatingNumber(int[] elements) {

    for(int i = 0;i<elements.length;i++) {
      for(int j =0;j<elements.length;j++) {
        if(i!=j && elements[i] == elements[j]) {
          break;
        }
        if((j + 1) == elements.length)
          System.out.println("first non repeating element is " + elements[i]);
      }
    }
  }
}

package practice.arrays.largestandsmallest;

/*
4. How to find largest and smallest number in unsorted array? (solution)
This is a rather simple array interview question.
You have given an unsorted integer array and you need to find the largest and smallest element in the array.
Of course, you can sort the array and then pick the top and bottom element but that would cost you O(NLogN)
because of sorting, getting element in array with index is O(1) operation.
 */

public class FindingLargestAndSmallest {
  public static void main(String args[]) {
      int[] arr1 = {5,6,7,111,3,4,5,8,9};

      printSmallestandLargerst(arr1);
  }

  static void printSmallestandLargerst(int arr[]) {
    int smallest = Integer.MAX_VALUE;
    int largest = Integer.MIN_VALUE;

    for (int element: arr) {
        if(element > largest)
            largest = element;
        else if(element < smallest)
            smallest = element;
    }

    System.out.println("smallest is " + smallest);
    System.out.println("largest is " + largest);
  }
}

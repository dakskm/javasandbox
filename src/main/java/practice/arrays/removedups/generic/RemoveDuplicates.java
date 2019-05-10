package practice.arrays.removedups.generic;

/*
Remove duplicates from array (solution)
Write a program to remove duplicates from an array in Java without using the Java Collection API. The array can be an
array of String, Integer or Character, your solution should be independent of the type of array. If you want to
practice more array based questions then see this list of top 30 array interview questions from Java interviews
 */

public class RemoveDuplicates<T> {
    public static void main(String args[]) {
        GenericArray<Integer> ga = new GenericArray<Integer>(10);

        ga.add(1);
        ga.add(2);
        ga.add(3);

        ga.display();
    }
}

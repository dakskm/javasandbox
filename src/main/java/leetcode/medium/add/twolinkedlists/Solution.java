package leetcode.medium.add.twolinkedlists;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode result = null;

    int l1count = getNodeCount(l1);
    int l2count = getNodeCount(l2);
    System.out.println(l1count);
    System.out.println(l2count);

    int firstNum = getNumber(l1, l1count);
    int secondNum = getNumber(l2, l2count);
    System.out.println(firstNum);
    System.out.println(secondNum);

    int addNums = firstNum + secondNum;

    System.out.println(addNums);
    result = addNumToListNode(addNums);


    display(result);

    return result;
  }

  public int getNodeCount(ListNode l) {
    int count = 0;
    ListNode pointer = l;
    while(pointer.next!=null) {
      pointer = pointer.next;
      count++;
    }
    return count + 1;
  }

  public int getNumber(ListNode l, int nodeCount) {
    ListNode pointer = l;
    int result = 0;
    for(int i=0; i < nodeCount; i++) {
      System.out.println("pointer.val" + pointer.val);
      result = result + (pointer.val * (int)Math.pow(10, i));
      pointer = pointer.next;
    }

    return result;
  }

  public ListNode addNumToListNode(int num) {
    ListNode pointer = null;
    int temp = num;
    int r = 0;
    ListNode root = null;

    while(temp!=0) {
      r = temp % 10;

      if(root == null && pointer == null) {
        root = new ListNode(r);
        root.next = null;
        pointer = root;
      } else {
        pointer.next = new ListNode(r);
        pointer = pointer.next;
      }
      pointer.next = null;

      temp = temp / 10;
    }

    return root;
  }

  public void display(ListNode l) {
    ListNode pointer = l;

    System.out.print("[");

    while(pointer.next != null) {
      System.out.print(pointer.val + " -> ");
      pointer = pointer.next;
    }

    System.out.print(pointer.val + " ] ");
  }
}

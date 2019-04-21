/**
 * 
 * @author Shogo Akiyama
 * Solved on 04/14/2019 
 * 
 * 876. Middle of the Linked List
 * https://leetcode.com/problems/middle-of-the-linked-list/ 
 * 
 * To run the code in LeetCode, take the codes from
 * middleList(ListNode head) method.
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
 * Memory Usage: 35.4 MB, less than 88.01% of Java online submissions for Middle of the Linked List.
 * 
 */

public class MiddleOfTheLinkedList {

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	
	public static void main(String[] args) {
		/*
		 * prepare the test case
		 */
		ListNode head = new ListNode(1);
		ListNode curr = head;
		String test = "[1,";

		for (int i = 1; i < 5; i++) {
			ListNode newNode = new ListNode(i + 1);
			curr.next = newNode;
			curr = newNode;
			test += String.valueOf(i + 1) + ",";
		}

		/*
		 * test and result
		 */
		ListNode answer = new MiddleOfTheLinkedList().middleNode(head);
		String result = "[";

		while (answer != null) {
			result += answer.val + ",";
			answer = answer.next;
		}

		System.out.println("Test case: " + test.substring(0, test.length() - 1) + "]");
		System.out.print("Result: " + result.substring(0, result.length() - 1) + "]");
	}

	public ListNode middleNode(ListNode head) {
		int count = 0;
		ListNode curr = head;
		while (curr != null) {
			curr = curr.next;
			count++;
		}

		curr = head;
		int target = count / 2;
		for (int i = 0; i < target; i++) {
			curr = curr.next;
		}
		return curr;
	}
}

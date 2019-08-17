/**
 * @author Shogo Akiyama 
 * Solved on 04/20/2019
 * 
 * 206. Reverse Linked List
 * https://leetcode.com/problems/reverse-linked-list/
 * Difficulty: Easy
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - ListNode reverseList(ListNode head).
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
 * Memory Usage: 37.9 MB, less than 11.06% of Java online submissions for Reverse Linked List.
 * 
 */

public class ReverseLinkedList {

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
		ListNode answer = new ReverseLinkedList().reverseList(head);
		String result = "[";

		while (answer != null) {
			result += answer.val + ",";
			answer = answer.next;
		}

		System.out.println("Test case: " + test.substring(0, test.length() - 1) + "]");
		System.out.print("Result: " + result.substring(0, result.length() - 1) + "]");
	}

	public ListNode reverseList(ListNode head) {
		ListNode curr = head;
		ListNode prev = null;

		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
}

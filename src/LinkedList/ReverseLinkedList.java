package LinkedList;

import LinkedList.LinkedListTest.ListNode;

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

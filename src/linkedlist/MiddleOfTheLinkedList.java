package linkedlist;

import linkedlist.LinkedListTest.ListNode;

/**
 * 
 * @author Shogo Akiyama
 * Solved on 04/14/2019 
 * 
 * 876. Middle of the Linked List
 * https://leetcode.com/problems/middle-of-the-linked-list/
 * Difficulty: Easy
 * 
 * Approach: Iteration
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
 * Memory Usage: 35.4 MB, less than 88.01% of Java online submissions for Middle of the Linked List.
 * 
 */

public class MiddleOfTheLinkedList {

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

package linkedlist;

import linkedlist.LinkedListTest.ListNode;

/**
 * @author Shogo Akiyama 
 * Solved on 10/01/2019
 * 
 * 141. Linked List Cycle
 * https://leetcode.com/problems/linked-list-cycle/
 * Difficulty: Easy
 * 
 * Approach: Floyd's Cycle Detection
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
 * Memory Usage: 37.4 MB, less than 98.57% of Java online submissions for Linked List Cycle.
 * 
 * @see LinkedListTest#testLinkedListCycle()
 */
public class LinkedListCycle2 {

	public boolean hasCycle(ListNode head) {
		if (head == null) {
			return false;
		}
		ListNode slow = head;
		ListNode fast = head.next;
		while (slow != fast) {
			if (fast == null || fast.next == null) {
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}

}

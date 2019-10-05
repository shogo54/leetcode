package linkedlist;

import linkedlist.LinkedListTest.ListNode;

/**
 * @author Shogo Akiyama 
 * Solved on 08/02/2019
 * 
 * 328. Odd Even Linked List
 * https://leetcode.com/problems/odd-even-linked-list/
 * Difficulty: Medium
 * 
 * Approach: Two Pointers & Iteration
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Odd Even Linked List.
 * Memory Usage: 36.6 MB, less than 100.00% of Java online submissions for Odd Even Linked List.
 * 
 * @see LinkedListTest#testOddEvenLinkedList()
 */
public class OddEvenLinkedList {

	public ListNode oddEvenList(ListNode head) {
		if (head == null) {
			return head;
		}

		ListNode odd = head;
		ListNode even = head.next;
		ListNode firstEven = even;

		while (odd.next != null && odd.next.next != null) {
			odd.next = odd.next.next;
			even.next = even.next.next;
			odd = odd.next;
			even = even.next;
		}

		odd.next = firstEven;
		return head;
	}

}

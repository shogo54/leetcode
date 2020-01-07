package linkedlist;

import linkedlist.LinkedListTest.ListNode;

/**
 * @author Shogo Akiyama 
 * Solved on 12/24/2019
 * 
 * 148. Sort List
 * https://leetcode.com/problems/sort-list/
 * Difficulty: Medium
 * 
 * Approach: Quick Sort
 * Runtime: 523 ms, faster than 6.79% of Java online submissions for Sort List.
 * Memory Usage: 40.7 MB, less than 71.93% of Java online submissions for Sort List.
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(log(n))
 * Where n is the number of nodes in the linked list
 * 
 * @see LinkedListTest#testSortList()
 */
public class SortList {

	public ListNode sortList(ListNode head) {
		return sort(head, null);
	}

	private ListNode sort(ListNode head, ListNode till) {
		if (head == null) {
			return null;
		}

		ListNode pivot = head;
		ListNode smallHead = null;
		ListNode bigHead = null;
		head = head.next;

		while (head != null && head != till) {
			ListNode next = head.next;
			if (pivot.val > head.val) {
				head.next = smallHead;
				smallHead = head;
			} else {
				head.next = bigHead;
				bigHead = head;
			}
			head = next;
		}

		smallHead = sort(smallHead, pivot);
		bigHead = sort(bigHead, null);

		ListNode smallTail = smallHead;
		while (smallTail != null && smallTail.next != null) {
			smallTail = smallTail.next;
		}

		if (smallTail != null) {
			smallTail.next = pivot;
		}

		pivot.next = bigHead;

		return (smallHead == null) ? pivot : smallHead;
	}

}

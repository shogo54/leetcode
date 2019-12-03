package linkedlist;

import linkedlist.LinkedListTest.ListNode;

/**
 * @author Shogo Akiyama 
 * Solved on 12/03/2019
 * 
 * 160. Intersection of Two Linked Lists
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 * Difficulty: Easy
 * 
 * Approach: Recursion with Count
 * Runtime: 1 ms, faster than 99.11% of Java online submissions for Intersection of Two Linked Lists.
 * Memory Usage: 38.5 MB, less than 51.43% of Java online submissions for Intersection of Two Linked Lists.
 * 
 * Time Complexity: O(m + n)
 * Space Complexity: O(m + n) for recursive stack, O(1) without counting recursive stack
 * Where m and n are the numbers of the linked lists respectively
 * 
 * @see LinkedListTest#testIntersectionOfTwoLinkedLists()
 */
public class IntersectionOfTwoLinkedLists {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		int countA = count(headA);
		int countB = count(headB);

		return recurse(headA, headB, countA - countB);
	}

	private int count(ListNode n) {
		if (n == null) {
			return 0;
		} else {
			return count(n.next) + 1;
		}
	}

	private ListNode recurse(ListNode a, ListNode b, int diff) {
		if (a == null || b == null) {
			return null;
		}
		if (a == b) {
			return a;
		}

		if (diff > 0) {
			return recurse(a.next, b, diff - 1);
		} else if (diff < 0) {
			return recurse(a, b.next, diff + 1);
		} else {
			return recurse(a.next, b.next, diff);
		}
	}

}

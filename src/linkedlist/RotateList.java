package linkedlist;

import linkedlist.LinkedListTest.ListNode;

/**
 * @author Shogo Akiyama
 * Solved on 06/19/2020 
 * 
 * 61. Rotate List
 * https://leetcode.com/problems/rotate-list/
 * Difficulty: Medium
 * 
 * Approach: Recursion
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate List.
 * Memory Usage: 39.2 MB, less than 45.98% of Java online submissions for Rotate List.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n) for the recursive stack
 * Where n is the number of nodes in the list
 * 
 * @see LinkedListTest#testRotateList()
 */
public class RotateList {

	private ListNode ret;
	private int kmod;

	public ListNode rotateRight(ListNode head, int k) {
		if (head == null || head.next == null) {
			return head;
		}
		kmod = k;
		rotate(head, head, 1);
		return ret;
	}

	private void rotate(ListNode node, ListNode start, int count) {
		if (node.next == null) {
			kmod %= count;
			if (kmod == 0) {
				ret = start;
			} else {
				node.next = start;
			}
			return;
		}

		rotate(node.next, start, count + 1);
		kmod--;

		if (kmod == 0) {
			ret = node.next;
			node.next = null;
		}
	}

}

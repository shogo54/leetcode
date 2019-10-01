package linkedlist;

import linkedlist.LinkedListTest.ListNode;

/**
 * @author Shogo Akiyama 
 * Solved on 08/20/2019
 * 
 * 19. Remove Nth Node From End of List
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * Difficulty: Medium
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - ListNode removeNthFromEnd(ListNode head, int n).
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Nth Node From End of List.
 * Memory Usage: 34.9 MB, less than 100.00% of Java online submissions for Remove Nth Node From End of List.
 * 
 */

public class RemoveNthNodeFromEndOfList {
	
	int count = 0;

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head == null) {
			return null;
		}
		if(head.next == null) {
			if(n==1) {
				return null;
			}
			return head;
		}
		
		head.next = removeNthFromEnd(head.next, n);
		
		count++;
		
		if(count == n-1) {
			return head.next;
		}
		
		return head;
    }
	
}

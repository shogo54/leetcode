package linkedlist;

import linkedlist.LinkedListTest.ListNode;

/**
 * @author Shogo Akiyama 
 * Solved on 01/06/2020
 * 
 * 237. Delete Node in a Linked List
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 * Difficulty: Easy
 * 
 * Approach: Swap
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Delete Node in a Linked List.
 * Memory Usage: 37 MB, less than 100.00% of Java online submissions for Delete Node in a Linked List.
 * 
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 * 
 * @see LinkedListTest#testDeleteNodeInALinkedList()
 */
public class DeleteNodeInALinkedList {

	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}

}

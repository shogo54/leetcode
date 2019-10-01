package linkedlist;

import linkedlist.LinkedListTest.ListNode;

/**
 * @author Shogo Akiyama 
 * Solved on 08/17/2019
 * 
 * 206. Reverse Linked List
 * https://leetcode.com/problems/reverse-linked-list/
 * Difficulty: Easy
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - ListNode reverseList(ListNode head)
 * - ListNode reverse(ListNode node, ListNode prev).
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
 * Memory Usage: 37.2 MB, less than 98.56% of Java online submissions for Reverse Linked List.
 * 
 */

public class ReverseLinkedList2 {

	public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }
    
    ListNode reverse(ListNode node, ListNode prev){
        if(node == null){
            return prev;
        }
        
        ListNode next = node.next;
        node.next = prev;
        return reverse(next, node);
    }
	
}

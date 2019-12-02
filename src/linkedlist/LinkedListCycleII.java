package linkedlist;

import linkedlist.LinkedListTest.ListNode;

/**
 * @author Shogo Akiyama 
 * Solved on 12/02/2019
 * 
 * 142. Linked List Cycle II
 * https://leetcode.com/problems/linked-list-cycle-ii/
 * Difficulty: Medium
 * 
 * Approach: Floyd's Cycle Detection
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle II.
 * Memory Usage: 34.5 MB, less than 95.79% of Java online submissions for Linked List Cycle II.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * where n is the number of nodes in the list
 * 
 * @see LinkedListTest#testLinkedListCycleII()
 */
public class LinkedListCycleII {
	
	public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        
        while(slow != null && fast != null && fast.next != null && slow != fast){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if(fast == null || fast.next == null){
            return null;
        }else{
            slow = head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            return fast;
        }
    }
	
}

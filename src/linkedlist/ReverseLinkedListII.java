package linkedlist;

import linkedlist.LinkedListTest.ListNode;

/**
 * @author Shogo Akiyama 
 * Solved on 08/18/2019
 * 
 * 92. Reverse Linked List II
 * https://leetcode.com/problems/reverse-linked-list-ii/
 * Difficulty: Medium
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - ListNode reverseBetween(ListNode head, int m, int n)
 * - ListNode ListNode reverse(ListNode curr, ListNode prev, ListNode start, ListNode end, int m, int n).
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List II.
 * Memory Usage: 34.6 MB, less than 100.00% of Java online submissions for Reverse Linked List II.
 * 
 */

public class ReverseLinkedListII {

	public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n){
            return head;
        }
        if(m == 1){
            return reverse(head, null, null, null, m, n);
        }
        reverse(head, null, null, null, m, n);
        return head;
    }
    
    private ListNode reverse(ListNode curr, ListNode prev, ListNode start, ListNode end, int m, int n){
        if(curr == null){
            return prev;
        }
        ListNode next = curr.next;
        
        if(m == 1){
            start = prev;
            
        }else if(m < 1 && n > 1){
            if(m == 0){
                end = prev;
            }
            curr.next = prev;
            
        }else if(n == 1){
            curr.next = prev;
            if(end == null){
                prev.next = next;
            }else{
                end.next = next;
            }
                       
            if(start == null){
                return curr;
            }
            start.next = curr;
            return start;
        }
        
        return reverse(next, curr, start, end, --m, --n);
    }
	
}

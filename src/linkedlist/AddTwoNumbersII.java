package linkedlist;

import linkedlist.LinkedListTest.ListNode;

/**
 * @author Shogo Akiyama 
 * Solved on 06/14/2019
 * 
 * 445. Add Two Numbers II
 * https://leetcode.com/problems/add-two-numbers-ii/
 * Difficulty: Medium
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - ListNode addTwoNumbers(ListNode l1, ListNode l2)
 * - ListNode reverse (ListNode n)
 * - void helper(ListNode n1, ListNode n2, int carried).
 * 
 * Runtime: 2 ms, faster than 99.95% of Java online submissions for Add Two Numbers II.
 * Memory Usage: 44.2 MB, less than 75.99% of Java online submissions for Add Two Numbers II.
 * 
 */

public class AddTwoNumbersII {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode r1 = reverse(l1);
        ListNode r2 = reverse(l2);
        helper(r1, r2, 0);
        return reverse(r1);
    }
    
    ListNode reverse (ListNode n){
        ListNode prev = null;
        ListNode curr = n;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    void helper(ListNode n1, ListNode n2, int carried){
        int newVal = n1.val + n2.val + carried;
        int carryOver = newVal / 10;
        n1.val = newVal % 10;
        
        if(n1.next == null & n2.next == null){
            if(carryOver > 0){
                n1.next = new ListNode(carryOver);
            }
            return;
        }
        if(n1.next == null){
            n1.next = new ListNode(0);
        }
        if(n2.next == null){
            n2.next = new ListNode(0);
        }        
        helper(n1.next, n2.next, carryOver);
    }
    
}
package linkedlist;

import linkedlist.LinkedListTest.ListNode;

/**
 * @author Shogo Akiyama 
 * Solved on 08/18/2019
 * 
 * 2. Add Two Numbers
 * https://leetcode.com/problems/add-two-numbers/
 * Difficulty: Medium
 * 
 * Approach: Recursion
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Two Numbers.
 * Memory Usage: 44.5 MB, less than 86.83% of Java online submissions for Add Two Numbers.
 * 
 */

public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        add(l1, l2, null, 0);
        return l1;
    }
    
    private void add(ListNode n1, ListNode n2, ListNode prev, int carry){
        if(n1 == null && n2 == null){
            if(carry == 1){
                prev.next = new ListNode(1);
            }
            return;
        }
        
        ListNode next;
        if(n1 == null || n2 == null){
            n1 = (n1 == null)? n2 : n1;
            next = null;
        }else{
            n1.val += n2.val;
            next = n2.next;
        }
        
        n1.val += carry;
        carry = n1.val / 10;
        n1.val %= 10;
        
        if(prev != null){
            prev.next = n1;
        }
        
        add(n1.next, next, n1, carry);
    }
	
}

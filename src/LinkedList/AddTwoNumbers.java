package LinkedList;

import LinkedList.LinkedListTest.ListNode;

/**
 * @author Shogo Akiyama 
 * Solved on 08/18/2019
 * 
 * 2. Add Two Numbers
 * https://leetcode.com/problems/add-two-numbers/
 * Difficulty: Medium
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - ListNode addTwoNumbers(ListNode l1, ListNode l2)
 * - void add(ListNode n1, ListNode n2, ListNode prev, int carry).
 * 
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Two Numbers.
 * Memory Usage: 43.7 MB, less than 87.15% of Java online submissions for Add Two Numbers.
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
        
        if(carry == 1){
            n1.val++;
            carry = 0;
        }
        if(n1.val >= 10){
            n1.val %= 10;
            carry = 1;
        }
        if(prev != null){
            prev.next = n1;
        }
        
        add(n1.next, next, n1, carry);
    }
	
}

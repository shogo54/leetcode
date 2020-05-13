package linkedlist;

import linkedlist.LinkedListTest.ListNode;

/**
 * @author Shogo Akiyama
 * Solved on 05/12/2020 
 * 
 * 24. Swap Nodes in Pairs
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 * Difficulty: Medium
 * 
 * Approach: Recursion
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Swap Nodes in Pairs.
 * Memory Usage: 37 MB, less than 5.50% of Java online submissions for Swap Nodes in Pairs.
 * 
 * @see LinkedListTest#testSwapNodesInPairs()
 */
public class SwapNodesInPairs {
    
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode temp1 = head.next;
        ListNode temp2 = head.next.next;
        head.next.next = head;
        head.next = swapPairs(temp2);
        return temp1;
    }
    
}

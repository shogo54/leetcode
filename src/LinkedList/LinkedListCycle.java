package LinkedList;

import java.util.*;

import LinkedList.LinkedListTest.ListNode;

/**
 * @author Shogo Akiyama 
 * Solved on 08/16/2019
 * 
 * 141. Linked List Cycle
 * https://leetcode.com/problems/linked-list-cycle/
 * Difficulty: Easy
 * 
 * To run the code in LeetCode, take the codes from the following method(s) and properties:
 * - Set<ListNode> set
 * - boolean hasCycle(ListNode head).
 * 
 * Runtime: 4 ms, faster than 20.24% of Java online submissions for Linked List Cycle.
 * Memory Usage: 36.8 MB, less than 100.00% of Java online submissions for Linked List Cycle.
 * 
 */

public class LinkedListCycle {

    Set<ListNode> set = new HashSet<ListNode>();
    
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        if(set.contains(head)){
            return true;
        }
        set.add(head);
        return hasCycle(head.next);
    }
    
}

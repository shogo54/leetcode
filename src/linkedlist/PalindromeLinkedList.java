package linkedlist;

import linkedlist.LinkedListTest.ListNode;

/**
 * @author Shogo Akiyama 
 * Solved on 12/04/2019
 * 
 * 234. Palindrome Linked List
 * https://leetcode.com/problems/palindrome-linked-list/
 * Difficulty: Easy
 * 
 * Approach: Recursion
 * Runtime: 1 ms, faster than 99.47% of Java online submissions for Palindrome Linked List.
 * Memory Usage: 44.3 MB, less than 6.10% of Java online submissions for Palindrome Linked List.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n) for recursive stack, O(1) without counting recursive stack
 * Where n is the numbers of a linked list
 * 
 * @see LinkedListTest#testPalindromeLinkedList()
 */
public class PalindromeLinkedList {
	
	private ListNode top;
    private boolean retVal;
    
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }
        top = head;
        return check(head);
    }
    
    private boolean check(ListNode node){
        if(node.next == null){
            return top.val == node.val;
        }
        
        retVal = check(node.next);
        
        if(retVal){
            top = top.next;
            return top.val == node.val;
        }else{
            return false;
        }
    }
    
}

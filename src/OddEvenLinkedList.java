/**
 * @author Shogo Akiyama 
 * Solved on 08/02/2019
 * 
 * 328. Odd Even Linked List
 * https://leetcode.com/problems/odd-even-linked-list/
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - ListNode oddEvenList(ListNode head).
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Odd Even Linked List.
 * Memory Usage: 36.6 MB, less than 100.00% of Java online submissions for Odd Even Linked List.
 * 
 */

public class OddEvenLinkedList {

	public ListNode oddEvenList(ListNode head) {
		if(head == null){
		    return head;
		}

		ListNode odd = head;
		ListNode even = head.next;
		ListNode firstEven = even;

		while(odd.next != null && odd.next.next != null){
		    odd.next = odd.next.next;
		    even.next = even.next.next;
		    odd = odd.next;
		    even = even.next;
		}

        	odd.next = firstEven;
		return head;
	}
	
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	
}

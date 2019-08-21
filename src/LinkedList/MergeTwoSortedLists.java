package LinkedList;

import LinkedList.LinkedListTest.ListNode;

/**
 * @author Shogo Akiyama 
 * Solved on 08/20/2019
 * 
 * 21. Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * Difficulty: Easy
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - ListNode mergeTwoLists(ListNode l1, ListNode l2).
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Sorted Lists.
 * Memory Usage: 40.6 MB, less than 13.13% of Java online submissions for Merge Two Sorted Lists.
 * 
 */

public class MergeTwoSortedLists {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null && l2 == null) {
			return null;
		}
		if(l1 == null || l2 == null){
	        ListNode noneNull = (l1 != null)? l1: l2;
	        return noneNull;
	    }
			
	    if(l1.val <= l2.val){
	        l1.next = mergeTwoLists(l1.next, l2);
	        return l1;
	    }else{
	        l2.next = mergeTwoLists(l1, l2.next);
	        return l2;
	    }
	}

//	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//		if(l1 == null && l2 == null) {
//			return null;
//		}
//		if(l1 == null || l2 == null){
//            ListNode noneNull = (l1 != null)? l1: l2;
//            merge(noneNull, noneNull.next, null);
//            return noneNull;
//        }
//			
//        if(l1.val <= l2.val){
//            merge(l1, l1.next, l2);
//            return l1;
//        }else{
//            merge(l2, l1, l2.next);
//            return l2;
//        }
//    }
//    
//    private ListNode merge(ListNode prev, ListNode n1, ListNode n2){
//        if(n1 == null && n2 == null){
//            return null;
//        }
//        if(n1 == null || n2 == null){
//            ListNode noneNull = (n1 != null)? n1: n2;
//            prev.next = noneNull;
//            merge(noneNull, noneNull.next, null);
//            return noneNull;
//        }
//        
//        ListNode smaller = (n1.val <= n2.val)? n1: n2;
//        ListNode larger = (smaller.equals(n2))? n1: n2;
//        prev.next = smaller;
//        merge(smaller, smaller.next, larger);
//        return smaller;
//    }
	
}

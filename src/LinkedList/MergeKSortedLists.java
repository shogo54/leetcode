package LinkedList;

import LinkedList.LinkedListTest.ListNode;

/**
 * @author Shogo Akiyama 
 * Solved on 08/23/2019
 * 
 * 23. Merge k Sorted Lists
 * https://leetcode.com/problems/merge-k-sorted-lists/
 * Difficulty: Hard
 * 
 * To run the code in LeetCode, take the codes from the following method(s) and all properties:
 * - ListNode mergeKLists(ListNode[] lists)
 * - ListNode mergeTwo(ListNode n1, ListNode n2).
 * 
 * Runtime: 2 ms, faster than 98.81% of Java online submissions for Merge k Sorted Lists.
 * Memory Usage: 40.9 MB, less than 46.45% of Java online submissions for Merge k Sorted Lists.
 * 
 */

public class MergeKSortedLists {

	public ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 0) {
			return null;
		}

		int skip = 1;
		while (skip < lists.length) {
			for (int i = 0; i < lists.length; i += skip * 2) {
				if (i + skip < lists.length) {
					lists[i] = mergeTwo(lists[i], lists[i + skip]);
				}
			}
			skip *= 2;
		}
		return lists[0];
	}
    
    private ListNode mergeTwo(ListNode n1, ListNode n2){
        if(n1 == null && n2 == null){
            return null;
        }
        if(n1 == null || n2 == null){
            return (n1 != null)? n1: n2;
        }
        
        ListNode smaller = (n1.val < n2.val)? n1: n2;
        ListNode bigger = (smaller.equals(n1))? n2: n1;
        
        smaller.next = mergeTwo(smaller.next, bigger);
        return smaller;
    }
	
}

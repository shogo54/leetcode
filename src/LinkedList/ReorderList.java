package LinkedList;

import java.util.*;

import LinkedList.LinkedListTest.ListNode;

/**
 * @author Shogo Akiyama 
 * Solved on 08/22/2019
 * 
 * 143. Reorder List
 * https://leetcode.com/problems/reorder-list/
 * Difficulty: Medium
 * 
 * To run the code in LeetCode, take the codes from the following method(s) and all properties:
 * - public void reorderList(ListNode head)
 * - private void add(ListNode node, int index)
 * - private ListNode reorder(int index).
 * 
 * Runtime: 8 ms, faster than 9.28% of Java online submissions for Reorder List.
 * Memory Usage: 46.1 MB, less than 6.82% of Java online submissions for Reorder List.
 * 
 */

public class ReorderList {
	
	Map<Integer, ListNode> map = new HashMap<Integer, ListNode>();
	int size;
	int left;
	int right;
	
	public void reorderList(ListNode head) {
        if(head == null){
            return;
        }
		add(head, 0);
		size = map.size();
		left = size-1;
		right = 0;
		head.next = reorder(left);
	}
	
	private void add(ListNode node, int index) {
		if(node == null) {
			return;
		}
		map.put(index, node);
		add(node.next, ++index);
	}
	
	private ListNode reorder(int index) {
		if(left <= right) {
			return null;
		}
		ListNode node = map.get(index);
		if(index >= size/2) {
			node.next = reorder(++right);
		}else{
			node.next = reorder(--left);
		}
		
		return node;
	}
	
}

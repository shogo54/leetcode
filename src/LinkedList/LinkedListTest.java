package LinkedList;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
	
	ListNode setupHead() {
		return setupHead(new int[] {1,2,3,4,5});
	}
	
	ListNode setupHead(int[] array) {
		ListNode head = new ListNode(array[0]);
		ListNode curr = head;

		for (int i = 1; i < array.length; i++) {
			ListNode newNode = new ListNode(array[i]);
			curr.next = newNode;
			curr = newNode;
		}
		
		return head;
	}
	
	ListNode setupCycle() {
		ListNode cycle = new ListNode(1);
		ListNode curr = cycle;

		for (int i = 1; i < 5; i++) {
			ListNode newNode = new ListNode(i + 1);
			curr.next = newNode;
			curr = newNode;
		}
		
		curr.next = cycle;
		return cycle;
	}
	
	@Test
	void testReverseLinkedList() throws Exception{
		ListNode head = setupHead();
		assertEquals("5-4-3-2-1", new ReverseLinkedList().reverseList(head).toString());
	}
	
	@Test
	void testReverseLinkedList2() throws Exception{
		ListNode head = setupHead();
		assertEquals("5-4-3-2-1", new ReverseLinkedList2().reverseList(head).toString());
	}
	
	@Test
	void testLinkedListCycle() throws Exception{
		ListNode head = setupHead();
		ListNode cycle = setupCycle();
		assertFalse(new LinkedListCycle().hasCycle(head));
		assertTrue(new LinkedListCycle().hasCycle(cycle));
	}
	
	@Test
	void testMiddleOfTheLinkedList() throws Exception{
		ListNode head = setupHead();
		ListNode head2 = setupHead(new int[]{7,6,5,4,3,2,1});
		assertEquals("3-4-5", new MiddleOfTheLinkedList().middleNode(head).toString());
		assertEquals("4-3-2-1", new MiddleOfTheLinkedList().middleNode(head2).toString());
	}
	
	@Test
	void testOddEvenLinkedList() throws Exception{
		ListNode head = setupHead();
		assertEquals("1-3-5-2-4", new OddEvenLinkedList().oddEvenList(head).toString());
	}
	
	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
		
		public String toString(){
			if(next == null) {
				return val + "";
			}
			return val + "-" + next.toString();
		}
	}

}

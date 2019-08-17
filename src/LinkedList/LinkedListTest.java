package LinkedList;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

	private ListNode head;
	private ListNode head2;
	private ListNode cycle;
	
	void setupHead() {
		head = new ListNode(1);
		ListNode curr = head;

		for (int i = 1; i < 5; i++) {
			ListNode newNode = new ListNode(i + 1);
			curr.next = newNode;
			curr = newNode;
		}
	}
	
	void setupHead2() {
		head2 = new ListNode(7);
		ListNode curr = head2;

		for (int i = 0; i < 6; i++) {
			ListNode newNode = new ListNode(6-i);
			curr.next = newNode;
			curr = newNode;
		}
	}
	
	void setupCycle() {
		cycle = new ListNode(1);
		ListNode curr = cycle;

		for (int i = 1; i < 5; i++) {
			ListNode newNode = new ListNode(i + 1);
			curr.next = newNode;
			curr = newNode;
		}
		
		curr.next = cycle;
	}
	
	@Test
	void testReverseLinkedList() throws Exception{
		setupHead();
		assertEquals("5-4-3-2-1", new ReverseLinkedList().reverseList(head).toString());
	}
	
	@Test
	void testReverseLinkedList2() throws Exception{
		setupHead();
		assertEquals("5-4-3-2-1", new ReverseLinkedList2().reverseList(head).toString());
	}
	
	@Test
	void testLinkedListCycle() throws Exception{
		setupHead();
		setupCycle();
		assertFalse(new LinkedListCycle().hasCycle(head));
		assertTrue(new LinkedListCycle().hasCycle(cycle));
	}
	
	@Test
	void testMiddleOfTheLinkedList() throws Exception{
		setupHead();
		setupHead2();
		assertEquals("3-4-5", new MiddleOfTheLinkedList().middleNode(head).toString());
		assertEquals("4-3-2-1", new MiddleOfTheLinkedList().middleNode(head2).toString());
	}
	
	@Test
	void testOddEvenLinkedList() throws Exception{
		setupHead();
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

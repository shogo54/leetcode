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
		ListNode head1 = setupHead();
		ListNode head2 = setupHead(new int[]{7,6,5,4,3,2,1});
		assertEquals("3-4-5", new MiddleOfTheLinkedList().middleNode(head1).toString());
		assertEquals("4-3-2-1", new MiddleOfTheLinkedList().middleNode(head2).toString());
	}
	
	@Test
	void testOddEvenLinkedList() throws Exception{
		ListNode head = setupHead();
		assertEquals("1-3-5-2-4", new OddEvenLinkedList().oddEvenList(head).toString());
	}
	
	@Test
	void testReverseLinkedListII() throws Exception{
		ListNode head = setupHead();
		assertEquals("1-4-3-2-5", new ReverseLinkedListII().reverseBetween(head, 2, 4).toString());
	}
	
	@Test
	void testAddTwoNumbers() throws Exception{
		ListNode head1 = setupHead(new int[] {1});
		ListNode head2 = setupHead(new int[] {9,9});
		assertEquals("0-0-1", new AddTwoNumbers().addTwoNumbers(head1, head2).toString());
	}
	
	@Test
	void testAddTwoNumbersII() throws Exception{
		ListNode head1 = setupHead(new int[] {9,2,4,3});
		ListNode head2 = setupHead(new int[] {7,6,4});
		assertEquals("1-0-0-0-7", new AddTwoNumbersII().addTwoNumbers(head1, head2).toString());
	}
	
	@Test
	void testRemoveNthNodeFromEndofList() throws Exception{
		ListNode head = setupHead();
		assertEquals("1-2-3-5", new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 2).toString());
		
		head = setupHead();
		assertEquals("1-2-3-4", new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 1).toString());
		
		head = setupHead();
		assertEquals("2-3-4-5", new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 5).toString());
		
		head = setupHead(new int[] {1});
		assertEquals(null, new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 1));
	}
	
	@Test
	void testMergeTwoSortedLists() throws Exception{
		ListNode head1 = setupHead(new int[] {1,2,4});
		ListNode head2 = setupHead(new int[] {1,3,4});
		assertEquals("1-1-2-3-4-4", new MergeTwoSortedLists().mergeTwoLists(head1, head2).toString());
		
		head1 = setupHead(new int[] {1,88,99});
		head2 = setupHead(new int[] {2,3,100,105});
		assertEquals("1-2-3-88-99-100-105", new MergeTwoSortedLists().mergeTwoLists(head1, head2).toString());
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

package linkedlist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

	/**
	 * Test cases for 2. Add Two Numbers
	 * 
	 * @see AddTwoNumbers
	 */
	@Test
	void testAddTwoNumbers() {
		ListNode head1 = setupHead(new int[] { 1 });
		ListNode head2 = setupHead(new int[] { 9, 9 });
		assertEquals("[0,0,1]", new AddTwoNumbers().addTwoNumbers(head1, head2).toString());
	}

	/**
	 * Test cases for 19. Remove Nth Node From End of List
	 * 
	 * @see RemoveNthNodeFromEndOfList
	 */
	@Test
	void testRemoveNthNodeFromEndofList() {
		ListNode head = setupHead();
		assertEquals("[1,2,3,5]", new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 2).toString());

		head = setupHead();
		assertEquals("[1,2,3,4]", new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 1).toString());

		head = setupHead();
		assertEquals("[2,3,4,5]", new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 5).toString());

		head = setupHead(new int[] { 1 });
		assertEquals(null, new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 1));
	}

	/**
	 * Test cases for 21. Merge Two Sorted Lists
	 * 
	 * @see MergeTwoSortedLists
	 */
	@Test
	void testMergeTwoSortedLists() {
		ListNode head1 = setupHead(new int[] { 1, 2, 4 });
		ListNode head2 = setupHead(new int[] { 1, 3, 4 });
		assertEquals("[1,1,2,3,4,4]", new MergeTwoSortedLists().mergeTwoLists(head1, head2).toString());

		head1 = setupHead(new int[] { 1, 88, 99 });
		head2 = setupHead(new int[] { 2, 3, 100, 105 });
		assertEquals("[1,2,3,88,99,100,105]", new MergeTwoSortedLists().mergeTwoLists(head1, head2).toString());
	}

	/**
	 * Test cases for 23. Merge k Sorted Lists
	 * 
	 * @see MergeKSortedLists
	 */
	@Test
	void testMergeKSortedLists() {
		ListNode[] lists = new ListNode[7];
		lists[0] = setupHead(new int[] { -10, -9, -9, -3, -1, -1, 0 });
		lists[1] = setupHead(new int[] { -5 });
		lists[2] = setupHead(new int[] { 4 });
		lists[3] = setupHead(new int[] { -8 });
		lists[5] = setupHead(new int[] { -9, -6, -5, -4, -2, 2, 3 });
		lists[6] = setupHead(new int[] { -3, -3, -2, -1, 0 });
		assertEquals("[-10,-9,-9,-9,-8,-6,-5,-5,-4,-3,-3,-3,-2,-2,-1,-1,-1,0,0,2,3,4]",
				new MergeKSortedLists().mergeKLists(lists).toString());
	}

	/**
	 * Test cases for 92. Reverse Linked List II
	 * 
	 * @see ReverseLinkedListII
	 */
	@Test
	void testReverseLinkedListII() {
		ListNode head = setupHead();
		assertEquals("[1,4,3,2,5]", new ReverseLinkedListII().reverseBetween(head, 2, 4).toString());
	}

	/**
	 * Test cases for 141. Linked List Cycle
	 * 
	 * @see LinkedListCycle
	 * @see LinkedListCycle2
	 */
	@Test
	void testLinkedListCycle() {
		// Test for LinkedListCycle
		ListNode head = setupHead();
		ListNode cycle = setupCycle();
		assertFalse(new LinkedListCycle().hasCycle(head));
		assertTrue(new LinkedListCycle().hasCycle(cycle));

		// Test for LinkedListCycle2
		ListNode head2 = setupHead();
		ListNode cycle2 = setupCycle();
		assertFalse(new LinkedListCycle2().hasCycle(head2));
		assertTrue(new LinkedListCycle2().hasCycle(cycle2));
	}

	/**
	 * Test cases for 142. Linked List Cycle II
	 * 
	 * @see LinkedListCycleII
	 */
	@Test
	void testLinkedListCycleII() {
		ListNode head = setupHead();
		ListNode cycle = setupCycle();
		assertEquals(null, new LinkedListCycleII().detectCycle(head));
		assertEquals(toString(cycle), toString(new LinkedListCycleII().detectCycle(cycle)));
	}

	/**
	 * Test cases for 143. Reorder List
	 * 
	 * @see ReorderList
	 */
	@Test
	void testReorderList() {
		ListNode head = setupHead();
		new ReorderList().reorderList(head);
		assertEquals("[1,5,2,4,3]", head.toString());

		head = setupHead(new int[] { 1, 2, 3, 4 });
		new ReorderList().reorderList(head);
		assertEquals("[1,4,2,3]", head.toString());

		head = setupHead(new int[] { 1, 2 });
		new ReorderList().reorderList(head);
		assertEquals("[1,2]", head.toString());
	}

	/**
	 * Test cases for 206. Reverse Linked List
	 * 
	 * @see ReverseLinkedList
	 * @see ReverseLinkedList2
	 */
	@Test
	void testReverseLinkedList() {
		// Test for ReverseLinkedList
		ListNode head = setupHead();
		assertEquals("[5,4,3,2,1]", new ReverseLinkedList().reverseList(head).toString());

		// Test for ReverseLinkedList2
		ListNode head2 = setupHead();
		assertEquals("[5,4,3,2,1]", new ReverseLinkedList2().reverseList(head2).toString());
	}

	/**
	 * Test cases for 328. Odd Even Linked List
	 * 
	 * @see OddEvenLinkedList
	 */
	@Test
	void testOddEvenLinkedList() {
		ListNode head = setupHead();
		assertEquals("[1,3,5,2,4]", new OddEvenLinkedList().oddEvenList(head).toString());
	}

	/**
	 * Test cases for 445. Add Two Numbers II
	 * 
	 * @see AddTwoNumbersII
	 */
	@Test
	void testAddTwoNumbersII() {
		ListNode head1 = setupHead(new int[] { 9, 2, 4, 3 });
		ListNode head2 = setupHead(new int[] { 7, 6, 4 });
		assertEquals("[1,0,0,0,7]", new AddTwoNumbersII().addTwoNumbers(head1, head2).toString());
	}

	/**
	 * Test cases for 876. Middle of the Linked List
	 * 
	 * @see MiddleOfTheLinkedList
	 */
	@Test
	void testMiddleOfTheLinkedList() {
		ListNode head1 = setupHead();
		ListNode head2 = setupHead(new int[] { 7, 6, 5, 4, 3, 2, 1 });
		assertEquals("[3,4,5]", new MiddleOfTheLinkedList().middleNode(head1).toString());
		assertEquals("[4,3,2,1]", new MiddleOfTheLinkedList().middleNode(head2).toString());
	}

	String toString(ListNode node) {
		return node.val + "";
	}

	ListNode setupHead() {
		return setupHead(new int[] { 1, 2, 3, 4, 5 });
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

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}

		public String toString() {
			String result = "[";
			result += helperString();
			return result + "]";
		}

		private String helperString() {
			if (next == null) {
				return val + "";
			}
			return val + "," + next.helperString();
		}
	}

}

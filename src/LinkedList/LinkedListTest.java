package LinkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LinkedListTest {

	private ListNode head;
	
	void setup() {
		/*
		 * prepare the test case
		 */
		head = new ListNode(1);
		ListNode curr = head;

		for (int i = 1; i < 5; i++) {
			ListNode newNode = new ListNode(i + 1);
			curr.next = newNode;
			curr = newNode;
		}
	}
	
	@Test
	void testReverseLinkedList() throws Exception{
		setup();
		assertEquals("5-4-3-2-1", new ReverseLinkedList().reverseList(head).toString());
	}
	
	@Test
	void testReverseLinkedList2() throws Exception{
		setup();
		assertEquals("5-4-3-2-1", new ReverseLinkedList2().reverseList(head).toString());
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

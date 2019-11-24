import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 11/23/2019
 * 
 * 138. Copy List with Random Pointer
 * https://leetcode.com/problems/copy-list-with-random-pointer/
 * Difficulty: Medium
 * 
 * Approach: Recursion & Map
 * Runtime: 1 ms, faster than 74.66% of Java online submissions for Copy List with Random Pointer.
 * Memory Usage: 32.8 MB, less than 99.07% of Java online submissions for Copy List with Random Pointer.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
 * 
 */
public class CopyListWithRandomPointer {

	public Node copyRandomList(Node head) {
		Map<Node, Node> map = new HashMap<Node, Node>();

		Node copy = create(head, map);
		addRandom(copy, head, map);

		return map.get(head);
	}

	private Node create(Node head, Map<Node, Node> map) {
		if (head == null) {
			return null;
		}

		map.put(head, new Node(head.val, null, null));
		map.get(head).next = create(head.next, map);

		return map.get(head);
	}

	private void addRandom(Node copy, Node head, Map<Node, Node> map) {
		if (copy == null || head == null) {
			return;
		}

		copy.random = map.get(head.random);
		addRandom(copy.next, head.next, map);
	}

	class Node {
		public int val;
		public Node next;
		public Node random;

		public Node() {
		}

		public Node(int _val, Node _next, Node _random) {
			val = _val;
			next = _next;
			random = _random;
		}
	}

}

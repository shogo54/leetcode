import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 11/16/2019
 * 
 * 116. Populating Next Right Pointers in Each Node
 * https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
 * Difficulty: Medium
 * 
 * Apporach: Iteration and Stack
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Populating Next Right Pointers in Each Node.
 * Memory Usage: 37.9 MB, less than 6.35% of Java online submissions for Populating Next Right Pointers in Each Node.
 * 
 */
public class PopulatingNextRightPointersInEachNode {
	public Node connect(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		int index = 0;
		int count = 1;
		Node curr;

		queue.add(root);

		while (!queue.isEmpty()) {
			index++;
			curr = queue.poll();
			if (curr == null) {
				break;
			}

			if (index == count) {
				index = 0;
				count *= 2;
			} else {
				curr.next = queue.element();
			}

			if (curr.left != null) {
				queue.add(curr.left);
				queue.add(curr.right);
			}
		}

		return root;
	}
}

class Node {
	public int val;
	public Node left;
	public Node right;
	public Node next;

	public Node() {
	}

	public Node(int _val, Node _left, Node _right, Node _next) {
		val = _val;
		left = _left;
		right = _right;
		next = _next;
	}
}
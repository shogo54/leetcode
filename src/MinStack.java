

/**
 * @author Shogo Akiyama 
 * Solved on 12/04/2019
 * 
 * 155. Min Stack
 * https://leetcode.com/problems/min-stack/
 * Difficulty: Easy
 * 
 * Approach: Two Node Pointers
 * Runtime: 4 ms, faster than 99.89% of Java online submissions for Min Stack.
 * Memory Usage: 40.4 MB, less than 29.71% of Java online submissions for Min Stack.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the number of elements in a stack
 * 
 */
public class MinStack {

	private Node tail;
	private Node min;

	/** initialize your data structure here. */
	public MinStack() {
		tail = null;
		min = null;
	}

	public void push(int x) {
		Node newNode = new Node(x);
		newNode.next = tail;
		tail = newNode;
		if (min == null) {
			min = newNode;
		} else if (x < min.val) {
			newNode.minNext = min;
			min = newNode;
		}
	}

	public void pop() {
		if (tail != null) {
			if (tail == min) {
				min = min.minNext;
			}
			tail = tail.next;
		}
	}

	public int top() {
		return tail.val;
	}

	public int getMin() {
		return min.val;
	}

	class Node {
		int val;
		Node next;
		Node minNext;

		Node(int v) {
			val = v;
			next = null;
			minNext = null;
		}
	}

}

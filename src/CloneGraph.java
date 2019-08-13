import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 08/13/2019
 * 
 * 133. Clone Graph
 * https://leetcode.com/problems/clone-graph/
 * 
 * To run the code in LeetCode, take the codes from the following method(s) and properties:
 * - Map<Node, Node> map
 * - Node cloneGraph(Node node).
 * 
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Clone Graph.
 * Memory Usage: 32.7 MB, less than 97.65% of Java online submissions for Clone Graph.
 * 
 */

public class CloneGraph {

	Map<Node, Node> map = new HashMap<Node, Node>();

	public Node cloneGraph(Node node) {
		if (map.containsKey(node)) {
			return map.get(node);
		}

		Node clone = new Node();
		clone.val = node.val;
		clone.neighbors = new ArrayList<Node>();
		map.put(node, clone);

		for (Node n : node.neighbors) {
			clone.neighbors.add(cloneGraph(n));
		}
		return clone;
	}

	static class Node {
		int val;
	    List<Node> neighbors;

	    Node() {}

	    Node(int _val,List<Node> _neighbors) {
	        val = _val;
	        neighbors = _neighbors;
	    }
	}
	
}

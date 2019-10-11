package binarytree;

import java.util.*;
import java.util.stream.*;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 09/27/2019
 * 
 * 297. Serialize and Deserialize Binary Tree
 * https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
 * Difficulty: Hard
 * 
 * Approach: Iteration
 * Runtime: 49 ms, faster than 15.51% of Java online submissions for Serialize and Deserialize Binary Tree.
 * Memory Usage: 40.1 MB, less than 31.43% of Java online submissions for Serialize and Deserialize Binary Tree.
 * 
 * @see BinaryTreeTest#testSerializeAndDeserializeBinaryTree()
 */
public class SerializeAndDeserializeBinaryTree {

	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		if (root == null) {
			return "null";
		}

		List<Integer> nodes = new ArrayList<Integer>();
		Queue<TreeNode> q = new ArrayDeque<TreeNode>();
		nodes.add(root.val);
		q.offer(root);

		while (!q.isEmpty()) {
			TreeNode n = q.poll();
			if (n.left != null) {
				nodes.add(n.left.val);
				q.offer(n.left);
			} else {
				nodes.add(null);
			}
			if (n.right != null) {
				nodes.add(n.right.val);
				q.offer(n.right);
			} else {
				nodes.add(null);
			}
		}

		for (int i = nodes.size() - 1; i >= 0; i--) {
			if (nodes.get(i) != null) {
				break;
			}
			nodes.remove(i);
		}

		return nodes.stream().map(n -> String.valueOf(n)).collect(Collectors.joining(","));
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {

		List<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList(data.split(",")));

		Queue<TreeNode> q = new ArrayDeque<TreeNode>();
		boolean left = true;
		TreeNode root = null;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("null")) {
				if (!left) {
					q.poll();
				}
				left = !left;
				continue;
			}

			TreeNode node = new TreeNode(Integer.valueOf(list.get(i)));
			if (i == 0) {
				q.offer(node);
				root = node;
			} else {
				TreeNode parent = q.element();
				if (left) {
					parent.left = node;
				} else {
					parent.right = node;
					q.poll();
				}
				q.offer(node);
				left = !left;
			}
		}
		return root;
	}
	
}

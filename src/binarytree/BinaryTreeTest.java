package binarytree;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {

	/**
	 * Test cases for 94. Binary Tree Inorder Traversal
	 * 
	 * @see BinaryTreeInorderTraversal
	 */
	@Test
	void testBinaryTreeInorderTraversal() {
		TreeNode root = setupTree();
		assertEquals(new ArrayList<Integer>(Arrays.asList(1, 3, 2)),
				new BinaryTreeInorderTraversal().inorderTraversal(root));
	}

	/**
	 * Test cases for 98. Validate Binary Search Tree
	 * 
	 * @see ValidateBinarySearchTree
	 */
	@Test
	void testValidateBinarySearchTree() {
		TreeNode root = setupTree(new Integer[] { 2, 1, 3 });
		assertTrue(new ValidateBinarySearchTree().isValidBST(root));
		root = setupTree(new Integer[] { 10, 5, 15, null, null, 6, 20 });
		assertFalse(new ValidateBinarySearchTree().isValidBST(root));
	}

	/**
	 * Test cases for 100. Same Tree
	 * 
	 * @see SameTree
	 */
	@Test
	void testSameTree() {
		SameTree st = new SameTree();
		TreeNode root1 = setupTree(new Integer[] { 1, 2, 3 });
		TreeNode root2 = setupTree(new Integer[] { 1, 2, 3 });
		assertTrue(st.isSameTree(root1, root2));

		root1 = setupTree(new Integer[] { 1, 2 });
		root2 = setupTree(new Integer[] { 1, null, 2 });
		assertFalse(st.isSameTree(root1, root2));
	}

	/**
	 * Test cases for 101. Symmetric Tree
	 * 
	 * @see SymmetricTree
	 */
	@Test
	void testSymmetricTree() {
		TreeNode root = setupTree(new Integer[] { 1, 2, 2, 3, 4, 4, 3 });
		assertTrue(new SymmetricTree().isSymmetric(root));

		root = setupTree(new Integer[] { 1, 2, 2, null, 3, null, 3 });
		assertFalse(new SymmetricTree().isSymmetric(root));

		root = null;
		assertTrue(new SymmetricTree().isSymmetric(root));
	}

	/**
	 * Test cases for 102. Binary Tree Level Order Traversal
	 * 
	 * @see BinaryTreeLevelOrderTraversal
	 */
	@Test
	void testBinaryTreeLevelOrderTraversal() {
		TreeNode root = setupTree(new Integer[] { 3, 9, 20, null, null, 15, 7 });
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(Arrays.asList(3));
		list.add(Arrays.asList(9, 20));
		list.add(Arrays.asList(15, 7));
		assertEquals(list, new BinaryTreeLevelOrderTraversal().levelOrder(root));
	}

	/**
	 * Test cases for 103. Binary Tree Zigzag Level Order Traversal
	 * 
	 * @see BinaryTreeZigzagLevelOrderTraversal
	 */
	@Test
	void testBinaryTreeZigzagLevelOrderTraversal() {
		TreeNode root = setupTree(new Integer[] { 3, 9, 20, null, null, 15, 7 });
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(Arrays.asList(3));
		list.add(Arrays.asList(20, 9));
		list.add(Arrays.asList(15, 7));
		assertEquals(list, new BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(root));

		root = setupTree(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 });
		list = new ArrayList<List<Integer>>();
		list.add(Arrays.asList(1));
		list.add(Arrays.asList(3, 2));
		list.add(Arrays.asList(4, 5, 6, 7));
		list.add(Arrays.asList(15, 14, 13, 12, 11, 10, 9, 8));
		list.add(Arrays.asList(16));
		assertEquals(list, new BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(root));
	}

	/**
	 * Test cases for 104. Maximum Depth of Binary Tree
	 * 
	 * @see MaximumDepthOfBinaryTree
	 */
	@Test
	void testMaximumDepthOfBinaryTree() {
		TreeNode root = setupTree(new Integer[] { 3, 9, 20, null, null, 15, 21 });
		assertEquals(3, new MaximumDepthOfBinaryTree().maxDepth(root));
	}

	/**
	 * Test cases for 105. Construct Binary Tree from Preorder and Inorder Traversal
	 * 
	 * @see ConstructBinaryTreeFromPreorderAndInorderTraversal
	 * @see ConstructBinaryTreeFromPreorderAndInorderTraversal2
	 */
	@Test
	void testConstructBinaryTreeFromPreorderAndInorderTraversal() {
		ConstructBinaryTreeFromPreorderAndInorderTraversal builder = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
		TreeNode exptected = setupTree(new Integer[] { 3, 9, 20, null, null, 15, 7 });
		TreeNode actual = builder.buildTree(new int[] { 3, 9, 20, 15, 7 }, new int[] { 9, 3, 15, 20, 7 });
		assertEquals(exptected.toString(), actual.toString());

		builder = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
		exptected = setupTree(new Integer[] { 4, 1, null, null, 2, null, 3 });
		actual = builder.buildTree(new int[] { 4, 1, 2, 3 }, new int[] { 1, 2, 3, 4 });
		assertEquals(exptected.toString(), actual.toString());
	}

	/**
	 * Test cases for 108. Convert Sorted Array to Binary Search Tree
	 * 
	 * @see ConvertSortedArrayToBinarySearchTree
	 */
	@Test
	void testConvertSortedArrayToBinarySearchTree() {
		TreeNode root = setupTree(new Integer[] { 0, -10, 5, null, -3, null, 9 });
		TreeNode converted = new ConvertSortedArrayToBinarySearchTree()
				.sortedArrayToBST(new int[] { -10, -3, 0, 5, 9 });
		assertEquals(root.toString(), converted.toString());
	}

	/**
	 * Test cases for 114. Flatten Binary Tree to Linked List
	 * 
	 * @see FlattenBinaryTreeToLinkedList
	 */
	void testFlattenBinaryTreeToLinkedList() {
		TreeNode root = setupTree(new Integer[] { 1, 2, 5, 3, 4, null, 6 });
		TreeNode expected = setupTree(new Integer[] { 1, null, 2, null, 3, null, 4, null, 5, null, 6 });
		new FlattenBinaryTreeToLinkedList().flatten(root);
		assertEquals(expected.toString(), root.toString());

		root = setupTree(new Integer[] { 1, 2, 5, 3, 4, 6, 7 });
		expected = setupTree(new Integer[] { 1, null, 2, null, 3, null, 4, null, 5, null, 6, null, 7 });
		new FlattenBinaryTreeToLinkedList().flatten(root);
		assertEquals(expected.toString(), root.toString());

		root = setupTree(new Integer[] { 1, 2, null, 3, null, 4 });
		expected = setupTree(new Integer[] { 1, null, 2, null, 3, null, 4 });
		new FlattenBinaryTreeToLinkedList().flatten(root);
		assertEquals(expected.toString(), root.toString());

		root = setupTree(new Integer[] { 1, null, 2, null, 3, null, 4 });
		expected = setupTree(new Integer[] { 1, null, 2, null, 3, null, 4 });
		new FlattenBinaryTreeToLinkedList().flatten(root);
		assertEquals(expected.toString(), root.toString());

		root = setupTree(new Integer[] { 1 });
		expected = setupTree(new Integer[] { 1 });
		new FlattenBinaryTreeToLinkedList().flatten(root);
		assertEquals(expected.toString(), root.toString());

		root = null;
		expected = null;
		new FlattenBinaryTreeToLinkedList().flatten(root);
		assertEquals(expected, root);
	}

	/**
	 * Test cases for 124. Binary Tree Maximum Path Sum
	 * 
	 * @see BinaryTreeMaximumPathSum
	 */
	@Test
	void testBinaryTreeMaximumPathSum() {
		TreeNode root = setupTree(new Integer[] { 1, 2, 3 });
		assertEquals(6, new BinaryTreeMaximumPathSum().maxPathSum(root));

		root = setupTree(new Integer[] { -10, 9, 20, null, null, 15, 7 });
		assertEquals(42, new BinaryTreeMaximumPathSum().maxPathSum(root));

		root = setupTree(new Integer[] { 5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1 });
		assertEquals(48, new BinaryTreeMaximumPathSum().maxPathSum(root));
	}

	/**
	 * Test cases for 145. Binary Tree Postorder Traversal
	 * 
	 * @see BinaryTreePostorderTraversal
	 */
	@Test
	void testBinaryTreePostorderTraversal() {
		TreeNode root = setupTree();
		assertEquals(new ArrayList<Integer>(Arrays.asList(3, 2, 1)),
				new BinaryTreePostorderTraversal().postorderTraversal(root));
	}

	/**
	 * Test cases for 226. Invert Binary Tree
	 * 
	 * @see InvertBinaryTree
	 */
	@Test
	void testInvertBinaryTree() {
		TreeNode root = setupTree(new Integer[] { 4, 2, 7, 1, 3, 6, 9 });
		TreeNode inverted = setupTree(new Integer[] { 4, 7, 2, 9, 6, 3, 1 });
		assertEquals(inverted.toString(), new InvertBinaryTree().invertTree(root).toString());
	}

	/**
	 * Test cases for 230. Kth Smallest Element in a BST
	 * 
	 * @see KthSmallestElementInABST
	 */
	@Test
	void testKthSmallestElementInABST() {
		TreeNode root = setupTree(new Integer[] { 3, 1, 4, null, 2 });
		assertEquals(1, new KthSmallestElementInABST().kthSmallest(root, 1));

		root = setupTree(new Integer[] { 5, 3, 6, 2, 4, null, null, 1 });
		assertEquals(3, new KthSmallestElementInABST().kthSmallest(root, 3));
	}

	/**
	 * Test cases for 235. Lowest Common Ancestor of a Binary Search Tree
	 * 
	 * @see LowestCommonAncestorOfABinarySearchTree
	 */
	@Test
	void testLowestCommonAncestorOfABinarySearchTree() {
		TreeNode root = setupTree(new Integer[] { 6, 2, 8, 0, 4, 7, 9, null, null, 3, 5 });
		LowestCommonAncestorOfABinarySearchTree tester = new LowestCommonAncestorOfABinarySearchTree();

		assertEquals(root.toString(), tester.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(8)).toString());

		assertEquals(root.left.toString(),
				tester.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(4)).toString());
	}

	/**
	 * Test cases for 297. Serialize and Deserialize Binary Tree
	 * 
	 * @see SerializeAndDeserializeBinaryTree
	 */
	@Test
	void testSerializeAndDeserializeBinaryTree() {
		SerializeAndDeserializeBinaryTree tester = new SerializeAndDeserializeBinaryTree();

		TreeNode root = setupTree();
		assertEquals(root.toString(), tester.deserialize(tester.serialize(root)).toString());

		root = setupTree(new Integer[] { 1, 2, 3, null, null, 4, 5 });
		assertEquals(root.toString(), tester.deserialize(tester.serialize(root)).toString());

		root = setupTree(new Integer[] { 1, 2, null, 3, null, 4, null, 5 });
		assertEquals(root.toString(), tester.deserialize(tester.serialize(root)).toString());

		root = setupTree(new Integer[] { 2, null, 3, null, 4, null, 5, null, 6 });
		assertEquals(root.toString(), tester.deserialize(tester.serialize(root)).toString());

		root = setupTree(new Integer[] { 2 });
		assertEquals(root.toString(), tester.deserialize(tester.serialize(root)).toString());

		root = setupTree(new Integer[0]);
		assertEquals(root, tester.deserialize(tester.serialize(root)));
	}

	/**
	 * Test cases for 337. House Robber III
	 * 
	 * @see HouseRobberIII
	 */
	@Test
	void testHouseRobberIII() {
		TreeNode root = setupTree();
		assertEquals(4, new HouseRobberIII().rob(root));

		root = setupTree(new Integer[] { 3, 2, 3, null, 3, null, 1 });
		assertEquals(7, new HouseRobberIII().rob(root));

		root = setupTree(new Integer[] { 3, 4, 5, 1, 3, null, 1 });
		assertEquals(9, new HouseRobberIII().rob(root));

		root = setupTree(new Integer[] { 2, 1, 3, null, 4 });
		assertEquals(7, new HouseRobberIII().rob(root));

		root = setupTree(new Integer[] { 2 });
		assertEquals(2, new HouseRobberIII().rob(root));

		root = setupTree(new Integer[0]);
		assertEquals(0, new HouseRobberIII().rob(root));
	}

	/**
	 * Test cases for 437. Path Sum III
	 * 
	 * @see PathSumIII
	 */
	@Test
	void testPathSumIII() {
		TreeNode root = setupTree();
		assertEquals(2, new PathSumIII().pathSum(root, 3));
		assertEquals(1, new PathSumIII().pathSum(root, 2));

		root = setupTree(new Integer[0]);
		assertEquals(0, new PathSumIII().pathSum(root, 2));

		root = setupTree(new Integer[] { 8 });
		assertEquals(0, new PathSumIII().pathSum(root, 2));
		assertEquals(1, new PathSumIII().pathSum(root, 8));

		root = setupTree(new Integer[] { 10, 5, -3, 3, 2, null, 11, 3, -2, null, 1 });
		assertEquals(3, new PathSumIII().pathSum(root, 8));
		assertEquals(3, new PathSumIII().pathSum(root, 3));
	}

	/**
	 * Test cases for 508. Most Frequent Subtree Sum
	 * 
	 * @see MostFrequentSubtreeSum
	 */
	@Test
	void testMostFrequentSubtreeSum() {
		TreeNode root = setupTree(new Integer[] { 5, 2, -3 });
		int[] expected = new int[] { 2, -3, 4 };
		int[] actual = new MostFrequentSubtreeSum().findFrequentTreeSum(root);
		Arrays.sort(expected);
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);

		root = setupTree(new Integer[] { 5, 2, -5 });
		assertArrayEquals(new int[] { 2 }, new MostFrequentSubtreeSum().findFrequentTreeSum(root));
	}

	/**
	 * Test cases for 543. Diameter of Binary Tree
	 * 
	 * @see DiameterOfBinaryTree
	 */
	@Test
	void testDiameterOfBinaryTree() {
		TreeNode root = setupTree(new Integer[] { 1, 2, 3, 4, 5 });
		assertEquals(3, new DiameterOfBinaryTree().diameterOfBinaryTree(root));

		root = setupTree(new Integer[0]);
		assertEquals(0, new DiameterOfBinaryTree().diameterOfBinaryTree(root));

		root = setupTree(new Integer[] { 1 });
		assertEquals(0, new DiameterOfBinaryTree().diameterOfBinaryTree(root));

		root = setupTree(new Integer[] { 1, 2 });
		assertEquals(1, new DiameterOfBinaryTree().diameterOfBinaryTree(root));

		root = setupTree(new Integer[] { 1, 2, null, 4, 5, 6, 7, 8, null, null, null, null, 9 });
		assertEquals(5, new DiameterOfBinaryTree().diameterOfBinaryTree(root));
	}

	/**
	 * Test cases for 572. Subtree of Another Tree
	 * 
	 * @see SubtreeOfAnotherTree
	 */
	@Test
	void testSubtreeOfAnotherTree() {
		TreeNode root = setupTree(new Integer[] { 3, 4, 5, 1, 2 });
		assertTrue(new SubtreeOfAnotherTree().isSubtree(root, setupTree(new Integer[] { 4, 1, 2 })));

		root = setupTree(new Integer[] { 3, 4, 5, 1, 2, null, null, null, null, 0 });
		assertFalse(new SubtreeOfAnotherTree().isSubtree(root, setupTree(new Integer[] { 4, 1, 2 })));

		root = setupTree(new Integer[] { 3, 4, 5, 1, null, 2 });
		assertFalse(new SubtreeOfAnotherTree().isSubtree(root, setupTree(new Integer[] { 3, 1, 2 })));
	}

	/**
	 * Test cases for 617. Merge Two Binary Trees
	 * 
	 * @see MergeTwoBinaryTrees
	 */
	@Test
	void testMergeTwoBinaryTrees() {
		TreeNode root1 = setupTree(new Integer[] { 1, 3, 2, 5 });
		TreeNode root2 = setupTree(new Integer[] { 2, 1, 3, null, 4, null, 7 });
		TreeNode expected = setupTree(new Integer[] { 3, 4, 5, 5, 4, null, 7 });
		assertEquals(expected.toString(), new MergeTwoBinaryTrees().mergeTrees(root1, root2).toString());

		root1 = setupTree(new Integer[] {});
		root2 = setupTree(new Integer[] { 2, 1, 3, null, 4, null, 7 });
		expected = setupTree(new Integer[] { 2, 1, 3, null, 4, null, 7 });
		assertEquals(expected.toString(), new MergeTwoBinaryTrees().mergeTrees(root1, root2).toString());

		root1 = setupTree(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		root2 = setupTree(new Integer[] { 2, 1, 3, null, 4, null, 7 });
		expected = setupTree(new Integer[] { 3, 3, 6, 4, 9, 6, 14, 8, 9 });
		assertEquals(expected.toString(), new MergeTwoBinaryTrees().mergeTrees(root1, root2).toString());
	}

	/**
	 * Test cases for 654. Maximum Binary Tree
	 * 
	 * @see MaximumBinaryTree
	 */
	@Test
	void testMaximumBinaryTree() {
		TreeNode root = setupTree(new Integer[] { 6, 3, 5, null, 2, 0, null, null, 1 });
		assertEquals(root.toString(),
				new MaximumBinaryTree().constructMaximumBinaryTree(new int[] { 3, 2, 1, 6, 0, 5 }).toString());

		root = setupTree(new Integer[] { 3 });
		assertEquals(root.toString(), new MaximumBinaryTree().constructMaximumBinaryTree(new int[] { 3 }).toString());
	}

	/**
	 * Test cases for 700. Search in a Binary Search Tree
	 * 
	 * @see SearchInABinarySearchTree
	 */
	@Test
	void testSearchInABinarySearchTree() {
		TreeNode root = setupTree(new Integer[] { 4, 2, 7, 1, 3 });
		assertEquals(root.left, new SearchInABinarySearchTree().searchBST(root, 2));
	}

	/**
	 * Test cases for 938. Range Sum of BST
	 * 
	 * @see RangeSumOfBST
	 */
	@Test
	void testRangeSumOfBST() {
		TreeNode root = setupTree(new Integer[] { 10, 5, 15, 3, 7, null, 18 });
		assertEquals(32, new RangeSumOfBST().rangeSumBST(root, 7, 15));

		root = setupTree(new Integer[] { 10, 5, 15, 3, 7, 13, 18, 1, null, 6 });
		assertEquals(23, new RangeSumOfBST().rangeSumBST(root, 6, 10));

		root = setupTree(new Integer[0]);
		assertEquals(0, new RangeSumOfBST().rangeSumBST(root, 6, 10));
	}

	TreeNode setupTree() {
		return setupTree(new Integer[] { 1, null, 2, 3 });
	}

	TreeNode setupTree(Integer[] array) {
		if (array.length == 0) {
			return null;
		}

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		TreeNode root = new TreeNode(array[0]);
		queue.offer(root);
		boolean left = true;

		for (int i = 1; i < array.length; i++) {
			TreeNode parent = queue.peek();

			if (array[i] != null) {
				TreeNode child = new TreeNode(array[i]);

				if (left) {
					parent.left = child;
				} else {
					parent.right = child;
					queue.poll();
				}
				queue.offer(child);
			} else {
				if (!left) {
					queue.poll();
				}
			}

			left = !left;
		}

		return root;
	}

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}

		@Override
		public String toString() {
			String s = "[";
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.add(this);

			while (!queue.isEmpty()) {
				TreeNode curr = queue.poll();
				if (curr != null) {
					s += curr.val + ",";
					queue.add(curr.left);
					queue.add(curr.right);
				} else {
					s += "null,";
				}
			}

			int lastIndex = s.length() - 1;
			for (int i = s.length() - 1; i >= 0; i--) {
				char c = s.charAt(i);
				if (Character.isDigit(c)) {
					lastIndex = i;
					break;
				}
			}

			return s.substring(0, lastIndex + 1) + "]";
		}
	}

}

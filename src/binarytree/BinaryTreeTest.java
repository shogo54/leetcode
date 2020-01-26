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
		TreeNode root = setupTree(1, null, 2, 3);
		assertEquals(Arrays.asList(1, 3, 2), new BinaryTreeInorderTraversal().inorderTraversal(root));

		root = setupTree(5);
		assertEquals(Arrays.asList(5), new BinaryTreeInorderTraversal().inorderTraversal(root));

		root = null;
		assertEquals(Arrays.asList(), new BinaryTreeInorderTraversal().inorderTraversal(root));
	}

	/**
	 * Test cases for 98. Validate Binary Search Tree
	 * 
	 * @see ValidateBinarySearchTree
	 */
	@Test
	void testValidateBinarySearchTree() {
		TreeNode root = setupTree(2, 1, 3);
		assertTrue(new ValidateBinarySearchTree().isValidBST(root));

		root = setupTree(10, 5, 15, null, null, 6, 20);
		assertFalse(new ValidateBinarySearchTree().isValidBST(root));

		root = setupTree(1);
		assertTrue(new ValidateBinarySearchTree().isValidBST(root));

		root = null;
		assertTrue(new ValidateBinarySearchTree().isValidBST(root));
	}

	/**
	 * Test cases for 100. Same Tree
	 * 
	 * @see SameTree
	 */
	@Test
	void testSameTree() {
		TreeNode root1 = setupTree(1, 2, 3);
		TreeNode root2 = setupTree(1, 2, 3);
		assertTrue(new SameTree().isSameTree(root1, root2));

		root1 = setupTree(1, 2);
		root2 = setupTree(1, null, 2);
		assertFalse(new SameTree().isSameTree(root1, root2));

		root1 = null;
		root2 = setupTree(1, 2);
		assertFalse(new SameTree().isSameTree(root1, root2));

		root1 = null;
		root2 = null;
		assertTrue(new SameTree().isSameTree(root1, root2));
	}

	/**
	 * Test cases for 101. Symmetric Tree
	 * 
	 * @see SymmetricTree
	 */
	@Test
	void testSymmetricTree() {
		TreeNode root = setupTree(1, 2, 2, 3, 4, 4, 3);
		assertTrue(new SymmetricTree().isSymmetric(root));

		root = setupTree(1, 2, 2, null, 3, null, 3);
		assertFalse(new SymmetricTree().isSymmetric(root));

		root = setupTree(6);
		assertTrue(new SymmetricTree().isSymmetric(root));

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
		TreeNode root = setupTree(3, 9, 20, null, null, 15, 7);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(Arrays.asList(3));
		list.add(Arrays.asList(9, 20));
		list.add(Arrays.asList(15, 7));
		assertEquals(list, new BinaryTreeLevelOrderTraversal().levelOrder(root));

		root = setupTree(5);
		list = new ArrayList<List<Integer>>();
		list.add(Arrays.asList(5));
		assertEquals(list, new BinaryTreeLevelOrderTraversal().levelOrder(root));

		root = null;
		assertEquals(Arrays.asList(), new BinaryTreeLevelOrderTraversal().levelOrder(root));
	}

	/**
	 * Test cases for 103. Binary Tree Zigzag Level Order Traversal
	 * 
	 * @see BinaryTreeZigzagLevelOrderTraversal
	 */
	@Test
	void testBinaryTreeZigzagLevelOrderTraversal() {
		TreeNode root = setupTree(3, 9, 20, null, null, 15, 7);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(Arrays.asList(3));
		list.add(Arrays.asList(20, 9));
		list.add(Arrays.asList(15, 7));
		assertEquals(list, new BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(root));

		root = setupTree(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
		list = new ArrayList<List<Integer>>();
		list.add(Arrays.asList(1));
		list.add(Arrays.asList(3, 2));
		list.add(Arrays.asList(4, 5, 6, 7));
		list.add(Arrays.asList(15, 14, 13, 12, 11, 10, 9, 8));
		list.add(Arrays.asList(16));
		assertEquals(list, new BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(root));

		root = setupTree(5);
		list = new ArrayList<List<Integer>>();
		list.add(Arrays.asList(5));
		assertEquals(list, new BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(root));

		root = null;
		list = new ArrayList<List<Integer>>();
		assertEquals(list, new BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(root));
	}

	/**
	 * Test cases for 104. Maximum Depth of Binary Tree
	 * 
	 * @see MaximumDepthOfBinaryTree
	 * @see MaximumDepthOfBinaryTree2
	 */
	@Test
	void testMaximumDepthOfBinaryTree() {
		//
		// Test for MaximumDepthOfBinaryTree
		//
		TreeNode root = setupTree(3, 9, 20, null, null, 15, 21);
		assertEquals(3, new MaximumDepthOfBinaryTree().maxDepth(root));

		root = null;
		assertEquals(0, new MaximumDepthOfBinaryTree().maxDepth(root));

		root = setupTree(5);
		assertEquals(1, new MaximumDepthOfBinaryTree().maxDepth(root));

		//
		// Test for MaximumDepthOfBinaryTree2
		//
		root = setupTree(3, 9, 20, null, null, 15, 21);
		assertEquals(3, new MaximumDepthOfBinaryTree2().maxDepth(root));

		root = null;
		assertEquals(0, new MaximumDepthOfBinaryTree2().maxDepth(root));

		root = setupTree(5);
		assertEquals(1, new MaximumDepthOfBinaryTree2().maxDepth(root));
	}

	/**
	 * Test cases for 105. Construct Binary Tree from Preorder and Inorder Traversal
	 * 
	 * @see ConstructBinaryTreeFromPreorderAndInorderTraversal
	 * @see ConstructBinaryTreeFromPreorderAndInorderTraversal2
	 */
	@Test
	void testConstructBinaryTreeFromPreorderAndInorderTraversal() {
		//
		// Test for ConstructBinaryTreeFromPreorderAndInorderTraversal
		//
		ConstructBinaryTreeFromPreorderAndInorderTraversal builder = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
		TreeNode exptected = setupTree(3, 9, 20, null, null, 15, 7);
		TreeNode actual = builder.buildTree(new int[] { 3, 9, 20, 15, 7 }, new int[] { 9, 3, 15, 20, 7 });
		assertEquals(exptected, actual);

		builder = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
		exptected = setupTree(4, 1, null, null, 2, null, 3);
		actual = builder.buildTree(new int[] { 4, 1, 2, 3 }, new int[] { 1, 2, 3, 4 });
		assertEquals(exptected, actual);

		//
		// Test for ConstructBinaryTreeFromPreorderAndInorderTraversal2
		//
		ConstructBinaryTreeFromPreorderAndInorderTraversal2 builder2 = new ConstructBinaryTreeFromPreorderAndInorderTraversal2();
		exptected = setupTree(3, 9, 20, null, null, 15, 7);
		actual = builder2.buildTree(new int[] { 3, 9, 20, 15, 7 }, new int[] { 9, 3, 15, 20, 7 });
		assertEquals(exptected, actual);

		builder = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
		exptected = setupTree(4, 1, null, null, 2, null, 3);
		actual = builder2.buildTree(new int[] { 4, 1, 2, 3 }, new int[] { 1, 2, 3, 4 });
		assertEquals(exptected, actual);
	}

	/**
	 * Test cases for 108. Convert Sorted Array to Binary Search Tree
	 * 
	 * @see ConvertSortedArrayToBinarySearchTree
	 */
	@Test
	void testConvertSortedArrayToBinarySearchTree() {
		ConvertSortedArrayToBinarySearchTree converter = new ConvertSortedArrayToBinarySearchTree();
		TreeNode expected = setupTree(0, -10, 5, null, -3, null, 9);
		TreeNode actual = converter.sortedArrayToBST(new int[] { -10, -3, 0, 5, 9 });
		assertEquals(expected, actual);

		expected = null;
		actual = converter.sortedArrayToBST(new int[0]);
		assertEquals(expected, actual);

		expected = setupTree(5);
		actual = converter.sortedArrayToBST(new int[] { 5 });
		assertEquals(expected, actual);
	}

	/**
	 * Test cases for 114. Flatten Binary Tree to Linked List
	 * 
	 * @see FlattenBinaryTreeToLinkedList
	 */
	void testFlattenBinaryTreeToLinkedList() {
		TreeNode root = setupTree(1, 2, 5, 3, 4, null, 6);
		TreeNode expected = setupTree(1, null, 2, null, 3, null, 4, null, 5, null, 6);
		new FlattenBinaryTreeToLinkedList().flatten(root);
		assertEquals(expected, root);

		root = setupTree(1, 2, 5, 3, 4, 6, 7);
		expected = setupTree(1, null, 2, null, 3, null, 4, null, 5, null, 6, null, 7);
		new FlattenBinaryTreeToLinkedList().flatten(root);
		assertEquals(expected, root);

		root = setupTree(1, 2, null, 3, null, 4);
		expected = setupTree(1, null, 2, null, 3, null, 4);
		new FlattenBinaryTreeToLinkedList().flatten(root);
		assertEquals(expected, root);

		root = setupTree(1, null, 2, null, 3, null, 4);
		expected = setupTree(1, null, 2, null, 3, null, 4);
		new FlattenBinaryTreeToLinkedList().flatten(root);
		assertEquals(expected, root);

		root = setupTree(1);
		expected = setupTree(1);
		new FlattenBinaryTreeToLinkedList().flatten(root);
		assertEquals(expected, root);

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
		TreeNode root = setupTree(1, 2, 3);
		assertEquals(6, new BinaryTreeMaximumPathSum().maxPathSum(root));

		root = setupTree(-10, 9, 20, null, null, 15, 7);
		assertEquals(42, new BinaryTreeMaximumPathSum().maxPathSum(root));

		root = setupTree(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1);
		assertEquals(48, new BinaryTreeMaximumPathSum().maxPathSum(root));

		root = setupTree(9);
		assertEquals(9, new BinaryTreeMaximumPathSum().maxPathSum(root));
	}

	/**
	 * Test cases for 145. Binary Tree Postorder Traversal
	 * 
	 * @see BinaryTreePostorderTraversal
	 */
	@Test
	void testBinaryTreePostorderTraversal() {
		TreeNode root = setupTree(1, null, 2, 3);
		assertEquals(Arrays.asList(3, 2, 1), new BinaryTreePostorderTraversal().postorderTraversal(root));

		root = setupTree(5);
		assertEquals(Arrays.asList(5), new BinaryTreePostorderTraversal().postorderTraversal(root));

		root = null;
		assertEquals(Arrays.asList(), new BinaryTreePostorderTraversal().postorderTraversal(root));
	}

	/**
	 * Test cases for 226. Invert Binary Tree
	 * 
	 * @see InvertBinaryTree
	 */
	@Test
	void testInvertBinaryTree() {
		TreeNode root = setupTree(4, 2, 7, 1, 3, 6, 9);
		TreeNode expected = setupTree(4, 7, 2, 9, 6, 3, 1);
		assertEquals(expected, new InvertBinaryTree().invertTree(root));

		root = setupTree(7);
		expected = setupTree(7);
		assertEquals(expected, new InvertBinaryTree().invertTree(root));

		root = null;
		expected = null;
		assertEquals(expected, new InvertBinaryTree().invertTree(root));
	}

	/**
	 * Test cases for 230. Kth Smallest Element in a BST
	 * 
	 * @see KthSmallestElementInABST
	 */
	@Test
	void testKthSmallestElementInABST() {
		TreeNode root = setupTree(3, 1, 4, null, 2);
		assertEquals(1, new KthSmallestElementInABST().kthSmallest(root, 1));

		root = setupTree(5, 3, 6, 2, 4, null, null, 1);
		assertEquals(3, new KthSmallestElementInABST().kthSmallest(root, 3));

		root = setupTree(4);
		assertEquals(4, new KthSmallestElementInABST().kthSmallest(root, 1));
	}

	/**
	 * Test cases for 235. Lowest Common Ancestor of a Binary Search Tree
	 * 
	 * @see LowestCommonAncestorOfABinarySearchTree
	 */
	@Test
	void testLowestCommonAncestorOfABinarySearchTree() {
		LowestCommonAncestorOfABinarySearchTree tester = new LowestCommonAncestorOfABinarySearchTree();

		TreeNode root = setupTree(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5);

		assertEquals(root, tester.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(8)));

		assertEquals(root.left, tester.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(4)));
	}

	/**
	 * Test cases for 297. Serialize and Deserialize Binary Tree
	 * 
	 * @see SerializeAndDeserializeBinaryTree
	 */
	@Test
	void testSerializeAndDeserializeBinaryTree() {
		SerializeAndDeserializeBinaryTree tester = new SerializeAndDeserializeBinaryTree();

		TreeNode root = null;
		assertEquals(root, tester.deserialize(tester.serialize(root)));

		root = setupTree(1, 2, 3, null, null, 4, 5);
		assertEquals(root, tester.deserialize(tester.serialize(root)));

		root = setupTree(1, 2, null, 3, null, 4, null, 5);
		assertEquals(root, tester.deserialize(tester.serialize(root)));

		root = setupTree(2, null, 3, null, 4, null, 5, null, 6);
		assertEquals(root, tester.deserialize(tester.serialize(root)));

		root = setupTree(2);
		assertEquals(root, tester.deserialize(tester.serialize(root)));
	}

	/**
	 * Test cases for 337. House Robber III
	 * 
	 * @see HouseRobberIII
	 */
	@Test
	void testHouseRobberIII() {
		TreeNode root = setupTree(1, null, 2, 3);
		assertEquals(4, new HouseRobberIII().rob(root));

		root = setupTree(3, 2, 3, null, 3, null, 1);
		assertEquals(7, new HouseRobberIII().rob(root));

		root = setupTree(3, 4, 5, 1, 3, null, 1);
		assertEquals(9, new HouseRobberIII().rob(root));

		root = setupTree(2, 1, 3, null, 4);
		assertEquals(7, new HouseRobberIII().rob(root));

		root = setupTree(2);
		assertEquals(2, new HouseRobberIII().rob(root));

		root = null;
		assertEquals(0, new HouseRobberIII().rob(root));
	}

	/**
	 * Test cases for 437. Path Sum III
	 * 
	 * @see PathSumIII
	 */
	@Test
	void testPathSumIII() {
		TreeNode root = setupTree(1, null, 2, 3);
		assertEquals(2, new PathSumIII().pathSum(root, 3));
		assertEquals(1, new PathSumIII().pathSum(root, 2));

		root = null;
		assertEquals(0, new PathSumIII().pathSum(root, 2));

		root = setupTree(8);
		assertEquals(0, new PathSumIII().pathSum(root, 2));
		assertEquals(1, new PathSumIII().pathSum(root, 8));

		root = setupTree(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1);
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
		TreeNode root = setupTree(5, 2, -3);
		int[] expected = new int[] { 2, -3, 4 };
		int[] actual = new MostFrequentSubtreeSum().findFrequentTreeSum(root);
		Arrays.sort(expected);
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);

		root = setupTree(5, 2, -5);
		assertArrayEquals(new int[] { 2 }, new MostFrequentSubtreeSum().findFrequentTreeSum(root));

		root = setupTree(5);
		assertArrayEquals(new int[] { 5 }, new MostFrequentSubtreeSum().findFrequentTreeSum(root));

		root = null;
		assertArrayEquals(new int[0], new MostFrequentSubtreeSum().findFrequentTreeSum(root));
	}

	/**
	 * Test cases for 543. Diameter of Binary Tree
	 * 
	 * @see DiameterOfBinaryTree
	 */
	@Test
	void testDiameterOfBinaryTree() {
		TreeNode root = setupTree(1, 2, 3, 4, 5);
		assertEquals(3, new DiameterOfBinaryTree().diameterOfBinaryTree(root));

		root = null;
		assertEquals(0, new DiameterOfBinaryTree().diameterOfBinaryTree(root));

		root = setupTree(1);
		assertEquals(0, new DiameterOfBinaryTree().diameterOfBinaryTree(root));

		root = setupTree(1, 2);
		assertEquals(1, new DiameterOfBinaryTree().diameterOfBinaryTree(root));

		root = setupTree(1, 2, null, 4, 5, 6, 7, 8, null, null, null, null, 9);
		assertEquals(5, new DiameterOfBinaryTree().diameterOfBinaryTree(root));
	}

	/**
	 * Test cases for 572. Subtree of Another Tree
	 * 
	 * @see SubtreeOfAnotherTree
	 */
	@Test
	void testSubtreeOfAnotherTree() {
		TreeNode root = setupTree(3, 4, 5, 1, 2);
		assertTrue(new SubtreeOfAnotherTree().isSubtree(root, setupTree(4, 1, 2)));

		root = setupTree(3, 4, 5, 1, 2, null, null, null, null, 0);
		assertFalse(new SubtreeOfAnotherTree().isSubtree(root, setupTree(4, 1, 2)));

		root = setupTree(3, 4, 5, 1, null, 2);
		assertFalse(new SubtreeOfAnotherTree().isSubtree(root, setupTree(3, 1, 2)));

		root = null;
		assertFalse(new SubtreeOfAnotherTree().isSubtree(root, setupTree(3, 1, 2)));

		root = setupTree(4);
		assertTrue(new SubtreeOfAnotherTree().isSubtree(root, setupTree(4)));
	}

	/**
	 * Test cases for 617. Merge Two Binary Trees
	 * 
	 * @see MergeTwoBinaryTrees
	 */
	@Test
	void testMergeTwoBinaryTrees() {
		TreeNode root1 = setupTree(1, 3, 2, 5);
		TreeNode root2 = setupTree(2, 1, 3, null, 4, null, 7);
		TreeNode expected = setupTree(3, 4, 5, 5, 4, null, 7);
		assertEquals(expected, new MergeTwoBinaryTrees().mergeTrees(root1, root2));

		root1 = null;
		root2 = setupTree(2, 1, 3, null, 4, null, 7);
		expected = setupTree(2, 1, 3, null, 4, null, 7);
		assertEquals(expected, new MergeTwoBinaryTrees().mergeTrees(root1, root2));

		root1 = setupTree(1, 2, 3, 4, 5, 6, 7, 8, 9);
		root2 = setupTree(2, 1, 3, null, 4, null, 7);
		expected = setupTree(3, 3, 6, 4, 9, 6, 14, 8, 9);
		assertEquals(expected, new MergeTwoBinaryTrees().mergeTrees(root1, root2));

		root1 = null;
		root2 = null;
		expected = null;
		assertEquals(expected, new MergeTwoBinaryTrees().mergeTrees(root1, root2));
	}

	/**
	 * Test cases for 623. Add One Row to Tree
	 * 
	 * @see AddOneRowToTree
	 */
	@Test
	void testAddOneRowToTree() {
		TreeNode root = setupTree(4, 2, 6, 3, 1, 5);
		TreeNode expected = setupTree(4, 1, 1, 2, null, null, 6, 3, 1, 5);
		assertEquals(expected, new AddOneRowToTree().addOneRow(root, 1, 2));

		root = setupTree(4, 2, null, 3, 1);
		expected = setupTree(4, 2, null, 1, 1, 3, null, null, 1);
		assertEquals(expected, new AddOneRowToTree().addOneRow(root, 1, 3));

		root = setupTree(4, 2, 6, 3, 1, 5);
		expected = setupTree(1, 4, null, 2, 6, 3, 1, 5);
		assertEquals(expected, new AddOneRowToTree().addOneRow(root, 1, 1));

		root = setupTree(4, 2, 6, 3, 1, 5);
		expected = setupTree(4, 2, 6, 3, 1, 5, null, 1, 1, 1, 1, 1, 1);
		assertEquals(expected, new AddOneRowToTree().addOneRow(root, 1, 4));

		root = setupTree(4);
		expected = setupTree(3, 4);
		assertEquals(expected, new AddOneRowToTree().addOneRow(root, 3, 1));

		root = setupTree(4);
		expected = setupTree(4, 3, 3);
		assertEquals(expected, new AddOneRowToTree().addOneRow(root, 3, 2));
	}

	/**
	 * Test cases for 654. Maximum Binary Tree
	 * 
	 * @see MaximumBinaryTree
	 */
	@Test
	void testMaximumBinaryTree() {
		TreeNode root = setupTree(6, 3, 5, null, 2, 0, null, null, 1);
		assertEquals(root, new MaximumBinaryTree().constructMaximumBinaryTree(new int[] { 3, 2, 1, 6, 0, 5 }));

		root = setupTree(3);
		assertEquals(root, new MaximumBinaryTree().constructMaximumBinaryTree(new int[] { 3 }));

		root = null;
		assertEquals(root, new MaximumBinaryTree().constructMaximumBinaryTree(new int[0]));
	}

	/**
	 * Test cases for 700. Search in a Binary Search Tree
	 * 
	 * @see SearchInABinarySearchTree
	 */
	@Test
	void testSearchInABinarySearchTree() {
		TreeNode root = setupTree(4, 2, 7, 1, 3);
		assertEquals(root.left, new SearchInABinarySearchTree().searchBST(root, 2));

		assertEquals(root, new SearchInABinarySearchTree().searchBST(root, 4));

		assertEquals(null, new SearchInABinarySearchTree().searchBST(root, 8));

		root = setupTree(2);
		assertEquals(null, new SearchInABinarySearchTree().searchBST(root, 6));

		assertEquals(root, new SearchInABinarySearchTree().searchBST(root, 2));
	}

	/**
	 * Test cases for 814. Binary Tree Pruning
	 * 
	 * @see BinaryTreePruning
	 */
	@Test
	void testBinaryTreePruning() {
		TreeNode root = setupTree(1, null, 0, 0, 1);
		TreeNode expected = setupTree(1, null, 0, null, 1);
		assertEquals(expected, new BinaryTreePruning().pruneTree(root));

		root = setupTree(1, 0, 1, 0, 0, 0, 1);
		expected = setupTree(1, null, 1, null, 1);
		assertEquals(expected, new BinaryTreePruning().pruneTree(root));

		root = setupTree(1, 1, 0, 1, 1, 0, 1, 0);
		expected = setupTree(1, 1, 0, 1, 1, null, 1);
		assertEquals(expected, new BinaryTreePruning().pruneTree(root));

		root = setupTree(1);
		expected = setupTree(1);
		assertEquals(expected, new BinaryTreePruning().pruneTree(root));

		root = null;
		expected = null;
		assertEquals(expected, new BinaryTreePruning().pruneTree(root));

		root = setupTree(0, 0, 0, 0, 0);
		expected = null;
		assertEquals(expected, new BinaryTreePruning().pruneTree(root));

		root = null;
		expected = null;
		assertEquals(expected, new BinaryTreePruning().pruneTree(root));
	}

	/**
	 * Test cases for 938. Range Sum of BST
	 * 
	 * @see RangeSumOfBST
	 */
	@Test
	void testRangeSumOfBST() {
		TreeNode root = setupTree(10, 5, 15, 3, 7, null, 18);
		assertEquals(32, new RangeSumOfBST().rangeSumBST(root, 7, 15));

		root = setupTree(10, 5, 15, 3, 7, 13, 18, 1, null, 6);
		assertEquals(23, new RangeSumOfBST().rangeSumBST(root, 6, 10));

		root = setupTree(10);
		assertEquals(10, new RangeSumOfBST().rangeSumBST(root, 6, 10));

		root = null;
		assertEquals(0, new RangeSumOfBST().rangeSumBST(root, 6, 10));
	}

	/**
	 * Test cases for 958. Check Completeness of a Binary Tree
	 * 
	 * @see CheckCompletenessOfABinaryTree
	 */
	@Test
	void testCheckCompletenessOfABinaryTree() {
		TreeNode root = setupTree(1, 2, 3, 4, 5, 6);
		assertTrue(new CheckCompletenessOfABinaryTree().isCompleteTree(root));

		root = setupTree(1, 2, 3, 4, 5, null, 7);
		assertFalse(new CheckCompletenessOfABinaryTree().isCompleteTree(root));

		root = setupTree(1, null, 3, 4);
		assertFalse(new CheckCompletenessOfABinaryTree().isCompleteTree(root));

		root = setupTree(1, 2, 3);
		assertTrue(new CheckCompletenessOfABinaryTree().isCompleteTree(root));

		root = setupTree(1, 2);
		assertTrue(new CheckCompletenessOfABinaryTree().isCompleteTree(root));

		root = setupTree(1);
		assertTrue(new CheckCompletenessOfABinaryTree().isCompleteTree(root));

		root = null;
		assertTrue(new CheckCompletenessOfABinaryTree().isCompleteTree(root));
	}

	/**
	 * Test cases for 1110. Delete Nodes And Return Forest
	 * 
	 * @see DeleteNodesAndReturnForest
	 */
	@Test
	void testDeleteNodesAndReturnForest() {
		TreeNode root = setupTree(1, 2, 3, 4, 5, 6, 7);
		int[] toDelete = new int[] { 3, 5 };
		List<TreeNode> expected = Arrays.asList(setupTree(1, 2, null, 4), setupTree(6), setupTree(7));
		List<TreeNode> actual = new DeleteNodesAndReturnForest().delNodes(root, toDelete);
		assertTrue(expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected));

		root = setupTree(1, 2, 3, 4, 5, 6, 7);
		toDelete = new int[] { 1, 3, 5 };
		expected = Arrays.asList(setupTree(2, 4), setupTree(6), setupTree(7));
		actual = new DeleteNodesAndReturnForest().delNodes(root, toDelete);
		assertTrue(expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected));

		root = setupTree(1, 2, 3, 4, 5, 6, 7);
		toDelete = new int[] { 1 };
		expected = Arrays.asList(setupTree(2, 4, 5), setupTree(3, 6, 7));
		actual = new DeleteNodesAndReturnForest().delNodes(root, toDelete);
		assertTrue(expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected));

		root = setupTree();
		toDelete = new int[] { 1 };
		expected = Arrays.asList();
		actual = new DeleteNodesAndReturnForest().delNodes(root, toDelete);
		assertTrue(expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected));
	}

	/**
	 * test cases for 1161. Maximum Level Sum of a Binary Tree
	 * 
	 * @see MaximumLevelSumOfABinaryTree
	 */
	@Test
	void testMaximumLevelSumOfABinaryTree() {
		TreeNode root = setupTree(1, 7, 0, 7, -8);
		assertEquals(2, new MaximumLevelSumOfABinaryTree().maxLevelSum(root));

		root = setupTree(1);
		assertEquals(1, new MaximumLevelSumOfABinaryTree().maxLevelSum(root));

		root = setupTree(1, 7, -6);
		assertEquals(1, new MaximumLevelSumOfABinaryTree().maxLevelSum(root));
	}

	/**
	 * Test cases for 1261. Find Elements in a Contaminated Binary Tree
	 * 
	 * @see FindElements
	 */
	void testFindElementsInAContaminatedBinaryTree() {
		TreeNode root = setupTree(-1, null, -1);
		FindElements findElements = new FindElements(root);
		assertFalse(findElements.find(1));
		assertTrue(findElements.find(2));

		root = setupTree(-1, -1, -1, -1, -1);
		findElements = new FindElements(root);
		assertTrue(findElements.find(1));
		assertTrue(findElements.find(3));
		assertFalse(findElements.find(5));

		root = setupTree(-1, null, -1, -1, null, -1);
		findElements = new FindElements(root);
		assertTrue(findElements.find(2));
		assertFalse(findElements.find(3));
		assertFalse(findElements.find(4));
		assertTrue(findElements.find(3));

		root = setupTree(-1);
		findElements = new FindElements(root);
		assertTrue(findElements.find(0));
		assertFalse(findElements.find(-1));
		assertFalse(findElements.find(2));
	}

	TreeNode setupTree(Integer... array) {
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

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (!(obj instanceof TreeNode)) {
				return false;
			}

			TreeNode other = (TreeNode) obj;
			return compare(this, other);
		}

		boolean compare(TreeNode t1, TreeNode t2) {
			if (t1 == t2) {
				return true;
			}
			if (t1 == null || t2 == null) {
				return false;
			}
			if (t1.val == t2.val && compare(t1.left, t2.left) && compare(t1.right, t2.right)) {
				return true;
			}
			return false;
		}
	}

}

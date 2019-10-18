package binarytree;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {

	/**
	 * Test cases for 94. Binary Tree Inorder Traversal
	 * @see BinaryTreeInorderTraversal
	 */
	@Test
	void testBinaryTreeInorderTraversal() throws Exception{
		TreeNode root = setupTree();
		assertEquals(new ArrayList<Integer>(Arrays.asList(1,3,2)), new BinaryTreeInorderTraversal().inorderTraversal(root));
	}

	/**
	 * Test cases for 98. Validate Binary Search Tree
	 * @see ValidateBinarySearchTree
	 */
	@Test
	void testValidateBinarySearchTree() throws Exception{
		TreeNode root = setupTree(new Integer[] {2,1,3});
		assertTrue(new ValidateBinarySearchTree().isValidBST(root));
		root = setupTree(new Integer[] {10,5,15,null,null,6,20});
		assertFalse(new ValidateBinarySearchTree().isValidBST(root));
	}

	/**
	 * Test cases for 100. Same Tree
	 * @see SameTree
	 */
	@Test
	void testSameTree() throws Exception{
		SameTree st = new SameTree();
		TreeNode root1 = setupTree(new Integer[] {1,2,3});
		TreeNode root2 = setupTree(new Integer[] {1,2,3});
		assertTrue(st.isSameTree(root1, root2));
		
		root1 = setupTree(new Integer[] {1,2});
		root2 = setupTree(new Integer[] {1,null,2});
		assertFalse(st.isSameTree(root1, root2));
	}

	/**
	 * Test cases for 102. Binary Tree Level Order Traversal
	 * @see BinaryTreeLevelOrderTraversal
	 */
	@Test
	void testBinaryTreeLevelOrderTraversal() throws Exception{
		TreeNode root = setupTree(new Integer[] {3,9,20,null,null,15,7});
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(Arrays.asList(3));
		list.add(Arrays.asList(9, 20));
		list.add(Arrays.asList(15, 7));
		assertEquals(list, new BinaryTreeLevelOrderTraversal().levelOrder(root));
	}

	/**
	 * Test cases for 104. Maximum Depth of Binary Tree
	 * @see MaximumDepthOfBinaryTree
	 */
	@Test
	void testMaximumDepthOfBinaryTree() throws Exception{
		TreeNode root = setupTree(new Integer[] {3,9,20,null,null,15,21});
		assertEquals(3, new MaximumDepthOfBinaryTree().maxDepth(root));
	}

	/**
	 * Test cases for 105. Construct Binary Tree from Preorder and Inorder Traversal
	 * @see ConstructBinaryTreeFromPreorderAndInorderTraversal
	 * @see ConstructBinaryTreeFromPreorderAndInorderTraversal2
	 */
	@Test
	void testConstructBinaryTreeFromPreorderAndInorderTraversal() throws Exception{
		ConstructBinaryTreeFromPreorderAndInorderTraversal builder = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
		TreeNode exptected = setupTree(new Integer[] {3,9,20,null,null,15,7});
		TreeNode actual = builder.buildTree(new int[] {3,9,20,15,7}, new int[] {9,3,15,20,7});
		assertEquals(exptected.toString(), actual.toString());

		builder = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
		exptected = setupTree(new Integer[] {4,1,null,null,2, null, null, null, null,null, 3});
		actual = builder.buildTree(new int[] {4,1,2,3}, new int[] {1,2,3,4});
		assertEquals(exptected.toString(), actual.toString());
	}

	/**
	 * Test cases for 108. Convert Sorted Array to Binary Search Tree
	 * @see ConvertSortedArrayToBinarySearchTree
	 */
	@Test
	void testConvertSortedArrayToBinarySearchTree() throws Exception{
		TreeNode root = setupTree(new Integer[] {0,-3,9,-10,null,5});
		TreeNode converted = new ConvertSortedArrayToBinarySearchTree().sortedArrayToBST(new int[] {-10,-3,0,5,9});
		assertEquals(root.toString(), converted.toString());
	}

	/**
	 * Test cases for 124. Binary Tree Maximum Path Sum
	 * @see BinaryTreeMaximumPathSum
	 */
	@Test
	void testBinaryTreeMaximumPathSum() throws Exception{
		TreeNode root = setupTree(new Integer[] {1,2,3});
		assertEquals(6, new BinaryTreeMaximumPathSum().maxPathSum(root));
		
		root = setupTree(new Integer[] {-10,9,20,null,null,15,7});
		assertEquals(42, new BinaryTreeMaximumPathSum().maxPathSum(root));
		
		root = setupTree(new Integer[] {5,4,8,11,null,13,4,7,2,null,null,null,null,null,1});
		assertEquals(48, new BinaryTreeMaximumPathSum().maxPathSum(root));
	}

	/**
	 * Test cases for 145. Binary Tree Postorder Traversal
	 * @see BinaryTreePostorderTraversal
	 */
	@Test
	void testBinaryTreePostorderTraversal() throws Exception{
		TreeNode root = setupTree();
		assertEquals(new ArrayList<Integer>(Arrays.asList(3,2,1)), new BinaryTreePostorderTraversal().postorderTraversal(root));
	}

	/**
	 * Test cases for 226. Invert Binary Tree
	 * @see InvertBinaryTree
	 */
	@Test
	void testInvertBinaryTree() throws Exception{
		TreeNode root = setupTree(new Integer[] {4,2,7,1,3,6,9});
		TreeNode inverted = setupTree(new Integer[] {4,7,2,9,6,3,1});
		assertEquals(inverted.toString(), new InvertBinaryTree().invertTree(root).toString());
	}

	/**
	 * Test cases for 230. Kth Smallest Element in a BST
	 * @see KthSmallestElementInABST
	 */
	@Test
	void testKthSmallestElementInABST() throws Exception{
		TreeNode root = setupTree(new Integer[] {3,1,4,null,2});
		assertEquals(1, new KthSmallestElementInABST().kthSmallest(root, 1));
		
		root = setupTree(new Integer[] {5,3,6,2,4,null,null,1});
		assertEquals(3, new KthSmallestElementInABST().kthSmallest(root, 3));
	}

	/**
	 * Test cases for 235. Lowest Common Ancestor of a Binary Search Tree
	 * @see LowestCommonAncestorOfABinarySearchTree
	 */
	@Test
	void testLowestCommonAncestorOfABinarySearchTree() throws Exception{
		TreeNode root = setupTree(new Integer[] {6,2,8,0,4,7,9,null,null,3,5});
		LowestCommonAncestorOfABinarySearchTree tester = new LowestCommonAncestorOfABinarySearchTree();
		
		assertEquals(root.toString(), tester.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(8)).toString());
		
		assertEquals(root.left.toString(), tester.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(4)).toString());
	}

	/**
	 * Test cases for 297. Serialize and Deserialize Binary Tree
	 * @see SerializeAndDeserializeBinaryTree
	 */
	@Test
	void testSerializeAndDeserializeBinaryTree() throws Exception{
		SerializeAndDeserializeBinaryTree tester = new SerializeAndDeserializeBinaryTree();
		
		TreeNode root = setupTree();
		assertEquals(root.toString(), tester.deserialize(tester.serialize(root)).toString());
		
		root = setupTree(new Integer[] {1,2,3,null,null,4,5});
		assertEquals(root.toString(), tester.deserialize(tester.serialize(root)).toString());
		
		root = setupTree(new Integer[] {1,2,null,3,null,null,null,4});
		assertEquals(root.toString(), tester.deserialize(tester.serialize(root)).toString());
	}

	/**
	 * Test cases for 508. Most Frequent Subtree Sum
	 * @see MostFrequentSubtreeSum
	 */
	@Test
	void testMostFrequentSubtreeSum() throws Exception{
		TreeNode root = setupTree(new Integer[] {5,2,-3});
		int[] expected = new int[] {2,-3,4};
		int[] actual = new MostFrequentSubtreeSum().findFrequentTreeSum(root);
		Arrays.sort(expected);
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
		
		root = setupTree(new Integer[] {5,2,-5});
		assertArrayEquals(new int[] {2}, new MostFrequentSubtreeSum().findFrequentTreeSum(root));
	}

	/**
	 * Test cases for 572. Subtree of Another Tree
	 * @see SubtreeOfAnotherTree
	 */
	@Test
	void testSubtreeOfAnotherTree() throws Exception{
		TreeNode root = setupTree(new Integer[] {3,4,5,1,2});
		assertTrue(new SubtreeOfAnotherTree().isSubtree(root, setupTree(new Integer[] {4,1,2})));
		
		root = setupTree(new Integer[] {3,4,5,1,2,null,null,null,null,0});
		assertFalse(new SubtreeOfAnotherTree().isSubtree(root, setupTree(new Integer[] {4,1,2})));
		
		root = setupTree(new Integer[] {3,4,5,1,null,2});
		assertFalse(new SubtreeOfAnotherTree().isSubtree(root, setupTree(new Integer[] {3,1,2})));
	}

	/**
	 * Test cases for 654. Maximum Binary Tree
	 * @see MaximumBinaryTree
	 */
	@Test
	void testMaximumBinaryTree() throws Exception{
		TreeNode root = setupTree(new Integer[] {6,3,5,null,2,0,null,null,null,null,1});
		assertEquals(root.toString(), new MaximumBinaryTree().constructMaximumBinaryTree(new int[] {3,2,1,6,0,5}).toString());
		
		root = setupTree(new Integer[] {3});
		assertEquals(root.toString(), new MaximumBinaryTree().constructMaximumBinaryTree(new int[] {3}).toString());
	}

	/**
	 * Test cases for 700. Search in a Binary Search Tree
	 * @see SearchInABinarySearchTree
	 */
	@Test
	void testSearchInABinarySearchTree() throws Exception{
		TreeNode root = setupTree(new Integer[] {4,2,7,1,3});
		assertEquals(root.left, new SearchInABinarySearchTree().searchBST(root, 2));
	}

	TreeNode setupTree() throws Exception {
		return setupTree(new Integer[] {1,null,2,null,null,3});
	}
	
	TreeNode setupTree(Integer[] array) throws Exception{
		if(array.length == 0) {
			return null;
		}
		
		Map<Integer, TreeNode> map = new TreeMap<Integer, TreeNode>();
		boolean left = true;
		
		map.put(0, new TreeNode(array[0]));
		
		for(int i=1; i<array.length; i++) {
			if(array[i] == null) {
				left = !left;
				continue;
			}
			TreeNode t = new TreeNode(array[i]);
			
			if(left) {
				if(map.get(i/2) == null) {
					throw new Exception();
				}
				map.get(i/2).left = t;
				
			}else{
				if(map.get((i-1)/2) == null) {
					throw new Exception();
				}
				map.get((i-1)/2).right = t;
				
			}
			map.put(i, t);
			left = !left;
		}
		
		return map.get(0);
	}
	
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int x) {
			val = x;
		}
		
		public String toString() {
			return "[" + helper().substring(1) + "]";
		}
		
		private String helper() {
			String s = "";
			if(left != null) {
				s += left.helper();
			}
			
			s += "," + val;
			
			if(right != null) {
				s += right.helper();
			}
			
			return s;
		}
	}
	
}

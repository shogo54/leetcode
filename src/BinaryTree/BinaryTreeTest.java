package BinaryTree;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {
	
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
	
	@Test
	void testBinaryTreeInorderTraversal() throws Exception{
		TreeNode root = setupTree();
		assertEquals(new ArrayList<Integer>(Arrays.asList(1,3,2)), new BinaryTreeInorderTraversal().inorderTraversal(root));
	}
	
	@Test
	void testBinaryTreePostorderTraversal() throws Exception{
		TreeNode root = setupTree();
		assertEquals(new ArrayList<Integer>(Arrays.asList(3,2,1)), new BinaryTreePostorderTraversal().postorderTraversal(root));
	}
	
	@Test
	void testConvertSortedArrayToBinarySearchTree() throws Exception{
		TreeNode root = setupTree(new Integer[] {0,-3,9,-10,null,5});
		TreeNode converted = new ConvertSortedArrayToBinarySearchTree().sortedArrayToBST(new int[] {-10,-3,0,5,9});
		assertEquals(root.toString(), converted.toString());
	}
	
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
	
	@Test
	void testSearchInABinarySearchTree() throws Exception{
		TreeNode root = setupTree(new Integer[] {4,2,7,1,3});
		assertEquals(root.left, new SearchInABinarySearchTree().searchBST(root, 2));
	}
	
	@Test
	void testMaximumDepthOfBinaryTree() throws Exception{
		TreeNode root = setupTree(new Integer[] {3,9,20,null,null,15,21});
		assertEquals(3, new MaximumDepthOfBinaryTree().maxDepth(root));
	}
	
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
	
	@Test
	void testBinaryTreeLevelOrderTraversal() throws Exception{
		TreeNode root = setupTree(new Integer[] {3,9,20,null,null,15,7});
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(Arrays.asList(3));
		list.add(Arrays.asList(9, 20));
		list.add(Arrays.asList(15, 7));
		assertEquals(list, new BinaryTreeLevelOrderTraversal().levelOrder(root));
	}
	
	@Test
	void testInvertBinaryTree() throws Exception{
		TreeNode root = setupTree(new Integer[] {4,2,7,1,3,6,9});
		TreeNode inverted = setupTree(new Integer[] {4,7,2,9,6,3,1});
		assertEquals(inverted.toString(), new InvertBinaryTree().invertTree(root).toString());
	}
	
	@Test
	void testValidateBinarySearchTree() throws Exception{
		TreeNode root = setupTree(new Integer[] {2,1,3});
		assertTrue(new ValidateBinarySearchTree().isValidBST(root));
		root = setupTree(new Integer[] {10,5,15,null,null,6,20});
		assertFalse(new ValidateBinarySearchTree().isValidBST(root));
	}
	
	@Test
	void testKthSmallestElementInABST() throws Exception{
		TreeNode root = setupTree(new Integer[] {3,1,4,null,2});
		assertEquals(1, new KthSmallestElementInABST().kthSmallest(root, 1));
		
		root = setupTree(new Integer[] {5,3,6,2,4,null,null,1});
		assertEquals(3, new KthSmallestElementInABST().kthSmallest(root, 3));
	}
	
	@Test
	void testLowestCommonAncestorOfABinarySearchTree() throws Exception{
		TreeNode root = setupTree(new Integer[] {6,2,8,0,4,7,9,null,null,3,5});
		LowestCommonAncestorOfABinarySearchTree tester = new LowestCommonAncestorOfABinarySearchTree();
		
		assertEquals(root.toString(), tester.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(8)).toString());
		
		assertEquals(root.left.toString(), tester.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(4)).toString());
	}
	
	@Test
	void testSubtreeOfAnotherTree() throws Exception{
		TreeNode root = setupTree(new Integer[] {3,4,5,1,2});
		assertTrue(new SubtreeOfAnotherTree().isSubtree(root, setupTree(new Integer[] {4,1,2})));
		
		root = setupTree(new Integer[] {3,4,5,1,2,null,null,null,null,0});
		assertFalse(new SubtreeOfAnotherTree().isSubtree(root, setupTree(new Integer[] {4,1,2})));
		
		root = setupTree(new Integer[] {3,4,5,1,null,2});
		assertFalse(new SubtreeOfAnotherTree().isSubtree(root, setupTree(new Integer[] {3,1,2})));
	}
	
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
	
	@Test
	void testMaximumBinaryTree() throws Exception{
		TreeNode root = setupTree(new Integer[] {6,3,5,null,2,0,null,null,null,null,1});
		assertEquals(root.toString(), new MaximumBinaryTree().constructMaximumBinaryTree(new int[] {3,2,1,6,0,5}).toString());
		
		root = setupTree(new Integer[] {3});
		assertEquals(root.toString(), new MaximumBinaryTree().constructMaximumBinaryTree(new int[] {3}).toString());
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

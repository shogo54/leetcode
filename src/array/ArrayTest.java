package array;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ArrayTest {

	/**
	 * Test cases for 1. Two Sum
	 * 
	 * @see TwoSum
	 * @see TwoSum2
	 */
	@Test
	void testTwoSum() {
		//
		// Test for TwoSum
		//
		assertArrayEquals(new int[] { 0, 1 }, new TwoSum().twoSum(new int[] { 2, 7, 11, 15 }, 9));
		assertArrayEquals(new int[] { 0, 1 }, new TwoSum().twoSum(new int[] { 4, 7 }, 11));
		assertArrayEquals(new int[] { 0, 1 }, new TwoSum().twoSum(new int[] { -1, 1 }, 0));
		assertArrayEquals(new int[] { 0, 1 }, new TwoSum().twoSum(new int[] { 2, -7 }, -5));

		//
		// Test for TwoSum2
		//
		assertArrayEquals(new int[] { 0, 1 }, new TwoSum2().twoSum(new int[] { 2, 7, 11, 15 }, 9));
		assertArrayEquals(new int[] { 0, 1 }, new TwoSum2().twoSum(new int[] { 4, 7 }, 11));
		assertArrayEquals(new int[] { 0, 1 }, new TwoSum2().twoSum(new int[] { -1, 1 }, 0));
		assertArrayEquals(new int[] { 0, 1 }, new TwoSum2().twoSum(new int[] { 2, -7 }, -5));
	}

	/**
	 * Test cases for 11. Container With Most Water
	 * 
	 * @see ContainerWithMostWater
	 */
	@Test
	void testContainerWithMostWater() {
		assertEquals(49, new ContainerWithMostWater().maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
		assertEquals(24, new ContainerWithMostWater().maxArea(new int[] { 1, 3, 2, 5, 25, 24, 5 }));
		assertEquals(96, new ContainerWithMostWater().maxArea(new int[] { 10, 14, 10, 4, 10, 2, 6, 1, 6, 12 }));
		assertEquals(10, new ContainerWithMostWater().maxArea(new int[] { 10, 10 }));
		assertEquals(0, new ContainerWithMostWater().maxArea(new int[] { 0, 0 }));
		assertEquals(4, new ContainerWithMostWater().maxArea(new int[] { 10, 4 }));
	}

	/**
	 * Test cases for 14. Longest Common Prefix
	 * 
	 * @see LongestCommonPrefix
	 */
	@Test
	void testLongestCommonPrefix() {
		assertEquals("fl", new LongestCommonPrefix().longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
		assertEquals("", new LongestCommonPrefix().longestCommonPrefix(new String[] { "dog", "racecar", "car" }));
		assertEquals("", new LongestCommonPrefix().longestCommonPrefix(new String[] { "" }));
		assertEquals("dog", new LongestCommonPrefix().longestCommonPrefix(new String[] { "dog" }));
		assertEquals("f", new LongestCommonPrefix().longestCommonPrefix(new String[] { "flip", "fire" }));
		assertEquals("", new LongestCommonPrefix().longestCommonPrefix(new String[] { "dog", "racecar", "" }));
		assertEquals("", new LongestCommonPrefix().longestCommonPrefix(new String[0]));
	}

	/**
	 * Test cases for 26. Remove Duplicates from Sorted Array
	 * 
	 * @see RemoveDuplicatesFromSortedArray
	 * @see RemoveDuplicatesFromSortedArray2
	 * @see #testRemoveDuplicatesFromSortedArray(int[], int[], int)
	 */
	@Test
	void testRemoveDuplicatesFromSortedArray() {
		testRemoveDuplicatesFromSortedArray(new int[] { 1, 1, 2 }, new int[] { 1, 2, 0 }, 2);
		testRemoveDuplicatesFromSortedArray(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 },
				new int[] { 0, 1, 2, 3, 4, 0, 0, 0, 0, 0 }, 5);
		testRemoveDuplicatesFromSortedArray(new int[] { 1, 2, 2 }, new int[] { 1, 2, 0 }, 2);
		testRemoveDuplicatesFromSortedArray(new int[] { 1, 2 }, new int[] { 1, 2 }, 2);
		testRemoveDuplicatesFromSortedArray(new int[] { 2 }, new int[] { 2 }, 1);
		testRemoveDuplicatesFromSortedArray(new int[0], new int[0], 0);
	}

	/**
	 * Helper method for testRemoveDuplicatesFromSortedArray()
	 * 
	 * @see RemoveDuplicatesFromSortedArray
	 * @see #testRemoveDuplicatesFromSortedArray()
	 */
	void testRemoveDuplicatesFromSortedArray(int[] input, int[] expectedArray, int expectedSize) {
		int result = new RemoveDuplicatesFromSortedArray().removeDuplicates(input);
		assertEquals(expectedSize, result);
		for (int i = 0; i < expectedSize; i++) {
			assertEquals(expectedArray[i], input[i]);
		}
	}

	/**
	 * Test cases for 31. Next Permutation
	 * 
	 * @see NextPermutation
	 */
	@Test
	void testNextPermutation() {
		int[] actual = new int[] { 1, 2, 3 };
		int[] expected = new int[] { 1, 3, 2 };
		new NextPermutation().nextPermutation(actual);
		assertArrayEquals(actual, expected);

		actual = new int[] { 3, 2, 1 };
		expected = new int[] { 1, 2, 3 };
		new NextPermutation().nextPermutation(actual);
		assertArrayEquals(actual, expected);

		actual = new int[] { 1, 1, 5 };
		expected = new int[] { 1, 5, 1 };
		new NextPermutation().nextPermutation(actual);
		assertArrayEquals(actual, expected);

		actual = new int[] { 1, 5, 8, 4, 7, 6, 5, 3, 1 };
		expected = new int[] { 1, 5, 8, 5, 1, 3, 4, 6, 7 };
		new NextPermutation().nextPermutation(actual);
		assertArrayEquals(actual, expected);
	}

	/**
	 * Test cases for 33. Search in Rotated Sorted Array
	 * 
	 * @see SearchInRotatedSortedArray
	 */
	@Test
	void testSearchInRotatedSortedArray() {
		assertEquals(4, new SearchInRotatedSortedArray().search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
		assertEquals(-1, new SearchInRotatedSortedArray().search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3));
		assertEquals(-1, new SearchInRotatedSortedArray().search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 8));
		assertEquals(-1, new SearchInRotatedSortedArray().search(new int[] {}, 5));
		assertEquals(-1, new SearchInRotatedSortedArray().search(new int[] { 1, 3 }, 0));
		assertEquals(0, new SearchInRotatedSortedArray().search(new int[] { 1, 3 }, 1));
		assertEquals(1, new SearchInRotatedSortedArray().search(new int[] { 1, 3 }, 3));
		assertEquals(1, new SearchInRotatedSortedArray().search(new int[] { 3, 1 }, 1));
		assertEquals(0, new SearchInRotatedSortedArray().search(new int[] { 3, 1 }, 3));
		assertEquals(4, new SearchInRotatedSortedArray().search(new int[] { 4, 5, 6, 7, 8, 1, 2, 3 }, 8));
		assertEquals(0, new SearchInRotatedSortedArray().search(new int[] { 3, 5, 1 }, 3));
	}

	/**
	 * Test cases for 34. Find First and Last Position of Element in Sorted Array
	 * 
	 * @see FindFirstAndLastPositionOfElementInSortedArray
	 */
	@Test
	void testFindFirstAndLastPositionOfElementInSortedArray() {
		assertArrayEquals(new int[] { 3, 4 },
				new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8));
		assertArrayEquals(new int[] { -1, -1 },
				new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 6));
		assertArrayEquals(new int[] { -1, -1 },
				new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[] { 5 }, 6));
		assertArrayEquals(new int[] { -1, -1 },
				new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[] { 5, 7 }, 6));
		assertArrayEquals(new int[] { 0, 0 },
				new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[] { 5, 7 }, 5));
		assertArrayEquals(new int[] { 0, 1 },
				new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[] { 5, 5 }, 5));
	}

	/**
	 * Test cases for 35. Search Insert Position
	 * 
	 * @see SearchInsertPosition
	 */
	@Test
	void testSearchInsertPosition() {
		assertEquals(2, new SearchInsertPosition().searchInsert(new int[] {1,3,5,6}, 5));
		assertEquals(1, new SearchInsertPosition().searchInsert(new int[] {1,3,5,6}, 2));
		assertEquals(4, new SearchInsertPosition().searchInsert(new int[] {1,3,5,6}, 7));
		assertEquals(0, new SearchInsertPosition().searchInsert(new int[] {1,3,5,6}, 0));
	}

	/**
	 * Test cases for 39. Combination Sum
	 * 
	 * @see CombinationSum
	 */
	@Test
	void testCombinationSum() {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(2, 2, 3));
		expected.add(Arrays.asList(7));
		List<List<Integer>> actual = new CombinationSum().combinationSum(new int[] { 2, 3, 6, 7 }, 7);
		assertEquals(expected, actual);

		expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(2, 3, 3));
		expected.add(Arrays.asList(3, 5));
		expected.add(Arrays.asList(2, 2, 2, 2));
		actual = new CombinationSum().combinationSum(new int[] { 2, 3, 5 }, 8);
		assertEquals(expected, actual);
	}

	/**
	 * Test cases for 41. First Missing Positive
	 * 
	 * @see FirstMissingPositive
	 */
	@Test
	void testFirstMissingPositive() {
		assertEquals(3, new FirstMissingPositive().firstMissingPositive(new int[] { 1, 2, 0 }));
		assertEquals(2, new FirstMissingPositive().firstMissingPositive(new int[] { 3, 4, -1, 1 }));
		assertEquals(1, new FirstMissingPositive().firstMissingPositive(new int[] { 7, 8, 9, 11, 12 }));
		assertEquals(1, new FirstMissingPositive().firstMissingPositive(new int[] { 0 }));
		assertEquals(1, new FirstMissingPositive().firstMissingPositive(new int[] { -5 }));
		assertEquals(2, new FirstMissingPositive().firstMissingPositive(new int[] { 1 }));
		assertEquals(1, new FirstMissingPositive().firstMissingPositive(new int[] { -3, -10, -5, -8 }));
		assertEquals(1, new FirstMissingPositive().firstMissingPositive(new int[0]));
	}

	/**
	 * Test cases for 46. Permutations
	 * 
	 * @see Permutations
	 */
	@Test
	void testPermutations() {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(1, 2, 3));
		expected.add(Arrays.asList(1, 3, 2));
		expected.add(Arrays.asList(2, 1, 3));
		expected.add(Arrays.asList(2, 3, 1));
		expected.add(Arrays.asList(3, 1, 2));
		expected.add(Arrays.asList(3, 2, 1));
		List<List<Integer>> actual = new Permutations().permute(new int[] { 1, 2, 3 });
		assertEquals(expected.size(), actual.size());
		assertEquals(new HashSet<List<Integer>>(expected), new HashSet<List<Integer>>(actual));
	}

	/**
	 * Test cases for 55. Jump Game
	 * 
	 * @see JumpGame
	 */
	@Test
	void testJumpGame() {
		assertTrue(new JumpGame().canJump(new int[] { 2, 3, 1, 1, 4 }));
		assertFalse(new JumpGame().canJump(new int[] { 3, 2, 1, 0, 4 }));
	}

	/**
	 * Test cases for 75. Sort Colors
	 * 
	 * @see SortColors
	 */
	@Test
	void testSortColors() {
		int[] array = new int[] { 2, 0, 2, 1, 1, 0 };
		int[] expected = new int[] { 0, 0, 1, 1, 2, 2 };
		new SortColors().sortColors(array);
		assertArrayEquals(expected, array);

		array = new int[] {};
		expected = new int[] {};
		new SortColors().sortColors(array);
		assertArrayEquals(expected, array);

		array = new int[] { 1 };
		expected = new int[] { 1 };
		new SortColors().sortColors(array);
		assertArrayEquals(expected, array);
	}

	/**
	 * Test cases for 78. Subsets
	 * 
	 * @see SubSets
	 */
	@Test
	void testSubsets() {
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(new ArrayList<Integer>());
		expected.add(Arrays.asList(1));
		expected.add(Arrays.asList(2));
		expected.add(Arrays.asList(3));
		expected.add(Arrays.asList(1, 2));
		expected.add(Arrays.asList(1, 3));
		expected.add(Arrays.asList(2, 3));
		expected.add(Arrays.asList(1, 2, 3));
		List<List<Integer>> actual = new Subsets().subsets(new int[] { 1, 2, 3 });
		assertEquals(expected.size(), actual.size());
		assertEquals(new HashSet<List<Integer>>(expected), new HashSet<List<Integer>>(actual));
	}

	/**
	 * Test cases for 88. Merge Sorted Array
	 * 
	 * @see MergeSortedArray
	 */
	@Test
	void testMergeSortedArray() {
		int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = new int[] { 2, 5, 6 };
		int[] expected = new int[] { 1, 2, 2, 3, 5, 6 };
		new MergeSortedArray().merge(nums1, 3, nums2, 3);
		assertArrayEquals(expected, nums1);

		nums1 = new int[] { 1 };
		nums2 = new int[0];
		expected = new int[] { 1 };
		new MergeSortedArray().merge(nums1, 1, nums2, 0);
		assertArrayEquals(expected, nums1);

		nums1 = new int[] { 0 };
		nums2 = new int[] { 3 };
		expected = new int[] { 3 };
		new MergeSortedArray().merge(nums1, 0, nums2, 1);
		assertArrayEquals(expected, nums1);

		nums1 = new int[0];
		nums2 = new int[0];
		expected = new int[0];
		new MergeSortedArray().merge(nums1, 0, nums2, 0);
		assertArrayEquals(expected, nums1);
	}

	/**
	 * Test cases for 121. Best Time to Buy and Sell Stock
	 * 
	 * @see BestTimeToBuyAndSellStock
	 */
	@Test
	void testBestTimeToBuyAndSellStock() {
		assertEquals(5, new BestTimeToBuyAndSellStock().maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
		assertEquals(0, new BestTimeToBuyAndSellStock().maxProfit(new int[] { 7, 6, 4, 3, 1 }));
		assertEquals(4, new BestTimeToBuyAndSellStock().maxProfit(new int[] { 3, 3, 5, 0, 0, 3, 1, 4 }));
		assertEquals(0, new BestTimeToBuyAndSellStock().maxProfit(new int[0]));
	}

	/**
	 * Test cases for 122. Best Time to Buy and Sell Stock II
	 * 
	 * @see BestTimeToBuyAndSellStockII
	 * @see BestTimeToBuyAndSellStockII2
	 */
	@Test
	void testBestTimeToBuyAndSellStockII() {
		// Test for BestTimeToBuyAndSellStockII
		assertEquals(7, new BestTimeToBuyAndSellStockII().maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
		assertEquals(4, new BestTimeToBuyAndSellStockII().maxProfit(new int[] { 1, 2, 3, 4, 5 }));
		assertEquals(0, new BestTimeToBuyAndSellStockII().maxProfit(new int[] { 7, 6, 4, 3, 1 }));
		assertEquals(0, new BestTimeToBuyAndSellStockII().maxProfit(new int[] { 7, 6 }));
		assertEquals(2, new BestTimeToBuyAndSellStockII().maxProfit(new int[] { 1, 3 }));
		assertEquals(0, new BestTimeToBuyAndSellStockII().maxProfit(new int[] { 7 }));
		assertEquals(0, new BestTimeToBuyAndSellStockII().maxProfit(new int[0]));
		
		// Test for BestTimeToBuyAndSellStockII2
		assertEquals(7, new BestTimeToBuyAndSellStockII2().maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
		assertEquals(4, new BestTimeToBuyAndSellStockII2().maxProfit(new int[] { 1, 2, 3, 4, 5 }));
		assertEquals(0, new BestTimeToBuyAndSellStockII2().maxProfit(new int[] { 7, 6, 4, 3, 1 }));
		assertEquals(0, new BestTimeToBuyAndSellStockII2().maxProfit(new int[] { 7, 6 }));
		assertEquals(2, new BestTimeToBuyAndSellStockII2().maxProfit(new int[] { 1, 3 }));
		assertEquals(0, new BestTimeToBuyAndSellStockII2().maxProfit(new int[] { 7 }));
		assertEquals(0, new BestTimeToBuyAndSellStockII2().maxProfit(new int[0]));
	}

	/**
	 * Test cases for 128. Longest Consecutive Sequence
	 * 
	 * @see LongestConsecutiveSequence
	 */
	@Test
	void testLongestConsecutiveSequence() {
		assertEquals(4, new LongestConsecutiveSequence().longestConsecutive(new int[] { 100, 4, 200, 1, 3, 2 }));
		assertEquals(3, new LongestConsecutiveSequence().longestConsecutive(new int[] { 1, 2, 0, 1 }));
		assertEquals(5, new LongestConsecutiveSequence().longestConsecutive(new int[] { 1, 3, 5, 2, 4 }));
		assertEquals(1, new LongestConsecutiveSequence().longestConsecutive(new int[] { 4 }));
		assertEquals(0, new LongestConsecutiveSequence().longestConsecutive(new int[] {}));
	}

	/**
	 * Test cases for 150. Evaluate Reverse Polish Notation
	 * 
	 * @see EvaluateReversePolishNotation
	 */
	void testEvaluateReversePolishNotation() {
		assertEquals(9, new EvaluateReversePolishNotation().evalRPN(new String[] { "2", "1", "+", "3", "*" }));
		assertEquals(6, new EvaluateReversePolishNotation().evalRPN(new String[] { "4", "13", "5", "/", "+" }));
		assertEquals(22, new EvaluateReversePolishNotation()
				.evalRPN(new String[] { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" }));
		assertEquals(0, new EvaluateReversePolishNotation().evalRPN(new String[0]));
		assertEquals(4, new EvaluateReversePolishNotation().evalRPN(new String[] { "4" }));
		assertEquals(-1, new EvaluateReversePolishNotation().evalRPN(new String[] { "3", "13", "3", "/", "-" }));
	}

	/**
	 * Test cases for 152. Maximum Product Subarray
	 * 
	 * @see MaximumProductSubarray
	 */
	@Test
	void testMaximumProductSubarray() {
		assertEquals(6, new MaximumProductSubarray().maxProduct(new int[] { 2, 3, -2, 4 }));
		assertEquals(0, new MaximumProductSubarray().maxProduct(new int[] { -2, 0, -1 }));
	}

	/**
	 * Test cases for 153. Find Minimum in Rotated Sorted Array
	 * 
	 * @see FindMinimumInRotatedSortedArray
	 */
	@Test
	void testFindMinimumInRotatedSortedArray() {
		assertEquals(1, new FindMinimumInRotatedSortedArray().findMin(new int[] { 3, 4, 5, 1, 2 }));
		assertEquals(0, new FindMinimumInRotatedSortedArray().findMin(new int[] { 4, 5, 6, 7, 0, 1, 2 }));
		assertEquals(3, new FindMinimumInRotatedSortedArray().findMin(new int[] { 3 }));
		assertEquals(3, new FindMinimumInRotatedSortedArray().findMin(new int[] { 3, 4, 5, 6, 7 }));
	}

	/**
	 * Test cases for 162. Find Peak Element
	 * 
	 * @see FindPeakElement
	 */
	@Test
	void testFindePeakElement() {
		assertEquals(2, new FindPeakElement().findPeakElement(new int[] { 1, 2, 3, 1 }));
		assertEquals(0, new FindPeakElement().findPeakElement(new int[] { 7 }));
		assertEquals(1, new FindPeakElement().findPeakElement(new int[] { 2, 3 }));
		assertEquals(0, new FindPeakElement().findPeakElement(new int[] { 5, 2 }));
		assertEquals(0, new FindPeakElement().findPeakElement(new int[] { -2147483648 }));
		Set<Integer> valids = new HashSet<Integer>(Arrays.asList(1, 5));
		assertTrue(valids.contains(new FindPeakElement().findPeakElement(new int[] { 1, 2, 1, 3, 5, 6, 4 })));
		valids = new HashSet<Integer>(Arrays.asList(0, 6));
		assertTrue(valids.contains(new FindPeakElement().findPeakElement(new int[] { 3, 2, 1, 3, 5, 6, 7 })));
	}

	/**
	 * Test cases for 189. Rotate Array
	 * 
	 * @see RotateArray
	 */
	void testRotateArray() {
		int[] actual = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		new RotateArray().rotate(actual, 3);
		int[] expected = new int[] { 5, 6, 7, 1, 2, 3, 4 };
		assertArrayEquals(expected, actual);

		actual = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		new RotateArray().rotate(actual, 5);
		expected = new int[] { 3, 4, 5, 6, 7, 1, 2 };
		assertArrayEquals(expected, actual);

		actual = new int[] { -1, -100, 3, 99 };
		new RotateArray().rotate(actual, 2);
		expected = new int[] { 3, 99, -1, -100 };
		assertArrayEquals(expected, actual);

		actual = new int[] { -1, -100, 3, 99 };
		new RotateArray().rotate(actual, 5);
		expected = new int[] { 99, -1, -100, 3 };
		assertArrayEquals(expected, actual);

		actual = new int[] { -1 };
		new RotateArray().rotate(actual, 2);
		expected = new int[] { -1 };
		assertArrayEquals(expected, actual);
	}

	/**
	 * Test cases for 198. House Robber
	 * 
	 * @see HouseRobber
	 */
	@Test
	void testHouseRobber() {
		assertEquals(4, new HouseRobber().rob(new int[] { 1, 2, 3, 1 }));
		assertEquals(12, new HouseRobber().rob(new int[] { 2, 7, 9, 3, 1 }));
		assertEquals(0, new HouseRobber().rob(new int[0]));
		assertEquals(4, new HouseRobber().rob(new int[] { 4 }));
		assertEquals(6, new HouseRobber().rob(new int[] { 4, 6 }));
	}

	/**
	 * Test cases for 213. House Robber II
	 * 
	 * @see HouseRobberII
	 */
	@Test
	void testHouseRobberII() {
		assertEquals(3, new HouseRobberII().rob(new int[] { 2, 3, 2 }));
		assertEquals(4, new HouseRobberII().rob(new int[] { 1, 2, 3, 1 }));
		assertEquals(103, new HouseRobberII().rob(new int[] { 1, 3, 1, 3, 100 }));
		assertEquals(0, new HouseRobberII().rob(new int[0]));
		assertEquals(1, new HouseRobberII().rob(new int[] { 1 }));
		assertEquals(4, new HouseRobberII().rob(new int[] { 4, 2 }));
	}

	/**
	 * Test cases for 215. Kth Largest Element in an Array
	 * 
	 * @see KthLargestElementInAnArray
	 */
	@Test
	void testKthLargestElementInAnArray() {
		assertEquals(5, new KthLargestElementInAnArray().findKthLargest(new int[] { 3, 2, 1, 5, 6, 4 }, 2));
		assertEquals(4, new KthLargestElementInAnArray().findKthLargest(new int[] { 3, 2, 3, 1, 2, 4, 5, 5, 6 }, 4));
	}

	/**
	 * Test cases for 217. Contains Duplicate
	 * 
	 * @see ContainsDuplicate
	 * @see ContainsDuplicate2
	 */
	@Test
	void testContainsDuplicate() {
		// Test for ContainsDuplicate
		assertTrue(new ContainsDuplicate().containsDuplicate(new int[] { 1, 2, 3, 1 }));
		assertFalse(new ContainsDuplicate().containsDuplicate(new int[] { 1, 2, 3, 4 }));
		assertTrue(new ContainsDuplicate().containsDuplicate(new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 }));
		
		// Test for ContainsDuplicate2
		assertTrue(new ContainsDuplicate2().containsDuplicate(new int[] { 1, 2, 3, 1 }));
		assertFalse(new ContainsDuplicate2().containsDuplicate(new int[] { 1, 2, 3, 4 }));
		assertTrue(new ContainsDuplicate2().containsDuplicate(new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 }));
	}

	/**
	 * Test cases for 238. Product of Array Except Self
	 * 
	 * @see ProductOfArrayExceptSelf
	 */
	void testProductOfArrayExceptSelf() {
		assertEquals(Arrays.asList(24, 12, 8, 6),
				new ProductOfArrayExceptSelf().productExceptSelf(new int[] { 1, 2, 3, 4 }));
		assertEquals(Arrays.asList(10, 5), new ProductOfArrayExceptSelf().productExceptSelf(new int[] { 5, 10 }));
		assertEquals(Arrays.asList(2, 2), new ProductOfArrayExceptSelf().productExceptSelf(new int[] { 2, 2 }));
		assertEquals(Arrays.asList(20, 15, 12),
				new ProductOfArrayExceptSelf().productExceptSelf(new int[] { 3, 4, 5 }));
	}

	/**
	 * Test cases for 268. Missing Number
	 * 
	 * @see MissingNumber
	 */
	@Test
	void testMissingNumber() {
		assertEquals(2, new MissingNumber().missingNumber(new int[] { 3, 0, 1 }));
		assertEquals(8, new MissingNumber().missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }));
		assertEquals(1, new MissingNumber().missingNumber(new int[] { 0 }));
		assertEquals(0, new MissingNumber().missingNumber(new int[] { 1 }));
	}

	/**
	 * Test cases for 287. Find the Duplicate Number
	 * 
	 * @see FindTheDuplicateNumber
	 * @see FindTheDuplicateNumber2
	 */
	@Test
	void testFindTheDuplicateNumber() {
		// Test for FindTheDuplicateNumber
		assertEquals(2, new FindTheDuplicateNumber().findDuplicate(new int[] { 1, 3, 4, 2, 2 }));
		assertEquals(3, new FindTheDuplicateNumber().findDuplicate(new int[] { 3, 1, 3, 4, 2 }));
		assertEquals(9, new FindTheDuplicateNumber().findDuplicate(new int[] { 2, 5, 9, 6, 9, 3, 8, 9, 7, 1 }));

		// Test for FindTheDuplicateNumber2
		assertEquals(2, new FindTheDuplicateNumber2().findDuplicate(new int[] { 1, 3, 4, 2, 2 }));
		assertEquals(3, new FindTheDuplicateNumber2().findDuplicate(new int[] { 3, 1, 3, 4, 2 }));
		assertEquals(9, new FindTheDuplicateNumber2().findDuplicate(new int[] { 2, 5, 9, 6, 9, 3, 8, 9, 7, 1 }));
	}

	/**
	 * Test cases for 295. Find Median from Data Stream
	 * 
	 * @see FindMedianFromDataStream
	 * @see FindMedianFromDataStream2
	 */
	@Test
	void testFindMedianFromDataStream() {
		// Test for FindMedianFromDataStream
		FindMedianFromDataStream finder = new FindMedianFromDataStream();
		finder.addNum(12);
		assertEquals(12.0, finder.findMedian());
		finder.addNum(10);
		assertEquals(11.0, finder.findMedian());
		finder.addNum(13);
		finder.addNum(11);
		finder.addNum(5);
		finder.addNum(15);
		assertEquals(11.5, finder.findMedian());

		// Test for FindMedianFromDataStream2
		FindMedianFromDataStream2 finder2 = new FindMedianFromDataStream2();
		finder2.addNum(12);
		assertEquals(12.0, finder2.findMedian());
		finder2.addNum(10);
		assertEquals(11.0, finder2.findMedian());
		finder2.addNum(13);
		finder2.addNum(11);
		finder2.addNum(5);
		finder2.addNum(15);
		assertEquals(11.5, finder2.findMedian());
	}

	/**
	 * Test cases for 300. Longest Increasing Subsequence
	 * 
	 * @see LongestIncreasingSubsequence
	 */
	@Test
	void testLongestIncreasingSubsequence() {
		assertEquals(4, new LongestIncreasingSubsequence().lengthOfLIS(new int[] { 10, 9, 2, 5, 3, 7, 101, 18 }));
		assertEquals(0, new LongestIncreasingSubsequence().lengthOfLIS(new int[] {}));
	}

	/**
	 * Test cases for 315. Count of Smaller Numbers After Self
	 * 
	 * @see CountOfSmallerNumbersAfterSelf
	 */
	@Test
	void testCountOfSmallerNumbersAfterSelf() {
		assertEquals(Arrays.asList(2, 1, 1, 0),
				new CountOfSmallerNumbersAfterSelf().countSmaller(new int[] { 5, 2, 6, 1 }));
		assertEquals(Arrays.asList(4, 3, 2, 1, 0),
				new CountOfSmallerNumbersAfterSelf().countSmaller(new int[] { 5, 4, 3, 2, 1 }));
		assertEquals(Arrays.asList(1, 0), new CountOfSmallerNumbersAfterSelf().countSmaller(new int[] { 5, 2 }));
		assertEquals(Arrays.asList(0, 0, 0, 0, 0),
				new CountOfSmallerNumbersAfterSelf().countSmaller(new int[] { 5, 6, 8, 9, 12 }));
		assertEquals(Arrays.asList(0, 0), new CountOfSmallerNumbersAfterSelf().countSmaller(new int[] { 5, 6 }));
		assertEquals(Arrays.asList(0), new CountOfSmallerNumbersAfterSelf().countSmaller(new int[] { 1 }));
		assertEquals(Arrays.asList(), new CountOfSmallerNumbersAfterSelf().countSmaller(new int[0]));
	}

	/**
	 * Test cases for 322. Coin Change
	 * 
	 * @see CoinChange
	 */
	@Test
	void testCoinChange() {
		assertEquals(3, new CoinChange().coinChange(new int[] { 1, 2, 5 }, 11));
		assertEquals(-1, new CoinChange().coinChange(new int[] { 2 }, 3));
		assertEquals(-1, new CoinChange().coinChange(new int[0], 11));
	}

	/**
	 * Test cases for 334. Increasing Triplet Subsequence
	 * 
	 * @see IncreasingTripletSubsequence
	 */
	@Test
	void IncreasingTripletSubsequence() {
		int[] array = new int[] { 1, 2, 3, 4, 5 };
		assertTrue(new IncreasingTripletSubsequence().increasingTriplet(array));

		array = new int[] { 5, 4, 3, 2, 1 };
		assertFalse(new IncreasingTripletSubsequence().increasingTriplet(array));

		array = new int[0];
		assertFalse(new IncreasingTripletSubsequence().increasingTriplet(array));

		array = new int[] { 1 };
		assertFalse(new IncreasingTripletSubsequence().increasingTriplet(array));

		array = new int[] { 1, 4 };
		assertFalse(new IncreasingTripletSubsequence().increasingTriplet(array));

		array = new int[] { 1, 4, 3 };
		assertFalse(new IncreasingTripletSubsequence().increasingTriplet(array));

		array = new int[] { 1, 2, -10, -8, -7 };
		assertTrue(new IncreasingTripletSubsequence().increasingTriplet(array));

		array = new int[] { 1, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 100000000 };
		assertTrue(new IncreasingTripletSubsequence().increasingTriplet(array));
	}

	/**
	 * Test cases for 347. Top K Frequent Elements
	 * 
	 * @see TopKFrequentElements
	 */
	@Test
	void testTopKFrequentElements() {
		assertEquals(Arrays.asList(1, 2), new TopKFrequentElements().topKFrequent(new int[] { 1, 1, 1, 2, 2, 3 }, 2));
		assertEquals(Arrays.asList(1), new TopKFrequentElements().topKFrequent(new int[] { 1 }, 1));
		assertEquals(Arrays.asList(-1, 2),
				new TopKFrequentElements().topKFrequent(new int[] { 4, 1, -1, 2, -1, 2, 3 }, 2));
	}

	/**
	 * Test cases for 349. Intersection of Two Arrays
	 * 
	 * @see IntersectionOfTwoArrays
	 */
	@Test
	void testIntersectionOfTwoArrays() {
		assertArrayEquals(new int[] { 2 },
				new IntersectionOfTwoArrays().intersection(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 }));

		int[] expected = new int[] { 9, 4 };
		int[] actual = new IntersectionOfTwoArrays().intersection(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 });
		Arrays.sort(expected);
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
	}

	/**
	 * Test cases for 350. Intersection of Two Arrays II
	 * 
	 * @see IntersectionOfTwoArraysII
	 * @see IntersectionOfTwoArraysII2
	 */
	@Test
	void testIntersectionOfTwoArraysII() {
		assertArrayEquals(new int[] { 2, 2 },
				new IntersectionOfTwoArraysII().intersect(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 }));
		assertArrayEquals(new int[] { 4, 9 },
				new IntersectionOfTwoArraysII().intersect(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 }));
		assertArrayEquals(new int[] { 2, 1 },
				new IntersectionOfTwoArraysII().intersect(new int[] { 2, 1 }, new int[] { 1, 2 }));
		assertArrayEquals(new int[0], new IntersectionOfTwoArraysII().intersect(new int[] { 1, 2, 2, 1 }, new int[0]));
		assertArrayEquals(new int[0], new IntersectionOfTwoArraysII().intersect(new int[0], new int[] { 1, 2, 2 }));
	}

	/**
	 * Test cases for 448. Find All Numbers Disappeared in an Array
	 * 
	 * @see FindAllNumbersDisappearedInAnArray
	 */
	@Test
	void testFindAllNumbersDisappearedInAnArray() {
		List<Integer> expected = Arrays.asList(5, 6);
		List<Integer> actual = new FindAllNumbersDisappearedInAnArray()
				.findDisappearedNumbers(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 });
		assertEquals(expected.size(), actual.size());
		assertEquals(new HashSet<Integer>(expected), new HashSet<Integer>(actual));

		expected = Arrays.asList(1);
		actual = new FindAllNumbersDisappearedInAnArray().findDisappearedNumbers(new int[] { 2, 2 });
		assertEquals(expected.size(), actual.size());
		assertEquals(new HashSet<Integer>(expected), new HashSet<Integer>(actual));

		expected = Arrays.asList(1, 2);
		actual = new FindAllNumbersDisappearedInAnArray().findDisappearedNumbers(new int[] { 3, 3, 3, 4 });
		assertEquals(expected.size(), actual.size());
		assertEquals(new HashSet<Integer>(expected), new HashSet<Integer>(actual));
	}

	/**
	 * Test cases for 560. Subarray Sum Equals K
	 * 
	 * @see SubarraySumEqualsK
	 */
	@Test
	void testSubarraySumEqualsK() {
		int[] array = new int[] { 1, 1, 1 };
		assertEquals(2, new SubarraySumEqualsK().subarraySum(array, 2));

		array = new int[] { 1, 1, 1, 3, 5, -2, -3, 2, 5, -7, 4, 1, -6 };
		assertEquals(7, new SubarraySumEqualsK().subarraySum(array, 3));

		array = new int[] { 2 };
		assertEquals(0, new SubarraySumEqualsK().subarraySum(array, 3));

		array = new int[] { 3 };
		assertEquals(1, new SubarraySumEqualsK().subarraySum(array, 3));

		array = new int[] { 1, 1, 1 };
		assertEquals(0, new SubarraySumEqualsK().subarraySum(array, 4));
	}

	/**
	 * Test cases for 581. Shortest Unsorted Continuous Subarray
	 * 
	 * @see ShortestUnsortedContinuousSubarray
	 */
	@Test
	void testShortestUnsortedContinuousSubarray() {
		assertEquals(5,
				new ShortestUnsortedContinuousSubarray().findUnsortedSubarray(new int[] { 2, 6, 4, 8, 10, 9, 15 }));
		assertEquals(6, new ShortestUnsortedContinuousSubarray().findUnsortedSubarray(new int[] { 3, 3, 1, 1, 1, 2 }));
		assertEquals(6, new ShortestUnsortedContinuousSubarray().findUnsortedSubarray(new int[] { 3, 3, 1, 1, 1, 1 }));
		assertEquals(0, new ShortestUnsortedContinuousSubarray().findUnsortedSubarray(new int[] { 2, 6 }));
		assertEquals(2, new ShortestUnsortedContinuousSubarray().findUnsortedSubarray(new int[] { 6, 2 }));
		assertEquals(3, new ShortestUnsortedContinuousSubarray().findUnsortedSubarray(new int[] { 1, 2, 4, 5, 3 }));
		assertEquals(3, new ShortestUnsortedContinuousSubarray().findUnsortedSubarray(new int[] { 1, 2, 3, 4, 5, 3 }));
		assertEquals(0, new ShortestUnsortedContinuousSubarray().findUnsortedSubarray(new int[] { 1 }));
	}

	/**
	 * Test cases for 599. Minimum Index Sum of Two Lists
	 * 
	 * @see MinimumIndexSumOfTwoLists
	 */
	@Test
	void testMinimumIndexSumOfTwoLists() {
		String[] list1 = new String[] { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		String[] list2 = new String[] { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun" };
		String[] expected = new String[] { "Shogun" };
		assertArrayEquals(expected, new MinimumIndexSumOfTwoLists().findRestaurant(list1, list2));

		list1 = new String[] { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		list2 = new String[] { "KFC", "Shogun", "Burger King" };
		expected = new String[] { "Shogun" };
		assertArrayEquals(expected, new MinimumIndexSumOfTwoLists().findRestaurant(list1, list2));

		list1 = new String[] { "Shogun", "KFC", "Burger King" };
		list2 = new String[] { "KFC", "Shogun", "Burger King" };
		expected = new String[] { "Shogun", "KFC" };
		String[] actual = new MinimumIndexSumOfTwoLists().findRestaurant(list1, list2);
		Arrays.sort(expected);
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
	}

	/**
	 * Test cases for 905. Sort Array By Parity
	 * 
	 * @see SortArrayByParity
	 */
	@Test
	void testSortArrayByParity() {
		int[] actual = new SortArrayByParity().sortArrayByParity(new int[] { 3, 1, 2, 4 });
		Set<int[]> expected = new HashSet<int[]>();
		expected.add(new int[] { 2, 4, 3, 1 });
		expected.add(new int[] { 4, 2, 3, 1 });
		expected.add(new int[] { 2, 4, 1, 3 });
		expected.add(new int[] { 4, 2, 1, 3 });
		boolean included = false;
		for (int[] ex : expected) {
			included = included || Arrays.toString(actual).equals(Arrays.toString(ex));
		}
		assertTrue(included);
	}

	/**
	 * Test cases for 977. Squares of a Sorted Array
	 * 
	 * @see SquaresOfASortedArray
	 */
	@Test
	void testSquaresOfASortedArray() {
		assertArrayEquals(new int[] { 0, 1, 9, 16, 100 },
				new SquaresOfASortedArray().sortedSquares(new int[] { -4, -1, 0, 3, 10 }));
		assertArrayEquals(new int[] { 4, 9, 9, 49, 121 },
				new SquaresOfASortedArray().sortedSquares(new int[] { -7, -3, 2, 3, 11 }));
		assertArrayEquals(new int[] { 4, 9, 81, 144 },
				new SquaresOfASortedArray().sortedSquares(new int[] { 2, 3, 9, 12 }));
		assertArrayEquals(new int[] { 1, 9, 16 }, new SquaresOfASortedArray().sortedSquares(new int[] { -4, -3, -1 }));
		assertArrayEquals(new int[] { 16 }, new SquaresOfASortedArray().sortedSquares(new int[] { -4 }));
		assertArrayEquals(new int[] { 49 }, new SquaresOfASortedArray().sortedSquares(new int[] { 7 }));
		assertArrayEquals(new int[] { 4, 4, 4 }, new SquaresOfASortedArray().sortedSquares(new int[] { 2, 2, 2 }));
		assertArrayEquals(new int[] { 49, 49, 49 }, new SquaresOfASortedArray().sortedSquares(new int[] { -7, -7, 7 }));
	}

	/**
	 * Test cases for 1207. Unique Number of Occurrences
	 * 
	 * @see UniqueNumberOfOccurrences
	 */
	@Test
	void testUniqueNumberOfOccurrences() {
		assertTrue(new UniqueNumberOfOccurrences().uniqueOccurrences(new int[] { 1, 2, 2, 1, 1, 3 }));
		assertFalse(new UniqueNumberOfOccurrences().uniqueOccurrences(new int[] { 1, 2 }));
		assertTrue(new UniqueNumberOfOccurrences().uniqueOccurrences(new int[] { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 }));
	}

	/**
	 * Test cases for 1295. Find Numbers with Even Number of Digits
	 * 
	 * @see FindNumbersWithEvenNumberOfDigits
	 */
	@Test
	void testFindNumbersWithEvenNumberOfDigits() {
		assertEquals(2, new FindNumbersWithEvenNumberOfDigits().findNumbers(new int[] { 12, 345, 2, 6, 7896 }));
		assertEquals(1, new FindNumbersWithEvenNumberOfDigits().findNumbers(new int[] { 555, 901, 482, 1771 }));
		assertEquals(0, new FindNumbersWithEvenNumberOfDigits().findNumbers(new int[] { 1 }));
	}

}

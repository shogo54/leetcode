package array;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ArrayTest{

	/**
	 * Test cases for 1. Two Sum
	 * @see TwoSum
	 */
	@Test
	void testTwoSum() throws Exception{
		assertArrayEquals(new int[] {0,1}, new TwoSum().twoSum(new int[] {2, 7, 11, 15}, 9));
		assertArrayEquals(new int[] {0,1}, new TwoSum().twoSum(new int[] {4, 7}, 11));
	}

	/**
	 * Test cases for 39. Combination Sum
	 * @see CombinationSum
	 */
	@Test
	void testCombinationSum() throws Exception{
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(2,2,3));
		expected.add(Arrays.asList(7));
		List<List<Integer>> actual = new CombinationSum().combinationSum(new int[] {2,3,6,7}, 7);
		assertEquals(expected, actual);
		
		expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(2,3,3));
		expected.add(Arrays.asList(3,5));
		expected.add(Arrays.asList(2,2,2,2));
		actual = new CombinationSum().combinationSum(new int[] {2,3,5}, 8);
		assertEquals(expected, actual);
	}

	/**
	 * Test cases for 46. Permutations
	 * @see Permutations
	 */
	@Test
	void testPermutations() throws Exception{
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(1,2,3));
		expected.add(Arrays.asList(1,3,2));
		expected.add(Arrays.asList(2,1,3));
		expected.add(Arrays.asList(2,3,1));
		expected.add(Arrays.asList(3,1,2));
		expected.add(Arrays.asList(3,2,1));
		List<List<Integer>> actual = new Permutations().permute(new int[] {1,2,3});
		assertEquals(expected.size(), actual.size());
		assertEquals(new HashSet<List<Integer>>(expected), new HashSet<List<Integer>>(actual));
	}

	/**
	 * Test cases for 55. Jump Game
	 * @see JumpGame
	 */
	@Test
	void testJumpGame() throws Exception {
		assertTrue(new JumpGame().canJump(new int[]{2,3,1,1,4}));
		assertFalse(new JumpGame().canJump(new int[]{3,2,1,0,4}));
	}

	/**
	 * Test cases for 75. Sort Colors
	 * @see SortColors
	 */
	@Test
	void testSortColors() throws Exception{
		int[] array = new int[] {2,0,2,1,1,0};
		int[] expected = new int[] {0,0,1,1,2,2};
		new SortColors().sortColors(array);
		assertArrayEquals(expected, array);
		
		array = new int[] {};
		expected = new int[] {};
		new SortColors().sortColors(array);
		assertArrayEquals(expected, array);
		
		array = new int[] {1};
		expected = new int[] {1};
		new SortColors().sortColors(array);
		assertArrayEquals(expected, array);
	}

	/**
	 * Test cases for 78. Subsets
	 * @see SubSets
	 */
	@Test
	void testSubsets() throws Exception{
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(new ArrayList<Integer>());
		expected.add(Arrays.asList(1));
		expected.add(Arrays.asList(2));
		expected.add(Arrays.asList(3));
		expected.add(Arrays.asList(1,2));
		expected.add(Arrays.asList(1,3));
		expected.add(Arrays.asList(2,3));
		expected.add(Arrays.asList(1,2,3));
		List<List<Integer>> actual = new Subsets().subsets(new int[] {1,2,3});
		assertEquals(expected.size(), actual.size());
		assertEquals(new HashSet<List<Integer>>(expected), new HashSet<List<Integer>>(actual));
	}

	/**
	 * Test cases for 121. Best Time to Buy and Sell Stock
	 * @see BestTimeToBuyAndSellStock
	 */
	@Test
	void testBestTimeToBuyAndSellStock() throws Exception{
		assertEquals(5, new BestTimeToBuyAndSellStock().maxProfit(new int[] {7,1,5,3,6,4}));
		assertEquals(0, new BestTimeToBuyAndSellStock().maxProfit(new int[] {7,6,4,3,1}));
		assertEquals(4, new BestTimeToBuyAndSellStock().maxProfit(new int[] {3,3,5,0,0,3,1,4}));
		assertEquals(0, new BestTimeToBuyAndSellStock().maxProfit(new int[0] ));
	}

	/**
	 * Test cases for 128. Longest Consecutive Sequence
	 * @see LongestConsecutiveSequence
	 */
	@Test
	void testLongestConsecutiveSequence() throws Exception{
		assertEquals(4, new LongestConsecutiveSequence().longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}));
		assertEquals(3, new LongestConsecutiveSequence().longestConsecutive(new int[] {1,2,0,1}));
		assertEquals(5, new LongestConsecutiveSequence().longestConsecutive(new int[] {1,3,5,2,4}));
		assertEquals(1, new LongestConsecutiveSequence().longestConsecutive(new int[] {4}));
		assertEquals(0, new LongestConsecutiveSequence().longestConsecutive(new int[] {}));
	}

	/**
	 * Test cases for 152. Maximum Product Subarray
	 * @see MaximumProductSubarray
	 */
	@Test
	void testMaximumProductSubarray() throws Exception{
		assertEquals(6, new MaximumProductSubarray().maxProduct(new int[] {2,3,-2,4}));
		assertEquals(0, new MaximumProductSubarray().maxProduct(new int[] {-2,0,-1}));
	}

	/**
	 * Test cases for 153. Find Minimum in Rotated Sorted Array
	 * @see FindMinimumInRotatedSortedArray
	 */
	@Test
	void testFindMinimumInRotatedSortedArray() throws Exception{
		assertEquals(1, new FindMinimumInRotatedSortedArray().findMin(new int[] {3,4,5,1,2}));
		assertEquals(0, new FindMinimumInRotatedSortedArray().findMin(new int[] {4,5,6,7,0,1,2}));
		assertEquals(3, new FindMinimumInRotatedSortedArray().findMin(new int[] {3}));
		assertEquals(3, new FindMinimumInRotatedSortedArray().findMin(new int[] {3,4,5,6,7}));
	}

	/**
	 * Test cases for 198. House Robber
	 * @see HouseRobber
	 */
	@Test
	void testHouseRobber() throws Exception{
		assertEquals(4, new HouseRobber().rob(new int[] {1,2,3,1}));
		assertEquals(12, new HouseRobber().rob(new int[] {2,7,9,3,1}));
		assertEquals(0, new HouseRobber().rob(new int[0]));
		assertEquals(4, new HouseRobber().rob(new int[] {4}));
		assertEquals(6, new HouseRobber().rob(new int[] {4,6}));
	}

	/**
	 * Test cases for 213. House Robber II
	 * @see HouseRobberII
	 */
	@Test
	void testHouseRobberII() throws Exception{
		assertEquals(3, new HouseRobberII().rob(new int[] {2,3,2}));
		assertEquals(4, new HouseRobberII().rob(new int[] {1,2,3,1}));
		assertEquals(103, new HouseRobberII().rob(new int[] {1,3,1,3,100}));
		assertEquals(0, new HouseRobberII().rob(new int[0]));
		assertEquals(1, new HouseRobberII().rob(new int[] {1}));
		assertEquals(4, new HouseRobberII().rob(new int[] {4,2}));
	}

	/**
	 * Test cases for 215. Kth Largest Element in an Array
	 * @see KthLargestElementInAnArray
	 */
	@Test
	void testKthLargestElementInAnArray() throws Exception{
		assertEquals(5, new KthLargestElementInAnArray().findKthLargest(new int[] {3,2,1,5,6,4}, 2));
		assertEquals(4, new KthLargestElementInAnArray().findKthLargest(new int[] {3,2,3,1,2,4,5,5,6}, 4));
	}

	/**
	 * Test cases for 217. Contains Duplicate
	 * @see ContainsDuplicate
	 */
	@Test
	void testContainsDuplicate() throws Exception{
		assertTrue(new ContainsDuplicate().containsDuplicate(new int[] {1,2,3,1}));
		assertFalse(new ContainsDuplicate().containsDuplicate(new int[] {1,2,3,4}));
		assertTrue(new ContainsDuplicate().containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
	}

	/**
	 * Test cases for 268. Missing Number
	 * @see MissingNumber
	 */
	@Test
	void testMissingNumber() throws Exception{
		assertEquals(2, new MissingNumber().missingNumber(new int[] {3,0,1}));
		assertEquals(8, new MissingNumber().missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
		assertEquals(1, new MissingNumber().missingNumber(new int[] {0}));
		assertEquals(0, new MissingNumber().missingNumber(new int[] {1}));
	}

	/**
	 * Test cases for 287. Find the Duplicate Number
	 * @see FindTheDuplicateNumber
	 * @see FindTheDuplicateNumber2
	 */
	@Test
	void testFindTheDuplicateNumber() {
		//Test for FindTheDuplicateNumber
		assertEquals(2, new FindTheDuplicateNumber().findDuplicate(new int[] {1,3,4,2,2}));
		assertEquals(3, new FindTheDuplicateNumber().findDuplicate(new int[] {3,1,3,4,2}));
		assertEquals(9, new FindTheDuplicateNumber().findDuplicate(new int[] {2,5,9,6,9,3,8,9,7,1}));
		
		//Test for FindTheDuplicateNumber2
		assertEquals(2, new FindTheDuplicateNumber2().findDuplicate(new int[] {1,3,4,2,2}));
		assertEquals(3, new FindTheDuplicateNumber2().findDuplicate(new int[] {3,1,3,4,2}));
		assertEquals(9, new FindTheDuplicateNumber2().findDuplicate(new int[] {2,5,9,6,9,3,8,9,7,1}));
	}

	/**
	 * Test cases for 295. Find Median from Data Stream
	 * @see FindMedianFromDataStream
	 * @see FindMedianFromDataStream2
	 */
	@Test
	void testFindMedianFromDataStream() throws Exception{
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
	 * @see LongestIncreasingSubsequence
	 */
	@Test
	void testLongestIncreasingSubsequence() throws Exception{
		assertEquals(4, new LongestIncreasingSubsequence().lengthOfLIS(new int[] {10,9,2,5,3,7,101,18}));
		assertEquals(0, new LongestIncreasingSubsequence().lengthOfLIS(new int[] {}));
	}

	/**
	 * Test cases for 322. Coin Change
	 * @see CoinChange
	 */
	@Test
	void testCoinChange() throws Exception{
		assertEquals(3, new CoinChange().coinChange(new int[] {1,2,5}, 11));
		assertEquals(-1, new CoinChange().coinChange(new int[] {2}, 3));
		assertEquals(-1, new CoinChange().coinChange(new int[0], 11));
	}

	/**
	 * Test cases for 347. Top K Frequent Elements
	 * @see TopKFrequentElements
	 */
	@Test
	void testTopKFrequentElements() throws Exception{
		assertEquals(Arrays.asList(1,2), new TopKFrequentElements().topKFrequent(new int[] {1,1,1,2,2,3}, 2));
		assertEquals(Arrays.asList(1), new TopKFrequentElements().topKFrequent(new int[] {1}, 1));
		assertEquals(Arrays.asList(-1,2), new TopKFrequentElements().topKFrequent(new int[] {4,1,-1,2,-1,2,3}, 2));
	}

	/**
	 * Test cases for 349. Intersection of Two Arrays
	 * @see IntersectionOfTwoArrays
	 */
	@Test
	void testIntersectionOfTwoArrays() throws Exception {
		assertArrayEquals(new int[] {2}, new IntersectionOfTwoArrays().intersection(new int[] {1,2,2,1}, new int[] {2,2}));
		
		int[] expected = new int[] {9,4};
		int[] actual = new IntersectionOfTwoArrays().intersection(new int[] {4,9,5}, new int[] {9,4,9,8,4});
		Arrays.sort(expected);
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
	}

	/**
	 * Test cases for 350. Intersection of Two Arrays II
	 * @see IntersectionOfTwoArraysII
	 * @see IntersectionOfTwoArraysII2
	 */
	@Test
	void testIntersectionOfTwoArraysII() throws Exception{
		assertArrayEquals(new int[] {2,2}, new IntersectionOfTwoArraysII().intersect(new int[] {1,2,2,1}, new int[] {2,2}));
		assertArrayEquals(new int[] {4,9}, new IntersectionOfTwoArraysII().intersect(new int[] {4,9,5}, new int[] {9,4,9,8,4}));
		assertArrayEquals(new int[] {2,1}, new IntersectionOfTwoArraysII().intersect(new int[] {2,1}, new int[] {1,2}));
		assertArrayEquals(new int[0], new IntersectionOfTwoArraysII().intersect(new int[] {1,2,2,1}, new int[0]));
		assertArrayEquals(new int[0], new IntersectionOfTwoArraysII().intersect(new int[0], new int[] {1,2,2}));
	}

	/**
	 * Test cases for 1207. Unique Number of Occurrences
	 * @see UniqueNumberOfOccurrences
	 */
	@Test
	void testUniqueNumberOfOccurrences() throws Exception{
		assertTrue(new UniqueNumberOfOccurrences().uniqueOccurrences(new int[] {1,2,2,1,1,3}));
		assertFalse(new UniqueNumberOfOccurrences().uniqueOccurrences(new int[] {1,2}));
		assertTrue(new UniqueNumberOfOccurrences().uniqueOccurrences(new int[] {-3,0,1,-3,1,1,1,-3,10,0}));
	}

}

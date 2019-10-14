package interval;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {

	/**
	 * Test cases for 435. Non-overlapping Intervals
	 * @see NonOverlappingIntervals
	 */
	@Test
	void testNonOverlappingIntervals() throws Exception{
		int[][] intervals = setupIntervals("[[1,2],[2,3],[3,4],[1,3]]");
		assertEquals(1, new NonOverlappingIntervals().eraseOverlapIntervals(intervals));
		
		intervals = setupIntervals("[[1,2],[1,2],[1,2]]");
		assertEquals(2, new NonOverlappingIntervals().eraseOverlapIntervals(intervals));
		
		intervals = setupIntervals("[[1,2],[2,3]]");
		assertEquals(0, new NonOverlappingIntervals().eraseOverlapIntervals(intervals));
	}

	/**
	 * Test cases for 56. Merge Intervals
	 * @see MergeIntervals
	 */
	@Test
	void testMergeIntervals() throws Exception{
		int[][] intervals = setupIntervals("[[1,3],[2,6],[8,10],[15,18]]");
		int[][] expected = setupIntervals("[[1,6],[8,10],[15,18]]");
		assertArrayEquals(expected, new MergeIntervals().merge(intervals));
		
		intervals = setupIntervals("[[1,4],[4,5]]");
		expected = setupIntervals("[[1,5]]");
		assertArrayEquals(expected, new MergeIntervals().merge(intervals));	
	}

	public static int[][] setupIntervals(String str) {
		String[] each = str.split("],");
		int[][] intervals = new int[each.length][];

		for (int i = 0; i < each.length; i++) {
			String[] nums = each[i].replaceAll("\\[|\\]", "").split(",");
			intervals[i] = new int[nums.length];

			for (int j = 0; j < nums.length; j++) {
				intervals[i][j] = Integer.valueOf(nums[j]);
			}
		}

		return intervals;
	}

}

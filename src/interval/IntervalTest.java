package interval;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {

	/**
	 * Test cases for 56. Merge Intervals
	 * 
	 * @see MergeIntervals
	 */
	@Test
	void testMergeIntervals() {
		int[][] intervals = setupIntervals("[[1,3],[2,6],[8,10],[15,18]]");
		int[][] expected = setupIntervals("[[1,6],[8,10],[15,18]]");
		assertArrayEquals(expected, new MergeIntervals().merge(intervals));

		intervals = setupIntervals("[[1,4],[4,5]]");
		expected = setupIntervals("[[1,5]]");
		assertArrayEquals(expected, new MergeIntervals().merge(intervals));
	}

	/**
	 * Test cases for 57. Insert Interval
	 * 
	 * @see InsertInterval
	 */
	@Test
	void testInsertInterval() {
		int[][] intervals = setupIntervals("[[1,3],[6,9]]");
		int[][] expected = setupIntervals("[[1,5],[6,9]]");
		assertArrayEquals(expected, new InsertInterval().insert(intervals, new int[] { 2, 5 }));

		intervals = setupIntervals("[[1,2],[3,5],[6,7],[8,10],[12,16]]");
		expected = setupIntervals("[[1,2],[3,10],[12,16]]");
		assertArrayEquals(expected, new InsertInterval().insert(intervals, new int[] { 4, 8 }));

		intervals = new int[0][];
		expected = setupIntervals("[[1,2]]");
		assertArrayEquals(expected, new InsertInterval().insert(intervals, new int[] { 1, 2 }));

		intervals = setupIntervals("[[5,8]]");
		expected = setupIntervals("[[1,3],[5,8]]");
		assertArrayEquals(expected, new InsertInterval().insert(intervals, new int[] { 1, 3 }));

		intervals = setupIntervals("[[1,2]]");
		expected = setupIntervals("[[1,2],[3,10]]");
		assertArrayEquals(expected, new InsertInterval().insert(intervals, new int[] { 3, 10 }));

		intervals = setupIntervals("[[1,4]]");
		expected = setupIntervals("[[1,8]]");
		assertArrayEquals(expected, new InsertInterval().insert(intervals, new int[] { 4, 8 }));
	}

	/**
	 * Test cases for 435. Non-overlapping Intervals
	 * 
	 * @see NonOverlappingIntervals
	 */
	@Test
	void testNonOverlappingIntervals() {
		int[][] intervals = setupIntervals("[[1,2],[2,3],[3,4],[1,3]]");
		assertEquals(1, new NonOverlappingIntervals().eraseOverlapIntervals(intervals));

		intervals = setupIntervals("[[1,2],[1,2],[1,2]]");
		assertEquals(2, new NonOverlappingIntervals().eraseOverlapIntervals(intervals));

		intervals = setupIntervals("[[1,2],[2,3]]");
		assertEquals(0, new NonOverlappingIntervals().eraseOverlapIntervals(intervals));
	}

	int[][] setupIntervals(String str) {
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

package graph;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class GraphTest {

	/**
	 * Test cases for 207. Course Schedule
	 * 
	 * @see CourseSchedule
	 */
	@Test
	void testCourseSchedule() {
		int[][] prerequisites = setupGraph("[[1,0]]");
		assertTrue(new CourseSchedule().canFinish(2, prerequisites));

		prerequisites = setupGraph("[[1,0],[0,1]]");
		assertFalse(new CourseSchedule().canFinish(2, prerequisites));

		prerequisites = setupGraph("[[0,1]]");
		assertTrue(new CourseSchedule().canFinish(2, prerequisites));

		prerequisites = setupGraph("[[1,0],[2,0],[3,1],[3,2]]");
		assertTrue(new CourseSchedule().canFinish(2, prerequisites));
	}

	/**
	 * Test cases for 210. Course Schedule II
	 * 
	 * @see CourseScheduleII
	 */
	@Test
	void testCourseScheduleII() {
		int[][] prerequisites = setupGraph("[[1,0]]");
		int[] expected = new int[] { 0, 1 };
		int[] order = new CourseScheduleII().findOrder(2, prerequisites);
		assertArrayEquals(expected, order);

		prerequisites = setupGraph("[[0,1]]");
		expected = new int[] { 1, 0 };
		order = new CourseScheduleII().findOrder(2, prerequisites);
		assertArrayEquals(expected, order);

		prerequisites = setupGraph("[[1,0],[0,1]]");
		expected = new int[0];
		order = new CourseScheduleII().findOrder(2, prerequisites);
		assertArrayEquals(expected, order);

		prerequisites = setupGraph("[[1,0],[2,0],[3,1],[3,2]]");
		Set<int[]> possibleOrders = new HashSet<int[]>();
		possibleOrders.add(new int[] { 0, 1, 2, 3 });
		possibleOrders.add(new int[] { 0, 2, 1, 3 });
		order = new CourseScheduleII().findOrder(4, prerequisites);
		boolean contained = false;
		for (int[] p : possibleOrders) {
			contained = contained || Arrays.equals(p, order);
		}
		assertTrue(contained);
	}

	int[][] setupGraph(String str) {
		String[] each = str.split("],");
		int[][] matrix = new int[each.length][];

		for (int i = 0; i < each.length; i++) {
			String[] nums = each[i].replaceAll("\\[|\\]", "").split(",");
			matrix[i] = new int[nums.length];

			for (int j = 0; j < nums.length; j++) {
				if (!nums[j].equals("")) {
					matrix[i][j] = Integer.valueOf(nums[j]);
				}
			}
		}

		return matrix;
	}

}

package graph;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class GraphTest {

	/**
	 * Test cases for 210. Course Schedule II
	 * 
	 * @see CourseScheduleII
	 */
	@Test
	void testCourseScheduleII() {
		int[][] prerequisites = new int[][] {{1,0}};
		int[] expected = new int[] {0,1};
		int[] order = new CourseScheduleII().findOrder(2, prerequisites);
		assertArrayEquals(expected, order);
		
		prerequisites = new int[][] {{0,1}};
		expected = new int[] {1,0};
		order = new CourseScheduleII().findOrder(2, prerequisites);
		assertArrayEquals(expected, order);
		
		prerequisites = new int[][] {{0,1}, {1,0}};
		expected = new int[0];
		order = new CourseScheduleII().findOrder(2, prerequisites);
		assertArrayEquals(expected, order);
		
		prerequisites = new int[][] {{1,0},{2,0},{3,1},{3,2}};
		Set<int[]> possibleOrders = new HashSet<int[]>();
		possibleOrders.add(new int[] {0,1,2,3});
		possibleOrders.add(new int[] {0,2,1,3});
		order = new CourseScheduleII().findOrder(4, prerequisites);
		boolean contained = false;
		for(int[] p: possibleOrders) {
			contained = contained || Arrays.equals(p, order);
		}
		assertTrue(contained);
	}

}

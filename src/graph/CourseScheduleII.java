package graph;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 12/19/2019
 * 
 * 210. Course Schedule II
 * https://leetcode.com/problems/course-schedule-ii/
 * difficulty: Medium
 * 
 * Approach: DFS & Recursion
 * Runtime: 8 ms, faster than 42.38% of Java online submissions for Course Schedule II.
 * Memory Usage: 46.4 MB, less than 50.00% of Java online submissions for Course Schedule II.
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(n^2)
 * Where n is the number of nodes in a graph
 * 
 * @see GraphTest#testCourseScheduleII()
 */
public class CourseScheduleII {

	private Map<Integer, Set<Integer>> map = new HashMap<Integer, Set<Integer>>();
	private Set<Integer> taken = new HashSet<Integer>();
	private int[] order;
	private int index = 0;
	private boolean cycle = false;

	public int[] findOrder(int numCourses, int[][] prerequisites) {
		order = new int[numCourses];

		// add all courses to map
		for (int i = 0; i < numCourses; i++) {
			map.put(i, new HashSet<Integer>());
		}

		// add requirements to each course
		for (int[] req : prerequisites) {
			map.get(req[0]).add(req[1]);
		}

		Set<Integer> passed = new HashSet<Integer>();

		for (Integer node : map.keySet()) {
			dfs(node, passed);
			if (cycle) {
				return new int[0];
			}
		}

		return order;
	}

	private void dfs(int node, Set<Integer> path) {
		if (cycle) {
			return;
		}
		if (taken.contains(node)) {
			return;
		}

		if (map.get(node).size() != 0) {
			path.add(node);

			for (Integer next : map.get(node)) {
				if (path.contains(next)) {
					cycle = true;
					return;
				}
				dfs(next, path);
			}

			path.remove(node);
		}

		order[index++] = node;
		taken.add(node);
	}

}

package graph;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 08/15/2019
 * 
 * 207. Course Schedule
 * https://leetcode.com/problems/course-schedule/
 * difficulty: Medium
 * 
 * Approach: DFS & Recursion
 * Runtime: 17 ms, faster than 40.17% of Java online submissions for Course Schedule.
 * Memory Usage: 46.1 MB, less than 62.31% of Java online submissions for Course Schedule.
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(n^2) for the recursive stack
 * Where n is the number of nodes in a graph
 * 
 * @see GraphTest#testCourseSchedule()
 */
public class CourseSchedule {

	private Map<Integer, HashSet<Integer>> graph = new HashMap<Integer, HashSet<Integer>>();
	private Set<Integer> seen = new TreeSet<Integer>();
	private int count;

	public boolean canFinish(int numCourses, int[][] prerequisites) {

		for (int i = 0; i < prerequisites.length; i++) {
			int[] pair = prerequisites[i];
			if (!graph.containsKey(pair[0])) {
				graph.put(pair[0], new HashSet<Integer>());
			}
			if (!graph.containsKey(pair[1])) {
				graph.put(pair[1], new HashSet<Integer>());
			}
			graph.get(pair[0]).add(pair[1]);
		}

		Set<Integer> passed = new TreeSet<Integer>();
		count = numCourses;

		for (Integer node : graph.keySet()) {
			if (!seen.contains(node)) {
				dfs(node, passed);
				if (count < 0) {
					return false;
				}
			}
		}

		return true;
	}

	void dfs(Integer node, Set<Integer> path) {

		seen.add(node);
		path.add(node);

		for (Integer i : graph.get(node)) {
			if (seen.contains(i) && path.contains(i)) {
				count = -1;
				return;
			}
			if (!seen.contains(i)) {
				dfs(i, path);
			}
		}

		path.remove(node);
	}

}

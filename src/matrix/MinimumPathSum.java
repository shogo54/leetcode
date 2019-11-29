package matrix;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 11/29/2019
 * 
 * 64. Minimum Path Sum
 * https://leetcode.com/problems/minimum-path-sum/
 * Difficulty: Medium
 * 
 * Approach: A*
 * Runtime: 20 ms, faster than 5.34% of Java online submissions for Minimum Path Sum.
 * Memory Usage: 37.2 MB, less than 100.00% of Java online submissions for Minimum Path Sum.
 * 
 * @see MatrixTest#testMinimumPathSum()
 */
public class MinimumPathSum {

	private int m;

	public int minPathSum(int[][] grid) {
		if (grid.length == 0 || grid[0].length == 0) {
			return 0;
		}

		m = grid.length;
		int n = grid[0].length;
		int min = Integer.MAX_VALUE;
		PriorityQueue<Path> queue = new PriorityQueue<Path>();
		Set<Path> seen = new HashSet<Path>();
		queue.offer(new Path(0, 0, grid[0][0]));

		while (!queue.isEmpty()) {
			Path curr = queue.poll();
			int y = curr.y;
			int x = curr.x;
			int cost = curr.cost;

			if (y == m - 1 && x == n - 1) {
				min = cost;
				break;
			}

			if (y < m - 1) {
				Path next = new Path(y + 1, x, cost + grid[y + 1][x]);
				if (!seen.contains(next)) {
					queue.offer(next);
					seen.add(next);
				}
			}
			if (x < n - 1) {
				Path next = new Path(y, x + 1, cost + grid[y][x + 1]);
				if (!seen.contains(next)) {
					queue.offer(next);
					seen.add(next);
				}
			}
		}

		return min;
	}

	private class Path implements Comparable<Path> {

		int y;
		int x;
		int cost;

		Path(int y, int x, int cost) {
			this.y = y;
			this.x = x;
			this.cost = cost;
		}

		@Override
		public int compareTo(Path p) {
			if (p.cost != this.cost) {
				return this.cost - p.cost;
			}
			return (p.x + p.y) - (this.x + this.y);
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Path) {
				Path p = (Path) obj;
				return (this.x == p.x && this.y == p.y);
			}
			return false;
		}

		@Override
		public int hashCode() {
			return (this.y * m) + this.x;
		}

	}

}

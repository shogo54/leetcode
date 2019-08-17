import java.util.*;
import java.awt.*;

/**
 * @author Shogo Akiyama 
 * Solved on 06/17/2019
 * 
 * 980. Unique Paths III
 * https://leetcode.com/problems/unique-paths-iii/
 * Difficulty: Hard
 * 
 * To run the code in LeetCode, take the codes inside the bellow class.
 * 
 * Runtime: 52 ms, faster than 6.14% of Java online submissions for Unique Paths III.
 * Memory Usage: 41.3 MB, less than 7.47% of Java online submissions for Unique Paths III.
 * 
 * Note: the running time is very slow. Revisit and try to improve in the future.
 * 
 */

public class UniquePathsIII {

	static Set<Point> dir = new HashSet<Point>();
	static {
		dir.add(new Point(0, 1));
		dir.add(new Point(0, -1));
		dir.add(new Point(-1, 0));
		dir.add(new Point(1, 0));
	}

	public int uniquePathsIII(int[][] grid) {
		int stepCount = 0;
		Point start = null;
		Set<Point> visited = new TreeSet<Point>();
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					start = new Point(i, j);
				}
				if (grid[i][j] != -1) {
					stepCount++;
				}
			}
		}

		return counter(grid, 1, stepCount, start, visited);
	}

	int counter(int[][] grid, int currSteps, int stepsNeeded, Point curr, Set<Point> visited) {
		if (currSteps == stepsNeeded) {
			if (grid[curr.x][curr.y] == 2) {
				return 1;
			} else {
				return 0;
			}
		} else if (currSteps > stepsNeeded) {
			return 0;
		}

		int count = 0;
		Set<Point> set = new TreeSet<Point>(new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				int difX = Double.valueOf(o1.x).compareTo(Double.valueOf(o2.x));
				if (difX != 0) {
					return difX;
				} else {
					return Double.valueOf(o1.y).compareTo(Double.valueOf(o2.y));
				}
			}
		});

		set.addAll(visited);
		set.add(curr);

		for (Point p : dir) {
			Point next = new Point(curr.x + p.x, curr.y + p.y);
			if (next.x < 0 || next.x >= grid.length || next.y < 0 || next.y >= grid[0].length) {
				continue;
			}
			if (set.contains(next) || grid[next.x][next.y] == -1) {
				continue;
			}
			count += counter(grid, currSteps + 1, stepsNeeded, next, set);
		}

		return count;
	}

}
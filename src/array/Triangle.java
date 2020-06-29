package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 06/29/2020
 * 
 * 120. Triangle
 * https://leetcode.com/problems/triangle/
 * Difficulty: Medium
 * 
 * Approach: Dynamic Programming (Bottom up)
 * Runtime: 3 ms, faster than 48.38% of Java online submissions for Triangle.
 * Memory Usage: 39.6 MB, less than 58.17% of Java online submissions for Triangle.
 * 
 * Time complexity : O(n*n)
 * Space complexity : O(1)
 * Where n is the size of the triangle
 * 
 * @see ArrayTest#testTriangle()
 */
public class Triangle {

	public int minimumTotal(List<List<Integer>> triangle) {
		if (triangle.size() == 0) {
			return 0;
		}

		for (int i = triangle.size() - 2; i >= 0; i--) {
			List<Integer> curr = triangle.get(i);
			List<Integer> prev = triangle.get(i + 1);
			for (int j = 0; j < curr.size(); j++) {
				curr.set(j, curr.get(j).intValue() + Math.min(prev.get(j), prev.get(j + 1)));
			}
		}

		return triangle.get(0).get(0);
	}

}

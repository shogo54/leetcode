package matrix;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

/**
 * @author Shogo Akiyama 
 * Solved on 05/16/2020
 * 
 * 1222. Queens That Can Attack the King
 * https://leetcode.com/problems/queens-that-can-attack-the-king/
 * Difficulty: Medium
 * 
 * Approach: Set and Ieration
 * Runtime: 1 ms, faster than 75.04% of Java online submissions for Queens That Can Attack the King.
 * Memory Usage: 41 MB, less than 100.00% of Java online submissions for Queens That Can Attack the King.
 * 
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 * Both of them are constant because at most there are 65 queens on the board
 * 
 * @see MatrixTest#testQueensThatCanAttackTheKing()
 */
public class QueensThatCanAttackTheKing {

	public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
		Set<Integer> set = new HashSet<Integer>();
		List<List<Integer>> res = new ArrayList<List<Integer>>();

		for (int[] q : queens) {
			set.add(q[0] * 8 + q[1]);
		}

		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				if (i == 0 && j == 0) {
					continue;
				}
				int x = king[0] + i;
				int y = king[1] + j;

				while (x >= 0 && x < 8 && y >= 0 && y < 8) {
					if (set.contains(x * 8 + y)) {
						res.add(Arrays.asList(x, y));
						break;
					}
					x += i;
					y += j;
				}
			}
		}

		return res;
	}

}

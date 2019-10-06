package matrix;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 08/22/2019
 * 
 * 79. Word Search
 * https://leetcode.com/problems/word-search/
 * Difficulty: Medium
 * 
 * Approach: DFS
 * Runtime: 33 ms, faster than 12.21% of Java online submissions for Word Search.
 * Memory Usage: 40.5 MB, less than 37.76% of Java online submissions for Word Search.
 * 
 * @see MatrixTest#testWordSearch()
 */
public class WordSearch {

	Map<Character, List<Integer>> map = new HashMap<Character, List<Integer>>();
	int[][] adjacents = new int[][] { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	Set<Integer> used = new HashSet<Integer>();
	boolean found = false;
	int X;
	int Y;

	public boolean exist(char[][] board, String word) {
		if (word.length() == 0) {
			return false;
		}
		if (board.length == 0 || board[0].length == 0) {
			return false;
		}

		X = board[0].length;
		Y = board.length;

		for (int i = 0; i < Y; i++) {
			for (int j = 0; j < X; j++) {
				char c = board[i][j];
				if (!map.containsKey(c)) {
					map.put(c, new ArrayList<Integer>());
				}
				map.get(c).add(i * X + j);
			}
		}

		if (map.containsKey(word.charAt(0))) {
			for (Integer i : map.get(word.charAt(0))) {
				used.add(i);
				check(board, word, 0, i % X, i / X);
				used.remove(i);
				if (found) {
					return true;
				}
			}
		}

		return false;
	}

	private void check(char[][] b, String goal, int index, int x, int y) {
		if (goal.length() - 1 == index) {
			found = true;
			return;
		}

		for (int[] next : adjacents) {
			if (found) {
				return;
			}
			int nextX = x + next[0];
			int nextY = y + next[1];
			if (nextX >= 0 && nextX < X && nextY >= 0 && nextY < Y) {
				int converted = nextY * X + nextX;
				if (!used.contains(converted) && goal.charAt(index + 1) == b[nextY][nextX]) {
					used.add(converted);
					check(b, goal, index + 1, nextX, nextY);
					used.remove(converted);
				}
			}
		}
	}

}

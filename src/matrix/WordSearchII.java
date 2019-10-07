package matrix;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 10/06/2019
 * 
 * 212. Word Search II
 * https://leetcode.com/problems/word-search-ii/
 * Difficulty: Hard
 * 
 * Approach: DFS
 * Runtime: 581 ms, faster than 5.36% of Java online submissions for Word Search II.
 * Memory Usage: 37.6 MB, less than 100.00% of Java online submissions for Word Search II.
 * 
 * @see MatrixTest#testWordSearchII()
 */
public class WordSearchII {

	char[][] grid;
	int h;
	int w;
	List<String> result = new LinkedList<String>();
	int[][] yxs = new int[][] { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	boolean found = false;

	public List<String> findWords(char[][] board, String[] words) {
		if (board == null || board.length == 0 || words == null || words.length == 0) {
			return new ArrayList<String>();
		}

		grid = board;
		h = board.length;
		w = board[0].length;
		Map<Character, List<int[]>> map = new HashMap<Character, List<int[]>>();

		// create a map from character to y-x cordinate
		for (int y = 0; y < h; y++) {
			for (int x = 0; x < w; x++) {
				char c = grid[y][x];
				if (!map.containsKey(c)) {
					map.put(c, new ArrayList<int[]>());
				}
				map.get(c).add(new int[] { y, x });
			}
		}

		// check each word
		for (String s : words) {
			char first = s.charAt(0);
			if (map.get(first) == null) {
				continue;
			}

			for (int[] cord : map.get(first)) {
				if (found) {
					break;
				}
				dfs(s, cord[0], cord[1], 1);
			}
			found = false;
		}

		return result;
	}

	private void dfs(String word, int y, int x, int index) {
		if (word.length() == index) {
			result.add(word);
			found = true;
			return;
		}

		char ch = grid[y][x];
		grid[y][x] = '-';
		char next = word.charAt(index);

		for (int[] yx : yxs) {
			if (found == true) {
				break;
			}
			int y2 = y + yx[0];
			int x2 = x + yx[1];
			if (y2 >= 0 && y2 < h && x2 >= 0 && x2 < w && grid[y2][x2] == next) {
				dfs(word, y2, x2, ++index);
				index--;
			}
		}
		grid[y][x] = ch;
	}

}

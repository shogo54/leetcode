package string;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 11/09/2019
 * 
 * 127. Word Ladder
 * https://leetcode.com/problems/word-ladder/
 * Difficulty: Medium
 * 
 * Approach: Graph & BFS
 * Runtime: 749 ms, faster than 6.85% of Java online submissions for Word Ladder.
 * Memory Usage: 48.7 MB, less than 5.11% of Java online submissions for Word Ladder.
 * 
 * @see StringTest#testWordLadder()
 */
public class WordLadder {

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		if (!wordList.contains(endWord)) {
			return 0;
		}

		// prepare a graph
		Map<String, Set<String>> map = new HashMap<String, Set<String>>();
		Set<String> set = new HashSet<String>();
		wordList.add(beginWord);

		for (String word : wordList) {
			map.put(word, new HashSet<String>());
		}

		for (String word : map.keySet()) {
			for (String prev : set) {
				int diff = 0;
				for (int i = 0; i < word.length(); i++) {
					if (word.charAt(i) != prev.charAt(i)) {
						diff++;
					}
				}
				if (diff == 1) {
					map.get(word).add(prev);
					map.get(prev).add(word);
				}
			}
			set.add(word);
		}

		// bfs
		Queue<String> stack = new ArrayDeque<String>();
		Queue<Integer> counts = new ArrayDeque<Integer>();
		Set<String> seen = new HashSet<String>();

		stack.add(beginWord);
		counts.add(1);

		while (!stack.isEmpty()) {
			String curr = stack.poll();
			int count = counts.poll();
			seen.add(curr);

			for (String next : map.get(curr)) {
				if (next.equals(endWord)) {
					return count + 1;
				}
				if (!seen.contains(next)) {
					stack.add(next);
					counts.add(count + 1);
				}
			}
		}

		return 0;
	}

}
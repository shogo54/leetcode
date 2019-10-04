package string;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 10/03/2019
 * 
 * 211. Add and Search Word - Data structure design
 * https://leetcode.com/problems/add-and-search-word-data-structure-design/
 * Difficulty: Medium
 * 
 * Approach: Trie
 * Runtime: 94 ms, faster than 26.33% of Java online submissions for Add and Search Word - Data structure design.
 * Memory Usage: 59.1 MB, less than 60.61% of Java online submissions for Add and Search Word - Data structure design.
 * 
 */

public class AddAndSearchWordDataStructureDesign {

	private Trie root = new Trie();

	/** Adds a word into the data structure. */
	public void addWord(String word) {
		root.add(word, 0);
	}

	/**
	 * Returns if the word is in the data structure. A word could contain the dot
	 * character '.' to represent any one letter.
	 */
	public boolean search(String word) {
		return root.search(word, 0);
	}

	class Trie {
		boolean isWord;
		Map<Character, Trie> nexts;

		Trie() {
			isWord = false;
			nexts = new HashMap<Character, Trie>();
		}

		void add(String s, int index) {
			if (s == null) {
				return;
			}
			if (s.length() <= index) {
				isWord = true;
				return;
			}
			char c = s.charAt(index);
			if (!nexts.containsKey(c)) {
				nexts.put(c, new Trie());
			}
			nexts.get(c).add(s, ++index);
		}

		boolean search(String s, int index) {
			if (s == null) {
				return false;
			}
			if (s.length() <= index) {
				return isWord;
			}

			char c = s.charAt(index);

			if (c == '.') {
				boolean flag = false;
				for (Trie t : nexts.values()) {
					if (flag) {
						return true;
					}
					flag = t.search(s, index + 1);
				}
				return flag;
			}
			if (nexts.containsKey(c)) {
				return nexts.get(c).search(s, ++index);
			}

			return false;
		}
	}

}

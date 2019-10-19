package string;

/**
 * @author Shogo Akiyama 
 * Solved on 10/18/2019
 * 
 * 208. Implement Trie (Prefix Tree)
 * https://leetcode.com/problems/implement-trie-prefix-tree/
 * Difficulty: Medium
 * 
 * Approach: Recursion
 * Runtime: 74 ms, faster than 89.22% of Java online submissions for Implement Trie (Prefix Tree).
 * Memory Usage: 50.6 MB, less than 100.00% of Java online submissions for Implement Trie (Prefix Tree).
 * 
 * @see StringTest#testImplementTrie()
 */
class Trie {

	boolean isWord = false;
	Trie[] nexts = new Trie[26];

	/** Inserts a word into the trie. */
	public void insert(String word) {
		if (word != null) {
			char[] chars = word.toCharArray();
			this.insert(chars, 0);
		}
	}

	private void insert(char[] word, int index) {
		if (word.length == index) {
			this.isWord = true;
			return;
		}

		char c = word[index];
		if (this.nexts[c - 'a'] == null) {
			this.nexts[c - 'a'] = new Trie();
		}
		Trie next = this.nexts[c - 'a'];
		next.insert(word, index + 1);
	}

	/** Returns if the word is in the trie. */
	public boolean search(String word) {
		Trie t = null;
		if (word != null) {
			char[] chars = word.toCharArray();
			t = this.search(chars, 0);
		}
		return (t != null) ? t.isWord : false;
	}

	private Trie search(char[] word, int index) {
		if (word.length == index) {
			return this;
		}
		char c = word[index];
		if (this.nexts[c - 'a'] == null) {
			return null;
		}

		return this.nexts[c - 'a'].search(word, index + 1);
	}

	/**
	 * Returns if there is any word in the trie that starts with the given prefix.
	 */
	public boolean startsWith(String prefix) {
		Trie t = null;
		if (prefix != null) {
			char[] chars = prefix.toCharArray();
			t = this.search(chars, 0);
		}
		return (t != null);
	}

}
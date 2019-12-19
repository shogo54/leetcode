package string;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 12/04/2019
 * 
 * 438. Find All Anagrams in a String
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/
 * Difficulty: Medium
 * 
 * Approach: Map & Iteration
 * Runtime: 21 ms, faster than 50.16% of Java online submissions for Find All Anagrams in a String.
 * Memory Usage: 38.5 MB, less than 100.00% of Java online submissions for Find All Anagrams in a String.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the length of the string s
 * 
 * @see StringTest#testFindAllAnagramsInAString()
 */
public class FindAllAnagramsInAString {

	public List<Integer> findAnagrams(String s, String p) {
		if (s.length() < p.length()) {
			return new ArrayList<Integer>();
		}

		List<Integer> result = new ArrayList<Integer>();
		int[] pMap = new int[26];
		int[] sMap = new int[26];
		Map<Integer, Integer> required = new HashMap<Integer, Integer>();

		for (int i = 0; i < p.length(); i++) {
			pMap[p.charAt(i) - 'a']++;
			sMap[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < pMap.length; i++) {
			change(required, i, sMap[i] - pMap[i]);
		}

		for (int i = 0; i < s.length() - p.length(); i++) {
			if (required.size() == 0) {
				result.add(i);
			}
			int removed = s.charAt(i) - 'a';
			int added = s.charAt(i + p.length()) - 'a';

			if (removed == added) {
				continue;
			}
			change(required, removed, -1);
			change(required, added, 1);
		}

		if (required.size() == 0) {
			result.add(s.length() - p.length());
		}

		return result;
	}

	private void change(Map<Integer, Integer> map, int index, int val) {
		map.put(index, map.getOrDefault(index, 0) + val);

		if (map.get(index).intValue() == 0) {
			map.remove(index);
		}
	}
}

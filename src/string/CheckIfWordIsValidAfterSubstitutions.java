package string;

/**
 * @author Shogo Akiyama 
 * Solved on 06/13/2019
 * 
 * 1003. Check If Word Is Valid After Substitutions
 * https://leetcode.com/problems/check-if-word-is-valid-after-substitutions/
 * Difficulty: Medium
 * 
 * Approach: Recursion
 * Runtime: 142 ms, faster than 14.33% of Java online submissions for Check If Word Is Valid After Substitutions.
 * Memory Usage: 44.3 MB, less than 6.29% of Java online submissions for Check If Word Is Valid After Substitutions.
 * 
 * @see StringTest#testCheckIfWordIsValidAfterSubstitutions()
 */
public class CheckIfWordIsValidAfterSubstitutions {

	public boolean isValid(String S) {
		return containValid(S, 0);
	}

	private boolean containValid(String s, int index) {
		if (s.equals("")) {
			return true;
		}
		index = index < 0 ? 0 : index;
		for (int i = index; i < s.length() - 2; i++) {
			if (s.substring(i, i + 3).equals("abc")) {
				return containValid(s.substring(0, i) + s.substring(i + 3), i - 2);
			}
		}
		return false;
	}

}

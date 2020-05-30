package integer;

/**
 * @author Shogo Akiyama 
 * Solved on 05/30/2020
 * Time: 7m30s
 * 
 * 278. First Bad Version
 * https://leetcode.com/problems/first-bad-version/
 * Difficulty: Easy
 * 
 * Approach: Binary Search
 * Runtime: 12 ms, faster than 98.83% of Java online submissions for First Bad Version.
 * Memory Usage: 35.9 MB, less than 5.63% of Java online submissions for First Bad Version.
 * 
 * Time Complexity: O(log(n))
 * Space Complexity: O(1)
 * Where n is the given number
 * 
 * @see IntegerTest#testFirstBadVersion()
 */
public class FirstBadVersion {

	private int badVersion;

	public FirstBadVersion(int v) {
		this.badVersion = v;
	}

	private boolean isBadVersion(int version) {
		return badVersion <= version;
	}

	public int firstBadVersion(int n) {
		int s = 1;
		int e = n;

		while (s < e) {
			int mid = s + (e - s) / 2;
			if (isBadVersion(mid)) {
				e = mid;
			} else {
				s = mid + 1;
			}
		}

		return e;
	}

}

package string;

/**
 * @author Shogo Akiyama 
 * Solved on 09/28/2019
 * 
 * 91. Decode Ways
 * https://leetcode.com/problems/decode-ways/
 * Difficulty: Medium
 * 
 * Approach: Divide and Conquer
 * Runtime: 2 ms, faster than 55.00% of Java online submissions for Decode Ways.
 * Memory Usage: 36.1 MB, less than 71.70% of Java online submissions for Decode Ways.
 * 
 */

public class DecodeWays {

	public int numDecodings(String s) {
		int[] vals = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {
			vals[i] = Integer.valueOf(s.charAt(i) + "");
		}

		return dc(vals, 0, vals.length - 1);
	}

	private int dc(int[] nums, int s, int e) {
		if (e - s + 1 <= 1) {
			if (e == s && nums[e] == 0) {
				return 0;
			}
			return 1;
		}

		int mid = (e + s) / 2;
		
		int count = dc(nums, s, mid);
		count *= dc(nums, mid + 1, e);

		if ((nums[mid] == 1) || (nums[mid] == 2 && nums[mid + 1] >= 0 && nums[mid + 1] <= 6)) {
			int middleCount = dc(nums, s, mid - 1);
			middleCount *= dc(nums, mid + 2, e);

			count += middleCount;
		}

		return count;
	}

}

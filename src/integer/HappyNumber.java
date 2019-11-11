package integer;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 11/10/2019
 * 
 * 202. Happy Number
 * https://leetcode.com/problems/happy-number/
 * Difficulty: Easy
 * 
 * Approach: Hash Set & Iteration
 * Runtime: 2 ms, faster than 65.27% of Java online submissions for Happy Number.
 * Memory Usage: 33.9 MB, less than 10.60% of Java online submissions for Happy Number.
 * 
 * @see IntegerTest#testHappyNumber()
 */
public class HappyNumber {
	
	public boolean isHappy(int n) {
		Set<String> seen = new HashSet<String>();
		String val = Integer.toString(n);
		while (!seen.contains(val)) {
			seen.add(val);
			n = 0;
			for (int i = 0; i < val.length(); i++) {
				int curr = (val.charAt(i) - '0');
				n += curr * curr;
			}
			val = Integer.toString(n);
		}
		return (val.equals("1"));
	}
	
}
package integer;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 06/19/2019 and 06/19/2020
 * 
 * 412. Fizz Buzz
 * https://leetcode.com/problems/fizz-buzz/
 * Difficulty: Easy
 * 
 * Approach: Iteration
 * Runtime: 2 ms, faster than 22.32% of Java online submissions for Fizz Buzz.
 * Memory Usage: 37.3 MB, less than 99.95% of Java online submissions for Fizz Buzz.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Where n is the given number
 * 
 * @see IntegerTest#testFizzBuzz()
 */
public class FizzBuzz {

	public List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<String>();

		for (int i = 1; i <= n; i++) {
			String s = "";
			if (i % 3 == 0) {
				s += "Fizz";
			}
			if (i % 5 == 0) {
				s += "Buzz";
			}
			if (s.equals("")) {
				s = String.valueOf(i);
			}
			list.add(s);
		}

		return list;
	}

}

package integer;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 06/19/2019
 * 
 * 412. Fizz Buzz
 * https://leetcode.com/problems/fizz-buzz/
 * Difficulty: Easy
 * 
 * Approach: Iteration
 * Runtime: 2 ms, faster than 22.32% of Java online submissions for Fizz Buzz.
 * Memory Usage: 37.3 MB, less than 99.95% of Java online submissions for Fizz Buzz.
 * 
 */
public class FizzBuzz {

	public List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<String>();
		
		for (int i = 1; i < n + 1; i++) {
			if (i % 3 != 0 && i % 5 != 0) {
				list.add(String.valueOf(i));
			} else {
				String s = "";
				if (i % 3 == 0) {
					s += "Fizz";
				}
				if (i % 5 == 0) {
					s += "Buzz";
				}
				list.add(s);
			}
		}
		
		return list;
	}

}

package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 05/22/2020
 * 
 * 881. Boats to Save People
 * https://leetcode.com/problems/boats-to-save-people/
 * Difficulty: Medium
 * 
 * Approach: Sort and Greedy
 * Runtime: 19 ms, faster than 19.35% of Java online submissions for Boats to Save People.
 * Memory Usage: 49 MB, less than 100.00% of Java online submissions for Boats to Save People.
 * 
 * Time Complexity: O(nlog(n))
 * Space Complexity: O(1)
 * Where n is the number of elements in the array
 * 
 * @see ArrayTest#testBoatsToSavePeople()
 */
public class BoatsToSavePeople {

	public int numRescueBoats(int[] people, int limit) {
		Arrays.sort(people);
		int i = 0;
		int j = people.length - 1;
		int count = 0;
		while (i <= j) {
			if (people[i] + people[j] <= limit) {
				i++;
			}
			j--;
			count++;
		}

		return count;
	}

}

/**
 * @author Shogo Akiyama 
 * Solved on 04/20/2019
 * 
 * 657. Robot Return to Origin
 * https://leetcode.com/problems/robot-return-to-origin/
 * Difficulty: Easy
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - boolean judgeCircle(String moves).
 * 
 * Runtime: 15 ms, faster than 13.65% of Java online submissions for Robot Return to Origin.
 * Memory Usage: 39.6 MB, less than 19.18% of Java online submissions for Robot Return to Origin.
 * 
 */

public class RobotReturnToOrigin {
	
	public boolean judgeCircle(String moves) {
		int[] store = new int[4];

		for (int i = 0; i < moves.length(); i++) {
			String c = moves.substring(i, i + 1);
			if (c.equals("U"))
				store[0]++;
			else if (c.equals("D"))
				store[1]++;
			else if (c.equals("R"))
				store[2]++;
			else if (c.equals("L"))
				store[3]++;
		}

		if (store[0] == store[1] && store[2] == store[3])
			return true;
		else
			return false;
	}
	
}

package string;

/**
 * @author Shogo Akiyama 
 * Solved on 08/18/2019
 * 
 * 657. Robot Return to Origin
 * https://leetcode.com/problems/robot-return-to-origin/
 * Difficulty: Easy
 * 
 * Approach: Recursion
 * Runtime: 3 ms, faster than 99.15% of Java online submissions for Robot Return to Origin.
 * Memory Usage: 37.5 MB, less than 100.00% of Java online submissions for Robot Return to Origin.
 * 
 */

public class RobotReturnToOrigin2 {

	int x = 0;
	int y = 0;

	public boolean judgeCircle(String moves) {
		return recurse(moves, 0);
	}

	private boolean recurse(String moves, int index) {
		if (moves.length() == index) {
			if (x == 0 && y == 0) {
				return true;
			} else {
				return false;
			}
		}
		char c = moves.charAt(index);
		if (c == 'U') {
			y++;
		} else if (c == 'D') {
			y--;
		} else if (c == 'R') {
			x++;
		} else if (c == 'L') {
			x--;
		}
		return recurse(moves, index + 1);
	}

}

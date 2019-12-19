import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 12/18/2019
 * 
 * 341. Flatten Nested List Iterator
 * https://leetcode.com/problems/flatten-nested-list-iterator/
 * Difficulty: Medium
 * 
 * Approach: Stack
 * Runtime: 4 ms, faster than 50.24% of Java online submissions for Flatten Nested List Iterator.
 * Memory Usage: 37.5 MB, less than 100.00% of Java online submissions for Flatten Nested List Iterator.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the number of elements in a given list
 * 
 */
public class FlattenNestedListIterator {

	/**
	 * Your NestedIterator object will be instantiated and called as such:
	 * NestedIterator i = new NestedIterator(nestedList); while (i.hasNext()) v[f()]
	 * = i.next();
	 */

	class NestedIterator implements Iterator<Integer> {

		Stack<NestedInteger> stack;

		public NestedIterator(List<NestedInteger> nestedList) {
			stack = new Stack<NestedInteger>();
			for (int i = nestedList.size() - 1; i >= 0; i--) {
				NestedInteger ni = validate(nestedList.get(i));
				if (ni != null) {
					stack.push(ni);
				}
			}
		}

		private NestedInteger validate(NestedInteger ni) {
			if (ni.isInteger()) {
				return ni;
			} else if (ni.getList().isEmpty()) {
				return null;
			}

			for (int i = 0; i < ni.getList().size(); i++) {
				NestedInteger next = validate(ni.getList().get(i));
				if (next == null) {
					ni.getList().remove(i);
					i--;
				}
			}

			if (ni.getList().isEmpty()) {
				return null;
			}
			return ni;
		}

		@Override
		public Integer next() {
			NestedInteger ni = stack.pop();
			if (ni.isInteger()) {
				return ni.getInteger();
			} else {
				List<NestedInteger> list = ni.getList();
				for (int i = list.size() - 1; i >= 0; i--) {
					stack.push(list.get(i));
				}
				return next();
			}
		}

		@Override
		public boolean hasNext() {
			if (stack.isEmpty()) {
				return false;
			}
			return true;
		}

	}

	// This is the interface that allows for creating nested lists.
	// You should not implement it, or speculate about its implementation
	public interface NestedInteger {

		// @return true if this NestedInteger holds a single integer, rather than a
		// nested list.
		public boolean isInteger();

		// @return the single integer that this NestedInteger holds, if it holds a
		// single integer
		// Return null if this NestedInteger holds a nested list
		public Integer getInteger();

		// @return the nested list that this NestedInteger holds, if it holds a nested
		// list
		// Return null if this NestedInteger holds a single integer
		public List<NestedInteger> getList();
	}

}

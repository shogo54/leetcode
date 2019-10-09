package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 10/09/2019
 * 
 * 295. Find Median from Data Stream
 * https://leetcode.com/problems/find-median-from-data-stream/
 * Difficulty: Hard
 * 
 * Approach: Sorting
 * Runtime: 485 ms, faster than 5.22% of Java online submissions for Find Median from Data Stream.
 * Memory Usage: 65.8 MB, less than 55.93% of Java online submissions for Find Median from Data Stream.
 * 
 * @see ArrayTest#testFindMedianFromDataStream()
 */
public class FindMedianFromDataStream {

	private List<Integer> list = new ArrayList<Integer>();

	public void addNum(int num) {
		list.add(num);
	}

	public double findMedian() {
		Collections.sort(list);
		int mid = list.size() / 2;
		if (list.size() % 2 == 1) {
			return list.get(mid);
		} else {
			return (list.get(mid - 1) + list.get(mid)) / 2.0;
		}
	}

}

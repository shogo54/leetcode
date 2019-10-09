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
 * Approach: Insertion Sort
 * Runtime: 116 ms, faster than 50.43% of Java online submissions for Find Median from Data Stream.
 * Memory Usage: 55.1 MB, less than 100.00% of Java online submissions for Find Median from Data Stream.
 * 
 * @see ArrayTest#testFindMedianFromDataStream()
 */
public class FindMedianFromDataStream2 {

	private List<Integer> list = new ArrayList<Integer>();

	public void addNum(int num) {
		binarySearch(num, 0, list.size());
	}

	private void binarySearch(int num, int s, int e) {
		if (s >= e) {
			list.add(s, num);
			return;
		}

		int mid = (s + e) / 2;

		if (list.get(mid) > num) {
			binarySearch(num, s, mid);
		} else if (list.get(mid) < num) {
			binarySearch(num, mid + 1, e);
		} else {
			list.add(mid + 1, num);
		}
	}

	public double findMedian() {
		int n = list.size();
		if (n % 2 == 1) {
			return list.get(n / 2);
		} else {
			return (list.get((n / 2) - 1) + list.get(n / 2)) / 2.0;
		}
	}

}

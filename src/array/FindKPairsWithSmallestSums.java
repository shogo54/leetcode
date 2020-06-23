package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 06/23/2020
 * Solved after seeing the solution
 * 
 * 373. Find K Pairs with Smallest Sums
 * https://leetcode.com/problems/find-k-pairs-with-smallest-sums/
 * Difficulty: Medium
 * 
 * Approach: Dijkstra
 * Runtime: 4 ms, faster than 79.85% of Java online submissions for Find K Pairs with Smallest Sums.
 * Memory Usage: 40.2 MB, less than 70.47% of Java online submissions for Find K Pairs with Smallest Sums.
 * 
 * Time Complexity: O(k*log(k))
 * Space Complexity: O(m*n + k) in which m*n is used for visited and k is used for pq
 * where k is the given number, and m and n are the sizes of the arrays. 
 * 
 * @see ArrayTest#testFindKPairsWithSmallestSums()
 */
public class FindKPairsWithSmallestSums {

	public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();

		PriorityQueue<int[]> pq = new PriorityQueue<int[]>(
			(a, b) -> Integer.compare(nums1[a[0]] + nums2[a[1]], nums1[b[0]] + nums2[b[1]])
		);
		int m = nums1.length;
		int n = nums2.length;
		boolean[][] visited = new boolean[m][n];
		int[][] dirs = new int[][] { { 0, 1 }, { 1, 0 } };

		pq.add(new int[] { 0, 0 });

		while (list.size() < Math.min(k, m * n)) {
			int[] t = pq.poll();
			list.add(Arrays.asList(nums1[t[0]], nums2[t[1]]));

			for (int[] d : dirs) {
				int nx = t[0] + d[0];
				int ny = t[1] + d[1];
				if (nx < m && ny < n && !visited[nx][ny]) {
					pq.offer(new int[] { nx, ny });
					visited[nx][ny] = true;
				}
			}
		}

		return list;
	}

}

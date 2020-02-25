package array;

import java.util.*;

public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(nums);

		int i = 0;
		while (i < nums.length && nums[i] <= 0) {
			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {
				if (nums[left] + nums[right] == -nums[i]) {
					result.add(Arrays.asList(nums[i], nums[left], nums[right]));
					while (right > 0 && nums[right] == nums[--right]);
					while (left < nums.length - 1 && nums[left] == nums[++left]);

				} else if (nums[left] + nums[right] > -nums[i]) {
					while (right > 0 && nums[right] == nums[--right]);

				} else {
					while (left < nums.length - 1 && nums[left] == nums[++left]);
				}
			}

			while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
				i++;
			}
			i++;
		}

		return result;
	}

}

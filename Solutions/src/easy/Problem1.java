package easy;

import java.util.HashMap;

public class Problem1 {
    // Given an array of integers nums and an integer target, return indices of the two numbers such that they
    // add up to target.
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //You can return the answer in any order.

    //Example 1:
    //Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]
    public static int[] bigON(int[] nums, int target) {
        HashMap<Integer, Integer> valueToIndex = new HashMap<>();
        valueToIndex.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (valueToIndex.containsKey(target - nums[i])) {
                return new int[] {valueToIndex.get(target - nums[i]), i};
            } else {
                valueToIndex.put(nums[i], i);
            }
        }
        return new int[] {-1, -1};
    }

    public static int[] bigONSqared(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}

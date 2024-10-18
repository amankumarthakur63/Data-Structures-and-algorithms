package LeetCode;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }

        }
        return new int[] {};
    }
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {1, 3, 6};
        System.out.println(Arrays.toString(ts.twoSum (nums, 4)));
    }
}
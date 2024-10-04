package Searching;

public class LinearSearch {
    public static int linear (int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {45,34,45,7,6,764,5,5,46,45,45,76,3};
        int target = 3;
        System.out.println(linear(nums, target));
    }
}

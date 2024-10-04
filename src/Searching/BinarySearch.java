package Searching;

public class BinarySearch {
    public static int BS (int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 7, 9, 10, 56, 83, 455};
        int target = 83;
        System.out.println(BS(nums, target));
    }
}

package LeetCode;

public class SearchInRotatedArray2 {

    public boolean search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SearchInRotatedArray2 sa = new SearchInRotatedArray2();
        int[] nums = {9, 6 ,4, 0, 0, 1, 2, 3, 3};
        System.out.println(sa.search(nums, 0));
    }
}

package LeetCode;

public class SearchPosition {

    public int seachPosition (int[] nums, int target) {
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
        SearchPosition sp = new SearchPosition();
        int[] nums = {8, 9, 0, 3, 4, 5, 6, 7};
        System.out.println(sp.seachPosition(nums, 0));
    }
}

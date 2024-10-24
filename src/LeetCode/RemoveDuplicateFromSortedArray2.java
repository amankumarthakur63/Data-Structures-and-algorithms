package LeetCode;

public class RemoveDuplicateFromSortedArray2 {

        public int removeDuplicates(int[] nums) {
            int k = 2;

            for (int i = 2; i < nums.length; i++) {
                if (nums[i] != nums[k - 2]) {
                    nums[k] = nums[i];
                    k++;
                }
            }
            return k;
        }

    public static void main(String[] args) {
        RemoveDuplicateFromSortedArray2 rd = new RemoveDuplicateFromSortedArray2();
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3};
        System.out.println(rd.removeDuplicates(nums));
    }
}

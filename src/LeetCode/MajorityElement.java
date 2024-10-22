package LeetCode;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int count = 0;
        int result = 0;

        for (int num : nums) {
            if (count == 0) {
                result = num;
            }
            count += (num == result) ? 1 : -1;
        }
        return result;
    }

    public static void main(String[] args) {
        MajorityElement me = new MajorityElement();
        int[] nums = {3,2,3};
        System.out.println(me.majorityElement(nums));
    }
}

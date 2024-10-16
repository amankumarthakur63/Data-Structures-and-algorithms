package LeetCode;

public class ContainerWithWater {
    public static int cww (int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int area = (right - left) * Math.min (height[left], height [right]);
            maxArea = Math.max(maxArea, area);
            if (left < right) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(cww(height));
    }
}

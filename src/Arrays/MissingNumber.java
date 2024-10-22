package Arrays;

public class MissingNumber {
    public static int missing (int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int num : arr) {
            sum = sum - num;
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(missing(arr));
    }
}

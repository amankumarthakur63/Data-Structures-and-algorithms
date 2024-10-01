package Arrays;

public class FindMax {

    static int Max (int[] arr) {
        int max = arr[0];                          // First we suppose arr [0] = max
        for (int i = 0; i < arr.length; i++) {     // Just iterate the element of the array
            if (arr[i] > max) {                    // If arr[i] > max then
                max = arr[i];                      // max will be the new number
            }
        }
        return max;                                // and In the end return max
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5 , 6, 7, 8, 9, 10};
        int ans = Max (arr);
        System.out.println(ans);
    }
}

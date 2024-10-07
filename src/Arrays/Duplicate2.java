package Arrays;

public class Duplicate2 {

    public static boolean dup (int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {0, 2, 4, 6, 8, 10};
        System.out.println(dup(arr1, arr2));
    }
}

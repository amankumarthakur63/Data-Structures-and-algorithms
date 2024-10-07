package Arrays;

public class ContainsInteger {

    public static boolean interger (int[] arr, int t) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == t) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 3};
        System.out.println(interger(arr, 9));
    }
}

package Arrays;

public class insertAtAnyPosition {

public static int insert (int[] arr, int element, int index, int size, int capacity) {
    if (size > capacity) {
        return -1;
    }
    for (int i = size - 1; i >= index; i--) {
        arr [i + 1] = arr[i];
        arr[index] = element;
    }
    return 1;
}
    public static void main(String[] args) {
    int[] arr = {1, 4, 6, 8, 9, 14, 17, 98, 23};
    System.out.println(insert (arr, 3, 1, 10, 10));
    }
}

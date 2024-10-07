package Arrays;

public class insertAtAnyPosition {

public static int insert (int[] arr, int element, int index, int size, int capacity) {
    if (size >= capacity) {
        return -1;
    }
    for (int i = size - 1; i >= index; i--) {
        arr [i + 1] = arr[i];
    }
    arr[index] = element;
    return 1;
}

public static void display (int[] arr, int n) {
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}
    public static void main(String[] args) {
    int[] arr = {1, 4, 6, 8};
    int size = 5;
    int element = 45;
    int index = 3;
    System.out.println(insert (arr, element, index, size, 20));
    size += 1;
    display(arr, size);
    }
}

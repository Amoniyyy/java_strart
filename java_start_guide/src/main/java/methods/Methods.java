package methods;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        int[] arr = {12, 5, 7, 1, 5};
        System.out.println("Before sorting " + Arrays.toString(arr));
        Methods method = new Methods();
        method.sort(arr);
        System.out.println("After sorting " + Arrays.toString(arr));
    }
    public void sort(int[] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
    }
}

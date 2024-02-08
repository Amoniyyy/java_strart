package array;

import java.util.Arrays;

public class Array_Java {
    public static void main(String[] args) {
        int[] arr = new int[10]; //default value = 0
        arr[0] = 1; // addr(a[0]) + i * size(object) O(1)
        arr[1] = 1000 - 7;
        System.out.println(Arrays.toString(arr));
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        for (int i : arr2){
            System.out.print(i + ", ");
        }
    }
}

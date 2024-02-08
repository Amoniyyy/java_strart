package two_dimensional_array;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {3, 4, 5},
                {6, 7, 8}};
        System.out.println(arr.length);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println(sum);
    }
}
